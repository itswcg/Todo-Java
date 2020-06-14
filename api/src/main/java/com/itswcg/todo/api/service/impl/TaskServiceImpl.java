package com.itswcg.todo.api.service.impl;

import com.itswcg.todo.api.service.TaskService;
import com.itswcg.todo.mbg.mapper.CoreTaskMapper;
import com.itswcg.todo.mbg.model.CoreTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private CoreTaskMapper coreTaskMapper;

    @Autowired
    public TaskServiceImpl(CoreTaskMapper coreTaskMapper) {
        this.coreTaskMapper = coreTaskMapper;
    }

    public CoreTask getItem(Integer id) {
        return coreTaskMapper.selectByPrimaryKey(id);
    }

    public int add(CoreTask coreTask) {
        return coreTaskMapper.insertSelective(coreTask);
    }
}
