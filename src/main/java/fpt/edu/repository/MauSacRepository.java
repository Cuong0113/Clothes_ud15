package fpt.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.MauSac;

@Repository
public interface MauSacRepository extends JpaRepository<MauSac, Long>{
	@Query(value = "SELECT * FROM `mau_sac` m WHERE m.da_xoa = false ", nativeQuery = true)
	List<MauSac> selectAllMauSacExist();
}
