package cn.lubing36.bankUnionNumber;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

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
		return "query";
	}

	
	
	
	@RequestMapping(value="showBankUnionNumberDataPage")
	public String queryBankUnionNumberData(Model model){
		return "bankUnionNumber.bankUnionNumberData";
	}
	
	
	@RequestMapping(value="queryBankUnionNumberData")
	public @ResponseBody String temp(HttpServletRequest request){
		String bankName = request.getParameter("bankName");
		String bankUnionNumber = request.getParameter("bankUnionNumber");
		
		BankUnionNumberInfoExample example = new BankUnionNumberInfoExample();
		BankUnionNumberInfoExample.Criteria criteria = example.createCriteria();
		criteria.andBankNameLike("%"+ bankName +"%");
		if(!StringUtils.isBlank(bankUnionNumber)){
			criteria.andBankUnionNumberEqualTo(bankUnionNumber);
		}
		long count = bankUnionNumberInfoMapper.countByExample(example);
		//获取数据集合【分页查询】
		Map<String, Object> params = new HashMap<String, Object>();
		String offset = request.getParameter("offset");
		params.put("offset", Integer.valueOf(offset));
		params.put("bankName", bankName);
		params.put("bankUnionNumber", bankUnionNumber);
		
		List<BankUnionNumberInfo> infos = bankUnionNumberInfoMapper.selectByPage(params);
		Object str = JSON.toJSON(infos);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", count);
		map.put("rows", str);
		return JSON.toJSON(map).toString();
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
