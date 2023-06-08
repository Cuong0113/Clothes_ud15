package fpt.edu.service.impl;

import org.springframework.stereotype.Service;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.MauSac;
import fpt.edu.repository.ChatLieuRepository;
import fpt.edu.service.ChatLieuService;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import groovy.util.logging.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class ChatLieuServiceImpl implements ChatLieuService{
	private ChatLieuRepository chatLieuRepository;
	private static Logger logger = LoggerFactory.getLogger(ChatLieuServiceImpl.class);
	
	@Override
	public List<ChatLieu> selectAllChatLieuExist() {
		logger.info("Select all chat lieu exist");
		return chatLieuRepository.selectAllChatLieuExist();
	}
	
	@Override
	public <S extends ChatLieu> S save(S entity) {
		return chatLieuRepository.save(entity);
	}

	@Override
	public Optional<ChatLieu> findById(Long id) {
		return chatLieuRepository.findById(id);
	}
}
