package Java_Assignment_7;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public class Que2 {

	public static void main(String[] args) {
		Project p=new Project();
		Class c=p.getClass();
		Annotation an=c.getAnnotation(Info.class);
		Info i=(Info) an;
		
		System.out.println(i.authorID());
		System.out.println(i.authorName());
		System.out.println(i.supervisor());
		System.out.println(i.date());
		System.out.println(i.time());
		System.out.println(i.version());
		System.out.println(i.description());
		
	}

}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	String authorID() default"Shivani@18199";
	String authorName() default"Shivani Bhagat";
	String supervisor() default"Mr.Mehtaa";
	String date() default"22/06/2022";
	String time() default"23:51:22";
	String version() default"v1.6";
	String description() default"This Assignment and class and methods is related to Annotations in java";
	
}

@Info 
class Project{
	
}
