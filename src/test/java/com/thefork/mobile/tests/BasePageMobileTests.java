package com.thefork.mobile.tests;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.thefork.utilities.PropetiesProvider;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasePageMobileTests {
	//protected static WebDriver driver = null;
	public static AppiumDriver<AndroidElement> driver=null;
	
	protected DesiredCapabilities caps = new DesiredCapabilities();
	private PropetiesProvider GlobalMobileproperties;
	static ExtentTest test;
	static ExtentReports report;

	public BasePageMobileTests()
	{
		 
		 GlobalMobileproperties=new PropetiesProvider("globalmobile");
		 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
         //report = new ExtentReports(System.getProperty("user.dir")+"\\testnameReport"+LocalDateTime.now().format(myFormatObj)+".html"); 
         report = new ExtentReports(System.getProperty("user.dir")+"\\testmobile.html"); 
         caps.setCapability("device", GlobalMobileproperties.getProprety("device"));
  	     caps.setCapability("os_version", GlobalMobileproperties.getProprety("os_version"));
  	     caps.setCapability("project", GlobalMobileproperties.getProprety("project"));
  	     caps.setCapability("build", GlobalMobileproperties.getProprety("build"));
  	     caps.setCapability("app", GlobalMobileproperties.getProprety("browserstack_url_app")); 
  	     String userName = GlobalMobileproperties.getProprety("browserstack_username");
  	     String accessKey = GlobalMobileproperties.getProprety("browserstack_password"); 
 		    try {
 		    	 driver = new AppiumDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
 			} catch (MalformedURLException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}  
	         
     }
	 
	
	public static String capture(AppiumDriver<AndroidElement> driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../BStackImages/" + System.currentTimeMillis()+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		} 
	
	
}
