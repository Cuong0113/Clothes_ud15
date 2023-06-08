package fpt.edu.service.model.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import fpt.edu.entity.HinhAnh;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SanPhamChiTietDTO{
	
	private Long id;
	
	private Long kichCoId;
	
	private Long mauSacId;
	
	private Long sanPhamId;
	
	private int soLuong;
		
	private Boolean coHienThi;
	
	private Boolean daXoa;
	
	private String nguoiTao;
	
	private Instant ngayTao;
	
	private String nguoiChinhSua;
	
	private Instant ngayChinhSua;
}
