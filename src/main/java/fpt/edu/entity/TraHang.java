package fpt.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tra_hang")
public class TraHang implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "khach_hang_id")
    private KhachHang khachHang;

    @OneToOne(optional = false)
    @JoinColumn(name = "hoa_don_chi_tiet_id")
    private HoaDonChiTiet hoaDonChiTiet;

    @Column(name = "ngay_tra", nullable = false)
    private Date ngayTra;

    @Column(name = "tong_tien",precision = 10)
    private BigDecimal tongTien;

    @Column(name = "li_do", columnDefinition = "nvarchar(max) not null")
    private String liDo;
    
    @Column(name = "trang_thai")
    private short trangThai;
    
    @Column(name = "ngay_tao", nullable = false)
    private LocalDateTime ngayTao;
    
    @Column(name = "nguoi_chinh_sua", columnDefinition = "nvarchar(50) not null")
    private String nguoi_chinh_sua;

    @Column(name = "ngay_chinh_sua", columnDefinition = "nvarchar(50) not null")
    private String ngay_chinh_sua;
}
