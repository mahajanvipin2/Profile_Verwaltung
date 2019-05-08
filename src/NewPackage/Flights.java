package NewPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Flights {
	
	public static void flight_status(WebElement flight_sts)
	{
		flight_sts.click();
	}
	public static void flight_fields(WebElement flight_type)
	{
		flight_type.click();	
	}
	public static void flght_pass(Select passen)
	{
		passen.selectByVisibleText("3");
	}
	public static void flight_from(Select from_com)
	{
		from_com.selectByValue("London");
	}
	
	public static void arriving_on(Select arrvi_on)
	{
		arrvi_on.selectByIndex(11);
	}
	
}
