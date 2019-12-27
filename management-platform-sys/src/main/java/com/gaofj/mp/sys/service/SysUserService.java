package com.gaofj.mp.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gaofj.mp.sys.entity.SysUser;

import java.util.List;

/**
 * @author gfj
 * @version v1.0
 * @package com.gaofj.mp.sys.service
 * @description SysUserService
 * @date 2019/12/27 17:10
 */
public interface SysUserService extends IService<SysUser> {

    public List<SysUser> findList();

    public int addUser(SysUser sysUser);
}
