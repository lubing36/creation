package cn.lubing36.bankUnionNumber;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lubing36.common.PageInfo;
import cn.lubing36.core.db.gen.domain.BankUnionNumberInfo;
import cn.lubing36.core.db.gen.domain.BankUnionNumberInfoExample;
import cn.lubing36.core.db.gen.mapper.BankUnionNumberInfoMapper;



@Controller
public class BankUnionNumberController {

	
	@Resource
	private BankUnionNumberInfoMapper bankUnionNumberInfoMapper; 
	
	@RequestMapping(value="query")
	public String query(Model model){
		BankUnionNumberInfoExample example = new BankUnionNumberInfoExample();
		BankUnionNumberInfoExample.Criteria criteria = example.createCriteria();
//		criteria.andBankNameLike("中国邮政");
		criteria.andContactPhoneEqualTo("00852-3413436");
		List<BankUnionNumberInfo> list = bankUnionNumberInfoMapper.selectByExample(example);
		model.addAttribute("list", list);
		return "query.page";
	}
	
	
//	@ResponseBody
	@RequestMapping(value="initBankUnionNumberData")
	public String initBankUnionNumberData(Model model){
		Map<String, Object> map = new HashMap<String, Object>();
		
		//获取数据总条数
		int count = (int)bankUnionNumberInfoMapper.countByExample(null);
		map.put("count", count);
		
		//获取数据集合【分页查询】
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("offset", 20);
		List<BankUnionNumberInfo> infos = bankUnionNumberInfoMapper.selectByPage(params);
		map.put("infos", infos);
	
		//初始化分页信息
		PageInfo pageInfo = new PageInfo(count, 10, 1, infos);
		map.put("pageInfo", pageInfo);
		
		model.addAttribute("data", map);
		return "bankUnionNumberData";
	}
	
	@ResponseBody
	@RequestMapping(value="queryBankUnionNumberData")
	public String queryBankUnionNumberData(Model model, BankUnionNumberInfo bankUnionNumberInfo, PageInfo pageInfo){
		System.out.println(bankUnionNumberInfo);
		System.out.println(pageInfo);
		return "";
	}
	
	
	
	@InitBinder("bankUnionNumberInfo")
	public void bankUnionNumberInfo (WebDataBinder binder){
		binder.setFieldDefaultPrefix("bankUnionNumberInfo."); //$NON-NLS-1$
	}
	@InitBinder("pageInfo")
	public void pageInfo(WebDataBinder binder){
		binder.setFieldDefaultPrefix("pageInfo");
	}
}
