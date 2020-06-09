package com.itswcg.todo.mapper;

import com.itswcg.todo.model.AuthGroup;
import com.itswcg.todo.model.AuthGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthGroupMapper {
    long countByExample(AuthGroupExample example);

    int deleteByExample(AuthGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthGroup record);

    int insertSelective(AuthGroup record);

    List<AuthGroup> selectByExample(AuthGroupExample example);

    AuthGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthGroup record, @Param("example") AuthGroupExample example);

    int updateByExample(@Param("record") AuthGroup record, @Param("example") AuthGroupExample example);

    int updateByPrimaryKeySelective(AuthGroup record);

    int updateByPrimaryKey(AuthGroup record);
}