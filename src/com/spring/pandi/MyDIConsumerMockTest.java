package com.spring.pandi;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDIConsumerMockTest {
	private ServiceInjector injector;
	
	@Before
	public void setup()
	{
		injector = new ServiceInjector() {
		@Override
		public Consumer getConsumer()
		{
			return new MyDIConsumer(new MsgService(){
				@Override
				public void sendMsg(String msg, String rec)
				{
					System.out.println("Mocked Service is called");
				}
			});
		}
	};
	}
	
	@Test
	public void test()
	{
		Consumer app = injector.getConsumer();
		app.processmsg("hi", "pandi@");
	}
	
	@After
	public void tear()
	{
		injector= null;
	}
}
