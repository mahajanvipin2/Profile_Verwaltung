package parameter_ProfileVerwaltung;
import java.sql.Driver;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import okio.Timeout;

public class para_Profile_Maintain {

	org.apache.poi.ss.usermodel.Sheet sht=null;
	Obj_Rep reposit=new Obj_Rep();
	WebElement elem;
	WebElement ele;
	public void cleanup(WebDriver driver)
	{
		ele=driver.findElement(By.xpath("//input[@id='profileDetailsPanelNameTextfield']"));
		ele.click();
		ele.clear();
		ele=driver.findElement(By.xpath("//input[@id='profileDetailsPanelSurnameTextfield']"));
		ele.click();
		ele.clear();
		ele=driver.findElement(By.xpath("//textarea[@id='profileDetailsPanelAbstractTextfield']"));
		ele.click();
		ele.clear();

		ele=driver.findElement(By.xpath("//div[@class='v-gridlayout-slot'][13]//input"));
		ele.click();
		ele.clear();
	}
	public void para_person(Workbook wkbook, WebDriver driver) throws InterruptedException
	{
		System.out.println("In person tab modification");
		sht= wkbook.getSheetAt(2);
		int rowCount = sht.getLastRowNum()-sht.getFirstRowNum();	
		
		WebElement divWithScrollbarElement = reposit.clik(reposit.frame, driver);
		WebElement elex;
		cleanup (driver);
		System.out.println("goint inside for");
		for (int i = 1; i <= rowCount; i++) {
		Row row = sht.getRow(i);
		for (int j = 0; j < row.getLastCellNum();) {	

//			elem = reposit.enter(reposit.vorname, driver);
			
			WebElement ele=driver.findElement(By.xpath("//input[@id='profileDetailsPanelNameTextfield']"));
			ele.click();
//			ele.clear();
			
			ele.sendKeys(row.getCell(j).getStringCellValue());
			Thread.sleep(2000);
			j++;
//			elem =reposit.enter(reposit.nachname, driver);
	
			ele=driver.findElement(By.xpath("//input[@id='profileDetailsPanelSurnameTextfield']"));
			ele.click();
		//	ele.clear();
			
			ele.sendKeys(row.getCell(j).getStringCellValue());
			j++;
//			Thread.sleep(2000);
			divWithScrollbarElement.sendKeys(Keys.TAB);
			divWithScrollbarElement.sendKeys(Keys.DOWN);
			divWithScrollbarElement.sendKeys(Keys.TAB);
			ele=reposit.enter(reposit.description, driver);
//			elex.clear();
			ele.click();
			ele.sendKeys(row.getCell(j).getStringCellValue());
			divWithScrollbarElement.sendKeys(Keys.TAB);			
			divWithScrollbarElement.sendKeys(Keys.DOWN);
			j++;		
			ele = reposit.enter(reposit.ausbildung, driver);
			ele.sendKeys(row.getCell(j).getStringCellValue());
			Thread.sleep(2000);
			j++;
			
			}				
		}	
		
		driver.findElement(By.id("profileDetailsPanelSaveBtn")).click();
	}
	
}
