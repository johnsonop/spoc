package com.edu.spoc.controller;

import com.edu.spoc.Vo.LoginVo;
import com.edu.spoc.base.model.ErrorResult;
import com.edu.spoc.base.model.Result;
import com.edu.spoc.model.SysUser;
import com.edu.spoc.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController extends BaseController {
    private UserService userService;

    /**
     * 验证用户登录
     *
     * @param loginVo 用户信息
     * @param session session
     * @return result
     */
    @RequestMapping("/login")
    public Result login(LoginVo loginVo, HttpSession session, BindingResult result) {
        //请求参数校验
        if (result.hasErrors()) {
            return new ErrorResult(HttpStatus.INTERNAL_SERVER_ERROR, result.getAllErrors());
        }
        SysUser sysUser = userService.verifyUser(loginVo);
        if (sysUser != null) {
            // 登录成功设置登录信息session
            session.setAttribute("login_user", loginVo);
            return success();
        } else {
            return error();
        }
    }
}
