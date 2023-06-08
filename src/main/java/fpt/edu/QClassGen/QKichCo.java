package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import fpt.edu.entity.KichCo;
import fpt.edu.entity.SanPhamChiTiet;


/**
 * QKichCo is a Querydsl query type for KichCo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QKichCo extends EntityPathBase<KichCo> {

    private static final long serialVersionUID = -674010530L;

    public static final QKichCo kichCo = new QKichCo("kichCo");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<SanPhamChiTiet, QSanPhamChiTiet> SanPhamChiTiets = this.<SanPhamChiTiet, QSanPhamChiTiet>createSet("SanPhamChiTiets", SanPhamChiTiet.class, QSanPhamChiTiet.class, PathInits.DIRECT2);

    public final StringPath tenKichCo = createString("tenKichCo");

    public final BooleanPath deleted = createBoolean("deleted");

    public QKichCo(String variable) {
        super(KichCo.class, forVariable(variable));
    }

    public QKichCo(Path<? extends KichCo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QKichCo(PathMetadata metadata) {
        super(KichCo.class, metadata);
    }

}

