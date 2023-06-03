package fpt.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.SanPham;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Long>{
	
}
