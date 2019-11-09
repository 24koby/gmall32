package com.hdu.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描mapper类
//@MapperScan(basePackages = "com.hdu.gmall.user.mapper")
//这里需要使用通用mapperscan扫描，集成通用mapper时需使用这个扫描
@MapperScan("com.hdu.gmall.user.mapper")
public class GmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserApplication.class, args);
    }

}
