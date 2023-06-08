package fpt.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.LoaiHang;

@Repository
public interface LoaiHangRepository extends JpaRepository<LoaiHang, Long>{
	@Query(value = "SELECT * FROM `loai_hang` c WHERE c.da_xoa = false ", nativeQuery = true)
	List<LoaiHang> selectAllLoaiHangExist();
}
