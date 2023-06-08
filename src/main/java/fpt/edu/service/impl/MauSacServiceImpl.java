package fpt.edu.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.MauSac;
import fpt.edu.repository.ChatLieuRepository;
import fpt.edu.repository.MauSacRepository;
import fpt.edu.service.ChatLieuService;
import fpt.edu.service.MauSacService;
import groovy.util.logging.Slf4j;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Slf4j
public class MauSacServiceImpl implements MauSacService{
	private MauSacRepository mauSacRepository;
	private static Logger logger = LoggerFactory.getLogger(MauSacServiceImpl.class);
	
	@Override
	public List<MauSac> selectAllMauSacExist() {
		return mauSacRepository.selectAllMauSacExist();
	}

	@Override
	public <S extends MauSac> S save(S entity) {
		return mauSacRepository.save(entity);
	}

	@Override
	public Optional<MauSac> findById(Long id) {
		return mauSacRepository.findById(id);
	}
	
	
}
