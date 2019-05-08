package New_Profileverwaltung;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import profilverwaltung.Object_Rep;

public class profileCreation {
	
	New_Rep rep = new New_Rep();

	public WebDriver create_Person(WebDriver driver) {
		try {	
			WebElement elex=rep.objRep("//div[@class='v-customcomponent v-widget v-has-width v-has-height']//div//div//div[@class='v-gridlayout-slot']//div[@class='v-gridlayout v-layout v-widget v-has-width v-has-height']//div[4]//div[1]",driver);	
		//	WebElement elex=rep.objRep("//tr[@class='v-table-row v-selected']//td[1]",driver);
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
			Thread.sleep(1000);
			elex.sendKeys("Aadreas");
			elex=rep.objRep("//input[@id='profileDetailsPanelSurnameTextfield']",driver);
			elex.click();
			Thread.sleep(1000);
			elex.sendKeys("Aali");
			Thread.sleep(1000);
			divWithScrollbarElement.sendKeys(Keys.TAB);
			divWithScrollbarElement.sendKeys(Keys.DOWN);
//			elex=rep.objRep("//button[@type='button']",driver);
			
			elex=rep.objRep("//input[@id='gwt-uid-52']",driver);

			elex.click();
			elex.sendKeys("05.12.81");
			divWithScrollbarElement.sendKeys(Keys.TAB);
			elex=rep.objRep("//textarea[@id='profileDetailsPanelAbstractTextfield']",driver);
			elex.sendKeys("I am having 12 years of testing experience as Quality Analyst in area of Manual, Regression, System and User Acceptance Testing and Testautomation. Also due to his experience he is strong in conceptual testsetup (also end-2-end testpreparation and -execution), including handling testdata-requirements and testdata-creation. He is currently handling role of Senior Quality Test Lead. He has an extensive experience in Datawarehousing, Siebel CRM and Web Applications. He has thorough knowledge and experience in STLC lifecycle activities and QA processes, both agile (Scrum) and waterfall.");
			divWithScrollbarElement.sendKeys(Keys.TAB);			
			divWithScrollbarElement.sendKeys(Keys.DOWN);
			elex=rep.objRep("//input[@id='profileDetailsPanelEducationTextfield']",driver);
			elex.click();
			Thread.sleep(1000);
			elex.sendKeys("Tester, Testautomation-Expert, Testmanager");
			elex=rep.objRep("//input[@id='profileDetailsPanelEductionNameTextfield']",driver);
			elex.click();
			Thread.sleep(1000);
			elex.sendKeys("Master of Computer Applications (MCA) Professional Scrum Master");
			divWithScrollbarElement.sendKeys(Keys.DOWN);
			elex=rep.objRep("//div//div//div[@class='v-gridlayout v-layout v-widget v-has-width v-has-height v-gridlayout-margin-top v-gridlayout-margin-right v-gridlayout-margin-bottom v-gridlayout-margin-left']//div[14]//input[1]",driver);

			elex.click();
			Thread.sleep(1000);
			elex.sendKeys("Selenium Testing");
			divWithScrollbarElement.sendKeys(Keys.DOWN);
			divWithScrollbarElement.sendKeys(Keys.DOWN);
			rep.objButton("profileDetailsPanelSaveBtn", driver);						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	
}
