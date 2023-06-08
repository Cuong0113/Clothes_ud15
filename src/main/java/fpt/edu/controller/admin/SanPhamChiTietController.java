package fpt.edu.controller.admin;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fpt.edu.entity.ChatLieu;
import fpt.edu.entity.KichCo;
import fpt.edu.entity.KieuDang;
import fpt.edu.entity.LoaiHang;
import fpt.edu.entity.MauSac;
import fpt.edu.entity.PhongCach;
import fpt.edu.entity.SanPham;
import fpt.edu.entity.SanPhamChiTiet;
import fpt.edu.service.ChatLieuService;
import fpt.edu.service.KichCoService;
import fpt.edu.service.KieuDangService;
import fpt.edu.service.LoaiHangService;
import fpt.edu.service.MauSacService;
import fpt.edu.service.PhongCachService;
import fpt.edu.service.SanPhamChiTietService;
import fpt.edu.service.SanPhamService;
import fpt.edu.service.model.dto.ChatLieuDTO;
import fpt.edu.service.model.dto.KichCoDTO;
import fpt.edu.service.model.dto.KieuDangDTO;
import fpt.edu.service.model.dto.LoaiHangDTO;
import fpt.edu.service.model.dto.MauSacDTO;
import fpt.edu.service.model.dto.PhongCachDTO;
import fpt.edu.service.model.dto.SanPhamChiTietDTO;
import fpt.edu.service.model.dto.SanPhamDTO;
import fpt.edu.service.model.dto.SanPhamManageDTO;
import fpt.edu.service.model.search.SPAndSPCTSearchDto;

@Controller
@RequestMapping("admin/product")
public class SanPhamChiTietController {
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
	
	@Autowired
	private KieuDangService kieuDangService;
	
	@ModelAttribute("lstMauSac")
	public List<MauSacDTO> getLstMauSac(){
		return mauSacService.selectAllMauSacExist().stream().map(item->{
			MauSacDTO dto = new MauSacDTO();
			BeanUtils.copyProperties(item, dto);
			return dto;
		}).collect(Collectors.toList());
	}
	
	@ModelAttribute("lstKieuDang")
	public List<KieuDangDTO> getLstKieuDang(){
		return kieuDangService.selectAllKieuDangExist().stream().map(item->{
			KieuDangDTO dto = new KieuDangDTO();
			BeanUtils.copyProperties(item, dto);
			return dto;
		}).collect(Collectors.toList());
	}
	
	@ModelAttribute("lstChatLieu")
	public List<ChatLieuDTO> getLstChatLieu(){
		return chatLieuService.selectAllChatLieuExist().stream().map(item->{
			ChatLieuDTO dto = new ChatLieuDTO();
			BeanUtils.copyProperties(item, dto);
			return dto;
		}).collect(Collectors.toList());
	}
	
	@ModelAttribute("lstKichCo")
	public List<KichCoDTO> getLstKichCo(){
		return kichCoService.selectAllKichCoExist().stream().map(item->{
			KichCoDTO dto = new KichCoDTO();
			BeanUtils.copyProperties(item, dto);
			return dto;
		}).collect(Collectors.toList());
	}
	
	@ModelAttribute("lstLoaiHang")
	public List<LoaiHangDTO> getLstLoaiHang(){
		return loaiHangService.selectAllLoaiHangExist().stream().map(item->{
			LoaiHangDTO dto = new LoaiHangDTO();
			BeanUtils.copyProperties(item, dto);
			return dto;
		}).collect(Collectors.toList());
	}
	
