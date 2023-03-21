package Q3Task2iSortById;

import java.util.Set;
import java.util.TreeSet;

public class Test 
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setId(5);
		e1.setName("XYZ");
		e1.setSalary(1000);
		
		Employee e2=new Employee();
		e2.setId(25);
		e2.setName("ABC");
		e2.setSalary(6000);
		
		Employee e3=new Employee();
		e3.setId(95);
		e3.setName("PQR");
		e3.setSalary(9000);
		
		Set<Employee>s=new TreeSet<Employee>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
		for(Employee e:s)
		{
			System.out.println("Name Of Employee:"+ ""+e.getName());
			System.out.println("Id Of Employee:"+ ""+e.getId());
			System.out.println("Salary Of Employee:"+ ""+e.getSalary());
		}
		
	}

}
