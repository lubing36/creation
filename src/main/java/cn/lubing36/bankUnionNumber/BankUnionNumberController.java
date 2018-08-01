package cn.lubing36.bankUnionNumber;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
//		criteria.andBankNameLike("ÖÐ¹úÓÊÕþ");
		criteria.andContactPhoneEqualTo("00852-3413436");
		List<BankUnionNumberInfo> list = bankUnionNumberInfoMapper.selectByExample(example);
		model.addAttribute("list", list);
		return "query.page";
	}
	
	
}
