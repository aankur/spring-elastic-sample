package com.example.redissearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "product")
public class Product {
  @Id
  private String id;
  private String externalProductID;
  private String name;
  private String title;
  private String description;
}
