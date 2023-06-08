package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;

import fpt.edu.entity.HoaDon;
import fpt.edu.entity.NguoiDung;


/**
 * QNguoiDung is a Querydsl query type for NguoiDung
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNguoiDung extends EntityPathBase<NguoiDung> {

    private static final long serialVersionUID = -1764110031L;

    public static final QNguoiDung nguoiDung = new QNguoiDung("nguoiDung");

    public final StringPath email = createString("email");

    public final SetPath<HoaDon, QHoaDon> hoaDons = this.<HoaDon, QHoaDon>createSet("hoaDons", HoaDon.class, QHoaDon.class, PathInits.DIRECT2);

    public final StringPath hoTenNguoiDung = createString("hoTenNguoiDung");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath matKhau = createString("matKhau");

    public final DateTimePath<java.util.Date> ngayChinhSua = createDateTime("ngayChinhSua", java.util.Date.class);

    public final DateTimePath<java.util.Date> ngayTao = createDateTime("ngayTao", java.util.Date.class);

    public final StringPath nguoiChinhSua = createString("nguoiChinhSua");

    public final StringPath nguoiTao = createString("nguoiTao");

    public final StringPath phanQuyen = createString("phanQuyen");

    public final StringPath sdt = createString("sdt");

    public final StringPath tenDangNhap = createString("tenDangNhap");

    public final BooleanPath trangThai = createBoolean("trangThai");

    public QNguoiDung(String variable) {
        super(NguoiDung.class, forVariable(variable));
    }

    public QNguoiDung(Path<? extends NguoiDung> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNguoiDung(PathMetadata metadata) {
        super(NguoiDung.class, metadata);
    }

}

