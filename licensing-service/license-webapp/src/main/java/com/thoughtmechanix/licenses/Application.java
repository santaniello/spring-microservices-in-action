package com.thoughtmechanix.licenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
/**
 * Annotation do Actuator que cria um url http://localhost:8081/refresh que quando chamado atualiza
 * as configurações dinâmcamente...
 * */
@RefreshScope
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
