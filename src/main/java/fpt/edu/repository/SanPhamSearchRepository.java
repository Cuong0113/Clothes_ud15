package fpt.edu.repository;

import java.util.List;

import fpt.edu.entity.SanPham;
import fpt.edu.service.model.search.SPAndSPCTSearchDto;

public interface SanPhamSearchRepository {

	List<SanPham> searchProductExist(SPAndSPCTSearchDto data);

}
