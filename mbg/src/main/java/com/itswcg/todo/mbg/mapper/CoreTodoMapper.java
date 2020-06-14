package com.itswcg.todo.mbg.mapper;

import com.itswcg.todo.mbg.model.CoreTodo;
import com.itswcg.todo.mbg.model.CoreTodoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoreTodoMapper {
    long countByExample(CoreTodoExample example);

    int deleteByExample(CoreTodoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreTodo record);

    int insertSelective(CoreTodo record);

    List<CoreTodo> selectByExample(CoreTodoExample example);

    CoreTodo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreTodo record, @Param("example") CoreTodoExample example);

    int updateByExample(@Param("record") CoreTodo record, @Param("example") CoreTodoExample example);

    int updateByPrimaryKeySelective(CoreTodo record);

    int updateByPrimaryKey(CoreTodo record);
}