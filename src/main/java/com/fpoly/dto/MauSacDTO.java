package com.fpoly.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MauSacDTO {
	private Long mau_sac_id;
	
	private String ten_mau_sac;

	private String nguoi_tao;

	private Date ngay_tao;

	private String nguoi_chinh_sua;

	private Date ngay_chinh_sua;
}
