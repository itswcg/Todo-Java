package com.itswcg.todo.mbg.mapper;

import com.itswcg.todo.mbg.model.CoreProfile;
import com.itswcg.todo.mbg.model.CoreProfileExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoreProfileMapper {
    long countByExample(CoreProfileExample example);

    int deleteByExample(CoreProfileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreProfile record);

    int insertSelective(CoreProfile record);

    List<CoreProfile> selectByExample(CoreProfileExample example);

    CoreProfile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreProfile record, @Param("example") CoreProfileExample example);

    int updateByExample(@Param("record") CoreProfile record, @Param("example") CoreProfileExample example);

    int updateByPrimaryKeySelective(CoreProfile record);

    int updateByPrimaryKey(CoreProfile record);
}