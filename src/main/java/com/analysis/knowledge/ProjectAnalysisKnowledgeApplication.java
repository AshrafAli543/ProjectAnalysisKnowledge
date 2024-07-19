package com.analysis.knowledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.analysis.knowledge")
public class ProjectAnalysisKnowledgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectAnalysisKnowledgeApplication.class, args);
	}

}
