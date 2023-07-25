package com.example.spring.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemoApplicationTests {

	public static Logger log=LoggerFactory.getLogger(SpringJenkinsDemoApplicationTests.class);
	
	@Test
	void contextLoads() {
	
		log.info("Test case Executed...");
		log.info("Test case Executed second test case executed....");
		assertEquals(true, true);
	}

}
