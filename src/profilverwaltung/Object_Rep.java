package profilverwaltung;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Object_Rep {
	WebElement ele;

	public WebElement objRep(String locator, WebDriver driver) {
		ele = driver.findElement(By.xpath(locator));
		return ele;
	}

	public WebElement objButtonID(String locator, WebDriver driver) {
		ele = driver.findElement(By.id(locator));
		return ele;
	}

	public WebElement objSend(String locator, WebDriver driver) {
		ele = driver.findElement(By.xpath(locator));
		return ele;
	}

	public void objButton(String locator, WebDriver driver)
	{
		driver.findElement(By.id(locator)).click();
	}
	
	public WebElement objText(String locator, WebDriver driver)
	{
		ele=driver.findElement(By.id(locator));
		return ele;
	}
}
