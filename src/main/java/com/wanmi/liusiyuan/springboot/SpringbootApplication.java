package com.wanmi.liusiyuan.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SpringbootApplication {

	@RequestMapping("/demo")
	public String demo(){
		return "hello world liusiyuan";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
