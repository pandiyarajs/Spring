package com.spring.pandi;

public class SMSServiceInjector implements ServiceInjector {

	@Override
	public Consumer getConsumer()
	{
		return  new MyDIConsumer(new SMSService());
	}
}
