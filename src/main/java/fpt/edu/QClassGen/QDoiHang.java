package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;

import fpt.edu.entity.DoiHang;
import fpt.edu.entity.DoiHangChiTiet;


/**
 * QDoiHang is a Querydsl query type for DoiHang
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDoiHang extends EntityPathBase<DoiHang> {

    private static final long serialVersionUID = -1160656799L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDoiHang doiHang = new QDoiHang("doiHang");

    public final SetPath<DoiHangChiTiet, QDoiHangChiTiet> doiHangChiTiets = this.<DoiHangChiTiet, QDoiHangChiTiet>createSet("doiHangChiTiets", DoiHangChiTiet.class, QDoiHangChiTiet.class, PathInits.DIRECT2);

    public final QHoaDon hoaDon;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QKhachHang khachHang;

    public final StringPath ly_do = createString("ly_do");

    public final DateTimePath<java.util.Date> ngay_chinh_sua = createDateTime("ngay_chinh_sua", java.util.Date.class);

    public final DateTimePath<java.util.Date> ngay_doi = createDateTime("ngay_doi", java.util.Date.class);

    public final StringPath nguoi_chinh_sua = createString("nguoi_chinh_sua");

    public final QNguoiDung nguoiDung;

    public final NumberPath<Integer> tong_so_luong_doi = createNumber("tong_so_luong_doi", Integer.class);

    public final NumberPath<java.math.BigDecimal> tongTien = createNumber("tongTien", java.math.BigDecimal.class);

    public final NumberPath<Short> trangThai = createNumber("trangThai", Short.class);

    public QDoiHang(String variable) {
        this(DoiHang.class, forVariable(variable), INITS);
    }

    public QDoiHang(Path<? extends DoiHang> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDoiHang(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDoiHang(PathMetadata metadata, PathInits inits) {
        this(DoiHang.class, metadata, inits);
    }

    public QDoiHang(Class<? extends DoiHang> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hoaDon = inits.isInitialized("hoaDon") ? new QHoaDon(forProperty("hoaDon"), inits.get("hoaDon")) : null;
        this.khachHang = inits.isInitialized("khachHang") ? new QKhachHang(forProperty("khachHang"), inits.get("khachHang")) : null;
        this.nguoiDung = inits.isInitialized("nguoiDung") ? new QNguoiDung(forProperty("nguoiDung")) : null;
    }

}

