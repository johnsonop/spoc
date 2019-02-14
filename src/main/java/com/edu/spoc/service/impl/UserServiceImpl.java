package com.edu.spoc.service.impl;

import com.edu.spoc.Vo.LoginVo;
import com.edu.spoc.mapper.SysUserMapper;
import com.edu.spoc.model.SysUser;
import com.edu.spoc.model.SysUserExample;
import com.edu.spoc.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户查询service
 *
 * @author wjc
 */
@Service
public class UserServiceImpl implements UserService {

    private SysUserMapper sysUserMapper;

    @Override
    public SysUser verifyUser(LoginVo loginVo) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andLoginNameEqualTo(loginVo.getUsername());
        example.createCriteria().andLoginNameEqualTo(loginVo.getPassword());
        List<SysUser> sysUsers = sysUserMapper.selectByExample(example);
        if (!sysUsers.isEmpty() && sysUsers.size() == 1) {
            return sysUsers.get(0);
        }
        return null;
    }


}
