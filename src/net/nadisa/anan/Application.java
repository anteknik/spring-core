package net.nadisa.anan;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {

		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Greetings greetings = (Greetings) context.getBean("greeting");
		System.out.println(greetings.getMessage());

		Greetings greetings2 = (Greetings) context.getBean("greeting");
		greetings2.setMessage("Hello Spring 2");
		System.out.println(greetings2 + " : " + greetings.getMessage());
		context.registerShutdownHook();
	}
}
