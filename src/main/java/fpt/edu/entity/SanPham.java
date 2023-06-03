package fpt.edu.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
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
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "san_pham")
public class SanPham implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "kieu_dang_id")
	private KieuDang kieuDang;
	
	@ManyToOne
	@JoinColumn(name = "chat_lieu_id")
	private ChatLieu chatLieu;
	
	@ManyToOne
	@JoinColumn(name = "loai_hang_id")
	private LoaiHang loaiHang;
	
	@ManyToOne
	@JoinColumn(name = "phong_cach_id")
	private PhongCach phongCach;
	
	@Column(columnDefinition = "nvarchar(256)", nullable = false)
	private String tenSanPham;
	
	@Column(precision = 10)
	private BigDecimal giaHienHanh;
	
	@Column(name = "nguoi_tao", columnDefinition = "nvarchar(50)")
	private String nguoiTao;
	
	@Column(name = "ngay_tao")
	private Date ngayTao;
	
	@Column(name = "nguoi_chinh_sua", columnDefinition = "nvarchar(50)")
	private String nguoiChinhSua;
	
	@Column(name = "ngay_chinh_sua")
	private Date ngayChinhSua;
}
