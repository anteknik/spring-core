package net.nadisa.anan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Greetings greetings = (Greetings) context.getBean("greetings");
		System.out.println(greetings.getGreetings2() + ", " + greetings.getGreetings2().getMessage());

		Greetings2 greetings2 = (Greetings2) context.getBean("newGreetings");
		System.out.println(greetings2 + " : " + greetings2.getMessage());
		
	}
}
