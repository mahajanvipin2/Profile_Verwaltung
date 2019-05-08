package Java_Core;

public class main_abstractClass extends abstractClass{

	public void abs_fun()
	{
		System.out.println("Body of abstract method");
	}
	
	public static void main(String args[])
	{
		main_abstractClass obj=new main_abstractClass();
		//abstractClass ab=new abstractClass(); //Not possible as it is an abstract Class 
		obj.abs_fun();
		obj.loan();
	}
}
