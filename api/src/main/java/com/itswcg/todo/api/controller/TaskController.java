package com.itswcg.todo.api.controller;

import com.itswcg.todo.api.service.TaskService;
import com.itswcg.todo.common.api.CommonResult;
import com.itswcg.todo.mbg.model.CoreTask;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {
    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @ApiOperation("获取task")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult getItem(@PathVariable Integer id) {
        CoreTask coreTask = taskService.getItem(id);
        return CommonResult.success(coreTask);
    }

    @ApiOperation("添加task")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public CommonResult add(@RequestBody CoreTask coreTask) {
        int res = taskService.add(coreTask);
        if (res > 0) {
            return CommonResult.success(res);
        }
        return CommonResult.failed();
    }
}
