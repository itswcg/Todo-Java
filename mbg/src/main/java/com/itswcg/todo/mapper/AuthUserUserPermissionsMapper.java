package com.itswcg.todo.mapper;

import com.itswcg.todo.model.AuthUserUserPermissions;
import com.itswcg.todo.model.AuthUserUserPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthUserUserPermissionsMapper {
    long countByExample(AuthUserUserPermissionsExample example);

    int deleteByExample(AuthUserUserPermissionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthUserUserPermissions record);

    int insertSelective(AuthUserUserPermissions record);

    List<AuthUserUserPermissions> selectByExample(AuthUserUserPermissionsExample example);

    AuthUserUserPermissions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthUserUserPermissions record, @Param("example") AuthUserUserPermissionsExample example);

    int updateByExample(@Param("record") AuthUserUserPermissions record, @Param("example") AuthUserUserPermissionsExample example);

    int updateByPrimaryKeySelective(AuthUserUserPermissions record);

    int updateByPrimaryKey(AuthUserUserPermissions record);
}