package com.springangul.springangulproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springangul.springangulproject.enumeration.Status;
import com.springangul.springangulproject.models.Server;
import com.springangul.springangulproject.repository.ServerRepository;

@SpringBootApplication
public class SpringAngulProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngulProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepository serverRepository) {
		return args -> {
    	  serverRepository.save(new Server(null,"192.168.1.170","Ubuntu Linux","16 GB","Personal PC", "http://localhost:8080/server/image/server1.png",Status.SERVER_UP));
    	  serverRepository.save(new Server(null,"192.168.1.14","Fedora Linux","16 GB","Dell Tower", "http://localhost:8080/server/image/server2.png",Status.SERVER_UP));
    	  serverRepository.save(new Server(null,"192.168.1.20","MS 2008","32 GB","Web Server", "http://localhost:8080/server/image/server3.png",Status.SERVER_UP));
    	  serverRepository.save(new Server(null,"192.168.1.16","Red Hat Entreprise Linux","64 GB","Mail Server", "http://localhost:8080/server/image/server4.png",Status.SERVER_DOWN));
        };
	}
}
