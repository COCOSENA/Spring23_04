package main;


import beans.HelloWorld;
import beans.HelloWorldEn;
import beans.HelloWorldKr;

public class MainClass {
   
   public static void main(String[] args) {
      
      HelloWorld hello1 = new HelloWorldKr();
      hello1.sayHello();
      HelloWorld hello2 =new HelloWorldEn();
      hello2.sayHello();
   }
   public static void callhello(HelloWorld hello) {
      hello.sayHello();
   }
}