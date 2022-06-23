package Java_Assignment_7;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public class Que1 {

	public static void main(String[] args) {
		
		Document d=new Document();
		//System.out.println(d);
		
		@SuppressWarnings("rawtypes")
		Class c=d.getClass();
		//System.out.println(c.getClass());
		
		@SuppressWarnings("unchecked")
		Test an=(Test) c.getAnnotation(Test.class);
		
		System.out.println(an.type());
		

	}

}
@Documented
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String type() default "test-case";
}

@Test
class Document{
	@Test
	void show() {
		
	}
}
