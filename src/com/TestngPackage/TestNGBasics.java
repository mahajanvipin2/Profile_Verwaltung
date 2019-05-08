package com.TestngPackage;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



@Test
public class TestNGBasics {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vipin.mahajan\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("http://192.168.4.117:8080/profilverwaltung");
		driver.manage().window().maximize();
		System.out.println("Out of setup()");
	}

	@Test(priority=1)
	public void verifySuccessfulLogin() throws InterruptedException
	{
		System.out.println("In Login window");
		WebElement eleUser = driver.findElement(By.xpath("//input[@id='loginUsernameTextField']"));
		eleUser.sendKeys("Vipin.mahajan@redbots.de");

		WebElement elePwd = driver.findElement(By.xpath("//input[@id='loginPasswordTextField']"));
		elePwd.sendKeys("october567");

		WebElement elem = driver.findElement(By.xpath("//div[@id='loginBtn']"));
		elem.click();
		Thread.sleep(2000);
		String expected="Profilverwaltung";
		String actual=driver.findElement(By.xpath("//div[@class='v-label v-widget valo-menu-title v-label-valo-menu-title bold v-label-bold v-label-undef-w']")).getText();  
		
		boolean chk=expected.equals(actual);
		System.out.println("Login check:"+chk);
		Assert.assertTrue(chk); 
	}
	
	@Test(priority=2)
	public void verifyClickProfile()
	{
		driver.findElement(By.xpath("//*[@id=\"gwt-uid-8\"]/descendant::span[text()='Profile']")).click();
		String expect="Mahajan";
		String actual=driver.findElement(By.xpath("//div[contains(text(),'Mahajan')]")).getText();
		boolean chk=expect.equals(actual);
		System.out.println("Click on Profile check:"+chk);
		Assert.assertTrue(chk); 
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}
