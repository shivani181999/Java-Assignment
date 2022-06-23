package Java_Assignment_6;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Que1 {

	public static void main(String[] args) {
		TreeMap <Long, Contact> tm=new TreeMap<Long, Contact>(Collections.reverseOrder());
		
		tm.put(7887766667l, new Contact("Dhiraj","dhiraj234@gmail.com", "Male"));
		tm.put(6887766667l, new Contact("Diksha","diksha1234@gmail.com", "Female"));
		tm.put(9887766667l, new Contact("karan","karan0034@gmail.com", "Male"));
		tm.put(8887744447l, new Contact("Dolly","dolly234@gmail.com", "Female"));
		
		Set<Map.Entry<Long, Contact>> s=tm.entrySet();
		
		for(Map.Entry<Long, Contact> p:s) {
			System.out.println(p.getKey());
		}
		
		for(Map.Entry<Long, Contact> p:s) {
			System.out.println(p.getValue());
		}
		
		for(Map.Entry<Long, Contact> p:s) {
			System.out.println(p.getKey() +" "+ p.getValue());
		}

	}

}
class Contact{
	private String name;
	private String email;
	private String gender;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, String email, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
}
