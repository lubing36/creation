package cn.lubing36.core.db.gen.mapper;

import cn.lubing36.core.db.gen.domain.OracleErrorMessage;
import cn.lubing36.core.db.gen.domain.OracleErrorMessageExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface OracleErrorMessageMapper {
    long countByExample(OracleErrorMessageExample example);

    int deleteByExample(OracleErrorMessageExample example);

    int insert(OracleErrorMessage record);

    int insertSelective(OracleErrorMessage record);

    List<OracleErrorMessage> selectByExample(OracleErrorMessageExample example);

    int updateByExampleSelective(@Param("record") OracleErrorMessage record, @Param("example") OracleErrorMessageExample example);

    int updateByExample(@Param("record") OracleErrorMessage record, @Param("example") OracleErrorMessageExample example);
    
    List<OracleErrorMessage> selectByPage(@Param("params") Map<String, Object> params);
}