package fpt.edu.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.KichCo;
import fpt.edu.entity.MauSac;
import fpt.edu.repository.ChatLieuRepository;
import fpt.edu.repository.KichCoRepository;
import fpt.edu.service.KichCoService;
import groovy.util.logging.Slf4j;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Slf4j
public class KichCoServiceImpl implements KichCoService{
	private KichCoRepository kichCoRepository;
	private static Logger logger = LoggerFactory.getLogger(KichCoServiceImpl.class);
	
	@Override
	public List<KichCo> selectAllKichCoExist() {
		return kichCoRepository.selectAllKichCoExist();
	}
	
	@Override
	public <S extends KichCo> S save(S entity) {
		return kichCoRepository.save(entity);
	}
	
	@Override
	public Optional<KichCo> findById(Long id) {
		return kichCoRepository.findById(id);
	}
}
