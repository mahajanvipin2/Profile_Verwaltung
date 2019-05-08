package Java_Core;

public class childClass extends parentClass{

	int i=20;
	childClass(int i)
	{
		super(1000);
		System.out.println("Value of Class variable : "+this.i);		
		System.out.println("Value of Child class variable : "+i);
	}
}
