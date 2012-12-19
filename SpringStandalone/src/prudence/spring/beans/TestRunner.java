package prudence.spring.beans;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springstandalone.xml");
		Couple bean=(Couple)context.getBean("firstCouple");
		System.err.println("FirstName: " +bean.getMale().getFirstName());

	}

}
