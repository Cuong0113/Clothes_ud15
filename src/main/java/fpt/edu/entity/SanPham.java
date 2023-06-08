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
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "san_pham")
@ToString
public class SanPham implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "kieu_dang_id", nullable = false)
	private KieuDang kieuDang;
	
	@ManyToOne
	@JoinColumn(name = "chat_lieu_id", nullable = false)
	private ChatLieu chatLieu;
	
	@ManyToOne
	@JoinColumn(name = "loai_hang_id", nullable = false)
	private LoaiHang loaiHang;
	
	@ManyToOne
	@JoinColumn(name = "phong_cach_id", nullable = false)
	private PhongCach phongCach;
	
	@Column
	private Boolean daXoa;
	
	@OneToMany(mappedBy = "sanPham",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SanPhamChiTiet> sanPhamChiTiets = new ArrayList<>();
	
	@Column(columnDefinition = "nvarchar(256)", nullable = false)
	private String tenSanPham;
	
	@Column(columnDefinition = "nvarchar(512)", nullable = true)
	private String moTa;
	
	@Column(precision = 10)
	private BigDecimal giaHienHanh;
}
