package fpt.edu.repository;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.SanPham;

@Repository
@Primary
public interface SanPhamRepository extends JpaRepository<SanPham, Long>, SanPhamSearchRepository{
	@Query(value = "SELECT * FROM `san_pham` s WHERE s.da_xoa = false ORDER BY s.id DESC ", nativeQuery = true)
	List<SanPham> selectSanPhamExist();

	@Query(value = "SELECT * FROM `san_pham` s WHERE s.id = :id AND s.da_xoa = false ORDER BY s.id DESC ", nativeQuery = true)
	List<SanPham> selectSanPhamExistById(@Param("id") Long id);
}
