package com.hdu.gmall.user;

import com.hdu.gmall.user.bean.UmsMember;
import com.hdu.gmall.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallUserApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        userService.getAllUser();
    }

}
