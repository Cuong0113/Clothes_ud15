package fpt.edu.QClassGen;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.SanPham;


/**
 * QChatLieu is a Querydsl query type for ChatLieu
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChatLieu extends EntityPathBase<ChatLieu> {

    private static final long serialVersionUID = -1175052556L;

    public static final QChatLieu chatLieu = new QChatLieu("chatLieu");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<SanPham, QSanPham> sanPhams = this.<SanPham, QSanPham>createSet("sanPhams", SanPham.class, QSanPham.class, PathInits.DIRECT2);

    public final StringPath tenChatLieu = createString("tenChatLieu");

    public final BooleanPath deleted = createBoolean("deleted");

    public QChatLieu(String variable) {
        super(ChatLieu.class, forVariable(variable));
    }

    public QChatLieu(Path<? extends ChatLieu> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChatLieu(PathMetadata metadata) {
        super(ChatLieu.class, metadata);
    }

}

