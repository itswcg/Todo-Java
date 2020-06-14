package com.itswcg.todo.api.controller;

import com.itswcg.todo.api.dao.UserParam;
import com.itswcg.todo.api.service.UserService;
import com.itswcg.todo.common.api.CommonResult;
import com.itswcg.todo.mbg.model.AuthUser;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation("注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public CommonResult<AuthUser> register(@RequestBody UserParam userParam) {
        AuthUser authUser = userService.register(userParam);
        return CommonResult.success(authUser);
    }

    @ApiOperation("登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResult login(@RequestBody UserParam userParam) {
        String username = userParam.getUsername();
        String password = userParam.getPassword();

        String token = userService.login(username, password);
        return CommonResult.success(token);
    }

    @ApiOperation("修改资料")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public CommonResult update(@PathVariable Integer id, @RequestBody AuthUser authUser) {
        int res = userService.update(id, authUser);
        if (res > 0) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }
}
