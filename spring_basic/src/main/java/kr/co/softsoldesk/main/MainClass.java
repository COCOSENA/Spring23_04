package kr.co.softsoldesk.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass {
   
   public static void main(String[] args) {
		/* test1(); */
	/*   test3();*/
      
      
   }
	/*
	 * public static void test1() { //������� ��ü ClassPathResource res = new
	 * ClassPathResource("kr/co/softsoldesk/config/beans.xml"); //������� ��ü�� xml����
	 * XmlBeanFactory factory=new XmlBeanFactory(res);
	 * 
	 * TestBean t1=factory.getBean("t1", TestBean.class); System.out.println("t1 : "
	 * + t1);
	 */
         
         /*
   
         public static void test3() {
             //�ڵ����� ������ ����
        	 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
                
                TestBean t1=ctx.getBean("t1", TestBean.class);
                System.out.println("t1 : " + t1);
                
                TestBean t2=ctx.getBean("t1", TestBean.class);
                System.out.println("t2 : " + t2);
                
                
                //ctx.close();
*/                
         
         
         
         /*
          * TestBean t2=factory.getBean("t1", TestBean.class); System.out.println("t2 : "
          * + t2);
          */
      
   }
   
   /*
    * public static void test2() { //�ܺ� ��Ű�� ��� FileSystemResource res = new
    * FileSystemResource("beans.xml"); //��� ���� ��ü�� xml ���� XmlBeanFactory factory =
    * new XmlBeanFactory(res);
    * 
    * TestBean t2 = factory.getBean("t2", TestBean.class);
    * System.out.println("t2 : "+t2);
    * 
    * 
    * 
    * }
    */
		

		