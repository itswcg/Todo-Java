package com.itswcg.todo.api.service;

import com.itswcg.todo.mbg.model.AuthUser;

public interface UserService {
    AuthUser register(AuthUser authUser);

    String login(String username, String password);

    int update(AuthUser authUser);
}
