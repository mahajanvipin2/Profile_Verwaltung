package profilverwaltung;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {

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
//		System.setProperty("webChromedriver", "C:\\Users\\vipin.mahajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vipin.mahajan\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		Basic obj=new Basic(); 
		Credentials cre=new Credentials();
		Profile_Maintain pro=new Profile_Maintain();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		obj.invokeBrowser();
		driver=cre.login(driver);
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"gwt-uid-8\"]/descendant::span[text()='Profile']")).click();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		pro.checkProf(driver);
		Thread.sleep(2000);
		pro.Prof_Person(driver);
		Thread.sleep(2000);
		pro.branchen(driver);	
		Thread.sleep(2000);
		pro.Sprachen(driver);
		Thread.sleep(2000);
		pro.Projekte(driver);
		Thread.sleep(2000);
		pro.Technologien(driver);
		Thread.sleep(2000);
		obj.close();
	}

}
