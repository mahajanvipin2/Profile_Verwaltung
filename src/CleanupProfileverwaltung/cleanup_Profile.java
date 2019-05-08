package CleanupProfileverwaltung;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import CleanupProfileverwaltung.Cleanup_Rep;
import okio.Timeout;

public class cleanup_Profile {
	Cleanup_Rep rep = new Cleanup_Rep();
	WebElement saveButton;

// Function branchen() is used to click on Branchen tab and enter "Test Automation" into it
		public WebDriver branchen(WebDriver driver) throws InterruptedException {
			System.out.println("Enter into Branchen");
			Thread.sleep(1000);
			WebElement ele=rep.objRep("//div[contains(text(),'Branchen')]",driver);
			Thread.sleep(1000);
			ele.click();
			WebElement elem = rep.objRep("//div[contains(text(),'Test Automation')]",driver);
			Thread.sleep(1000);
			elem.click();
//			 elem = rep.objRep(
//					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]",
//					driver);
			 elem = rep.objRep("(//div[@class='v-gridlayout-slot'])[22]",driver);
			//	Click on Bearbeiten button to process it
				Thread.sleep(1000);
			elem.click();
			
			
			rep.objButton("profileDetailsPanelSectorRemoveBtn",driver);
			Thread.sleep(1000);
			rep.objButton("profileDetailsPanelSaveBtn", driver);
			return driver;
		}

	
//Function checkProf() is used to check row for Vipin Mahajan in Profile Page and then calls Prof_Person to update it, if available
	public WebDriver checkProf(WebDriver driver) throws InterruptedException {
		
		WebElement ele=rep.objRep("//div[contains(text(),'Andreas')]",driver);
		String str = ele.getText();
		if (str.equals("Andreas")) {
			//driver.findElement(By.xpath("//div[contains(text(),'Mahajan')]")).click();
			WebElement elem = rep.objRep("//div[contains(text(),'Andreas')]", driver);
			Thread.sleep(1000);
			elem.click();
			//Prof_Person(driver);
		//	
		} else {
			System.out.print("Call Create_Profile");
		}
		return driver;
	}
	
