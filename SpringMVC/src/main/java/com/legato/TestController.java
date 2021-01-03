package com.legato;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/first")
public String first() {
	return "first";
}
	@RequestMapping("/second")
public String second() {
	return "second";
}
}
