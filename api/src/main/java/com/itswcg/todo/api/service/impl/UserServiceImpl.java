package com.itswcg.todo.api.service.impl;

import com.itswcg.todo.api.dao.UserParam;
import com.itswcg.todo.api.service.UserService;
import com.itswcg.todo.mbg.mapper.AuthUserMapper;
import com.itswcg.todo.mbg.model.AuthUser;
import com.itswcg.todo.mbg.model.AuthUserExample;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private AuthUserMapper authUserMapper;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(AuthUserMapper authUserMapper, PasswordEncoder passwordEncoder) {
        this.authUserMapper = authUserMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public AuthUser register(UserParam userParam) {
        AuthUser authUser = new AuthUser();
        BeanUtils.copyProperties(userParam, authUser);
        authUser.setDateJoined(new Date());

        AuthUserExample example = new AuthUserExample();
        example.createCriteria().andUsernameEqualTo(authUser.getUsername());
        List<AuthUser> userList = authUserMapper.selectByExample(example);
        if (userList.size() > 0) {
            return null;
        }

        String encodePassword = passwordEncoder.encode(authUser.getPassword());
        authUser.setPassword(encodePassword);
        authUserMapper.insert(authUser);
        return authUser;
    }

    public String login(String username, String password) {
        String token = "";
        AuthUserExample example = new AuthUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        AuthUser authUser = authUserMapper.selectByExample(example).get(0);
        if (passwordEncoder.matches(password, authUser.getPassword())) {
            token = "test";
        }
        return token;
    }

    public int update(Integer id, AuthUser authUser) {
        authUser.setId(id);
        return authUserMapper.updateByPrimaryKeySelective(authUser);
    }
}
