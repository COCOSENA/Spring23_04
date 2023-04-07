package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.beans2.TestBean1;

public class MainClass2 {
	
	public static void main(String[] args) {
		
		//#1		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans2.xml");
		TestBean1 t1=ctx.getBean("t1", TestBean1.class);
		System.out.println("t1"+t1);
		
		
		
		ctx.close();
		
	}

}
