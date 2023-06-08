package fpt.edu.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.KichCo;
import fpt.edu.entity.LoaiHang;
import fpt.edu.repository.ChatLieuRepository;
import fpt.edu.repository.LoaiHangRepository;
import fpt.edu.service.ChatLieuService;
import fpt.edu.service.LoaiHangService;
import groovy.util.logging.Slf4j;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Slf4j
public class LoaiHangServiceImpl implements LoaiHangService{
	private LoaiHangRepository loaiHangRepository;
	private static Logger logger = LoggerFactory.getLogger(ChatLieuServiceImpl.class);
	
	@Override
	public List<LoaiHang> selectAllLoaiHangExist() {
		return loaiHangRepository.selectAllLoaiHangExist();
	}		
	
	@Override
	public <S extends LoaiHang> S save(S entity) {
		return loaiHangRepository.save(entity);
	}
	
	@Override
	public Optional<LoaiHang> findById(Long id) {
		return loaiHangRepository.findById(id);
	}
}
