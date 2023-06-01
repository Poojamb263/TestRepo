package com.ty;

      
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDrive {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("person.xml");
		Person person = (Person) beanFactory.getBean("person");

		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getAge());

	}

}
