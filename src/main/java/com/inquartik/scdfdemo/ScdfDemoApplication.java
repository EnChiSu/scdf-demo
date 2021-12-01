package com.inquartik.scdfdemo;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@EnableTask
@EnableBatchProcessing
@SpringBootApplication
public class ScdfDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScdfDemoApplication.class, args);
	}
}


