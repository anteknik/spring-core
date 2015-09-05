package net.nadisa.anan;

public class Greetings {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// need to create init and destroy method
	public void init() {
		System.out.println("Initialize Bean");
	}

	public void destroy() {
		System.out.println("Destroy Bean");
	}
}
