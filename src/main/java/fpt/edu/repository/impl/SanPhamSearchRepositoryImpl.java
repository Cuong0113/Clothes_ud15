package fpt.edu.repository.impl;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;

import fpt.edu.QClassGen.QChatLieu;
import fpt.edu.QClassGen.QHinhAnh;
import fpt.edu.QClassGen.QKichCo;
import fpt.edu.QClassGen.QKieuDang;
import fpt.edu.QClassGen.QLoaiHang;
import fpt.edu.QClassGen.QMauSac;
import fpt.edu.QClassGen.QPhongCach;
import fpt.edu.QClassGen.QSanPham;
import fpt.edu.QClassGen.QSanPhamChiTiet;
import fpt.edu.entity.SanPham;
import fpt.edu.entity.SanPhamChiTiet;
import fpt.edu.repository.SanPhamChiTietSearchRepository;
import fpt.edu.repository.SanPhamSearchRepository;
import fpt.edu.service.TypeHelperService;
import fpt.edu.service.impl.TypeHelper;
import fpt.edu.service.model.search.SPAndSPCTSearchDto;
import lombok.AllArgsConstructor;


@Repository
@AllArgsConstructor
public class SanPhamSearchRepositoryImpl implements SanPhamSearchRepository{
	private final EntityManager entityManager;
	
	@Autowired
	private TypeHelperService typeHelperService;
	
	@Override
	public List<SanPham> searchProductExist(SPAndSPCTSearchDto data){
		SPAndSPCTSearchDto dataSearch = convertSearchNotNull(data);
		
		JPAQuery<SanPham> query = new JPAQuery<SanPham>(entityManager);
		BooleanBuilder where = new BooleanBuilder();

		QSanPhamChiTiet qSanPhamChiTiet = QSanPhamChiTiet.sanPhamChiTiet;
		QSanPham qSanPham = QSanPham.sanPham;
		QKieuDang qKieuDang = QKieuDang.kieuDang;
		QPhongCach qPhongCach = QPhongCach.phongCach;
		QChatLieu qChatLieu = QChatLieu.chatLieu;
		QMauSac qMauSac = QMauSac.mauSac;
		QKichCo qKichCo = QKichCo.kichCo;
		
		where.and(qSanPhamChiTiet.deleted.isFalse());
		
		
		List<Long> lstKieuDang = dataSearch.getKieuDangIds();
		List<Long> lstChatLieu = dataSearch.getChatLieuIds();
		List<Long> lstLoaiHang = dataSearch.getLoaiHangIds();
		List<Long> lstPhongCach = dataSearch.getPhongCachIds();
		List<Long> lstKichCo = dataSearch.getKichCoIds();
		List<Long> lstMauSac = dataSearch.getMauSacIds();
		List<Boolean> lstCoHienThi = dataSearch.getCoHienThi();
		
		if(lstCoHienThi.size() == 2) {			
			where.and(qSanPhamChiTiet.coHienThi.eq(dataSearch.getCoHienThi().get(0)));
		}
		
		if(lstKieuDang.size() != 0) {
			if(lstKieuDang.get(0).equals(-1L)) {
				where.and(qSanPham.kieuDang.id.in(lstKieuDang));
			}
		}
		if(lstChatLieu.size() != 0) {
			where.and(qSanPham.chatLieu.id.in(lstChatLieu));
		}
		if(lstPhongCach.size() != 0) {
			where.and(qSanPham.phongCach.id.in(lstPhongCach));
		}
		if(lstLoaiHang.size() != 0) {
			where.and(qSanPham.loaiHang.id.in(lstLoaiHang));
		}
		if(lstMauSac.size() != 0) {
			where.and(qSanPhamChiTiet.mauSac.id.in(lstMauSac));
		}
		if(lstKichCo.size() != 0) {
			where.and(qSanPhamChiTiet.kichCo.id.in(lstKichCo));
		}
		
		if(!dataSearch.getTenSanPham().equalsIgnoreCase("-1")) {
			if(StringUtils.isNotEmpty(dataSearch.getTenSanPham())) {
				where.and(qSanPham.tenSanPham.containsIgnoreCase(dataSearch.getTenSanPham()));
			}
		}
		
		if(!dataSearch.getNguoiTaoSPCT().equalsIgnoreCase("-1")) {
			if(StringUtils.isNotEmpty(dataSearch.getNguoiTaoSPCT())) {
				where.and(qSanPham.nguoiTao.containsIgnoreCase(dataSearch.getNguoiTaoSPCT()));
			}
		}
		
		if(!dataSearch.getNguoiChinhSuaSPCT().equalsIgnoreCase("-1")) {
			if(StringUtils.isNotEmpty(dataSearch.getNguoiChinhSuaSPCT())) {
				where.and(qSanPham.nguoiTao.containsIgnoreCase(dataSearch.getNguoiChinhSuaSPCT()));
			}
		}
		
		//Check validate Date
		Date CheckDate = Date.from(Instant.EPOCH);
		
		if(!dataSearch.getNgayTaoMin().toString().equalsIgnoreCase(""+CheckDate) &&
				!dataSearch.getNgayTaoMax().toString().equalsIgnoreCase(""+CheckDate)) {
			if(!dataSearch.getNgayTaoMin().toString().isEmpty() && 
					!dataSearch.getNgayTaoMax().toString().isEmpty()) {
				where.and(qSanPhamChiTiet.ngayTao.between(dataSearch.getNgayTaoMin(), dataSearch.getNgayTaoMin()));
			}
		}
		
		if(!dataSearch.getNgayChinhSuaMin().toString().equalsIgnoreCase(""+CheckDate) &&
				!dataSearch.getNgayChinhSuaMax().toString().equalsIgnoreCase(""+CheckDate)) {
			if(!dataSearch.getNgayChinhSuaMin().toString().isEmpty() && 
					!dataSearch.getNgayChinhSuaMax().toString().isEmpty()) {
				where.and(qSanPhamChiTiet.ngayChinhSua.between(dataSearch.getNgayChinhSuaMin(), dataSearch.getNgayChinhSuaMax()));
			}
		}
		
		List<SanPham> result = query.from(qSanPham)
				.join(qPhongCach).on(qSanPham.phongCach.id.eq(qPhongCach.id))
				.rightJoin(qKieuDang).on(qSanPham.kieuDang.id.eq(qKieuDang.id))
				.rightJoin(qChatLieu).on(qSanPham.chatLieu.id.eq(qChatLieu.id))
				.leftJoin(qSanPhamChiTiet).on(qSanPhamChiTiet.sanPham.id.eq(qSanPham.id))
				.rightJoin(qMauSac).on(qSanPhamChiTiet.mauSac.id.eq(qMauSac.id))
				.rightJoin(qKichCo).on(qSanPhamChiTiet.kichCo.id.eq(qKichCo.id))
				.where(where)
				.orderBy(qSanPham.id.desc())
				.fetch();
		return result;
	}
	
