package com.spring.pandi;

public class EmailService implements MsgService {
	@Override
	public void sendMsg(String msg, String rec)
	{
		System.out.println("Sending email..." + msg);
	}
}
