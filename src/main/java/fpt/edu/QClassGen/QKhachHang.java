package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;

import fpt.edu.entity.DoiHang;
import fpt.edu.entity.GiaoDich;
import fpt.edu.entity.HoaDon;
import fpt.edu.entity.KhachHang;
import fpt.edu.entity.TraHang;


/**
 * QKhachHang is a Querydsl query type for KhachHang
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QKhachHang extends EntityPathBase<KhachHang> {

    private static final long serialVersionUID = 191518572L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QKhachHang khachHang = new QKhachHang("khachHang");

    public final SetPath<DoiHang, QDoiHang> doiHangs = this.<DoiHang, QDoiHang>createSet("doiHangs", DoiHang.class, QDoiHang.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final SetPath<GiaoDich, QGiaoDich> giaoDichs = this.<GiaoDich, QGiaoDich>createSet("giaoDichs", GiaoDich.class, QGiaoDich.class, PathInits.DIRECT2);

    public final QGioHang gioHang;

    public final SetPath<HoaDon, QHoaDon> hoaDons = this.<HoaDon, QHoaDon>createSet("hoaDons", HoaDon.class, QHoaDon.class, PathInits.DIRECT2);

    public final StringPath hoTen = createString("hoTen");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath matKhau = createString("matKhau");

    public final StringPath soDienThoai = createString("soDienThoai");

    public final NumberPath<Integer> soLanMua = createNumber("soLanMua", Integer.class);

    public final NumberPath<Integer> soLanTraHang = createNumber("soLanTraHang", Integer.class);

    public final SetPath<TraHang, QTraHang> traHangs = this.<TraHang, QTraHang>createSet("traHangs", TraHang.class, QTraHang.class, PathInits.DIRECT2);

    public final NumberPath<Short> trangThai = createNumber("trangThai", Short.class);

    public QKhachHang(String variable) {
        this(KhachHang.class, forVariable(variable), INITS);
    }

    public QKhachHang(Path<? extends KhachHang> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QKhachHang(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QKhachHang(PathMetadata metadata, PathInits inits) {
        this(KhachHang.class, metadata, inits);
    }

    public QKhachHang(Class<? extends KhachHang> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.gioHang = inits.isInitialized("gioHang") ? new QGioHang(forProperty("gioHang"), inits.get("gioHang")) : null;
    }

}

