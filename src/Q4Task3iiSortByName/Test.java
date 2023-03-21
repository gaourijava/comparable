package Q4Task3iiSortByName;

import java.util.Set;

public class Test 
{
	public static void main(String args[])
	{
		Collage c=new Collage();
		Set<Student >data = c.m1();
		
		for(Student a:data)
		{
			System.out.println("Name of a Student="+""+a.getName());
			System.out.println("Rollno of a Student="+""+a.getRollno());
		}
	}

}
