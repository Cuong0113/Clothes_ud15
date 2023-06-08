package fpt.edu.service.impl;

import org.springframework.stereotype.Service;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.LoaiHang;
import fpt.edu.entity.PhongCach;
import fpt.edu.repository.ChatLieuRepository;
import fpt.edu.repository.PhongCachRepository;
import fpt.edu.service.ChatLieuService;
import fpt.edu.service.PhongCachService;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import groovy.util.logging.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class PhongCachServiceImpl implements PhongCachService{
	private PhongCachRepository phongCachRepository;
	private static Logger logger = LoggerFactory.getLogger(PhongCachServiceImpl.class);
	
	@Override
	public List<PhongCach> selectAllPhongCachExist() {
		return phongCachRepository.selectAllPhongCachExist();
	}
	@Override
	public <S extends PhongCach> S save(S entity) {
		return phongCachRepository.save(entity);
	}
	
	@Override
	public Optional<PhongCach> findById(Long id) {
		return phongCachRepository.findById(id);
	}
}
