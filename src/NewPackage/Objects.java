package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class Objects {
	private static WebElement RegLink = null;
	private static WebElement FName = null;
	private static WebElement LName = null;
	private static WebElement Pnumber = null;
	private static WebElement Email = null;
	private static WebElement Address = null;
	private static WebElement City = null;
	private static WebElement State = null;
	private static WebElement PostalCode = null;
	private static WebElement Usernam=null;
	private static WebElement Passwd=null;
	private static WebElement conf_pwd=null; 
	
	private static WebElement txt_Name=null; 
	
	public static WebElement txt_Register(WebDriver driver) {
		RegLink = driver.findElement(By.linkText("REGISTER"));
		return RegLink;
	}

	public static WebElement txt_FName(WebDriver driver) {
		FName = driver.findElement(By.name("firstName"));
		return FName;
	}

	public static WebElement txt_LName(WebDriver driver) {
		LName = driver.findElement(By.name("lastName"));
		return LName;
	}

	public static WebElement txt_Pnumber(WebDriver driver) {
		Pnumber = driver.findElement(By.name("phone"));
		return Pnumber;
	}

	public static WebElement txt_Email(WebDriver driver) {
		Email = driver.findElement(By.id("userName"));
		return Email;
	}

	public static WebElement txt_Address(WebDriver driver) {
		Address = driver.findElement(By.name("address1"));
		return Address;
	}

	public static WebElement txt_City(WebDriver driver) {
		City = driver.findElement(By.name("city"));
		return City;
	}

	public static WebElement State(WebDriver driver) {
		State = driver.findElement(By.name("state"));
		return State;
	}

	public static WebElement txt_Post(WebDriver driver) {
		PostalCode = driver.findElement(By.name("postalCode"));
		return PostalCode;
	}
	
	public static WebElement UserName(WebDriver driver)
	{
		Usernam=driver.findElement(By.id("email"));
		return Usernam;
	}
	
	public static WebElement passwd(WebDriver driver)
	{
		Passwd=driver.findElement(By.name("password"));
		return Passwd;
	}
	
	public static WebElement conf_pawd(WebDriver driver)
	{
	conf_pwd=driver.findElement(By.name("confirmPassword"));	
	return conf_pwd;
	}
	

	
	public static WebElement sub_bttn(WebDriver driver)
	{
		WebElement submit_btn=driver.findElement(By.name("submit"));
		return submit_btn;
	}
	
	public static WebElement Signoff(WebDriver driver)
	{
		WebElement signoff_butn=driver.findElement(By.linkText("SIGN-OFF"));
		return signoff_butn;
	}
	
	public static WebElement flight_link(WebDriver driver)
	{
		WebElement flight=driver.findElement(By.linkText("Flights"));
		return flight;
	}
	
	public static WebElement flight_tye(WebDriver driver)
	{
	WebElement flight_type=driver.findElement(By.id("One Way"));
	return flight_type;
	}

	public static Select Passengers(WebDriver driver)
	{
		Select pass=new Select (driver.findElement(By.name("passCount")));
				return pass;
	}
	public static Select combo_cont(WebDriver driver)
	{
		Select combo_ctry=new Select(driver.findElement(By.name("country")));		
		return combo_ctry;
	}
	public static Select combo_From(WebDriver driver)
	{
		Select from_comb=new Select (driver.findElement(By.name("fromPort")));
		return from_comb;
	}
	
	public static Select Arr_on(WebDriver driver)
	{
		Select arrv_on=new Select(driver.findElement(By.name("fromMonth")));
		return arrv_on;
	}
	 
	public static WebElement txt_Name(WebDriver driver)
	{
		WebElement name_txt=(WebElement) driver.findElements(By.id("loginUsernameTextField"));
		return name_txt;
		
	}
}
