package com.example.redissearch.runner;

import com.example.redissearch.entity.Product;
import com.example.redissearch.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
@Slf4j
public class TestRunner {

  @Autowired
  ProductRepository productRepository;

  @Bean
  CommandLineRunner runSampleTest() {
    return args -> {
      productRepository.deleteAll();
      Product product = new Product();
      product.setExternalProductID("product-iphone-13");
      product.setName("iPhone 13");
      product.setTitle("Sujithras iPhone 13");
      product.setDescription("This iPhone belongs to sujithra");
      productRepository.save(product);

      Iterable<Product> productIterable = productRepository.searchByNameContainingIgnoreCase("th");
      productIterable.forEach(product1 -> {
        log.info("{}", product1);
      });

      productIterable = productRepository.searchByTitleContainingIgnoreCase("th");
      productIterable.forEach(product1 -> {
        log.info("{}", product1);
      });

      productIterable = productRepository.queryByNameContainingIgnoreCase("pho");
      productIterable.forEach(product1 -> {
        log.info("{}", product1);
      });

      productIterable = productRepository.queryByDescriptionContainingIgnoreCase("bel");
      productIterable.forEach(product1 -> {
        log.info("{}", product1);
      });

      productIterable = productRepository.findByNameOrDescription("ongs to", "ongs to");
      productIterable.forEach(product1 -> {
        log.info("{}", product1);
      });
    };
  }
}
