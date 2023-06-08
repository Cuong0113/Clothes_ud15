package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import fpt.edu.entity.LoaiHang;
import fpt.edu.entity.SanPham;


/**
 * QLoaiHang is a Querydsl query type for LoaiHang
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLoaiHang extends EntityPathBase<LoaiHang> {

    private static final long serialVersionUID = -762355572L;

    public static final QLoaiHang loaiHang = new QLoaiHang("loaiHang");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<SanPham, QSanPham> sanPhams = this.<SanPham, QSanPham>createSet("sanPhams", SanPham.class, QSanPham.class, PathInits.DIRECT2);

    public final StringPath tenLoaiHang = createString("tenLoaiHang");

    public final BooleanPath deleted = createBoolean("deleted");

    public QLoaiHang(String variable) {
        super(LoaiHang.class, forVariable(variable));
    }

    public QLoaiHang(Path<? extends LoaiHang> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLoaiHang(PathMetadata metadata) {
        super(LoaiHang.class, metadata);
    }

}

