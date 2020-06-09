package com.itswcg.todo.mapper;

import com.itswcg.todo.model.AuthUserGroups;
import com.itswcg.todo.model.AuthUserGroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthUserGroupsMapper {
    long countByExample(AuthUserGroupsExample example);

    int deleteByExample(AuthUserGroupsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthUserGroups record);

    int insertSelective(AuthUserGroups record);

    List<AuthUserGroups> selectByExample(AuthUserGroupsExample example);

    AuthUserGroups selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthUserGroups record, @Param("example") AuthUserGroupsExample example);

    int updateByExample(@Param("record") AuthUserGroups record, @Param("example") AuthUserGroupsExample example);

    int updateByPrimaryKeySelective(AuthUserGroups record);

    int updateByPrimaryKey(AuthUserGroups record);
}