package cn.lubing36.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TilesController {

	@SuppressWarnings({ "static-method", "nls" })
	@RequestMapping(value = "/body1", method = RequestMethod.GET)
	public String index(Model model){
		System.out.println("hasdhjasdkjahskjdhasj");
		return "body1.page";
	}
	
	@SuppressWarnings({ "static-method", "nls" })
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(Model model){
		return "index.page";
	}
}
