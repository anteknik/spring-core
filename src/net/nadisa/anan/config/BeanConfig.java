package net.nadisa.anan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.nadisa.anan.entities.Greetings;


@Configuration
public class BeanConfig {

	@Bean
	public Greetings createGreetings() {
		Greetings greetings = new Greetings();
		greetings.setMessage("Hello Spring");
		return greetings;
	}

}
