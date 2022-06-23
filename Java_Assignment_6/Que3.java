package Java_Assignment_6;

import java.util.*;

public class Que3 {

public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your choice");
	System.out.println(" 1:ID \n 2:NAME \n 3:DEPARTMENT \n 4:SALARY");
	
	int choice=sc.nextInt();
	
	if(choice==1) {
	
 
		TreeSet<Employee> ids= new TreeSet<Employee>(new idComparator());
		
		ids.add(new Employee(11,"Mayuri","MBA",80000));
		ids.add(new Employee(12,"Pradnya","BBA",50000));
		ids.add(new Employee(13,"Sandhya","MSC",80000));
		ids.add(new Employee(14,"Pallavi","HSC",400));
		ids.add(new Employee(15,"Dhiraj","SQL",5600));
		ids.add(new Employee(16,"Sullu","MECH",34020));
		ids.add(new Employee(17,"Aisha","BCS",2190));
		ids.add(new Employee(18,"Nisha","Nursery",780));
		ids.add(new Employee(19,"Bhakti","BTech",17970));
		ids.add(new Employee(20,"Mishti","SSC",500));
		
		System.out.println();
        
        for(Employee e : ids)
        {
            System.out.print(e);
            
        }
	}else if(choice==2) {
        
		TreeSet<Employee> names= new TreeSet<Employee>(new nameComparator());
	
		
		names.add(new Employee(11,"Mayuri","MBA",80000));
		names.add(new Employee(12,"Pradnya","BBA",50000));
		names.add(new Employee(13,"Sandhya","MSC",80000));
		names.add(new Employee(14,"Pallavi","HSC",400));
		names.add(new Employee(15,"Dhiraj","SQL",5600));
		names.add(new Employee(16,"Sullu","MECH",34020));
		names.add(new Employee(17,"Aisha","BCS",2190));
		names.add(new Employee(18,"Nisha","Nursery",780));
		names.add(new Employee(19,"Bhakti","BTech",17970));
		names.add(new Employee(20,"Mishti","SSC",500));
		
		System.out.println();
        
        for(Employee e : names)
        {
            System.out.print(e);
            
        }
	}else if(choice==3) {
        
	
        
        TreeSet<Employee> departments= new TreeSet<Employee>(new departmentComparator());
	
		
        departments.add(new Employee(11,"Mayuri","MBA",80000));
		departments.add(new Employee(12,"Pradnya","BBA",50000));
		departments.add(new Employee(13,"Sandhya","MSC",80000));
		departments.add(new Employee(14,"Pallavi","HSC",400));
		departments.add(new Employee(15,"Dhiraj","SQL",5600));
		departments.add(new Employee(16,"Sullu","MECH",34020));
		departments.add(new Employee(17,"Aisha","BCS",2190));
		departments.add(new Employee(18,"Nisha","Nursery",780));
		departments.add(new Employee(19,"Bhakti","BTech",17970));
		departments.add(new Employee(20,"Mishti","SSC",500));
		
		System.out.println();
        
        for(Employee e : departments)
        {
            System.out.print(e);
            
        }
	}else if(choice==4) {
        
        
    TreeSet<Employee> salarys= new TreeSet<Employee>(new salaryComparator());
	
		
    salarys.add(new Employee(11,"Mayuri","MBA",80000));
	salarys.add(new Employee(12,"Pradnya","BBA",50000));
	salarys.add(new Employee(13,"Sandhya","MSC",80000));
	salarys.add(new Employee(14,"Pallavi","HSC",400));
	salarys.add(new Employee(15,"Dhiraj","SQL",5600));
	salarys.add(new Employee(16,"Sullu","MECH",34020));
	salarys.add(new Employee(17,"Aisha","BCS",2190));
	salarys.add(new Employee(18,"Nisha","Nursery",780));
	salarys.add(new Employee(19,"Bhakti","BTech",17970));
	salarys.add(new Employee(20,"Mishti","SSC",500));
		
		System.out.println();
        
        for(Employee e : salarys)
        {
            System.out.print(e);
            
        }
	}else {
		System.out.println("Choice is Incorrect");
	}
   
   
    }

}

class Employee{
	
	private int id;
	private String name;
	private String department;
	private double salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
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


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]\n";
	}
		
}


class idComparator implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
        return e1.getId()-e2.getId();
    }
}


class nameComparator implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
        return e1.getName().compareTo(e2.getName());
    }
}

class departmentComparator implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
        return e1.getDepartment().compareTo(e2.getDepartment());
    }
}

class salaryComparator implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
        return (int) (e1.getSalary()-e2.getSalary());
    }
}
