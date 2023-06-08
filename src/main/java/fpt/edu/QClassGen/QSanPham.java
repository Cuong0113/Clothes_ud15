package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import fpt.edu.entity.SanPham;


/**
 * QSanPham is a Querydsl query type for SanPham
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSanPham extends EntityPathBase<SanPham> {

    private static final long serialVersionUID = -1128949323L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSanPham sanPham = new QSanPham("sanPham");

    public final QChatLieu chatLieu;

    public final NumberPath<java.math.BigDecimal> giaHienHanh = createNumber("giaHienHanh", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QKieuDang kieuDang;

    public final QLoaiHang loaiHang;

    public final DateTimePath<java.util.Date> ngayChinhSua = createDateTime("ngayChinhSua", java.util.Date.class);

    public final DateTimePath<java.util.Date> ngayTao = createDateTime("ngayTao", java.util.Date.class);

    public final StringPath nguoiChinhSua = createString("nguoiChinhSua");

    public final StringPath nguoiTao = createString("nguoiTao");

    public final StringPath moTa = createString("moTa");
    
    public final QPhongCach phongCach;

    public final StringPath tenSanPham = createString("tenSanPham");

    public QSanPham(String variable) {
        this(SanPham.class, forVariable(variable), INITS);
    }

    public QSanPham(Path<? extends SanPham> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSanPham(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSanPham(PathMetadata metadata, PathInits inits) {
        this(SanPham.class, metadata, inits);
    }

    public QSanPham(Class<? extends SanPham> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.chatLieu = inits.isInitialized("chatLieu") ? new QChatLieu(forProperty("chatLieu")) : null;
        this.kieuDang = inits.isInitialized("kieuDang") ? new QKieuDang(forProperty("kieuDang")) : null;
        this.loaiHang = inits.isInitialized("loaiHang") ? new QLoaiHang(forProperty("loaiHang")) : null;
        this.phongCach = inits.isInitialized("phongCach") ? new QPhongCach(forProperty("phongCach")) : null;
    }

}

