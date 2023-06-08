package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;

import fpt.edu.entity.HoaDonChiTiet;


/**
 * QHoaDonChiTiet is a Querydsl query type for HoaDonChiTiet
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHoaDonChiTiet extends EntityPathBase<HoaDonChiTiet> {

    private static final long serialVersionUID = 673063568L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHoaDonChiTiet hoaDonChiTiet = new QHoaDonChiTiet("hoaDonChiTiet");

    public final QDoiHangChiTiet doiHangChiTiet;

    public final NumberPath<java.math.BigDecimal> gia = createNumber("gia", java.math.BigDecimal.class);

    public final QHoaDon hoaDon;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QSanPhamChiTiet sanPhamChiTiet;

    public final NumberPath<Integer> so_luong = createNumber("so_luong", Integer.class);

    public final NumberPath<java.math.BigDecimal> tong_tien = createNumber("tong_tien", java.math.BigDecimal.class);

    public final QTraHang traHang;

    public final NumberPath<Short> trang_thai = createNumber("trang_thai", Short.class);

    public QHoaDonChiTiet(String variable) {
        this(HoaDonChiTiet.class, forVariable(variable), INITS);
    }

    public QHoaDonChiTiet(Path<? extends HoaDonChiTiet> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHoaDonChiTiet(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHoaDonChiTiet(PathMetadata metadata, PathInits inits) {
        this(HoaDonChiTiet.class, metadata, inits);
    }

    public QHoaDonChiTiet(Class<? extends HoaDonChiTiet> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.doiHangChiTiet = inits.isInitialized("doiHangChiTiet") ? new QDoiHangChiTiet(forProperty("doiHangChiTiet"), inits.get("doiHangChiTiet")) : null;
        this.hoaDon = inits.isInitialized("hoaDon") ? new QHoaDon(forProperty("hoaDon"), inits.get("hoaDon")) : null;
        this.sanPhamChiTiet = inits.isInitialized("sanPhamChiTiet") ? new QSanPhamChiTiet(forProperty("sanPhamChiTiet"), inits.get("sanPhamChiTiet")) : null;
        this.traHang = inits.isInitialized("traHang") ? new QTraHang(forProperty("traHang"), inits.get("traHang")) : null;
    }

}

