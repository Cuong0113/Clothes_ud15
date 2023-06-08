package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;

import fpt.edu.entity.HoaDon;
import fpt.edu.entity.Voucher;


/**
 * QVoucher is a Querydsl query type for Voucher
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QVoucher extends EntityPathBase<Voucher> {

    private static final long serialVersionUID = 1941400639L;

    public static final QVoucher voucher = new QVoucher("voucher");

    public final NumberPath<java.math.BigDecimal> giaTriToiThieu = createNumber("giaTriToiThieu", java.math.BigDecimal.class);

    public final SetPath<HoaDon, QHoaDon> hoaDons = this.<HoaDon, QHoaDon>createSet("hoaDons", HoaDon.class, QHoaDon.class, PathInits.DIRECT2);

    public final StringPath id = createString("id");

    public final TimePath<java.time.LocalTime> ngayBatDau = createTime("ngayBatDau", java.time.LocalTime.class);

    public final DateTimePath<java.util.Date> ngayChinhSua = createDateTime("ngayChinhSua", java.util.Date.class);

    public final TimePath<java.time.LocalTime> ngayKetThuc = createTime("ngayKetThuc", java.time.LocalTime.class);

    public final DateTimePath<java.util.Date> ngayTao = createDateTime("ngayTao", java.util.Date.class);

    public final StringPath nguoiChinhSua = createString("nguoiChinhSua");

    public final StringPath nguoiTao = createString("nguoiTao");

    public final NumberPath<java.math.BigDecimal> phanTramGiam = createNumber("phanTramGiam", java.math.BigDecimal.class);

    public final StringPath tenVoucher = createString("tenVoucher");

    public QVoucher(String variable) {
        super(Voucher.class, forVariable(variable));
    }

    public QVoucher(Path<? extends Voucher> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVoucher(PathMetadata metadata) {
        super(Voucher.class, metadata);
    }

}

