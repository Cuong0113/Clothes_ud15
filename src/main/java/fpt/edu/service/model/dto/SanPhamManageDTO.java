package fpt.edu.service.model.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SanPhamManageDTO {
	private Long sanPhamId;
	
	private Boolean isAnhChinh;
	
	private String tenAnh;
	
	private Long kieuDangId;
	
	private Long chatLieuId;
	
	private Long loaiHangId;
	
	private Long phongCachId;
	
	private Boolean daXoa;
	
	private String tenSanPham;
	
	private String moTa;
	
	private BigDecimal giaHienHanh;
	
	private List<Long> kichCoIds;
	
	private List<Long> mauSacIds;
	//@param idSPCT, MultipartFile
	private HashMap<Long, MultipartFile> imgFiles = new HashMap<>();
		
	private List<SanPhamChiTietDTO> spctDTO = new ArrayList<>();
	
	private Boolean isEdit = false;
}
