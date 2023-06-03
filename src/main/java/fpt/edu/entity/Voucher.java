package fpt.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Voucher")
public class Voucher implements Serializable {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "id", unique = true, nullable = false, length = 36)
	private String id;

    @Column(name = "ten_voucher",columnDefinition = "nvarchar(256) not null")
    private String tenVoucher;

    @OneToMany(mappedBy = "voucher", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<HoaDon> hoaDons;
    
    @Column(name = "ngay_bat_dau")
    private LocalTime ngayBatDau;

    @Column(name = "ngay_ket_thuc")
    private LocalTime ngayKetThuc;

    @Column(name = "phan_tram_giam", precision = 10)
    private BigDecimal phanTramGiam;

    @Column(name = "gia_tri_toi_thieu", precision = 10)
    private BigDecimal giaTriToiThieu;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "nguoi_tao", columnDefinition = "nvarchar(256) not null")
    private String nguoiTao;

    @Column(name = "ngay_chinh_sua")
    private Date ngayChinhSua;

    @Column(name = "nguoi_chinh_sua", columnDefinition = "nvarchar(256) not null")
    private String nguoiChinhSua;
}
