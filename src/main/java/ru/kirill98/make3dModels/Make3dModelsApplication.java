package ru.kirill98.make3dModels;

import lombok.extern.log4j.Log4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j
public class Make3dModelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Make3dModelsApplication.class, args);
		log.info("Was start app");
	}

//	@Bean
//	public SpringTemplateEngine templateEngine(ITemplateResolver templateResolver, SpringSecurityDialect sec) {
//		final SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//		templateEngine.setTemplateResolver(templateResolver);
//		templateEngine.addDialect(sec); // Enable use of "sec"
//		return templateEngine;
//	}



}
