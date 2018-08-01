package cn.lubing36.core.db.gen.mapper;

import cn.lubing36.core.db.gen.domain.JcPlannedOrder;
import cn.lubing36.core.db.gen.domain.JcPlannedOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JcPlannedOrderMapper {
    long countByExample(JcPlannedOrderExample example);

    int deleteByExample(JcPlannedOrderExample example);

    int insert(JcPlannedOrder record);

    int insertSelective(JcPlannedOrder record);

    List<JcPlannedOrder> selectByExample(JcPlannedOrderExample example);

    int updateByExampleSelective(@Param("record") JcPlannedOrder record, @Param("example") JcPlannedOrderExample example);

    int updateByExample(@Param("record") JcPlannedOrder record, @Param("example") JcPlannedOrderExample example);
}