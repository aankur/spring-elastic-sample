package com.example.redissearch.repository;

import com.example.redissearch.entity.Product;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, String> {

  Iterable<Product> queryByNameContainingIgnoreCase(String prefix);
  Iterable<Product> searchByNameContainingIgnoreCase(String prefix);
  Iterable<Product> searchByTitleContainingIgnoreCase(String prefix1);

  Iterable<Product> queryByDescriptionContainingIgnoreCase(String prefix);

  @Query("{\"match\": {\"description\": {\"query\": \"?0\"}}}")
  Iterable<Product> findByNameOrDescription(String prefix1, String prefix2);
}
