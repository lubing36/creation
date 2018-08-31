package cn.lubing36.oracle;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.lubing36.core.db.gen.domain.BankUnionNumberInfo;
import cn.lubing36.core.db.gen.domain.BankUnionNumberInfoExample;
import cn.lubing36.core.db.gen.domain.OracleErrorMessage;
import cn.lubing36.core.db.gen.domain.OracleErrorMessageExample;
import cn.lubing36.core.db.gen.mapper.OracleErrorMessageMapper;



@Controller
public class OracleErrorMessageController {

	@Resource
	private OracleErrorMessageMapper oracleErrorMessageMapper;
	
	@RequestMapping(value="showOracleErrorMessageDataPage")
	public String queryBankUnionNumberData(Model model){
		return "oracle.oracleErrorMessage";
	}
	
	@RequestMapping(value="queryOracleErrorMessageData")
	public @ResponseBody String temp(HttpServletRequest request){
		
		String errorCode = request.getParameter("errorCode");
		
		OracleErrorMessageExample example = new OracleErrorMessageExample();
		OracleErrorMessageExample.Criteria criteria = example.createCriteria();
		criteria.andErrorCodeLike("%"+ errorCode +"%");		
		long count = oracleErrorMessageMapper.countByExample(example);
		//获取数据集合【分页查询】
		Map<String, Object> params = new HashMap<String, Object>();
		String offset = request.getParameter("offset");
		params.put("offset", Integer.valueOf(offset));
		params.put("errorCode", errorCode);
		List<OracleErrorMessage> infos = oracleErrorMessageMapper.selectByPage(params);
		Object str = JSON.toJSON(infos);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", count);
		map.put("rows", str);
		return JSON.toJSON(map).toString();
	}
	
	
	
	
}
