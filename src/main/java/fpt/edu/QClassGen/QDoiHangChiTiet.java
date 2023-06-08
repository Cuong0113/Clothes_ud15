package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;

import fpt.edu.entity.DoiHangChiTiet;


/**
 * QDoiHangChiTiet is a Querydsl query type for DoiHangChiTiet
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDoiHangChiTiet extends EntityPathBase<DoiHangChiTiet> {

    private static final long serialVersionUID = 2132288775L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDoiHangChiTiet doiHangChiTiet = new QDoiHangChiTiet("doiHangChiTiet");

    public final QDoiHang doiHang;

    public final StringPath ghi_chu = createString("ghi_chu");

    public final QHoaDonChiTiet hoaDonChiTiet;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.util.Date> ngayChinhSua = createDateTime("ngayChinhSua", java.util.Date.class);

    public final DateTimePath<java.util.Date> ngayTao = createDateTime("ngayTao", java.util.Date.class);

    public final StringPath nguoiChinhSua = createString("nguoiChinhSua");

    public final StringPath nguoiTao = createString("nguoiTao");

    public final QSanPhamChiTiet sanPhamChiTiet;

    public final NumberPath<Integer> so_luong = createNumber("so_luong", Integer.class);

    public final NumberPath<Short> trang_thai = createNumber("trang_thai", Short.class);

    public QDoiHangChiTiet(String variable) {
        this(DoiHangChiTiet.class, forVariable(variable), INITS);
    }

    public QDoiHangChiTiet(Path<? extends DoiHangChiTiet> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDoiHangChiTiet(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDoiHangChiTiet(PathMetadata metadata, PathInits inits) {
        this(DoiHangChiTiet.class, metadata, inits);
    }

    public QDoiHangChiTiet(Class<? extends DoiHangChiTiet> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.doiHang = inits.isInitialized("doiHang") ? new QDoiHang(forProperty("doiHang"), inits.get("doiHang")) : null;
        this.hoaDonChiTiet = inits.isInitialized("hoaDonChiTiet") ? new QHoaDonChiTiet(forProperty("hoaDonChiTiet"), inits.get("hoaDonChiTiet")) : null;
        this.sanPhamChiTiet = inits.isInitialized("sanPhamChiTiet") ? new QSanPhamChiTiet(forProperty("sanPhamChiTiet"), inits.get("sanPhamChiTiet")) : null;
    }

}

