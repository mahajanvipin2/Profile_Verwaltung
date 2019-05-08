package New_Profileverwaltung;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import profilverwaltung.Basic;
import profilverwaltung.Credentials;
import profilverwaltung.Profile_Maintain;

public class New_Profile {

	static WebDriver driver;
	
	public void invokeBrowser() throws InterruptedException {
		try {
			
			driver.get("http://192.168.4.117:8080/profilverwaltung");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
		//	close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vipin.mahajan\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		New_Profile obj=new New_Profile(); 
		New_Credentials cre=new New_Credentials();
		New_Rep rep=new New_Rep();
		profileCreation pro=new profileCreation();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		obj.invokeBrowser();
		driver=cre.login(driver);
	   // driver.findElement(By.xpath("//div[@id='gwt-uid-73']/")).click();
		//driver.findElement(By.xpath("//*[@id='gwt-uid-350']/span")).click();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"gwt-uid-8\"]/descendant::span[text()='Profile']")).click();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		rep.objButton("profilePanelNewBtn",driver);
		Thread.sleep(2000);
		pro.create_Person(driver);
		Thread.sleep(2000);
		obj.close();
	}

}
