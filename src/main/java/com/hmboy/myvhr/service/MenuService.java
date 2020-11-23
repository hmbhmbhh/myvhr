package com.hmboy.myvhr.service;

import com.hmboy.myvhr.mapper.MenuMapper;
import com.hmboy.myvhr.model.Hr;
import com.hmboy.myvhr.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hmbfe
 * @version：
 * @date 2020-11-22 14:57
 * @description：
 */
@Service
public class MenuService {
    @Autowired
    private MenuMapper menuMapper;

    public List<Menu> getMenuByHrid() {
        return menuMapper.getMenuByHrid(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }
}
