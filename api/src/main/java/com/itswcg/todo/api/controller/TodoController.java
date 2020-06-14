package com.itswcg.todo.api.controller;

import com.itswcg.todo.api.service.TodoService;
import com.itswcg.todo.common.api.CommonPage;
import com.itswcg.todo.common.api.CommonResult;
import com.itswcg.todo.mbg.model.CoreTodo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/todo")
public class TodoController {
    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @ApiOperation("获取todo列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<CoreTodo>> list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                   @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        Integer author_id = 1;
        List<CoreTodo> todoList = todoService.list(author_id, pageNum, pageSize);
        return CommonResult.success(CommonPage.setPage(todoList));
    }

    @ApiOperation("获取单个todo信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CoreTodo> getItem(@PathVariable Integer id) {
        CoreTodo coreTodo = todoService.getItem(id);
        return CommonResult.success(coreTodo);
    }

    @ApiOperation("添加todo")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody CoreTodo coreTodo) {
        int res = todoService.add(coreTodo);
        if (res > 0) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除todo")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult delete(@PathVariable Integer id) {
        int res = todoService.delete(id);
        if (res > 0) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    @ApiOperation("do Todo")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult update(@PathVariable Integer id, @RequestBody CoreTodo coreTodo) {
        int res = todoService.update(id, coreTodo);
        if (res > 0) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }
}
