package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import fpt.edu.entity.KieuDang;
import fpt.edu.entity.SanPham;


/**
 * QKieuDang is a Querydsl query type for KieuDang
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QKieuDang extends EntityPathBase<KieuDang> {

    private static final long serialVersionUID = 885226291L;

    public static final QKieuDang kieuDang = new QKieuDang("kieuDang");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<SanPham, QSanPham> sanPhams = this.<SanPham, QSanPham>createSet("sanPhams", SanPham.class, QSanPham.class, PathInits.DIRECT2);

    public final StringPath tenKieuDang = createString("tenKieuDang");

    public final BooleanPath deleted = createBoolean("deleted");

    public QKieuDang(String variable) {
        super(KieuDang.class, forVariable(variable));
    }

    public QKieuDang(Path<? extends KieuDang> path) {
        super(path.getType(), path.getMetadata());
    }

    public QKieuDang(PathMetadata metadata) {
        super(KieuDang.class, metadata);
    }

}

