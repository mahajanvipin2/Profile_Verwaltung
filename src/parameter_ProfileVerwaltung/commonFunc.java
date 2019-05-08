package parameter_ProfileVerwaltung;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class commonFunc {
	public WebElement rtn_Webelement(String strin, WebDriver driver)
	{
		WebElement ele=driver.findElement(By.xpath(strin));
		ele.click();
		ele.clear();
		return ele;
	}
	
	public WebElement clik_Webelement(String strin, WebDriver driver)
	{
		WebElement ele=driver.findElement(By.xpath(strin));
		ele.click();
		return ele;
	}
	

}
