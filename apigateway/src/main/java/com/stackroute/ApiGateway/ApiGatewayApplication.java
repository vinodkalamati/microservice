package com.stackroute.ApiGateway;

import com.stackroute.ApiGateway.filters.ErrorFilter;
import com.stackroute.ApiGateway.filters.PostFilter;
import com.stackroute.ApiGateway.filters.PreFilter;
import com.stackroute.ApiGateway.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);

	}
		@Bean
		public PreFilter preFilter() {
			return new PreFilter();
		}
		@Bean
		public PostFilter postFilter() {
			return new PostFilter();
		}
		@Bean
		public ErrorFilter errorFilter() {
			return new ErrorFilter();
		}
		@Bean
		public RouteFilter routeFilter() {
			return new RouteFilter();
		}


}
