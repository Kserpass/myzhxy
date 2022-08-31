package com.atguigu.myzhxy.controller;

import com.atguigu.myzhxy.pojo.Grade;
import com.atguigu.myzhxy.util.Result;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sms/gradeController")
public class GradeController {
//    sms/gradeController/getGrades/1/3?gradeName=%E4%B8%89

    @GetMapping("/getGrades/{pageNo}/{pageSize}")
    public Result getGrades(
        @PathVariable("pageNo") Integer pageNo,
        @PathVariable("pageSize") Integer pageSize,
        String  gradeName
    ) {
        // 分页 带条件查询
        Page<Grade> page = new Page<>(pageNo, pageSize);
        // 通过服务层查询

    }

}
