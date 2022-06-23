package Java_Assignment_8;

import java.util.Arrays;
import java.util.List;

public class Que2 {

	public static void main(String[] args) {
		
		List<Order> list=Arrays.asList(
				new Order (20000,"Accepted"),
				new Order (29000,"Accepted"),
				new Order (4000,"Not Accept"),
				new Order (3500,"Not Accepted")
				);
		
		list.forEach((l) ->{
			if(l.getPrice()>10000 && l.getStatus()=="Accepted")
				System.out.println(l);
		});

	}

}
class Order{
	
	private int price;
	private String status;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int price, String status) {
		super();
		this.price = price;
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Order [price="+price+",status="+status+"]";
	}
}
