package com.kk.easycode.controller;

import com.kk.easycode.entity.Manager;
import com.kk.easycode.service.ManagerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Manager)表控制层
 *
 * @author makejava
 * @since 2020-03-22 10:26:42
 */
@RestController
@RequestMapping("manager")
public class ManagerController {
    /**
     * 服务对象
     */
    @Resource
    private ManagerService managerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Manager selectOne(Integer id) {
        return this.managerService.queryById(id);
    }

}