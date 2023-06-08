package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;

import fpt.edu.entity.GiaoDich;
import fpt.edu.entity.HoaDon;


/**
 * QGiaoDich is a Querydsl query type for GiaoDich
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGiaoDich extends EntityPathBase<GiaoDich> {

    private static final long serialVersionUID = -1911098135L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGiaoDich giaoDich = new QGiaoDich("giaoDich");

    public final SetPath<HoaDon, QHoaDon> hoaDons = this.<HoaDon, QHoaDon>createSet("hoaDons", HoaDon.class, QHoaDon.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QKhachHang khachHang;

    public final DateTimePath<java.util.Date> ngayCapNhat = createDateTime("ngayCapNhat", java.util.Date.class);

    public final DateTimePath<java.util.Date> ngayTao = createDateTime("ngayTao", java.util.Date.class);

    public final StringPath nguoiCapNhat = createString("nguoiCapNhat");

    public final StringPath nguoiTao = createString("nguoiTao");

    public final NumberPath<Integer> trang_thai = createNumber("trang_thai", Integer.class);

    public QGiaoDich(String variable) {
        this(GiaoDich.class, forVariable(variable), INITS);
    }

    public QGiaoDich(Path<? extends GiaoDich> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGiaoDich(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGiaoDich(PathMetadata metadata, PathInits inits) {
        this(GiaoDich.class, metadata, inits);
    }

    public QGiaoDich(Class<? extends GiaoDich> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.khachHang = inits.isInitialized("khachHang") ? new QKhachHang(forProperty("khachHang"), inits.get("khachHang")) : null;
    }

}

