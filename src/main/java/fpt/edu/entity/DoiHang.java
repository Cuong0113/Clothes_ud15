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
@Table(name = "doi_hang")
public class DoiHang implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hoa_don_id")
    private HoaDon hoaDon;

    @OneToMany(mappedBy = "doiHang", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<DoiHangChiTiet> doiHangChiTiets;
    
    @ManyToOne
    @JoinColumn(name = "nguoi_dung_id")
    private NguoiDung nguoiDung;
    
    @ManyToOne
    @JoinColumn(name = "khach_hang_id")
    private KhachHang khachHang;
    
    @Column(name = "ngay_doi", nullable = false)
    private Date ngay_doi;

    @Column(name = "ly_do", columnDefinition = "nvarchar(256)", nullable = false)
    private String ly_do;

    @Column(name = "tong_so_luong_doi", columnDefinition = "int not null")
    private int tong_so_luong_doi;

    @Column(name = "trang_thai", columnDefinition = "not null")
    private short trangThai;

    @Column(name = "tong_tien", columnDefinition = "not null")
    private BigDecimal tongTien;

    @Column(name = "ngay_chinh_sua")	
    private Date ngay_chinh_sua;

    @Column(name = "nguoi_chinh_sua", columnDefinition = "nvarchar(50) not null")
    private String nguoi_chinh_sua;
}
