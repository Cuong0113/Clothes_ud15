package fpt.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.PhongCach;

@Repository
public interface PhongCachRepository extends JpaRepository<PhongCach, Long>{
	@Query(value = "SELECT * FROM `phong_cach` c WHERE c.da_xoa = false ", nativeQuery = true)
	List<PhongCach> selectAllPhongCachExist();
}
