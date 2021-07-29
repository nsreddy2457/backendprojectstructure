package com.sapient.helloworldservice;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloWorldServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void test1() {
//		sample test
		assertTrue(1 == 1);
	}
	
	@Test
	void test2() {
//		sample test
		assertTrue(2 == 2);
	}

}
