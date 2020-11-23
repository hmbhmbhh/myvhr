package com.hmboy.myvhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//项目初期新配置
/*
* 你想要在让启动类扫描到需要加在接口上加@Mapper，
* 而@MapperScan注解是把指定路径包下的类都扫描进去了，
* 不需要加@Mapper注解
* */
@MapperScan(basePackages = "com.hmboy.myvhr.mapper")
public class MyvhrApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyvhrApplication.class, args);
    }

}
