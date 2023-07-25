package com.example.spring.jenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsDemoApplication {

	public static Logger log=LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);
	
	@PostConstruct
	public void init() {
		log.info("spring jenkins project is ready");
	}
	
	public static void main(String[] args) {
		log.info("springjenkinsDemo is started:");
		SpringApplication.run(SpringJenkinsDemoApplication.class, args);
	}

}
