package com.itswcg.todo.api.service;

import com.itswcg.todo.mbg.model.CoreTodo;
import io.swagger.models.auth.In;

import java.util.List;

public interface TodoService {
    int add(CoreTodo coreTodo);

    int update(Integer id, CoreTodo coreTodo);

    int delete(Integer id);

    List<CoreTodo> list(Integer author_id, Integer pageNum, Integer pageSize);

    CoreTodo getItem(Integer id);
}
