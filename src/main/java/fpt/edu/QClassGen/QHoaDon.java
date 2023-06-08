package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;

import fpt.edu.entity.HoaDon;
import fpt.edu.entity.HoaDonChiTiet;


/**
 * QHoaDon is a Querydsl query type for HoaDon
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHoaDon extends EntityPathBase<HoaDon> {

    private static final long serialVersionUID = -754449672L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHoaDon hoaDon = new QHoaDon("hoaDon");

    public final StringPath diaChiGiaoHang = createString("diaChiGiaoHang");

    public final StringPath ghi_chu = createString("ghi_chu");

    public final QGiaoDich giaoDich;

    public final SetPath<HoaDonChiTiet, QHoaDonChiTiet> hoaDonChiTiets = this.<HoaDonChiTiet, QHoaDonChiTiet>createSet("hoaDonChiTiets", HoaDonChiTiet.class, QHoaDonChiTiet.class, PathInits.DIRECT2);

    public final StringPath id = createString("id");

    public final QKhachHang khachHang;

    public final StringPath loaiHoaDon = createString("loaiHoaDon");

    public final DateTimePath<java.util.Date> ngayTao = createDateTime("ngayTao", java.util.Date.class);

    public final QNguoiDung nguoiDung;

    public final StringPath sdtNguoiNhan = createString("sdtNguoiNhan");

    public final StringPath tenNguoiNhan = createString("tenNguoiNhan");

    public final DateTimePath<java.util.Date> thoiGianGiaoHang = createDateTime("thoiGianGiaoHang", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> tienShip = createNumber("tienShip", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> tongTienDonHang = createNumber("tongTienDonHang", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> tongTienHoaDon = createNumber("tongTienHoaDon", java.math.BigDecimal.class);

    public final NumberPath<Short> trangThai = createNumber("trangThai", Short.class);

    public final QVoucher voucher;

    public QHoaDon(String variable) {
        this(HoaDon.class, forVariable(variable), INITS);
    }

    public QHoaDon(Path<? extends HoaDon> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHoaDon(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHoaDon(PathMetadata metadata, PathInits inits) {
        this(HoaDon.class, metadata, inits);
    }

    public QHoaDon(Class<? extends HoaDon> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.giaoDich = inits.isInitialized("giaoDich") ? new QGiaoDich(forProperty("giaoDich"), inits.get("giaoDich")) : null;
        this.khachHang = inits.isInitialized("khachHang") ? new QKhachHang(forProperty("khachHang"), inits.get("khachHang")) : null;
        this.nguoiDung = inits.isInitialized("nguoiDung") ? new QNguoiDung(forProperty("nguoiDung")) : null;
        this.voucher = inits.isInitialized("voucher") ? new QVoucher(forProperty("voucher")) : null;
    }

}

