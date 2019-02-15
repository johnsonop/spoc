package com.edu.spoc.controller;

import com.edu.spoc.base.model.Result;
import com.edu.spoc.model.SysUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @PostMapping("/addUser")
    public Result addUser(@RequestBody SysUser sysUser) {
        return success();
    }
}
