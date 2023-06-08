package fpt.edu.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fpt.edu.entity.SanPhamChiTiet;
import fpt.edu.repository.SanPhamChiTietRepository;
import fpt.edu.service.ChatLieuService;
import fpt.edu.service.SanPhamChiTietService;
import groovyjarjarantlr4.v4.parse.ANTLRParser.finallyClause_return;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SanPhamChiTietServiceImpl implements SanPhamChiTietService{
	private final SanPhamChiTietRepository sanPhamChiTietRepository;

	@Override
	public List<SanPhamChiTiet> getLstSanPhamChiTietExist() {
		return sanPhamChiTietRepository.getLstSanPhamChiTietExist();
	}

	@Override
	public <S extends SanPhamChiTiet> S save(S entity) {
		return sanPhamChiTietRepository.save(entity);
	}

	@Override
	public Optional<SanPhamChiTiet> findById(Long id) {
		return sanPhamChiTietRepository.findById(id);
	}

	@Override
	public List<SanPhamChiTiet> getLstSanPhamChiTietBySanPhamId(Long id) {
		return sanPhamChiTietRepository.getLstSanPhamChiTietBySanPhamId(id);
	}
	
	
}
