package NewPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import NewPackage.Objects;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import NewPackage.Objects;
import org.openqa.selenium.support.ui.Select;


//package excelExportAndFileIO;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	public void readExcel(String filePath,String fileName,String sheetName, WebDriver driver, Objects Temp) throws IOException{

		//Create an object of File class to open xlsx file

		File file =    new File(filePath+"\\"+fileName);

		//Create an object of FileInputStream class to read excel file

		FileInputStream inputStream = new FileInputStream(file);

		Workbook guru99Workbook = null;

		//Find the file extension by splitting file name in substring  and getting only extension name

		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		//Check condition if the file is xlsx file

		if(fileExtensionName.equals(".xlsx")){

			//If it is xlsx file then create object of XSSFWorkbook class

			guru99Workbook = new XSSFWorkbook(inputStream);

		}

		//Check condition if the file is xls file

		else if(fileExtensionName.equals(".xls")){

			//If it is xls file then create object of XSSFWorkbook class

			guru99Workbook = new HSSFWorkbook(inputStream);

		}

		//Read sheet inside the workbook by its name

		Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

		//Find number of rows in excel file

		int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

		//Create a loop over all the rows of excel file to read it

		for (int i = 1; i < rowCount+1; i++) {

			Row row = guru99Sheet.getRow(i);

			//Create a loop to print cell values in a row

			for (int j = 0; j < row.getLastCellNum();) {

				//Print Excel data in console

				System.out.print(row.getCell(j).getStringCellValue()+"|| ");

				WebElement Fname =Temp.txt_FName(driver);
				Fname.sendKeys(row.getCell(j).getStringCellValue());
				j++;
				WebElement Lname = Temp.txt_LName(driver);
				Lname.sendKeys(row.getCell(j).getStringCellValue());
				j++;
				WebElement Pnum = Temp.txt_Pnumber(driver);
				Pnum.sendKeys(row.getCell(j).getStringCellValue());		
				j++;
				WebElement Email=Temp.txt_Email(driver);
				Email.sendKeys(row.getCell(j).getStringCellValue());
				j++;
				WebElement Address=Temp.txt_Address(driver);
				Address.sendKeys(row.getCell(j).getStringCellValue());
				j++;
				WebElement City=Temp.txt_City(driver);
				City.sendKeys(row.getCell(j).getStringCellValue());
				j++;
				WebElement State=Temp.State(driver);
				State.sendKeys(row.getCell(j).getStringCellValue());
				j++;
				WebElement Postalcode=Temp.txt_Post(driver);
				Postalcode.sendKeys(row.getCell(j).getStringCellValue());
				j++;
				Select dropdown1 = Temp.combo_cont(driver);
				dropdown1.selectByVisibleText(row.getCell(j).getStringCellValue());   
				j++;

				WebElement username = Temp.UserName(driver);
				username.sendKeys(row.getCell(j).getStringCellValue());
				j++;

				WebElement passwd=Temp.passwd(driver);
				passwd.sendKeys(row.getCell(j).getStringCellValue());
				j++;
				WebElement conf_pwd=Temp.conf_pawd(driver);
				conf_pwd.sendKeys(row.getCell(j).getStringCellValue());
				j++;


				System.out.println("Test Passed!");


			}


			System.out.println();
		} 



	}  

	//Main function is calling readExcel function to read data from excel file

	public static void main(String[] args) throws IOException{

		//Create an object of ReadGuru99ExcelFile class

		readexcel objExcelFile = new readexcel();

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Objects Temp = new Objects();
		Registeration registr= new Registeration();
		Flights flight=new Flights();
		Signoff sgn= new Signoff();
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);
		// get the actual value of the title
		actualTitle = driver.getTitle();


		WebElement RegLink = Temp.txt_Register(driver);
		registr.reg(RegLink);

		driver.manage().window().maximize();
		//Prepare the path of excel file

		//    String filePath = System.getProperty("user.dir")+"C:\\input_File_Selenium";
		String filePath = "C:\\input_File_Selenium";

		//Call read file method of the class to read data

		objExcelFile.readExcel(filePath,"ExportExcel.xls","Vipin",driver,Temp);
		WebElement submit_but=Temp.sub_bttn(driver);
		submit_but.click();

		WebElement sign_off=Temp.Signoff(driver);
		sgn.sign_off(sign_off);


		WebElement regis=Temp.txt_Register(driver);
		registr.reg(regis);

		objExcelFile.readExcel(filePath,"ExportExcel.xls","shub",driver,Temp);
		submit_but = Temp.sub_bttn(driver);
		submit_but.click();

		sign_off=Temp.Signoff(driver);
		sgn.sign_off(sign_off);

		WebElement flights_status=Temp.flight_link(driver);
		flight.flight_status(flights_status);
		//    
		//    WebElement flights_type=Temp.flight_tye(driver);
		//    flight.flight_fields(flights_type);

		Select flight_pass=Temp.Passengers(driver);
		flight.flght_pass(flight_pass);

		Select from_com= Temp.combo_From(driver);
		flight.flight_from(from_com);

		Select arrvi_on=Temp.Arr_on(driver);
		flight.arriving_on(arrvi_on);
	}

}