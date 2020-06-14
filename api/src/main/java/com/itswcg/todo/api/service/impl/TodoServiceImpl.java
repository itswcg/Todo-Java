package com.itswcg.todo.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.itswcg.todo.api.service.TodoService;
import com.itswcg.todo.mbg.mapper.CoreTodoMapper;
import com.itswcg.todo.mbg.model.CoreTodo;
import com.itswcg.todo.mbg.model.CoreTodoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private CoreTodoMapper coreTodoMapper;

    @Autowired
    public TodoServiceImpl(CoreTodoMapper coreTodoMapper) {
        this.coreTodoMapper = coreTodoMapper;
    }

    public int add(CoreTodo coreTodo) {
        return coreTodoMapper.insertSelective(coreTodo);
    }

    public int update(Integer id, CoreTodo coreTodo) {
        coreTodo.setId(id);
        return coreTodoMapper.updateByPrimaryKeySelective(coreTodo);
    }

    public int delete(Integer id) {
        return coreTodoMapper.deleteByPrimaryKey(id);
    }

    public List<CoreTodo> list(Integer author_id, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CoreTodoExample example = new CoreTodoExample();
        example.createCriteria().andAuthorIdEqualTo(author_id);
        return coreTodoMapper.selectByExample(example);
    }

    @Override
    public CoreTodo getItem(Integer id) {
        return coreTodoMapper.selectByPrimaryKey(id);
    }

}
