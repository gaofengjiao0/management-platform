package com.gaofj.mp.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author gfj
 * @version v1.0
 * @package com.gaofj.mp.sys.entity
 * @description SysUser
 * @date 2019/12/27 16:36
 */
@Data
@Accessors(chain=true)
public class SysUser {

    @TableId(value = "id",type = IdType.ASSIGN_UUID)
    private String id;

    private String name;

    private Integer sex;

    private Integer age;

    private String address;
}
