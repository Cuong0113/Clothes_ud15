package fpt.edu.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hinh_anh")
public class HinhAnh implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "san_pham_chi_tiet_id")
	private SanPhamChiTiet sanPhamChiTiet;
	
	@Column(name = "ten_anh", columnDefinition = "nvarchar(200) not null")
	private String tenAnh;
	
	@Column(name = "is_anh_chinh")
	private Boolean isAnhChinh;
	
	@Column(name = "co_hien_thi")
	private short coHienThi;
	
	@Column(name = "nguoi_tao", columnDefinition = "nvarchar(50) not null")
	private String nguoiTao;
	
	@Column(name = "ngay_tao")
	private Date ngayTao;
	
	@Column(name = "nguoi_chinh_sua", columnDefinition = "nvarchar(50) not null")
	private String nguoiChinhSua;
	
	@Column(name = "ngay_chinh_sua")
	private Date ngayChinhSua;
}
