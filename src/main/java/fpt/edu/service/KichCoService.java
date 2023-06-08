package fpt.edu.service;

import java.util.List;
import java.util.Optional;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.KichCo;

public interface KichCoService {

	List<KichCo> selectAllKichCoExist();

	Optional<KichCo> findById(Long id);

	<S extends KichCo> S save(S entity);

}
