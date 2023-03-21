package Q5Task4;

import java.util.Set;
import java.util.TreeSet;

public class Collage 
{
	Set<Student>s=new TreeSet<Student>();
	
	public void addStudent()
	{
		Student s1=new Student();
		s1.setRollno(10);
		s1.setName("ABC");
		
		Student s2=new Student();
		s2.setRollno(20);
		s2.setName("PQR");
		
		Student s3=new Student();
		s3.setRollno(30);
		s3.setName("XYZ");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
	}
	public void viewStudent()
	{
		for(Student a:s)
		{
			System.out.println("Name of a Student="+" "+a.getName());
			System.out.println("Rollno of a Student="+" "+a.getRollno());
		}
		
	}
	 
	

}
