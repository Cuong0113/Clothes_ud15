package fpt.edu.service;

import java.util.List;
import java.util.Optional;

import fpt.edu.entity.ChatLieu;

public interface ChatLieuService {

	List<ChatLieu> selectAllChatLieuExist();

	Optional<ChatLieu> findById(Long id);

	<S extends ChatLieu> S save(S entity);

}
