package kr.hsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.hsi.domain.ListVO;
import kr.hsi.service.ListService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/*")
@AllArgsConstructor
public class ListController {

	private ListService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", service.getList());
	}
	
//	@PostMapping("/register")
//	public String register(ListVO list) {
//		service.register(list);
//		return "redirect:/register";
//	}
	@GetMapping("/register")
	public void register() {
	}
	
	@PostMapping("/register")
	public String register(ListVO list, RedirectAttributes rttr) {
		log.info("register: " + list);
		service.register(list);
		
		rttr.addFlashAttribute("result", list.getSn());
		
		return "redirect:/register";
	}
}
