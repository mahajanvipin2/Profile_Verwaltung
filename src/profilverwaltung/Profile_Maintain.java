package profilverwaltung;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import okio.Timeout;

public class Profile_Maintain {
	Object_Rep rep = new Object_Rep();
	WebElement saveButton;

// Function branchen() is used to click on Branchen tab and enter "Test Automation" into it
		public WebDriver branchen(WebDriver driver) throws InterruptedException {
			System.out.println("Enter into Branchen");
			WebElement ele = rep.objRep("//div[contains(text(),'Branchen')]", driver);
			//	Click on Branchen tab
			ele.click();

//			WebElement elem = rep.objRep(
//					"//div[@class='v-customcomponent v-widget v-has-width v-has-height']//div//div//div[@class='v-gridlayout-slot']//div[@class='v-gridlayout v-layout v-widget v-has-width v-has-height']//div[4]//div[1]",
//					driver);
			
			WebElement elem = rep.objRep("(//div[@class='v-gridlayout-slot'])[22]",driver);
			//	Click on Bearbeiten button to process it
			elem.click();
			WebElement eleme = rep.objRep("//div[@id='profileDetailsPanelSectorComboBox']//input[@type='text']",
					driver);
			//	Click on TextBox related to Branchen
			eleme.click();
			// WebElement
			// elemen=rep.objRep("//div[@id='profileDetailsPanelSectorComboBox']//input[@type='text']",driver);
			//	Clear the contents of Textbox
			eleme.clear();
			// WebElement
			// element=rep.objRep("//div[@id='profileDetailsPanelSectorComboBox']//input[@type='text']",driver);
			//	Enter "Test Automation" string in TextBox
			eleme.sendKeys("Test Automation");
			Thread.sleep(2000);
			eleme.sendKeys(Keys.TAB);
			rep.objButton("profileDetailsPanelSectorAddBtn", driver);
			eleme = rep.objRep("//div[@id='profileDetailsPanelSectorComboBox']//input[@type='text']",
					driver);
			eleme.click();
		//	saveButton = rep.objButtonID("profileDetailsPanelSaveBtn", driver);
			// Click on Speichern button
			rep.objButton("profileDetailsPanelSaveBtn", driver);
			return driver;
		}
	
//Function mod_Raten() is used to modify the value of Raten/Verfügbarkeit value avaialble in Person Tab
	public WebDriver mod_Raten(WebDriver driver) {
		try {
			WebElement ele = rep.objRep("//input[@id='profileDetailsPanelRatesTextfield']", driver);
			String str = ele.getAttribute("value");
			if (str.contentEquals("69")) {
				ele.clear();
				ele.sendKeys("79");
			}

			else {
				ele = rep.objRep("//input[@id='profileDetailsPanelRatesTextfield']", driver);
				ele.clear();
				ele.sendKeys("69");
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
			
			//WebElement ele=rep.objRep("//div[@class='v-captiontext'][contains(text(),'Person')]", driver);
			WebElement ele=rep.objRep("//div[contains(text(),'Person')]//ancestor::div[@id='gwt-uid-77']", driver);
			ele.click();
			//Click on Div portion so that div can be scrolled
			WebElement divWithScrollbarElement = rep.objRep("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]",driver);
			
			//WebElement divWithScrollbarElement = rep.objRep("//div[@class='v-gridlayout-slot'])[33]//div[@role='button']//child::span//span[text()='Bearbeiten']",	driver);
			divWithScrollbarElement.click();

			elex=rep.objRep("//input[@id='profileDetailsPanelNameTextfield']",driver);
			elex.click();
			elex.clear();
			Thread.sleep(1000);
			elex.sendKeys("Andreas");
			elex=rep.objRep("//input[@id='profileDetailsPanelSurnameTextfield']",driver);
			elex.click();
			elex.clear();
			Thread.sleep(1000);
			elex.sendKeys("Vipin");
			Thread.sleep(1000);
			divWithScrollbarElement.sendKeys(Keys.TAB);
			divWithScrollbarElement.sendKeys(Keys.DOWN);
//			elex=rep.objRep("//button[@type='button']",driver);
			
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
			//elex=rep.objRep("//div//div//div[@class='v-gridlayout v-layout v-widget v-has-width v-has-height v-gridlayout-margin-top v-gridlayout-margin-right v-gridlayout-margin-bottom v-gridlayout-margin-left']//div[14]//input[1]",driver);
			elex=rep.objRep("//div[@class='v-gridlayout-slot'][13]//input",driver);
			elex.clear();
			elex.click();
			Thread.sleep(1000);
			elex.sendKeys("Selenium Testing");
			divWithScrollbarElement.sendKeys(Keys.DOWN);
			divWithScrollbarElement.sendKeys(Keys.DOWN);
			
			
			mod_Raten(driver);
			
			WebElement eleRS=rep.objText("profileDetailsPanelRatesStd",driver);
			eleRS.clear();
			eleRS.click();
			Thread.sleep(1000);
			eleRS.sendKeys("50");

			WebElement eleRT=rep.objText("profileDetailsPanelRatesTag",driver);
			eleRT.clear();
			eleRT.click();
			Thread.sleep(1000);
			eleRT.sendKeys("50");
			rep.objButton("profileDetailsPanelSaveBtn", driver);
			System.out.println("exit from modification of Person");								
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	
//Function checkProf() is used to check row for Vipin Mahajan in Profile Page and then calls Prof_Person to update it, if available
	public WebDriver checkProf(WebDriver driver) throws InterruptedException {
		
		WebElement ele=rep.objRep("//div[contains(text(),'Andreas')]",driver);
		String str = ele.getText();
		if (str.equals("Andreas")) {
			//driver.findElement(By.xpath("//div[contains(text(),'Mahajan')]")).click();
			WebElement elem = rep.objRep("//div[contains(text(),'Andreas')]", driver);
			elem.click();
		} else {
			System.out.print("Call Create_Profile");
		}
		return driver;
	}
	
//Function Sprachen() will click on Sprachen tab and enters Sprachen
	public WebDriver Sprachen(WebDriver driver) throws InterruptedException
	{
		WebElement ele=rep.objRep("//div[contains(text(),'Sprachen')]",driver);
		ele.click();
//		WebElement elem = rep.objRep(
//				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]",
//				driver);
		
//WebElement elem = rep.objRep("(//div[@class='v-gridlayout-slot'])[23]//span[text()='Bearbeiten']",driver);

//elem.click();
		//Thread.sleep(5000);
		
//		Click on Bearbeiten button to process it
		WebElement elem =driver.findElement((By.xpath("(//div[@class='v-gridlayout-slot'])[23]")));
		elem.click();
		//Enter the value in first DropDown
		elem =rep.objRep("//div[@id='profileDetailsPanelLanguageNameAddComboBox']//input[@type='text']",driver);
		elem.click();
		elem.sendKeys("English");
		Thread.sleep(1000);
	//	elem.sendKeys(Keys.TAB);
		
	/*	elem =rep.objRep("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]",driver);
		Thread.sleep(1000);
		elem.click();
		elem.sendKeys("Fließend");*/
		elem.sendKeys(Keys.TAB);
		
		rep.objButton("profileDetailsPanelLanguageAddBtn", driver);
		Thread.sleep(1000);
/*		elem =rep.objText("languagePopupNameTextField",driver);
		elem.click();
		elem.clear();
		elem.sendKeys("Hindi");*/
		
	//	elem =rep.objRep("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/input[1]",driver);
		
		elem =rep.objRep("(//div[@role='combobox'])[3]//input",driver);
		elem.click();
		elem.sendKeys("Fließend");
		Thread.sleep(2000);
		elem.sendKeys(Keys.TAB);
		
		rep.objButton("languagePopupSaveBtn", driver);
		
		Thread.sleep(1000);
		elem =rep.objRep("//div[@id='profileDetailsPanelLanguageNameAddComboBox']//input[@type='text']",driver);
		elem.click();
		
		rep.objButton("profileDetailsPanelSaveBtn", driver);
		return driver;		
	}

//Function Projekte() will click on Projekte tab and enters Projekt details	
	public WebDriver Projekte(WebDriver driver) throws InterruptedException
	{
		WebElement ele=rep.objRep("//div[contains(text(),'Projekte')]",driver);
		ele.click();
//		WebElement elem = rep.objRep(
//				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]",
//				driver);
		
		WebElement elem=rep.objRep("(//div[@class='v-gridlayout-slot'])[22]",driver);
		//	Click on Bearbeiten button to process it
		elem.click();
		elem=rep.objText("profileDetailsPanelProjectTextfield", driver);
		elem.sendKeys("Profilverwaltung");
		Thread.sleep(1000);
		//Click on + button available on the page to add the project details
		rep.objButton("profileDetailsPanelProjectAddBtn", driver);
		
		elem=rep.objRep("//div[@id='projectPopupStartDateField']//button[@type='button']", driver);
		elem.click();
		
		elem=rep.objRep("//span[@class='v-datefield-calendarpanel-day'][contains(text(),'24')]",driver);
		elem.click();
		
		elem=rep.objRep("//div[@id='projectPopupProjectEndDateTextField']//button[@type='button']", driver);
		elem.click();
		
		elem=rep.objRep("//span[contains(text(),'24')]",driver);
		elem.click();
		
		WebElement text_field=rep.objText("projectPopupAbstractTextField",driver);
		text_field.click();
		text_field.sendKeys("It maitains the Profiles of the employees");
		Thread.sleep(2000);
		text_field.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		rep.objButton("projectPopupSaveBtn", driver);
		Thread.sleep(1000);
		rep.objButton("profileDetailsPanelSaveBtn", driver);
		return driver;
	}

//Function Technologien() will click on Technologien tab and enters Technologien details		
	public WebDriver Technologien(WebDriver driver) throws InterruptedException
	{
		WebElement ele=rep.objRep("//div[contains(text(),'Technologien')]", driver);
		ele.click();
//		WebElement elem = rep.objRep(
//				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]",
//				driver);
		
		WebElement elem = rep.objRep("(//div[@class='v-gridlayout-slot'])[23]",driver);
		//	Click on Bearbeiten button to process it
		elem.click();
		
		ele=rep.objRep("//div[@id='profileDetailsPanelTechAddComboBox']//input[@type='text']",driver);
		ele.click();
		ele.sendKeys("Selenium");
		Thread.sleep(2000);
		ele=rep.objRep("//div[@id='profileDetailsPanelTechNameAddComboBox']//input[@type='text']",driver);
		ele.click();
		Thread.sleep(2000);
		ele.sendKeys("Eclipse");
		Thread.sleep(2000);
		ele.sendKeys(Keys.TAB);
		rep.objButton("profileDetailsPanelTechAddBtn", driver);
		Thread.sleep(2000);

		ele=rep.objRep("//div[@id='TechnologyPopupSaveBtn']", driver);
		ele.click();
		System.out.println("Before highlighting technology Row");
//		ele=rep.objRep("//div[@id='profileDetailsPanelTechAddComboBox']//input[@type='text']",driver);
//		ele.click();	
		System.out.println("After highlighting technology Row");
		Thread.sleep(2000);

		rep.objButton("profileDetailsPanelSaveBtn", driver);
		return driver;
	}
	
}

