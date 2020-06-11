package com.itswcg.todo.mbg.mapper;

import com.itswcg.todo.mbg.model.AuthUser;
import com.itswcg.todo.mbg.model.AuthUserExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthUserMapper {
    long countByExample(AuthUserExample example);

    int deleteByExample(AuthUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthUser record);

    int insertSelective(AuthUser record);

    List<AuthUser> selectByExample(AuthUserExample example);

    AuthUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthUser record, @Param("example") AuthUserExample example);

    int updateByExample(@Param("record") AuthUser record, @Param("example") AuthUserExample example);

    int updateByPrimaryKeySelective(AuthUser record);

    int updateByPrimaryKey(AuthUser record);
}