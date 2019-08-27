
package com.primeton.eos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import com.primeton.ptp.tarest.client.api.annotation.EnableTarestClients;


@EnableDiscoveryClient
@EnableTarestClients
@EnableCircuitBreaker
@SpringBootApplication
@ComponentScan("com")
@MapperScan("com.primeton.eos.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
