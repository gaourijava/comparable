package Q3Task2iiiSortbySalary;

import java.util.Set;
import java.util.TreeSet;

public class Test 
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setId(75);
		e1.setName("ABc");
		e1.setSalary(12000);
		
		Employee e2=new Employee();
		e2.setId(48);
		e2.setName("xyz");
		e2.setSalary(1000);
		
		Employee e3=new Employee();
		e3.setId(200);
		e3.setName("ijk");
		e3.setSalary(19000);
		
		Set<Employee>s=new TreeSet<>();
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
