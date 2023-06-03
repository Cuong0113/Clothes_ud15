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
@Table(name = "giao_dich")
public class GiaoDich implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "giaoDich", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<HoaDon> hoaDons;

    @ManyToOne
    @JoinColumn(name = "khach_hang_id")
    private KhachHang khachHang;

    @Column(name = "trang_thai", columnDefinition = "not null")
    private int trang_thai;
    
    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_cap_nhat")
    private Date ngayCapNhat;

    @Column(name = "nguoi_cap_nhat", columnDefinition = "nvarchar(50) not null")
    private String nguoiCapNhat;
    
    @Column(name = "nguoi_tao", columnDefinition = "nvarchar(50) not null")
    private String nguoiTao;
}
