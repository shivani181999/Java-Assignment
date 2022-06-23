package Java_Assignment_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Que5 {
	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		
		Consumer<String> con=(s)->{
			sb.append(s.charAt(0));
		};
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("GoodMorning");
		list.add("Hiiiiiiiiiiiiii");
		list.add("Switch");
		list.add("soft");
		
		for (Iterator iterator =list.iterator();
				iterator.hasNext();) {
			String str=(String) iterator.next();
			con.accept(str);
		}
		
		System.out.println(sb);
	}

}