	public SPAndSPCTSearchDto convertSearchNotNull(SPAndSPCTSearchDto dataSearch) {
		List<Long> lstKieuDangId = typeHelperService.convertObjectTypeListLong(dataSearch.getKieuDangIds());
		List<Long> lstChatLieuId = typeHelperService.convertObjectTypeListLong(dataSearch.getChatLieuIds());
		List<Long> lstLoaiHangId = typeHelperService.convertObjectTypeListLong(dataSearch.getLoaiHangIds());
		List<Long> lstPhongCachId = typeHelperService.convertObjectTypeListLong(dataSearch.getPhongCachIds());
		List<Long> lstKichCoId = typeHelperService.convertObjectTypeListLong(dataSearch.getKichCoIds());
		List<Long> lstMauSacId = typeHelperService.convertObjectTypeListLong(dataSearch.getMauSacIds());
		String tenSanPham = typeHelperService.convertObjectTypeString(dataSearch.getTenSanPham());
		BigDecimal giaHienHanhMin = typeHelperService.convertObjectTypeBigDecimal(dataSearch.getGiaHienHanhMin());
		BigDecimal giaHienHanhMax = typeHelperService.convertObjectTypeBigDecimal(dataSearch.getGiaHienHanhMax());
		int soLuongMin = typeHelperService.convertObjectTypeListInt(dataSearch.getSoLuongMin());
		int soLuongMax = typeHelperService.convertObjectTypeListInt(dataSearch.getSoLuongMax());
//		String nguoiTaoSP = typeHelperService.convertObjectTypeString(dataSearch.getNguoiTaoSP());
		List<Boolean> coHienThi = typeHelperService.convertObjectTypeListBoolean(dataSearch.getCoHienThi());
		String nguoiTaoSPCT = typeHelperService.convertObjectTypeString(dataSearch.getNguoiTaoSPCT());
//		String nguoiChinhSuaSP = typeHelperService.convertObjectTypeString(dataSearch.getNguoiChinhSuaSP());
		String nguoiChinhSuaSPCT = typeHelperService.convertObjectTypeString(dataSearch.getNguoiChinhSuaSPCT());
		Date ngayTaoMin = typeHelperService.convertObjectTypeDate(dataSearch.getNgayTaoMin());
		Date ngayTaoMax = typeHelperService.convertObjectTypeDate(dataSearch.getNgayTaoMax());
		Date ngayChinhSuaMin = typeHelperService.convertObjectTypeDate(dataSearch.getNgayChinhSuaMin());
		Date ngayChinhSuaMax = typeHelperService.convertObjectTypeDate(dataSearch.getNgayChinhSuaMax());
		SPAndSPCTSearchDto result = new SPAndSPCTSearchDto(lstKieuDangId, lstChatLieuId, lstLoaiHangId, lstPhongCachId, lstKichCoId, lstMauSacId, tenSanPham, giaHienHanhMin, giaHienHanhMax, soLuongMin, soLuongMax, coHienThi, nguoiTaoSPCT, nguoiChinhSuaSPCT, ngayTaoMin, ngayTaoMax, ngayChinhSuaMin, ngayChinhSuaMax);
		return result;
	}
}
