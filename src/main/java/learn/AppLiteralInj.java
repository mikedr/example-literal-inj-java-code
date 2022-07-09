package learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppLiteralInj {

	public static void main(String... args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Person.class);
		
		Person person = context.getBean("person",Person.class);
		
		System.out.println("Name: "+person.getName()+"\nLast name: "+person.getLastName());
		
		context.close();
	}
}
