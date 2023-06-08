package fpt.edu.service;

import java.util.List;
import java.util.Optional;

import fpt.edu.entity.SanPhamChiTiet;

public interface SanPhamChiTietService {

	List<SanPhamChiTiet> getLstSanPhamChiTietExist();

	Optional<SanPhamChiTiet> findById(Long id);

	<S extends SanPhamChiTiet> S save(S entity);

	List<SanPhamChiTiet> getLstSanPhamChiTietBySanPhamId(Long id);

}
