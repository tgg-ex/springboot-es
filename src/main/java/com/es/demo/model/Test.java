package com.es.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Document(indexName = "test", type = "tgg", shards = 1, replicas = 0)
public class Test {

    @Id
    private Long id;

    @Field(type = FieldType.Text)
    private String name;
}
