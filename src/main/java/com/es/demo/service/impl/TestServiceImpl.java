package com.es.demo.service.impl;

import com.es.demo.dao.TestRepository;
import com.es.demo.model.Test;
import com.es.demo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zeng
 * <p>
 * es crud业务实现类
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private TestRepository testRepository;

    public void addIndex() {
        elasticsearchTemplate.createIndex(Test.class);
    }

    @Override
    public void add() {
        this.addIndex();
        Test test = new Test();
        test.setId((long) (Math.random() * 100));
        test.setName("111213" + Math.random() * 1000);
        testRepository.save(test);
    }

    @Override
    public List<Test> find() {
        return testRepository.findByName("11121351.579819808789566");
        //        return testRepository.findByName("张三");
    }

    @Override
    public List<Test> list(int page, int size) {
        Page<Test> userPage = testRepository.findAll(PageRequest.of(page, size));
        return userPage.getContent();
    }
}
