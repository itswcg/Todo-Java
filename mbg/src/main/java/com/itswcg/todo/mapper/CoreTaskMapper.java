package com.itswcg.todo.mapper;

import com.itswcg.todo.model.CoreTask;
import com.itswcg.todo.model.CoreTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoreTaskMapper {
    long countByExample(CoreTaskExample example);

    int deleteByExample(CoreTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreTask record);

    int insertSelective(CoreTask record);

    List<CoreTask> selectByExample(CoreTaskExample example);

    CoreTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreTask record, @Param("example") CoreTaskExample example);

    int updateByExample(@Param("record") CoreTask record, @Param("example") CoreTaskExample example);

    int updateByPrimaryKeySelective(CoreTask record);

    int updateByPrimaryKey(CoreTask record);
}