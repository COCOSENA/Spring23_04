package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass1 {
	
	public static void main(String[] args) {
		
		//#1		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans1.xml");
		
		
		//ctx.close();
		//#2
		//id test1�� bean ��ü�� �ּҰ��� �޾ƿ´�
		TestBean t1=ctx.getBean("test1", TestBean.class);
		System.out.println("t1"+t1);
		//--------------------------------------------------
		//id test2�� bean ��ü�� �ּҰ��� �޾ƿ´�
		TestBean t2=ctx.getBean("test2", TestBean.class);
		System.out.println("t2"+t2);
		TestBean t2_2=ctx.getBean("test2", TestBean.class);
		System.out.println("t2_2"+t2_2);
		//--------------------------------------------------
		//id test3�� bean ��ü�� �ּҰ��� �޾ƿ´�
		TestBean t3=ctx.getBean("test3", TestBean.class);
		System.out.println("t3"+t2);
		TestBean t3_3=ctx.getBean("test2", TestBean.class);
		System.out.println("t3_2"+t3_3
				);
		
		
		ctx.close();
		
	}

}
