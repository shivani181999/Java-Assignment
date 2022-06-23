package Java_Assignment_6;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;

public class Que4 {

	public static void main(String[] args) {


	        LinkedList<LocalDate> list = new LinkedList<LocalDate>();

            list.add(LocalDate.of(2022,Month.JULY,6));
            list.add(LocalDate.of(2004,Month.MARCH,7));
            list.add(LocalDate.of(2001,Month.DECEMBER,8));
            list.add(LocalDate.of(2041,Month.MAY,9));
            list.add(LocalDate.of(2003,Month.APRIL,10));
	        
	        
	        
	        for (LocalDate i : list) {
	   
	            
	            if(i.isLeapYear())
                {
                    System.out.println("Your date of birth is "+i+" and it is  leap year");
                }
                else
                {
                    System.out.println("Your date of birth is "+i+" and it is not leap year");
                }
            
	        }
	        
	}
}