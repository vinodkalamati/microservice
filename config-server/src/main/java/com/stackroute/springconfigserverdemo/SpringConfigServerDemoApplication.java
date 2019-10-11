package com.stackroute.springconfigserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerDemoApplication.class, args);
	}

}
