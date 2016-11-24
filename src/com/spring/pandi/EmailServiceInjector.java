package com.spring.pandi;

public class EmailServiceInjector implements ServiceInjector {

	@Override
	public Consumer getConsumer()
	{
		return  new MyDIConsumer(new EmailService());
	}
}
