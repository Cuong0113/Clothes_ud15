package fpt.edu.service;

import java.util.List;
import java.util.Optional;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.MauSac;

public interface MauSacService {

	List<MauSac> selectAllMauSacExist();

	Optional<MauSac> findById(Long id);

	<S extends MauSac> S save(S entity);

}
