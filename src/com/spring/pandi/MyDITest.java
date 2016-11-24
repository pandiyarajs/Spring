package com.spring.pandi;

public class MyDITest {

	public static void main(String[] args) {
		String msg = "hi";
		String rec = "paselvaraj@paypal.com";

		ServiceInjector inj = null;
		Consumer app = null;
		inj = new EmailServiceInjector();
		app = inj.getConsumer();
		app.processmsg(msg, rec);

		inj = new SMSServiceInjector();
		app = inj.getConsumer();
		app.processmsg(msg, rec);
	}

}
