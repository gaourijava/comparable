package Task1Q2;

import java.util.TreeSet;
 // Q Check the String sorting program using comparable interface. 
public class Demo 
{                                           //default natural sorting order
	public static void main(String args[])
	{                         //no need to implement comparable interface because String is 
		                                     //already implement comparable interface.
		TreeSet t=new TreeSet<>();
		t.add("A");
		t.add("Z");
		t.add("B");
		t.add("A");
		System.out.println(t);
	}

}
