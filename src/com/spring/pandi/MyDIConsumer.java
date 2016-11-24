package com.spring.pandi;

public class MyDIConsumer implements Consumer {
	MsgService svc;
	MyDIConsumer(MsgService service)
	{
		this.svc = service;
	}
	
	public void processmsg(String msg, String rec){
		this.svc.sendMsg(msg, rec);
	}
}
