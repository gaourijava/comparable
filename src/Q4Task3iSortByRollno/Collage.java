package Q4Task3iSortByRollno;

import java.util.Set;
import java.util.TreeSet;

public class Collage 
{
	public Set<Student>m1()
	{
		Student s1=new Student();
		s1.setRollno(10);
		s1.setName("ABC");
		
		Student s2=new Student();
		s2.setRollno(20);
		s2.setName("PQR");
		
		Student s3=new Student();
		s3.setRollno(30);
		s3.setName("MNO");
		
		Student s4=new Student();
		s4.setRollno(40);
		s4.setName("XYZ");
		
		Set<Student>ss=new TreeSet<Student>();
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		return ss;
			
			
		
	}

}
