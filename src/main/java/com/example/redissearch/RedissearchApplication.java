package com.example.redissearch;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.SSLContexts;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import javax.net.ssl.SSLContext;

@SpringBootApplication
public class RedissearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedissearchApplication.class, args);
	}


//	@Bean
//	public RestHighLevelClient createSimpleElasticClient() throws Exception {
//		try {
//			final CredentialsProvider credentialsProvider =
//				new BasicCredentialsProvider();
//			credentialsProvider.setCredentials(AuthScope.ANY,
//				new UsernamePasswordCredentials("elastic","Ks0BO=+Ttk-BE+1PqWUa"));
//
//			SSLContextBuilder sslBuilder = SSLContexts.custom()
//				.loadTrustMaterial(null, (x509Certificates, s) -> true);
//			final SSLContext sslContext = sslBuilder.build();
//			RestHighLevelClient client = new RestHighLevelClient(RestClient
//				//port number is given as 443 since its https schema
//				.builder(new HttpHost("localhost", 9200, "https"))
//				.setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
//					@Override
//					public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
//						return httpClientBuilder
//							.setSSLContext(sslContext)
//							.setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
//							.setDefaultCredentialsProvider(credentialsProvider);
//					}
//				})
//				.setRequestConfigCallback(new RestClientBuilder.RequestConfigCallback() {
//					@Override
//					public RequestConfig.Builder customizeRequestConfig(
//						RequestConfig.Builder requestConfigBuilder) {
//						return requestConfigBuilder.setConnectTimeout(5000)
//							.setSocketTimeout(120000);
//					}
//				}));
//			System.out.println("elasticsearch client created");
//			return client;
//		} catch (Exception e) {
//			System.out.println(e);
//			throw new Exception("Could not create an elasticsearch client!!");
//		}
//	}
}
