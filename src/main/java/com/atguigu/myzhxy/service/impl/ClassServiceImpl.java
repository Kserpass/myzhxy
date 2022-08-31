package com.atguigu.myzhxy.service.impl;

import com.atguigu.myzhxy.mapper.ClassMapper;
import com.atguigu.myzhxy.pojo.Class;
import com.atguigu.myzhxy.service.ClassService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("classServiceImpl")
@Transactional
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class> implements ClassService {
}
