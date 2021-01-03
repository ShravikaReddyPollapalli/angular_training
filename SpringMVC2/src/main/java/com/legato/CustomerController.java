package com.legato;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	CusDAO cdao = ctx.getBean(CusDAO.class);
	
	@GetMapping(path = { "/showcus" })
	public String showAllCus(ModelMap model) {
		List<Cus> cuslist = cdao.getCusDetails();
		model.addAttribute("clist", cuslist);
		return "cus";
	}
	
	@RequestMapping(path = "/savecus",
			method = RequestMethod.POST)
	public String addCus(@RequestParam("id") Integer id,
						 @RequestParam("name") String name,
						 @RequestParam("address") String address
						 ) {
		Cus cus = ctx.getBean(Cus.class);
		cus.setId(id);	
		cus.setName(name);
		cus.setAddress(address);
		cdao.addCus(cus);
		return "redirect:showcus";
	}
}
