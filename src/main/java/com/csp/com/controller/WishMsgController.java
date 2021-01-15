package com.csp.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WishMsgController {

	@GetMapping("/msg")
	public String showmsg(Model model) {
		return "Wish";
		
	}
}
