package com.hmboy.myvhr.controller;

import com.hmboy.myvhr.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hmbfe
 * @version：
 * @date 2020-11-05 23:39
 * @description：
 */
@RestController
public class LoginController {
    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error("尚未登陆，请登录");
    }
}
