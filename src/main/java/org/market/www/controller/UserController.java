package org.market.www.controller;

import org.market.www.service.UserService;
import org.market.www.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/add")
	public String add(@ModelAttribute("vo")UserVo vo) {
		return "add";
	}
	
	@PostMapping("/add")
		public String add(@ModelAttribute("vo")UserVo vo,Model model) {
			userService.insert(vo);
			return "/test";
	}
}
