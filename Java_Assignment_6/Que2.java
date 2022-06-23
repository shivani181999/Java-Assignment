package Java_Assignment_6;


import java.util.HashSet;
import java.util.Map;


public class Que2 {

	public static void main(String[] args) {
		HashSet<Product> hs=new HashSet<Product>();
		hs.add(new Product(1, "Nilesh"));
		hs.add(new Product(2, "Yogesh"));
		hs.add(new Product(3, "Nilima"));
		hs.add(new Product(4, "Vijay"));
		hs.add(new Product(5, "Ajay"));
		hs.add(new Product(6, "Niraj"));
		hs.add(new Product(7, "Vikas"));
		hs.add(new Product(8, "Shivali"));
		hs.add(new Product(9, "Suraj"));
		hs.add(new Product(10, "Rishi"));
		
		for(Product p:hs) {
			System.out.println(p);
		}
		
				

		

	}

}
class Product{
	private int id;
	private String name;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override 
	public int hashCode() {
		return this.getId();
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Product p = null;
	    if(obj instanceof Product){
	        p = (Product) obj;
	    }
	   // System.out.println("In equals");
	    if(this.getId() == p.getId()){
	        return true;
	    } else {
	        return false;
	    }
	 }  
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	
	

}



