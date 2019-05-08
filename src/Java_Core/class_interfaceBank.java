package Java_Core;

public class class_interfaceBank implements interfaceBank {


	public void debit()
	{
		System.out.println("debit is defined");
	}
	
	@Override
	public void loan() {
		System.out.println("Loan is defined");
	}

	@Override
	public void credit() {
		System.out.println("Credit is defined");		
	}
	

}
