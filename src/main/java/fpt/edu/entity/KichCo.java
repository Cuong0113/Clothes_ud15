package fpt.edu.entity;

import java.io.Serializable;
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
@Table(name = "kich_co")
public class KichCo implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "kichCo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<SanPhamChiTiet> SanPhamChiTiets;
	
	@Column(columnDefinition = "nvarchar(50) not null")
	private String tenKichCo;
	
	@Column(name = "trang_thai")
	private short trangThai;
}
