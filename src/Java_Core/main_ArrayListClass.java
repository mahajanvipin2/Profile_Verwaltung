package Java_Core;

import java.util.ArrayList;
import java.util.Iterator;

public class main_ArrayListClass {

	public static void main(String[] args) {
		ArrayListClass ar = new ArrayListClass(10,20);
		System.out.println(ar.i);
		System.out.println(ar.j);
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(400);
		ar1.add(500);
		int size = ar1.size();
		for (int i=0; i<size; i++)
		{
			System.out.println("Print value of "+i+" :"+ar1.get(i));
		}
		
		
		ArrayList<ArrayListClass> arclassObj= new ArrayList<ArrayListClass>();
		arclassObj.add(ar);
		
		Iterator<ArrayListClass> it = arclassObj.iterator();
		ArrayListClass xx = it.next();
		System.out.println (xx.i);
		System.out.println (xx.j);
	}

}
