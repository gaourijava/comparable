package Q3Task2iiSortbyname;

import java.util.Set;
import java.util.TreeSet;

public class Test 
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setId(22);
		e1.setName("uvw");
		e1.setSalary(51000);
		
		Employee e2=new Employee();
		e2.setId(56);
		e2.setName("rst");
		e2.setSalary(5000);
		
		
		Employee e3=new Employee();
		e3.setId(98);
		e3.setName("abc");
		e3.setSalary(65000);
		
		Set<Employee>s=new TreeSet<Employee>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
		
		for(Employee e:s)
		{
			System.out.println("Name of a Employee="+" "+e.getName());
			System.out.println("Id of a Employee="+" "+e.getId());
			System.out.println("Salary of a Employee="+" "+e.getSalary());
			
		}
	}
			
		
			

}
