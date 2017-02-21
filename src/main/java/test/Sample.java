package test;

import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Sample {

	@Test
public void test() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();

		capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64 bit.exe");
		ChromeDriver driver = new ChromeDriver(capabilities);
		//FirefoxDriver driver=new FirefoxDriver(capabilities);
		Thread.sleep(3000);
		/*driver.manage().deleteAllCookies();
		Runtime.getRuntime().exec("cmd /c start TempClean.bat",null, new File("C:\\Users\\vignesh.k\\Desktop"));*/
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.salesforce.com/in/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//click free trial in homepage
		driver.findElementByLinkText("FREE TRIAL").click();
		
		//handling windows
		/* Set<String> windowids = driver.getWindowHandles();

		  //System.out.println("Total window->" + windowids.size());
		 
		  Iterator<String> it = windowids.iterator();
		  				
		  String signupWindow=it.next();

		  driver.switchTo().window(signupWindow);*/
		/* Set<String> windows=driver.getWindowHandles();
		 for (String window : windows) {
			 
			 driver.switchTo().window(window);
			 
			
		}
		*/
		 
		 //driver.findElementByXPath("//input[@id='UserFirstName']").sendKeys("vignesh");
//		  driver.findElementByLinkText("Start free trial �").click();
		
		
		
		
		
		/*Actions test=new Actions(driver);
		test.keyDown(Keys.CONTROL).sendKeys("\t").keyUp(Keys.CONTROL).build().perform();
		driver.navigate().to("https://www.google.co.in/");
		
		test.sendKeys(Keys.TAB);
*/		/*int no_Of_Adults=10;
		int no_Of_Adults1=5;sendKeys(Keys.CONTROL +"\t"
		driver.findElementByXPath("//span[@class=' tab_txt']").click();
		
		for(int i=1;i<=no_Of_Adults;i++)
		{
			driver.findElementByXPath("//div[@id='adult_count']/a[2]").click();	
		}
		
		for(int i=1;i<=no_Of_Adults1;i++)
		{
			driver.findElementByXPath("//div[@id='adult_count']/a[1]").click();	
		}		*/
		
	/*	driver.findElementById("lst-ib").sendKeys("makemytrip");
		driver.findElementById("lst-ib").sendKeys(Keys.ENTER);
		driver.findElementByXPath("//span[@class='ellip']").click();
		*/
		/*driver.findElementById("ssologinlink").click();	
		driver.findElementById("openFgrPwdLink").click();
		driver.findElementById("fp_email").sendKeys("aaavig111@yopmail.com");
		driver.findElementById("fpwd_btn").click();
		String errorMess=driver.findElementByXPath("(//span[@class='chf_errortext chf_flL chf_error_msg'])[8]").getText();
		String displayedMess="EmailID provided is not registered with MakeMyTrip.";
		if(errorMess.contains(displayedMess))
		{
			System.out.println("true");
		}*/
		
		
		/*driver.findElementById("username").sendKeys("aaavig@yopmail.com");
		driver.findElementById("username").sendKeys(Keys.TAB);
		driver.findElementById("password").sendKeys("aaavig ");
		driver.findElementById("password").sendKeys(Keys.TAB);
		driver.findElementByXPath("//input[@id='login_btn']").click();
		
		driver.findElementById("ssologinlink").click();
		driver.findElementByXPath("(//input[@class='sign_out chf_flL'])[1]").click();*/
		/*String errorMessage=driver.findElementByXPath("(//span[@id='errormsg_password'])[5]").getText();
		String displayedError="EMail-ID not registered. Please try a different ID.";
		if (errorMessage.contains(displayedError)) {
			System.out.println("true");
		}*/
		
		
/*		driver.findElementById("ssologinlink").click();		
		driver.findElementById("openNewUserDivlink").click();		
		driver.findElementById("newusername").sendKeys("bbdvig@yopmail.com");
		driver.findElementById("newusername").sendKeys(Keys.TAB);		
		driver.findElementById("newpassword").sendKeys("bbdvig");
		driver.findElementById("newpassword").sendKeys(Keys.TAB);		
		driver.findElementById("repassword").sendKeys("bbdvigaaa");
		driver.findElementById("repassword").sendKeys(Keys.TAB);
		driver.findElementById("iagreeSpan").click();
		driver.findElementById("create_act_btn").click();*/
		
//		System.out.println("success");
		/*
		driver.findElementByXPath("//span[@class=' tab_txt']").click();
		driver.findElementById("return_date_sec").click();
		driver.findElementByXPath("//span[@class='ui-icon ui-icon-circle-triangle-e']").click();
		driver.findElementByXPath("//span[@class='ui-icon ui-icon-circle-triangle-e']").click();
		driver.findElementByLinkText("23").click();*/
		
		System.out.println("sucess");
		//driver.manage().deleteAllCookies();
		//driver.close();

	/*	FileInputStream fis = new FileInputStream(new File("./data/office.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);*/
		
		
	}

}
