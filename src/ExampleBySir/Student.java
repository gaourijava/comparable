package ExampleBySir;

public class Student implements Comparable<Student>
{
	int rollno;
	String name;
	
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollno-o.rollno;
	}
	

}
