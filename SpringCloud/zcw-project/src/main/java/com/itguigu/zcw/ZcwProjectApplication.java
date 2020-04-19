package com.itguigu.zcw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.itguigu.zcw.project.mapper")
@EnableTransactionManagement
@EnableDiscoveryClient
@EnableSwagger2
@SpringBootApplication
public class ZcwProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZcwProjectApplication.class, args);
	}

}