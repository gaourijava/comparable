package ExampleBySir;

import java.util.Set;
import java.util.TreeSet;

public class Test 
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.setName("ABC");
		s.setRollno(1);
		
		Student s1=new Student();
		s1.setName("PQR");
		s1.setRollno(2);
		
		Student s2=new Student();
		s2.setName("MNO");
		s2.setRollno(3);
		
		Set<Student>stu=new TreeSet<>();
		stu.add(s);
		stu.add(s1);
		stu.add(s2);
		
		for(Student a:stu)
		{
			System.out.println(a.getName());
			System.out.println(a.getRollno());
		}
		
		
	}

}
