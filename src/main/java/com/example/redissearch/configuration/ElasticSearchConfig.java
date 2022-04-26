package com.example.redissearch.configuration;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;

@Configuration
public class ElasticSearchConfig  extends AbstractElasticsearchConfiguration {

  @Value("${config.elastic.host}")
  String elasticHost;
  @Value("${config.elastic.port}")
  String elasticPort;

  @Override
  @Bean
  public RestHighLevelClient elasticsearchClient() {

    final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
      .connectedTo(elasticHost + ":" + elasticPort)
      .build();

    return RestClients.create(clientConfiguration).rest();
  }
}
