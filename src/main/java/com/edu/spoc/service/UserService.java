package com.edu.spoc.service;

import com.edu.spoc.Vo.LoginVo;
import com.edu.spoc.model.SysUser;

/**
 * 用户查询service
 * @author wjc
 */
public interface UserService {
    /**
     * 验证用户登录信息是否正确
     * @param loginVo
     * @return
     *      1 为 验证成功
     *      0 为 验证失败
     */
    SysUser verifyUser(LoginVo loginVo);
}
