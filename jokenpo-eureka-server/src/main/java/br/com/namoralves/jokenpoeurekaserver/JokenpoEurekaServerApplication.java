package br.com.namoralves.jokenpoeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JokenpoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokenpoEurekaServerApplication.class, args);
	}
}
