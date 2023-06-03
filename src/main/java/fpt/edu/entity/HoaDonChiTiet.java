package fpt.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hoa_don_chi_tiet")
public class HoaDonChiTiet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hoa_don_id")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "san_pham_chi_tiet_id")
    private SanPhamChiTiet sanPhamChiTiet;

    @OneToOne(optional=false, mappedBy="hoaDonChiTiet")
    private TraHang traHang;

    @OneToOne(optional=false, mappedBy="hoaDonChiTiet")
    private DoiHangChiTiet doiHangChiTiet;
    
    @Column(name = "gia", nullable = false, precision = 10)
    private BigDecimal gia;

    @Column(name = "so_luong", nullable = false)
    private int so_luong;

    @Column(name = "tong_tien", nullable = false, precision = 10)
    private BigDecimal tong_tien;

    @Column(name = "trang_thai", nullable = false)
    private short trang_thai;
}
