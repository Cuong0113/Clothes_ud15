package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;

import fpt.edu.entity.TraHang;


/**
 * QTraHang is a Querydsl query type for TraHang
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTraHang extends EntityPathBase<TraHang> {

    private static final long serialVersionUID = 232999494L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTraHang traHang = new QTraHang("traHang");

    public final QHoaDonChiTiet hoaDonChiTiet;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QKhachHang khachHang;

    public final StringPath liDo = createString("liDo");

    public final StringPath ngay_chinh_sua = createString("ngay_chinh_sua");

    public final DateTimePath<java.time.LocalDateTime> ngayTao = createDateTime("ngayTao", java.time.LocalDateTime.class);

    public final DateTimePath<java.util.Date> ngayTra = createDateTime("ngayTra", java.util.Date.class);

    public final StringPath nguoi_chinh_sua = createString("nguoi_chinh_sua");

    public final NumberPath<java.math.BigDecimal> tongTien = createNumber("tongTien", java.math.BigDecimal.class);

    public final NumberPath<Short> trangThai = createNumber("trangThai", Short.class);

    public QTraHang(String variable) {
        this(TraHang.class, forVariable(variable), INITS);
    }

    public QTraHang(Path<? extends TraHang> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTraHang(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTraHang(PathMetadata metadata, PathInits inits) {
        this(TraHang.class, metadata, inits);
    }

    public QTraHang(Class<? extends TraHang> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hoaDonChiTiet = inits.isInitialized("hoaDonChiTiet") ? new QHoaDonChiTiet(forProperty("hoaDonChiTiet"), inits.get("hoaDonChiTiet")) : null;
        this.khachHang = inits.isInitialized("khachHang") ? new QKhachHang(forProperty("khachHang"), inits.get("khachHang")) : null;
    }

}

