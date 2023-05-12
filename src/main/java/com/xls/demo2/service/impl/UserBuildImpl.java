package com.xls.demo2.service.impl;


import com.xls.demo2.entity.Build;


import com.xls.demo2.mapper.UserBuildMapper;
import com.xls.demo2.service.UserBuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//数据库保存
@Service
public class UserBuildImpl implements UserBuildService {
    @Autowired
    UserBuildMapper userBuildMapper;

    @Override
    public void save(Build build) {
        userBuildMapper.insert(build);
    }
}