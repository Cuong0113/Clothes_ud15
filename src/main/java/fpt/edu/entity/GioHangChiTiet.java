
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
@Table(name = "gio_hang_chi_tiet")
public class GioHangChiTiet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "san_pham_chi_tiet_id")
    private SanPhamChiTiet sanPhamChiTiet;

    @ManyToOne
    @JoinColumn(name = "gio_hang_id")
    private GioHang gioHang;

    @Column(name = "so_luong")
    private int soLuong;

    @Column(name = "thanh_tien", precision = 10)
    private BigDecimal thanhTien;

    @Column(name = "trang_thai")
    private short trangThai;
}
