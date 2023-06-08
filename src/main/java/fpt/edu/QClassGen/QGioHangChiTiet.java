package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;

import fpt.edu.entity.GioHangChiTiet;


/**
 * QGioHangChiTiet is a Querydsl query type for GioHangChiTiet
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGioHangChiTiet extends EntityPathBase<GioHangChiTiet> {

    private static final long serialVersionUID = -1144440040L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGioHangChiTiet gioHangChiTiet = new QGioHangChiTiet("gioHangChiTiet");

    public final QGioHang gioHang;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QSanPhamChiTiet sanPhamChiTiet;

    public final NumberPath<Integer> soLuong = createNumber("soLuong", Integer.class);

    public final NumberPath<java.math.BigDecimal> thanhTien = createNumber("thanhTien", java.math.BigDecimal.class);

    public final NumberPath<Short> trangThai = createNumber("trangThai", Short.class);

    public QGioHangChiTiet(String variable) {
        this(GioHangChiTiet.class, forVariable(variable), INITS);
    }

    public QGioHangChiTiet(Path<? extends GioHangChiTiet> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGioHangChiTiet(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGioHangChiTiet(PathMetadata metadata, PathInits inits) {
        this(GioHangChiTiet.class, metadata, inits);
    }

    public QGioHangChiTiet(Class<? extends GioHangChiTiet> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.gioHang = inits.isInitialized("gioHang") ? new QGioHang(forProperty("gioHang"), inits.get("gioHang")) : null;
        this.sanPhamChiTiet = inits.isInitialized("sanPhamChiTiet") ? new QSanPhamChiTiet(forProperty("sanPhamChiTiet"), inits.get("sanPhamChiTiet")) : null;
    }

}

