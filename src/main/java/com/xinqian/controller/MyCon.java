package com.xinqian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyCon {
	@RequestMapping("index")
	public String toVisit() {
		return "index";
	}
}
