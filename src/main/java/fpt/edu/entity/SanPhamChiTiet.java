package fpt.edu.entity;

import java.io.Serializable;
import java.time.Instant;
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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
	@JoinColumn(name = "kich_co_id", nullable = false)
	private KichCo kichCo;
	
	@ManyToOne
	@JoinColumn(name = "mau_sac_id", nullable = false)
	private MauSac mauSac;
	
	@ManyToOne
	@JoinColumn(name = "san_pham_id", nullable = false)
	private SanPham sanPham;
	
	@OneToMany(mappedBy = "sanPhamChiTiet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<HinhAnh> hinhAnhs = new ArrayList<>();
	
	@Column
	private int soLuong;
	
	@OneToMany(mappedBy = "sanPhamChiTiet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<HoaDonChiTiet> hoaDonChiTiets;
	
	@OneToMany(mappedBy = "sanPhamChiTiet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DoiHangChiTiet> doiHangChiTiets;
	
	@Column
	private Boolean coHienThi;
	
	@Column
	private Boolean daXoa;
	
	@Column(name = "nguoi_tao", columnDefinition = "nvarchar(50)")
	private String nguoiTao;
	
	@Column(name = "ngay_tao")
	private Date ngayTao;
	
	@Column(name = "nguoi_chinh_sua", columnDefinition = "nvarchar(50)")
	private String nguoiChinhSua;
	
	@Column(name = "ngay_chinh_sua")
	private Date ngayChinhSua;
}
