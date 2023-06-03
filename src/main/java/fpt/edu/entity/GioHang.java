package fpt.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "gio_hang")
public class GioHang implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    @JoinColumn(name = "khach_hang_id")
    private KhachHang khachHang;
    
    @Column(name = "trang_thai", nullable = false)
    private short trangThai;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "nguoi_tao")
    private String nguoiTao;

    @Column(name = "ngay_cap_nhat")
    private Date ngayCapNhat;
    
    @Column(name = "nguoi_cap_nhat")
    private String nguoiCapNhat;
}
