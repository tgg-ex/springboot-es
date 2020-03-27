package com.es.demo.service;

import com.es.demo.model.Test;

import java.util.List;

/**
 * @author zeng
 * <p>
 * es crud接口
 */
public interface ITestService {

    void add();

    List<Test> find();

    List<Test>  list(int page, int size);
}
