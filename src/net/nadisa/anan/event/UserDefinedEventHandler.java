package net.nadisa.anan.event;

import org.springframework.context.ApplicationListener;

public class UserDefinedEventHandler implements ApplicationListener<UserDefinedEvent> {

	@Override
	public void onApplicationEvent(UserDefinedEvent event) {
		System.out.println("UserDefinedEventHandler : onApplicationEvent");
		System.out.println(event);
	}

}
