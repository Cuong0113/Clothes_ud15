package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import fpt.edu.entity.MauSac;
import fpt.edu.entity.SanPhamChiTiet;


/**
 * QMauSac is a Querydsl query type for MauSac
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMauSac extends EntityPathBase<MauSac> {

    private static final long serialVersionUID = -623623421L;

    public static final QMauSac mauSac = new QMauSac("mauSac");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<SanPhamChiTiet, QSanPhamChiTiet> sanPhamChiTiets = this.<SanPhamChiTiet, QSanPhamChiTiet>createSet("sanPhamChiTiets", SanPhamChiTiet.class, QSanPhamChiTiet.class, PathInits.DIRECT2);

    public final StringPath tenMauSac = createString("tenMauSac");

    public final BooleanPath deleted = createBoolean("deleted");

    public QMauSac(String variable) {
        super(MauSac.class, forVariable(variable));
    }

    public QMauSac(Path<? extends MauSac> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMauSac(PathMetadata metadata) {
        super(MauSac.class, metadata);
    }

}

