package fpt.edu.service.model.search;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.KichCo;
import fpt.edu.entity.KieuDang;
import fpt.edu.entity.LoaiHang;
import fpt.edu.entity.MauSac;
import fpt.edu.entity.PhongCach;
import fpt.edu.entity.SanPham;
import fpt.edu.entity.SanPhamChiTiet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SPAndSPCTSearchDto {
	
	private List<Long> kieuDangIds;
	
	private List<Long> chatLieuIds;
	
	private List<Long>  loaiHangIds;
	
	private List<Long>  phongCachIds;
	
	private List<Long> kichCoIds;
	
	private List<Long> mauSacIds;
	
	private String tenSanPham;
	
	private BigDecimal giaHienHanhMin;
	
	private BigDecimal giaHienHanhMax;
	
	private Integer soLuongMin;
	
	private Integer soLuongMax;
	
	private List<Boolean> coHienThi;
	
	private String nguoiTaoSPCT;
	
	private String nguoiChinhSuaSPCT;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ngayTaoMin;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ngayTaoMax;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ngayChinhSuaMin;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ngayChinhSuaMax;
}
