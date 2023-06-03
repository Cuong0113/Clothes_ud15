package fpt.edu.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "nguoi_dung")
public class NguoiDung implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@Column(name = "ten_dang_nhap",columnDefinition = "nvarchar(256)", nullable = false, unique = true)
	private String tenDangNhap;
	
	@Column(name = "mat_khau",columnDefinition = "nvarchar(256)", nullable = false)
	private String matKhau;
	
	@OneToMany(mappedBy = "nguoiDung", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<HoaDon> hoaDons;
	
	@Column(columnDefinition = "nvarchar(256)", nullable = false, unique = true)
	private String email;
	
	@Column(name = "ho_ten_nguoi_dung", columnDefinition = "nvarchar(256)", nullable = false)
	private String hoTenNguoiDung;
	
	@Column(columnDefinition = "nvarchar(20) not null", nullable = false)
	private String sdt;
	
	@Column(name = "phan_quyen", columnDefinition = "nvarchar(10)", nullable = false)
	private String phanQuyen;
	
	@Column
	private Boolean trangThai;
	
	@Column(name = "nguoi_tao", columnDefinition = "nvarchar(50)")
	private String nguoiTao;
	
	@Column(name = "ngay_tao")
	private Date ngayTao;
	
	@Column(name = "nguoi_chinh_sua", columnDefinition = "nvarchar(50)")
	private String nguoiChinhSua;
	
	@Column(name = "ngay_chinh_sua")
	private Date ngayChinhSua;
}
