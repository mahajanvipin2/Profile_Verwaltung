package parameter_ProfileVerwaltung;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Obj_Rep {

	commonFunc fun=new commonFunc();
	String xpathLogin="//input[@id='loginUsernameTextField']";
	String xpathpwd="//input[@id='loginPasswordTextField']";
	String submit_but="//div[@id='loginBtn']";
	String chk_Text="//div[contains(text(),'Mahajan')]";
	String left_panText="//*[@id=\"gwt-uid-8\"]/descendant::span[text()='Profile']";
//	String val="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]";
	String row="//div[contains(text(),'Andreas')]";
	String val="//div[@class='v-gridlayout-slot'])[22]";	
	String bearbeiten="(//div[@class='v-gridlayout-slot'])[33]";
	String personTab="//div[@class='v-captiontext'][contains(text(),'Person')]";
	String vorname="//input[@id='profileDetailsPanelNameTextfield']";
	String nachname="//input[@id='profileDetailsPanelSurnameTextfield']";
	String frame="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]";
	String description="//textarea[@id='profileDetailsPanelAbstractTextfield']";
	String ausbildung="//div[@class='v-gridlayout-slot'][13]//input";
	
	
	public WebElement enter(String input, WebDriver driver)
	{
		 WebElement user= fun.rtn_Webelement(input,driver);
		 return user;
	}

	public WebElement clik(String input, WebDriver driver)
	{
		 WebElement user= fun.clik_Webelement(input,driver);
		 return user;
	}
	
}
