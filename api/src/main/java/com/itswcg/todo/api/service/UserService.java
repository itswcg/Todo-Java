package com.itswcg.todo.api.service;

import com.itswcg.todo.api.dao.UserParam;
import com.itswcg.todo.mbg.model.AuthUser;

public interface UserService {
    AuthUser register(UserParam userParam);

    String login(String username, String password);

    int update(Integer id, AuthUser authUser);
}
