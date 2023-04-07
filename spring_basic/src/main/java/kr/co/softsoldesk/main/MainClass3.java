package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.beans2.TestBean1;

public class MainClass3 {
	
	public static void main(String[] args) {
		
			
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans3.xml");
		
		//#1
		TestBean1 t1=ctx.getBean("t1", TestBean1.class);
		System.out.println("t1"+t1);
		
		//#2
		TestBean1 t2=ctx.getBean("t", TestBean1.class);
		System.out.println("t2"+t2);
		
		
		ctx.close();
		
	}

}
