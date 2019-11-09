package com.hdu.gmall.user.service.impl;

import com.hdu.gmall.user.mapper.UserMapper;
import com.hdu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
}
