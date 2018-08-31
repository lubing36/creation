package cn.lubing36.jcPlanOrder;


import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.lubing36.core.db.gen.domain.JcPlannedOrder;
import cn.lubing36.core.db.gen.domain.JcPlannedOrderExample;
import cn.lubing36.core.db.gen.mapper.BankUnionNumberInfoMapper;
import cn.lubing36.core.db.gen.mapper.JcPlannedOrderMapper;


@Controller
public class JcPlanOrderController {

	private static final Logger LOG = Logger.getLogger(JcPlanOrderController.class);
	
	@Resource
	private JcPlannedOrderMapper jcPlannedOrderMapper;
	
	@Resource
	private BankUnionNumberInfoMapper bankUnionNumberInfoMapper; 
	
	
	@RequestMapping(value="show_jcPlanOrderEntering")
	public String show_jcPlanOrderEntering(Model model){
		return "jcPlanOrder.show_jcPlanOrderEntering";
	}

	
	@RequestMapping(value="jcPlanOrderAdd", method=RequestMethod.POST)
	public String jcPlanOrderSubmit(Model model, JcPlannedOrder jcPlannedOrder) throws IOException{
		if(jcPlannedOrder!=null){
			try {
				this.jcPlannedOrderMapper.insert(jcPlannedOrder);
				model.addAttribute("result", "数据入库完成");
			} catch (Exception e) {
				LOG.error(e.getMessage());
				model.addAttribute("result", "数据入库异常");
			}
		}
		return "result";
	}
	
	
	@InitBinder("jcPlannedOrder")
	public void jcPlannedOrder (WebDataBinder binder){
		binder.setFieldDefaultPrefix("jcPlannedOrder."); //$NON-NLS-1$
	}
	
	
}
