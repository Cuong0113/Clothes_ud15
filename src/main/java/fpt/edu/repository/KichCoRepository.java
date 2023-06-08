package fpt.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.KichCo;

@Repository
public interface KichCoRepository extends JpaRepository<KichCo, Long>{
	@Query(value = "SELECT * FROM `kich_co` c WHERE c.da_xoa = false ", nativeQuery = true)
	List<KichCo> selectAllKichCoExist();
}
