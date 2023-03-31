package main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import beans.TV;

public class TVMain {

	public static void main(String[] args) {
			
		//Spring �����̳� ����
		//AbstractApplicationContext :  BeanFactory + ApplicationContext
		//GenericXmlApplicationContext : ���ϰ� Ŭ���� ���� ����(xml)
		AbstractApplicationContext ctx=new GenericXmlApplicationContext("config/beans.xml");
		
		//�����̳ʷκ��� �ʿ��� ��ü�� ��û
		TV tv=(TV)ctx.getBean("tv1");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		ctx.close();
		
	}

}
