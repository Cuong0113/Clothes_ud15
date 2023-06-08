package com.fpoly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpoly.entity.SanPham;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham,Long> {

}
