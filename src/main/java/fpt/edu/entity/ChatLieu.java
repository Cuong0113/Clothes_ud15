package fpt.edu.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "chat_lieu")
public class ChatLieu implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "nvarchar(50) not null")
	private String tenChatLieu;
	
	@Column(name = "trang_thai")
	private short trangThai;
	
	@OneToMany(mappedBy = "chatLieu", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<SanPham> sanPhams;
}
