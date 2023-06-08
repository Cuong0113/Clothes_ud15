package fpt.edu.service.impl;

import org.springframework.stereotype.Service;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.KieuDang;
import fpt.edu.entity.PhongCach;
import fpt.edu.repository.ChatLieuRepository;
import fpt.edu.repository.KieuDangRepository;
import fpt.edu.service.ChatLieuService;
import fpt.edu.service.KieuDangService;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import groovy.util.logging.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class KieuDangServiceImpl implements KieuDangService{
	private KieuDangRepository kieuDangRepository;
	private static Logger logger = LoggerFactory.getLogger(KieuDangServiceImpl.class);
	
	@Override
	public List<KieuDang> selectAllKieuDangExist() {
		logger.info("Select all kieu dang exist");
		return kieuDangRepository.selectAllKieuDangExist();
	}
	@Override
	public <S extends KieuDang> S save(S entity) {
		return kieuDangRepository.save(entity);
	}
	
	@Override
	public Optional<KieuDang> findById(Long id) {
		return kieuDangRepository.findById(id);
	}
}
