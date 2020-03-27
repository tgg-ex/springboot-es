package com.es.demo.controller;

import com.es.demo.model.Test;
import com.es.demo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zeng
 * <p>
 * es测试控制器
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService iTestService;

    @RequestMapping("/add")
    public String add() {
        iTestService.add();
        return "ok";
    }

    @RequestMapping("/find")
    public List<Test> find() {
        return iTestService.find();
    }

    @RequestMapping("/list")
    public List<Test> list(int page, int size) {
        return iTestService.list((page - 1) * size, size);
    }
}
