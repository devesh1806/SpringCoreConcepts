package com.springdemo.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springdemo.core.component.DemoBean;
import com.springdemo.core.component.HelloRestController;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringCoreConceptsApplication.class);
	public static void main(String[] args) {
		logger.debug("Hello from bridgelabz");
		ApplicationContext  context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("Demo Bean=" + demoBean.toString());
		System.out.println(context.getBean(HelloRestController.class));
		
	}

}
