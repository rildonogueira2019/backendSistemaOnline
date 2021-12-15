package com.online;

import com.online.model.entity.Processo;
import com.online.model.entity.Testes;
import com.online.repository.ProcessoRepository;
import com.online.repository.TestesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class OnlineApplication {
/*
	@Bean
	public CommandLineRunner run(@Autowired TestesRepository repository) {
		return (args) -> {
			Testes testes = Testes.builder().nome("Rildo").build();
			repository.save(testes);
		};
		
	}*/
	public static void main(String[] args) {
		SpringApplication.run(OnlineApplication.class, args);
	}

}
