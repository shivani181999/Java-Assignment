package Java_Assignment_8;

import java.util.ArrayList;
import java.util.List;

public class Que4 {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("GoodMorning");
		list.add("Hiiiiiiiiiiiiii");
		list.add("Switch");
		list.add("soft");
		
		list.removeIf(l->(l.length()%2!=0));
		
		for(String s :list) {
			System.out.println(s);
		}
	}

}
