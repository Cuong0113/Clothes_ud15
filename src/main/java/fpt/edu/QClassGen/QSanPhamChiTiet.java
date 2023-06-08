package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import fpt.edu.entity.DoiHangChiTiet;
import fpt.edu.entity.HinhAnh;
import fpt.edu.entity.HoaDonChiTiet;
import fpt.edu.entity.SanPhamChiTiet;


/**
 * QSanPhamChiTiet is a Querydsl query type for SanPhamChiTiet
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSanPhamChiTiet extends EntityPathBase<SanPhamChiTiet> {

    private static final long serialVersionUID = 324660531L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSanPhamChiTiet sanPhamChiTiet = new QSanPhamChiTiet("sanPhamChiTiet");

    public final BooleanPath coHienThi = createBoolean("coHienThi");

    public final BooleanPath deleted = createBoolean("deleted");

    public final SetPath<DoiHangChiTiet, QDoiHangChiTiet> doiHangChiTiets = this.<DoiHangChiTiet, QDoiHangChiTiet>createSet("doiHangChiTiets", DoiHangChiTiet.class, QDoiHangChiTiet.class, PathInits.DIRECT2);

    public final SetPath<HinhAnh, QHinhAnh> hinhAnhs = this.<HinhAnh, QHinhAnh>createSet("hinhAnhs", HinhAnh.class, QHinhAnh.class, PathInits.DIRECT2);

    public final SetPath<HoaDonChiTiet, QHoaDonChiTiet> hoaDonChiTiets = this.<HoaDonChiTiet, QHoaDonChiTiet>createSet("hoaDonChiTiets", HoaDonChiTiet.class, QHoaDonChiTiet.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QKichCo kichCo;

    public final QMauSac mauSac;

    public final DateTimePath<java.util.Date> ngayChinhSua = createDateTime("ngayChinhSua", java.util.Date.class);

    public final DateTimePath<java.util.Date> ngayTao = createDateTime("ngayTao", java.util.Date.class);
    
    public final StringPath nguoiChinhSua = createString("nguoiChinhSua");

    public final StringPath nguoiTao = createString("nguoiTao");

    public final QSanPham sanPham;

    public final NumberPath<Integer> soLuong = createNumber("soLuong", Integer.class);

    public QSanPhamChiTiet(String variable) {
        this(SanPhamChiTiet.class, forVariable(variable), INITS);
    }

    public QSanPhamChiTiet(Path<? extends SanPhamChiTiet> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSanPhamChiTiet(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSanPhamChiTiet(PathMetadata metadata, PathInits inits) {
        this(SanPhamChiTiet.class, metadata, inits);
    }

    public QSanPhamChiTiet(Class<? extends SanPhamChiTiet> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.kichCo = inits.isInitialized("kichCo") ? new QKichCo(forProperty("kichCo")) : null;
        this.mauSac = inits.isInitialized("mauSac") ? new QMauSac(forProperty("mauSac")) : null;
        this.sanPham = inits.isInitialized("sanPham") ? new QSanPham(forProperty("sanPham"), inits.get("sanPham")) : null;
    }

}

