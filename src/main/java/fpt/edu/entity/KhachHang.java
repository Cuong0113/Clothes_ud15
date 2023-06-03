package fpt.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "khach_hang")
public class KhachHang implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email",columnDefinition = "nvarchar(256) not null unique")
    private String email;
    
    @OneToOne(mappedBy = "khachHang")
    private GioHang gioHang;
    
    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<DoiHang> doiHangs;
    
    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<TraHang> traHangs;
    
    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<GiaoDich> giaoDichs;
    
    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<HoaDon> hoaDons;
    
    @Column(name = "mat_Khau",columnDefinition = "nvarchar(256) not null")
    private String matKhau;

    @Column(name = "ho_ten_khach_hang",columnDefinition = "nvarchar(256) not null")
    private String hoTen;

    @Column(name = "so_lan_mua", nullable = false)
    private int soLanMua;
    
    @Column(name = "so_lan_tra_hang", nullable = false)
    private int soLanTraHang;

    @Column(name = "so_dien_thoai",columnDefinition = "nvarchar(20) not null")
    private String soDienThoai;

    @Column(name = "trang_thai")
    private short trangThai;
}
