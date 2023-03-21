package Q5Task4;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test 
{
	 public static void main(String[] args) 
	 {
		 Collage co=new Collage();
		 Scanner sc=new Scanner(System.in);
		 loop: while(true) {
			 System.out.println("Enter Case");
			 System.out.println("1 - To Add Student data");
			 System.out.println("2 - To View Student data");
			 int c=sc.nextInt();
			 switch(c)
			 {
			 case 1:
				 
				  co.addStudent();
				  break;
				 
			 case 2:
				 
				co.viewStudent();
			 		break loop;
			 }
		 }
		 
	 }

}
