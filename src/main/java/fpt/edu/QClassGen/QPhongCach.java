package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import fpt.edu.entity.PhongCach;
import fpt.edu.entity.SanPham;


/**
 * QPhongCach is a Querydsl query type for PhongCach
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPhongCach extends EntityPathBase<PhongCach> {

    private static final long serialVersionUID = -401821660L;

    public static final QPhongCach phongCach = new QPhongCach("phongCach");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<SanPham, QSanPham> sanPhams = this.<SanPham, QSanPham>createSet("sanPhams", SanPham.class, QSanPham.class, PathInits.DIRECT2);

    public final StringPath tenPhongCach = createString("tenPhongCach");
    
    public final BooleanPath deleted = createBoolean("deleted");

    public QPhongCach(String variable) {
        super(PhongCach.class, forVariable(variable));
    }

    public QPhongCach(Path<? extends PhongCach> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPhongCach(PathMetadata metadata) {
        super(PhongCach.class, metadata);
    }

}

