package fpt.edu.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import fpt.edu.entity.SanPham;
import fpt.edu.repository.SanPhamRepository;
import fpt.edu.repository.SanPhamSearchRepository;
import fpt.edu.service.ChatLieuService;
import fpt.edu.service.SanPhamService;
import fpt.edu.service.model.search.SPAndSPCTSearchDto;
import groovyjarjarantlr4.v4.parse.ANTLRParser.finallyClause_return;
import lombok.AllArgsConstructor;

@Service
public class SanPhamServiceImpl implements SanPhamService{
	private final SanPhamRepository sanPhamRepository;
	private final SanPhamSearchRepository sanPhamSearchRepository;
	
	public SanPhamServiceImpl(SanPhamRepository sanPhamRepository,SanPhamSearchRepository sanPhamSearchRepository) {
		this.sanPhamRepository = sanPhamRepository;
		this.sanPhamSearchRepository = sanPhamSearchRepository;
	}
	
	@Override
	public List<SanPham> selectSanPhamExistById(Long id) {
		return sanPhamRepository.selectSanPhamExistById(id);
	}

	@Override
	public List<SanPham> searchProductExist(SPAndSPCTSearchDto data) {
		return sanPhamSearchRepository.searchProductExist(data);
	}
	
	@Override
	public <S extends SanPham> S save(S entity) {
		return sanPhamRepository.save(entity);
	}

	@Override
	public Optional<SanPham> findById(Long id) {
		return sanPhamRepository.findById(id);
	}

	@Override
	public List<SanPham> selectSanPhamExist() {
		return sanPhamRepository.selectSanPhamExist();
	}
}
