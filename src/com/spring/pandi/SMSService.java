package com.spring.pandi;

public class SMSService implements MsgService {
		@Override
		public void sendMsg(String msg, String rec)
		{
			System.out.println("Sending Sms..." + msg);
		}
	}
