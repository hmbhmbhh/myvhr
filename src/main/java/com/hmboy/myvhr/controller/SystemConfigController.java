package com.hmboy.myvhr.controller;

import com.hmboy.myvhr.model.Menu;
import com.hmboy.myvhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hmbfe
 * @version：
 * @date 2020-11-22 14:53
 * @description：系统配置controller
 * 注意事项：前端数据不可信，需要在后端继续校验数据，用户id同样需要后端校验，比如别人用postman这种工具传，会不安全
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {
    @Autowired
    private MenuService menuService;

    @GetMapping("/menu")
    public List<Menu> getMenuByHrid(){
        return menuService.getMenuByHrid();
    }
}
