package com.thefork.tests;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.thefork.utilities.PropetiesProvider;

public class BasePageTests {

	
	protected static WebDriver driver = null;
	public PropetiesProvider Globalproperties;
	static ExtentTest test;
	static ExtentReports report;
	
	public BasePageTests()
	{
		 
		 Globalproperties=new PropetiesProvider("global");
		 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
         //report = new ExtentReports(System.getProperty("user.dir")+"\\testnameReport"+LocalDateTime.now().format(myFormatObj)+".html"); 
         report = new ExtentReports(System.getProperty("user.dir")+"\\testnameReport.html"); 
		 
     }
	
	@BeforeMethod
	public void Setup()
	{    
		   
		   
		String browsertype=Globalproperties.getProprety("Browser").toString();
		 switch(browsertype)
		 {
		 case "chrome":
			
			 System.setProperty("webdriver.chrome.driver", new File("Drivers\\chromedriver.exe").getAbsolutePath());
			 driver=new ChromeDriver();
			 break;
			 
		 default : driver=new ChromeDriver();
		 }
		
	}
	public static String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../BStackImages/" + System.currentTimeMillis()+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		} 
	
    
}
