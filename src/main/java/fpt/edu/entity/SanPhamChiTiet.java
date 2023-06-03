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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "san_pham_chi_tiet")
public class SanPhamChiTiet implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "kich_co_id")
	private KichCo kichCo;
	
	@ManyToOne
	@JoinColumn(name = "mau_sac_id")
	private MauSac mauSac;
	
	@ManyToOne
	@JoinColumn(name = "san_pham_id")
	private SanPham sanPham;
	
	@OneToMany(mappedBy = "sanPhamChiTiet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<HinhAnh> hinhAnhs;
	
	@Column
	private int soLuong;
	
	@Column(columnDefinition = "nvarchar(512)", nullable = true)
	private String moTa;
	
	@OneToMany(mappedBy = "sanPhamChiTiet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<HoaDonChiTiet> hoaDonChiTiets;
	
	@OneToMany(mappedBy = "sanPhamChiTiet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<DoiHangChiTiet> doiHangChiTiets;
	
	@Column
	private Boolean coHienThi;
	
	@Column
	private Boolean deleted;
	
	@Column(name = "nguoi_tao", columnDefinition = "nvarchar(50)")
	private String nguoiTao;
	
	@Column(name = "ngay_tao")
	private Date ngayTao;
	
	@Column(name = "nguoi_chinh_sua", columnDefinition = "nvarchar(50)")
	private String nguoiChinhSua;
	
	@Column(name = "ngay_chinh_sua")
	private Date ngayChinhSua;
}
