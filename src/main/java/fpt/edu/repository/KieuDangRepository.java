package fpt.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.KieuDang;

@Repository
public interface KieuDangRepository extends JpaRepository<KieuDang, Long>{
	@Query(value = "SELECT * FROM `kieu_dang` c WHERE c.da_xoa = false ", nativeQuery = true)
	List<KieuDang> selectAllKieuDangExist();
}
