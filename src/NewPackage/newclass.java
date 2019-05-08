//package NewPackage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
////import org.openqa.selenium.firefox.FirefoxDriver;
////import org.openqa.selenium.firefox.GeckoDriverService;
////comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
//import NewPackage.Objects;
//import org.openqa.selenium.support.ui.Select;
//public class newclass {
//
//
//    public static void main(String[] args) {
//        // declaration and instantiation of objects/variables
////	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver\\geckodriver.exe");
////	WebDriverdriver = new FirefoxDriver();
//		//comment the above 2 lines and uncomment below 2 lines to use Chrome
//		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//	
//		Objects Temp = new Objects();
////		Select comb= new Select(null);
//    	
//        String baseUrl = "http://demo.guru99.com/test/newtours/";
//        String expectedTitle = "Welcome: Mercury Tours";
//        String actualTitle = "";
//        // launch Fire fox and direct it to the Base URL
//        driver.get(baseUrl);
//        // get the actual value of the title
//        actualTitle = driver.getTitle();
//        /*
//         * compare the actual title of the page with the expected one and print
//         * the result as "Passed" or "Failed"
//         */
//        if (actualTitle.contentEquals(expectedTitle)){
//           
//        	WebElement RegLink = Temp.txt_Register(driver);
//        	
//        	//WebElement RegLink = driver.findElement(By.linkText("REGISTER"));
//            RegLink.click();
//            
//            driver.manage().window().maximize();
//            
//            WebElement Fname =Temp.txt_FName(driver);
//            Fname.sendKeys("Vipin");
//            
//            WebElement Lname = Temp.txt_LName(driver);
//            Lname.sendKeys("Mahajan");
//            
//            WebElement Pnum = Temp.txt_Pnumber(driver);
//            Pnum.sendKeys("9999999999");		
//            
//            WebElement Email=Temp.txt_Email(driver);
//            Email.sendKeys("abc.gmail.com");
//            
//            WebElement Address=Temp.txt_Address(driver);
//            Address.sendKeys("Cäcilien Str");
//            
//            WebElement City=Temp.txt_City(driver);
//            City.sendKeys("BONN");
//            
//            WebElement State=Temp.State(driver);
//            State.sendKeys("BONN");
//            
//            WebElement Postalcode=Temp.txt_Post(driver);
//            Postalcode.sendKeys("53227");
//            
//            WebElement username = Temp.UserName(driver);
//            username.sendKeys("mahaj.vip");
//            
//            
//            WebElement passwd=Temp.passwd(driver);
//            passwd.sendKeys("pwd123");
//       
//            WebElement conf_pwd=Temp.conf_pawd(driver);
//            conf_pwd.sendKeys("pwd123");
//            
//             
//            Select dropdown1 = Temp.combo_cont(driver);
//            dropdown1.selectByVisibleText("INDIA");   
//            
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
//       
//        //close Fire fox
//       driver.close();
//       
//    }
//
//}