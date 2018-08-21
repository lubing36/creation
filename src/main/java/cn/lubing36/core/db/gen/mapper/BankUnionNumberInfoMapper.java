package cn.lubing36.core.db.gen.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.lubing36.core.db.gen.domain.BankUnionNumberInfo;
import cn.lubing36.core.db.gen.domain.BankUnionNumberInfoExample;

public interface BankUnionNumberInfoMapper {
    long countByExample(BankUnionNumberInfoExample example);

    int deleteByExample(BankUnionNumberInfoExample example);

    int insert(BankUnionNumberInfo record);

    int insertSelective(BankUnionNumberInfo record);

    List<BankUnionNumberInfo> selectByExample(BankUnionNumberInfoExample example);

    int updateByExampleSelective(@Param("record") BankUnionNumberInfo record, @Param("example") BankUnionNumberInfoExample example);

    int updateByExample(@Param("record") BankUnionNumberInfo record, @Param("example") BankUnionNumberInfoExample example);
    
    List<BankUnionNumberInfo> selectByPage(@Param("params") Map<String, Object> params);
    
}