package fpt.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.SanPhamChiTiet;

@Repository
public interface SanPhamChiTietRepository extends JpaRepository<SanPhamChiTiet, Long>, SanPhamChiTietSearchRepository{
	@Query(value = "SELECT * FROM `san_pham_chi_tiet` s WHERE s.da_xoa = false ORDER BY s.san_pham_id DESC", nativeQuery = true)
	List<SanPhamChiTiet> getLstSanPhamChiTietExist();
	
	@Query(value = "SELECT * FROM `san_pham_chi_tiet` s WHERE s.da_xoa = false AND s.san_pham_id = :sanPhamId", nativeQuery = true)
	List<SanPhamChiTiet> getLstSanPhamChiTietBySanPhamId(@Param("sanPhamId") Long id);
}
