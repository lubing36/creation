package cn.lubing36.city;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CityPopulationController {

	@SuppressWarnings({ "static-method", "nls" })
	@RequestMapping(value = "/cityPopulation")
	public String home(Model model){
		return "cityPopulation.page";
	}
	
}
