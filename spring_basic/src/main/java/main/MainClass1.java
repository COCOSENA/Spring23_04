package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.HelloWorld;

public class MainClass1 {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config/beans.xml");
		
		HelloWorld hello1=(HelloWorld)ctx.getBean("hello1");
		callhello(hello1);
		ctx.close();
		
	}
	
	public static void callhello(HelloWorld hello) {
		hello.sayHello();
	}
	
	
	

}

/*
 * ClassPathXmlApplicationContext : 인스턴스 변수(=객체)를 편리하게 생성하는 클래스
 */

