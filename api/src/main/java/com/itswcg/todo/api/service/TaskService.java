package com.itswcg.todo.api.service;

import com.itswcg.todo.mbg.model.CoreTask;

public interface TaskService {
    CoreTask getItem(Integer id);
    int add(CoreTask coreTask);
}
