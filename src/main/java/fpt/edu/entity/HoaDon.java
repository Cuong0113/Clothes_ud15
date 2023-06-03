package fpt.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hoa_don")
public class HoaDon implements Serializable {
    @Id
    @Column(unique = true, nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "voucher_id")
    private Voucher voucher;

    @OneToMany(mappedBy = "hoaDon", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<HoaDonChiTiet> hoaDonChiTiets;
    
    @ManyToOne
    @JoinColumn(name = "nguoi_dung_id")
    private NguoiDung nguoiDung;

    @ManyToOne
    @JoinColumn(name = "khach_hang_id")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "giao_dich_id")
    private GiaoDich giaoDich;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ten_nguoi_nhan", columnDefinition = "nvarchar(256) not null")
    private String tenNguoiNhan;

    @Column(name = "sdt_nguoi_nhan", columnDefinition = "nvarchar(20) not null")
    private String sdtNguoiNhan;

    @Column(name = "dia_chi_giao_hang", columnDefinition = "nvarchar(max) not null")
    private String diaChiGiaoHang;

    @Column(name = "thoi_gian_giao_hang", nullable = false)
    private Date thoiGianGiaoHang;

    @Column(name = "ghi_chu", columnDefinition = "nvarchar(max) not null")
    private String ghi_chu;

    @Column(name = "tong_tien_hoa_don", precision = 10, nullable = false)
    private BigDecimal tongTienHoaDon;

    @Column(name = "tien_ship",  precision = 10, nullable = false)
    private BigDecimal tienShip;

    @Column(name = "tong_tien_don_hang", precision = 10, nullable = false)
    private BigDecimal tongTienDonHang;

    @Column(name = "loai_hoa_don", columnDefinition = "nvarchar(50) not null")
    private String loaiHoaDon;

    @Column(name = "trang_thai")
    private short trangThai;
}
