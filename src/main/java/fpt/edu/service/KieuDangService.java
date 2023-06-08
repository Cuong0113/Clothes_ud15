package fpt.edu.service;

import java.util.List;
import java.util.Optional;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.KieuDang;

public interface KieuDangService {

	List<KieuDang> selectAllKieuDangExist();

	Optional<KieuDang> findById(Long id);

	<S extends KieuDang> S save(S entity);


}
