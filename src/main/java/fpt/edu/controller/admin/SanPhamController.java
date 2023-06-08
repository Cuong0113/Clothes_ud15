package fpt.edu.controller.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.mail.FetchProfile.Item;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fpt.edu.entity.LoaiHang;
import fpt.edu.entity.MauSac;
import fpt.edu.entity.SanPham;
import fpt.edu.entity.SanPhamChiTiet;
import fpt.edu.service.ChatLieuService;
import fpt.edu.service.KichCoService;
import fpt.edu.service.LoaiHangService;
import fpt.edu.service.MauSacService;
import fpt.edu.service.PhongCachService;
import fpt.edu.service.SanPhamChiTietService;
import fpt.edu.service.SanPhamService;
import fpt.edu.service.model.dto.ChatLieuDTO;
import fpt.edu.service.model.dto.KichCoDTO;
import fpt.edu.service.model.dto.LoaiHangDTO;
import fpt.edu.service.model.dto.MauSacDTO;
import fpt.edu.service.model.dto.PhongCachDTO;
import fpt.edu.service.model.search.SPAndSPCTSearchDto;

@Controller
//@RequestMapping("admin/product")
public class SanPhamController {
	@Autowired
	private SanPhamChiTietService sanPhamChiTietService;
	
	@Autowired
	private SanPhamService sanPhamService;
	
	@Autowired
	private MauSacService mauSacService;
	
	@Autowired
	private ChatLieuService chatLieuService;
	
	@Autowired
	private KichCoService kichCoService;
	
	@Autowired
	private LoaiHangService loaiHangService;

	@Autowired
	private PhongCachService phongCachService;
	
//	@ModelAttribute("lstMauSac")
//	public List<MauSacDTO> getLstMauSac(){
//		return mauSacService.selectAllMauSacExist().stream().map(item->{
//			MauSacDTO dto = new MauSacDTO();
//			BeanUtils.copyProperties(item, dto);
//			return dto;
//		}).collect(Collectors.toList());
//	}
//	
//	@ModelAttribute("lstChatLieu")
//	public List<ChatLieuDTO> getLstChatLieu(){
//		return chatLieuService.selectAllChatLieuExist().stream().map(item->{
//			ChatLieuDTO dto = new ChatLieuDTO();
//			BeanUtils.copyProperties(item, dto);
//			return dto;
//		}).collect(Collectors.toList());
//	}
//	
//	@ModelAttribute("lstKichCo")
//	public List<KichCoDTO> getLstKichCo(){
//		return kichCoService.selectAllKichCoExist().stream().map(item->{
//			KichCoDTO dto = new KichCoDTO();
//			BeanUtils.copyProperties(item, dto);
//			return dto;
//		}).collect(Collectors.toList());
//	}
//	
//	@ModelAttribute("lstLoaiHang")
//	public List<LoaiHangDTO> getLstLoaiHang(){
//		return loaiHangService.selectAllLoaiHangExist().stream().map(item->{
//			LoaiHangDTO dto = new LoaiHangDTO();
//			BeanUtils.copyProperties(item, dto);
//			return dto;
//		}).collect(Collectors.toList());
//	}
//	
//	@ModelAttribute("lstPhongCach")
//	public List<PhongCachDTO> getLstPhongCach(){
//		return loaiHangService.selectAllLoaiHangExist().stream().map(item->{
//			PhongCachDTO dto = new PhongCachDTO();
//			BeanUtils.copyProperties(item, dto);
//			return dto;
//		}).collect(Collectors.toList());
//	}
	
//	@GetMapping("")
//	public String productManage(ModelMap model) {
//		List<SanPham> result = sanPhamService.selectSanPhamExist();
//		model.addAttribute("lstSanPham", result);
//		model.addAttribute("dataSearch", new SPAndSPCTSearchDto());
//		return "dashboard/product/productManage";
//	}
}
