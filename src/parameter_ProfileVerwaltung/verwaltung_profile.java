package parameter_ProfileVerwaltung;

import static org.testng.Assert.assertNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verwaltung_profile {
	static Obj_Rep reposit=new Obj_Rep();
	WebElement ele;
	WebElement divWithScrollbarElement;
	para_Profile_Maintain para=new para_Profile_Maintain();
	public WebDriver readExcel(String filePath, String fileName, String sheetName, WebDriver driver,Obj_Rep reposit) throws IOException, InterruptedException
	{
		File file=new File(filePath + "\\"+fileName);
		commonFunc funct= new commonFunc();
		FileInputStream str=new FileInputStream(file);
		Workbook wkbook=null;
		String fileExt=fileName.substring(fileName.indexOf("."));
		if(fileExt.equals(".xls"))
		{
			wkbook=new HSSFWorkbook(str);
		}
		else
		{
			wkbook=new XSSFWorkbook(str);
		}
		
		int totalSheets= wkbook.getNumberOfSheets();
		int k=0;
		Sheet sheet=null;
		WebElement elem;
	if(sheetName=="login")
	{
			sheet=wkbook.getSheetAt(0);
			int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();		
			for (int i = 1; i < rowCount+1; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum();) {	
					elem = reposit.enter(reposit.xpathLogin, driver);
					elem.sendKeys(row.getCell(j).getStringCellValue());
					j++;
					elem =reposit.enter(reposit.xpathpwd, driver);
					elem.sendKeys(row.getCell(j).getStringCellValue());
					j++;
					}				
				}
	}	
	
	if(sheetName=="chk_text") {
			sheet=wkbook.getSheetAt(1);
			Row row = sheet.getRow(1);
			String str1=row.getCell(0).getStringCellValue();
			System.out.println(str1);
			reposit.clik(verwaltung_profile.reposit.row, driver);
//			reposit.clik(verwaltung_profile.reposit.val, driver);
		}
	
	
	if(sheetName=="person")
	{
		para.para_person(wkbook,driver);
	}
	return driver;
	}


	public static void main(String[] args) throws IOException, InterruptedException {
		verwaltung_profile pro = new verwaltung_profile();
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vipin.mahajan\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
		driver.get("http://192.168.4.117:8080/profilverwaltung/");		
		String filePath="C:\\Users\\vipin.mahajan\\Desktop\\Vipin_Automation\\Profileverwaltung";
		String fileName="input_profileverwaltung.xls";
		String sheetName="login";
		pro.readExcel(filePath,fileName,sheetName,driver,reposit);
		reposit.clik(reposit.submit_but,driver);
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);	
		reposit.clik(reposit.left_panText, driver);
		sheetName="chk_text";
		pro.readExcel(filePath,fileName,sheetName,driver,reposit);		
		reposit.clik(reposit.bearbeiten, driver);
		sheetName="person";
		pro.readExcel(filePath,fileName,sheetName,driver,reposit);				
	}

}
