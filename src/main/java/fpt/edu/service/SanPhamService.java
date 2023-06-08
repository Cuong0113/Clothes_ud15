package fpt.edu.service;

import java.util.List;
import java.util.Optional;

import fpt.edu.entity.SanPham;
import fpt.edu.service.model.search.SPAndSPCTSearchDto;

public interface SanPhamService {

	List<SanPham> searchProductExist(SPAndSPCTSearchDto data);

	List<SanPham> selectSanPhamExist();

	Optional<SanPham> findById(Long id);

	<S extends SanPham> S save(S entity);

	List<SanPham> selectSanPhamExistById(Long id);

}
