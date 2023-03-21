package Q4Task3iSortByRollno;

public class Student implements Comparable<Student> //Sort by Rollno
{
	private int rollno;
	private String name;
	
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollno-o.rollno;
	}
	
	

}
