package com.itswcg.todo.mapper;

import com.itswcg.todo.model.AuthGroupPermissions;
import com.itswcg.todo.model.AuthGroupPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthGroupPermissionsMapper {
    long countByExample(AuthGroupPermissionsExample example);

    int deleteByExample(AuthGroupPermissionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthGroupPermissions record);

    int insertSelective(AuthGroupPermissions record);

    List<AuthGroupPermissions> selectByExample(AuthGroupPermissionsExample example);

    AuthGroupPermissions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthGroupPermissions record, @Param("example") AuthGroupPermissionsExample example);

    int updateByExample(@Param("record") AuthGroupPermissions record, @Param("example") AuthGroupPermissionsExample example);

    int updateByPrimaryKeySelective(AuthGroupPermissions record);

    int updateByPrimaryKey(AuthGroupPermissions record);
}