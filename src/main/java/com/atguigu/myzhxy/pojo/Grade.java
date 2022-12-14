package com.atguigu.myzhxy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_clazz")
public class Grade {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String introducatior;
    private String manager;
    private String telephone;
}
