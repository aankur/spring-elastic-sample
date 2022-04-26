package com.example.redissearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


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
