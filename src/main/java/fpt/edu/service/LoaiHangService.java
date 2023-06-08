package fpt.edu.service;

import java.util.List;
import java.util.Optional;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.LoaiHang;

public interface LoaiHangService {

	List<LoaiHang> selectAllLoaiHangExist();

	Optional<LoaiHang> findById(Long id);

	<S extends LoaiHang> S save(S entity);
}
