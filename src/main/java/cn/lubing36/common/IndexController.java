package cn.lubing36.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	private static final String REDIRECT_INDEX = "redirect:main.htm";
	
	@RequestMapping(value="/")
	public String index(){
		return REDIRECT_INDEX;
	}
	
	@RequestMapping(value="main")
	public String showIndex(){
		return "common.main";
	}

}
