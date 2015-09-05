package net.nadisa.anan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.nadisa.anan.event.publisher.UserDefinedEventPublisher;

public class Application {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Greetings greetings = (Greetings) context.getBean("greeting");
		System.out.println(greetings.getMessage());
		UserDefinedEventPublisher publisher = (UserDefinedEventPublisher) context.getBean("eventPublisher");
		publisher.publish();
	}
}
