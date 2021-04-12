package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml"); 

		Flipkart flipkart= context.getBean("flipkart", Flipkart.class);
		
		flipkart.display();
		
	/*	flipkart.flipkartDelievery();*/
		
				
	/*	Flipkart flipkart = new Flipkart(10);
		Flipkart obj1=new Flipkart(20);
		obj1.display(56);
		flipkart.display(56);*/
		
	/*	flipkart.flipkartDelievery(new BlueDart());
		flipkart.flipkartDelievery(new DHL());*/
	}

}
