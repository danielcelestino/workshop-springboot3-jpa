package com.aulajpamaven.course.cofig;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aulajpamaven.course.entities.User;
import com.aulajpamaven.course.repositories.UserRepository;

@Configuration
@Profile("test")  //mesmo do application.properties
public class TestConfig implements CommandLineRunner{ //executa automaticamente quando o programa for iniciado
	
	@Autowired
	private UserRepository userRepository; //inicializa automaticamente

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		userRepository.saveAll(Arrays.asList(u1,u2));
	}

}
