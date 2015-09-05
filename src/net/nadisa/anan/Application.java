package net.nadisa.anan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.nadisa.anan.config.BeanConfig;
import net.nadisa.anan.config.BeanConfig2;
import net.nadisa.anan.entities.Greetings;
import net.nadisa.anan.entities.Greetings2;
import net.nadisa.anan.entities.Greetings3;

public class Application {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanConfig.class, BeanConfig2.class);
		context.refresh();

		Greetings greetings = (Greetings) context.getBean(Greetings.class);
		System.out.println(greetings +" :"+greetings.getMessage());

		Greetings2 greetings2 = (Greetings2) context.getBean(Greetings2.class);
		System.out.println(greetings2 + " : " + greetings2.getMessage());
		
		Greetings3 greetings3 = (Greetings3) context.getBean(Greetings3.class);
		System.out.println(
				greetings3 + " : " + greetings3.getGreetings() + " : " + greetings3.getGreetings().getMessage());
		
	}
}
