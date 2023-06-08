package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;

import fpt.edu.entity.HinhAnh;


/**
 * QHinhAnh is a Querydsl query type for HinhAnh
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHinhAnh extends EntityPathBase<HinhAnh> {

    private static final long serialVersionUID = -2071844111L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHinhAnh hinhAnh = new QHinhAnh("hinhAnh");

    public final NumberPath<Short> coHienThi = createNumber("coHienThi", Short.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isAnhChinh = createBoolean("isAnhChinh");

    public final DateTimePath<java.util.Date> ngayChinhSua = createDateTime("ngayChinhSua", java.util.Date.class);

    public final DateTimePath<java.util.Date> ngayTao = createDateTime("ngayTao", java.util.Date.class);

    public final StringPath nguoiChinhSua = createString("nguoiChinhSua");

    public final StringPath nguoiTao = createString("nguoiTao");

    public final QSanPhamChiTiet sanPhamChiTiet;

    public final StringPath tenAnh = createString("tenAnh");

    public QHinhAnh(String variable) {
        this(HinhAnh.class, forVariable(variable), INITS);
    }

    public QHinhAnh(Path<? extends HinhAnh> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHinhAnh(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHinhAnh(PathMetadata metadata, PathInits inits) {
        this(HinhAnh.class, metadata, inits);
    }

    public QHinhAnh(Class<? extends HinhAnh> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sanPhamChiTiet = inits.isInitialized("sanPhamChiTiet") ? new QSanPhamChiTiet(forProperty("sanPhamChiTiet"), inits.get("sanPhamChiTiet")) : null;
    }

}

