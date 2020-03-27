package com.es.demo.dao;

import com.es.demo.model.Test;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import java.util.List;

public interface TestRepository extends ElasticsearchCrudRepository<Test,Long> {

    List<Test> findByName(String name);
}
