package fpt.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doi_hang_chi_tiet")
public class DoiHangChiTiet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doi_hang_id")
    private DoiHang doiHang;
    
    @OneToOne(optional = false)
    @JoinColumn(name = "hoa_don_chi_tiet_id")
    private HoaDonChiTiet hoaDonChiTiet;
    
    @ManyToOne
    @JoinColumn(name = "san_pham_chi_tiet_id")
    private SanPhamChiTiet sanPhamChiTiet;

    @Column(name = "so_luong", columnDefinition = "not null")
    private int so_luong;

    @Column(name = "ghi_chu", columnDefinition = "nvarchar(max) not null")
    private String ghi_chu;

    @Column(name = "trang_thai", columnDefinition = "not null")
    private short trang_thai;
    
    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "nguoi_tao", columnDefinition = "nvarchar(50) not null")
    private String nguoiTao;

    @Column(name = "ngay_chinh_sua")
    private Date ngayChinhSua;
    
    @Column(name = "nguoi_chinh_sua", columnDefinition = "nvarchar(50) not null")
    private String nguoiChinhSua;
}
