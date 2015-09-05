package net.nadisa.anan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Greetings {
	@Autowired
	@Qualifier("newGreetings")
	private Greetings2 greetings2;

	public Greetings(Greetings2 greetings2) {
		super();
		this.greetings2 = greetings2;
	}

	public Greetings2 getGreetings2() {
		return greetings2;
	}

	public void setGreetings2(Greetings2 greetings2) {
		this.greetings2 = greetings2;
	}

}
