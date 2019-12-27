package com.gaofj.mp.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gaofj.mp.sys.entity.SysUser;
import com.gaofj.mp.sys.mapper.SysUserMapper;
import com.gaofj.mp.sys.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gfj
 * @version v1.0
 * @package com.gaofj.mp.sys.service.impl
 * @description SysUserServiceImpl
 * @date 2019/12/27 17:11
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper,SysUser> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findList() {
        return this.sysUserMapper.selectList(null);
    }

    @Override
    public int addUser(SysUser sysUser) {
        return this.sysUserMapper.insert(sysUser);
    }
}
