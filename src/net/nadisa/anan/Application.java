package net.nadisa.anan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.nadisa.anan.config.BeanConfig;
import net.nadisa.anan.config.BeanConfig2;
import net.nadisa.anan.entities.Greetings;

public class Application {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanConfig.class, BeanConfig2.class);
		context.refresh();

		Greetings greetings = (Greetings) context.getBean(Greetings.class);
		System.out.println(greetings +" :"+greetings.getMessage());

		Greetings greetings2 = (Greetings) context.getBean(Greetings.class);
		greetings2.setMessage("Hello Spring 2");
		System.out.println(greetings2 + " : " + greetings2.getMessage());
		
	}
}
