package net.nadisa.anan.event;

import org.springframework.context.ApplicationEvent;

public class UserDefinedEvent extends ApplicationEvent {

	private static final long serialVersionUID = -4264109794317707068L;

	public UserDefinedEvent(Object source) {
		super(source);
		System.out.println(source);
	}

	@Override
	public String toString() {
		return "user defined event.";
	}

}
