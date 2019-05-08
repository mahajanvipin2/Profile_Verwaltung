package profilverwaltung;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Credentials {

	String inputLogin, inputPassword;
	Object_Rep obj = new Object_Rep();

	public WebDriver login(WebDriver driver) {
		WebElement eleUser = obj.objSend("//input[@id='loginUsernameTextField']", driver);
		eleUser.sendKeys("Vipin.mahajan@redbots.de");

		WebElement elePwd = obj.objSend("//input[@id='loginPasswordTextField']", driver);
		elePwd.sendKeys("october567");

		WebElement elem = obj.objRep("//div[@id='loginBtn']", driver);
		elem.click();
		return driver;
	}

}
