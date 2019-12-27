package com.gaofj.mp.sys.controller;

import com.gaofj.mp.sys.entity.SysUser;
import com.gaofj.mp.sys.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author gfj
 * @version v1.0
 * @package com.gaofj.mp.sys.controller
 * @description SysUserController
 * @date 2019/12/27 17:13
 */
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/all")
    public Map all(){
        Map<String,Object> map =new HashMap<>();
        map.put("code",0);
        map.put("msg","请求成功");
        map.put("count",18);
        map.put("data",this.sysUserService.findList());
        return map;
    }

    /**
     * 新增用户
     * @param sysUser
     * @return
     */
    @PostMapping("/add")
    public int add(SysUser sysUser){
        return this.sysUserService.addUser(sysUser);
    }
}
