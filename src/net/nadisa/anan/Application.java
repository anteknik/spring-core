package net.nadisa.anan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
	public static void main(String[] args) {

		ApplicationContext factory = new FileSystemXmlApplicationContext("beans.xml");
		Greetings greetings = (Greetings) factory.getBean("greeting");
		System.out.println(greetings.getMessage());
	}
}