	@ModelAttribute("lstPhongCach")
	public List<PhongCachDTO> getLstPhongCach(){
		return phongCachService.selectAllPhongCachExist().stream().map(item->{
			PhongCachDTO dto = new PhongCachDTO();
			BeanUtils.copyProperties(item, dto);
			return dto;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("")
	public String productManage(ModelMap model) {
		List<SanPhamChiTiet> result = sanPhamChiTietService.getLstSanPhamChiTietExist();
		model.addAttribute("sanPhamChiTiets", result);
		model.addAttribute("dataSearch", new SPAndSPCTSearchDto());
		return "dashboard/product/productManage";
	}
	
	@GetMapping("add")
	public String addProductDetail(ModelMap model) {
		model.addAttribute("sanPhamManageDTO", new SanPhamManageDTO());
		return "dashboard/product/addOrEdit";
	}
	
	@GetMapping("genData")
	public String genData(ModelMap model, @RequestParam("d") Long id) {
		List<SanPhamChiTiet> dataGen = sanPhamChiTietService.getLstSanPhamChiTietBySanPhamId(id);
		model.addAttribute("sanPhamManageDTO", new SanPhamManageDTO());
		model.addAttribute("dataGen", dataGen);
		return "dashboard/product/addOrEdit";
	}
	
	@PostMapping("generateProductDetails")
	public ModelAndView generateProductDetails(ModelMap model,
			@Valid @ModelAttribute("SanPhamManageDTO") SanPhamManageDTO data,
			BindingResult result) {
//		if(result.hasErrors()) {
//			model.addAttribute("sanPhamManageDTO", data);
//			return new ModelAndView("dashboard/product/addOrEdit", model);
//		}
		SanPham sanPham = new SanPham();
		sanPham.setDaXoa(false);
		sanPham.setGiaHienHanh(data.getGiaHienHanh());
		sanPham.setTenSanPham(data.getTenSanPham());	
		
		sanPham.setMoTa("");
		
		ChatLieu chatLieu = new ChatLieu();
		chatLieu.setId(data.getChatLieuId());;
		sanPham.setChatLieu(chatLieu);
		
		LoaiHang loaiHang = new LoaiHang();
		loaiHang.setId(data.getLoaiHangId());
		sanPham.setLoaiHang(loaiHang);
		
		PhongCach phongCach = new PhongCach();
		phongCach.setId(data.getPhongCachId());
		sanPham.setPhongCach(phongCach);
		
		KieuDang kieuDang = new KieuDang();
		kieuDang.setId(data.getKieuDangId());
		sanPham.setKieuDang(kieuDang);
		
		sanPhamService.save(sanPham);
		
		for (Long kichCoId : data.getKichCoIds()) {
			for (Long mauSacId : data.getMauSacIds()) {
				SanPhamChiTiet spct = new SanPhamChiTiet();
				spct.setCoHienThi(true);
				spct.setDaXoa(false);
				spct.setSanPham(sanPham);
				
				KichCo kichCo = new KichCo();
				kichCo.setId(kichCoId);
				spct.setKichCo(kichCo);
				
				MauSac mauSac = new MauSac();
				mauSac.setId(mauSacId);
				spct.setMauSac(mauSac);
				
				spct.setSoLuong(0);
				sanPhamChiTietService.save(spct);
			}
		}
//		List<SanPhamChiTiet> dataGen = sanPhamChiTietService.getLstSanPhamChiTietBySanPhamId(sanPham.getId());
//		model.addAttribute("sanPhamManageDTO", data);
//		model.addAttribute("dataGen", dataGen);
		return new ModelAndView("redirect:/admin/product/genData?d=" + sanPham.getId(), model);
	}
	
	@GetMapping("changeIsShow/{id}/{status}")
	public String changeIsShow(ModelMap model, @PathVariable("id") Long id,
			@PathVariable("status") Boolean status) {
		Optional<SanPhamChiTiet> opt = sanPhamChiTietService.findById(id);
		if(opt.isPresent()) {
			opt.get().setCoHienThi(status);
			sanPhamChiTietService.save(opt.get());
			model.addAttribute("messageSuccess", "Sửa trạng thái hiển thị của sản phẩm thành công");
		}
		List<SanPhamChiTiet> result = sanPhamChiTietService.getLstSanPhamChiTietExist();
		model.addAttribute("sanPhamChiTiets", result);
		model.addAttribute("dataSearch", new SPAndSPCTSearchDto());
		return "dashboard/product/productManage";
	}
	
	@GetMapping("changeIsShowFormAddOrEdit/{id}/{status}")
	public ModelAndView changeIsShowFormAddOrEdit(ModelMap model, @PathVariable("id") Long id,
			@PathVariable("status") Boolean status) {
		Optional<SanPhamChiTiet> opt = sanPhamChiTietService.findById(id);
		if(opt.isPresent()) {
			opt.get().setCoHienThi(status);
			sanPhamChiTietService.save(opt.get());
			model.addAttribute("messageSuccess", "Sửa trạng thái hiển thị của sản phẩm thành công");
		}else model.addAttribute("messageSuccess", "Sửa trạng thái hiển thị của sản phẩm thất bại");
		return new ModelAndView("redirect:/admin/product/genData?d=" + opt.get().getSanPham().getId());
	}
	
}