	//Function mod_Raten() is used to modify the value of Raten/Verfügbarkeit value avaialble in Person Tab
		public WebDriver mod_Raten(WebDriver driver) {
			try {
				WebElement ele = rep.objRep("//input[@id='profileDetailsPanelRatesTextfield']", driver);
				String str = ele.getAttribute("value");
				if (str.contentEquals("69")) {
					ele.clear();
				}

				else {
					ele = rep.objRep("//input[@id='profileDetailsPanelRatesTextfield']", driver);
					ele.clear();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return driver;
		}
		
		//Function Prof_Person() is used to scroll down the Div potion and then it calls mod_Raten() and branchen()
		public WebDriver Prof_Person(WebDriver driver) {
			try {	
				//click on Bearbeiten button
				WebElement elex=rep.objRep("(//div[@class='v-gridlayout-slot'])[33]",driver);
				elex.click();
				
				
				WebElement ele=rep.objRep("//div[@class='v-captiontext'][contains(text(),'Person')]", driver);
				ele.click();
				//Click on Div portion so that div can be scrolled
				WebElement divWithScrollbarElement = rep.objRep("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]",driver);
				divWithScrollbarElement.click();
			//	divWithScrollbarElement.sendKeys(Keys.PAGE_DOWN);
			//	divWithScrollbarElement.sendKeys(Keys.PAGE_DOWN);
				elex=rep.objRep("//input[@id='profileDetailsPanelNameTextfield']",driver);
				elex.click();
				elex.clear();
				Thread.sleep(1000);
				elex.sendKeys("Andreas");
				elex=rep.objRep("//input[@id='profileDetailsPanelSurnameTextfield']",driver);
				elex.click();
				elex.clear();
				Thread.sleep(1000);
				elex.sendKeys("Herr");
				Thread.sleep(1000);
				divWithScrollbarElement.sendKeys(Keys.TAB);
				divWithScrollbarElement.sendKeys(Keys.DOWN);

				divWithScrollbarElement.sendKeys(Keys.TAB);
				elex=rep.objRep("//textarea[@id='profileDetailsPanelAbstractTextfield']",driver);
				elex.clear();
				elex.click();
				elex.sendKeys("Vipin is having 12 years of testing experience as Quality Analyst in area of Manual, Regression, System and User Acceptance Testing and Testautomation. Also due to his experience he is strong in conceptual testsetup (also end-2-end testpreparation and -execution), including handling testdata-requirements and testdata-creation. He is currently handling role of Senior Quality Test Lead. He has an extensive experience in Datawarehousing, Siebel CRM and Web Applications. He has thorough knowledge and experience in STLC lifecycle activities and QA processes, both agile (Scrum) and waterfall.");
				divWithScrollbarElement.sendKeys(Keys.TAB);			
				divWithScrollbarElement.sendKeys(Keys.DOWN);
				elex=rep.objRep("//input[@id='profileDetailsPanelEducationTextfield']",driver);
				elex.clear();
				elex.click();
				Thread.sleep(1000);
				elex.sendKeys("Tester, Testautomation-Expert, Testmanager");
				elex=rep.objRep("//input[@id='profileDetailsPanelEductionNameTextfield']",driver);
				elex.clear();
				elex.click();
				Thread.sleep(1000);
				elex.sendKeys("Master of Computer Applications (MCA) Professional Scrum Master");
				divWithScrollbarElement.sendKeys(Keys.DOWN);
//				elex=rep.objRep("//div//div//div[@class='v-gridlayout v-layout v-widget v-has-width v-has-height v-gridlayout-margin-top v-gridlayout-margin-right v-gridlayout-margin-bottom v-gridlayout-margin-left']//div[14]//input[1]",driver);
				elex=rep.objRep("//div[@class='v-gridlayout-slot'][13]//input",driver);
				elex.clear();
				elex.click();
				elex.sendKeys("Selenium");
				Thread.sleep(1000);
				divWithScrollbarElement.sendKeys(Keys.DOWN);
				divWithScrollbarElement.sendKeys(Keys.DOWN);
				mod_Raten(driver);
				
				WebElement eleRS=rep.objText("profileDetailsPanelRatesStd",driver);
				eleRS.clear();
				eleRS.click();
				Thread.sleep(1000);
				//eleRS.sendKeys("50");

				WebElement eleRT=rep.objText("profileDetailsPanelRatesTag",driver);
				eleRT.clear();
				eleRT.click();
				Thread.sleep(1000);
				//eleRT.sendKeys("50");
				rep.objButton("profileDetailsPanelSaveBtn", driver);
				System.out.println("exit from modification of Person");
				} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	
//Function Sprachen() will click on Sprachen tab and enters Sprachen
	public WebDriver Sprachen(WebDriver driver) throws InterruptedException
	{
		System.out.println("Enter into Sprachen");
		WebElement ele=rep.objRep("//div[contains(text(),'Sprachen')]",driver);
		Thread.sleep(1000);
		ele.click();
		System.out.println("Click on Sprachen tab");

	
		WebElement elem = rep.objRep("//div[contains(text(),'Flie')]",driver);
		Thread.sleep(1000);
		elem.click();


			elem =driver.findElement((By.xpath("(//div[@class='v-gridlayout-slot'])[23]")));

		//	Click on Bearbeiten button to process it
			Thread.sleep(1000);
		elem.click();
		
		
		rep.objButton("profileDetailsPanelLanguageRemoveBtn",driver);
		Thread.sleep(1000);
		rep.objButton("profileDetailsPanelSaveBtn", driver);
		return driver;		
	}

//Function Projekte() will click on Projekte tab and enters Projekt details	
	public WebDriver Projekte(WebDriver driver) throws InterruptedException
	{
		WebElement ele=rep.objRep("//div[contains(text(),'Projekte')]",driver);
		Thread.sleep(1000);
		ele.click();
		
		
		WebElement elem = rep.objRep("//div[@class='v-table-cell-wrapper'][contains(text(),'Profilverwaltung')]",driver);
		Thread.sleep(1000);
		elem.click();
		

		elem=rep.objRep("(//div[@class='v-gridlayout-slot'])[22]",driver);
		
		Thread.sleep(1000);
		//	Click on Bearbeiten button to process it
		elem.click();

		rep.objButton("profileDetailsPanelProjectRemoveBtn",driver);
		
		
		rep.objButton("profileDetailsPanelSaveBtn", driver);
		return driver;
	}

//Function Technologien() will click on Technologien tab and enters Technologien details		
	public WebDriver Technologien(WebDriver driver) throws InterruptedException
	{
		WebElement ele=rep.objRep("//div[contains(text(),'Technologien')]", driver);
		Thread.sleep(1000);
		ele.click();
		
		WebElement elem = rep.objRep("//div[contains(text(),'Eclipse')]",driver);
		Thread.sleep(1000);
		elem.click();
		
		 elem = rep.objRep("(//div[@class='v-gridlayout-slot'])[23]",driver);

						   
		//	Click on Bearbeiten button to process it
		Thread.sleep(1000);
		elem.click();
		
		rep.objButton("profileDetailsPanelTechRemoveBtn", driver);

		rep.objButton("profileDetailsPanelSaveBtn", driver);
		return driver;
	}

}

