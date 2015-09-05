package net.nadisa.anan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Greetings greetings = (Greetings) context.getBean(Greetings.class);
		System.out.println(greetings +" :"+greetings.getMessage());

		Greetings greetings2 = (Greetings) context.getBean(Greetings.class);
		greetings2.setMessage("Hello Spring 2");
		System.out.println(greetings2 + " : " + greetings2.getMessage());
		
	}
}
