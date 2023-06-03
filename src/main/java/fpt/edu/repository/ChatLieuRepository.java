package fpt.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fpt.edu.entity.ChatLieu;

@Repository
public interface ChatLieuRepository extends JpaRepository<ChatLieu, Long>{
	
}
