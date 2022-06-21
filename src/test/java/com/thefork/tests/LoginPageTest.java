package com.thefork.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.thefork.pages.HomePage;
import com.thefork.pages.LoginPage;
import com.thefork.pages.PersonnalAccountPage;
import com.thefork.utilities.PropetiesProvider;

public class LoginPageTest extends BasePageTests {

	private PropetiesProvider loginpageproperties;  //Properties in test page
	private LoginPage loginpagemodel;					   // Page Objects 
	private HomePage homepagemodel;
	private PersonnalAccountPage personalaccountmodel;
	
	public LoginPageTest()
	{     super();
		  
	}
	
	@BeforeMethod
	public void Init()
	{
		loginpageproperties=new PropetiesProvider("login_page");//Properties in test page
		loginpagemodel=new LoginPage(this.driver);
		homepagemodel=new HomePage(this.driver);
		personalaccountmodel=new PersonnalAccountPage(this.driver);
	}
	
	 @Test
		public void ValidatePersonalInformations() throws IOException
		 {      
	    	   test = report.startTest("validate the personal informations"); 
	    	   
	    	   
	    	   loginpagemodel.OpenApplication(loginpageproperties.getProprety("url"));
	    	   loginpagemodel.AcceptCookies();
	    	   test.log(LogStatus.INFO,test.addScreenCapture(capture(driver))+ "Step 1 : Open The Fork application");
			   
	    	   loginpagemodel.TypeUsername(loginpageproperties.getProprety("username"));
	    	   test.log(LogStatus.INFO,test.addScreenCapture(capture(driver))+ "Step 2 : Input Username");
	    	   
	    	   loginpagemodel.TypePassword(loginpageproperties.getProprety("password"));
	    	   test.log(LogStatus.INFO,test.addScreenCapture(capture(driver))+ "Step 3 : Input Password");
	    	   
	    	   //loginpagemodel.ValidateInformation("haraka.mohammed@gmail.com", loginpageproperties.getProprety("password"));
	    	   //loginpagemodel.ClickOnConnect();
	    	   test.log(LogStatus.INFO,test.addScreenCapture(capture(driver))+ "Step 4 : Click On Connect");
	    	   
	    	   //homepagemodel.AccessToPersonalAccount();
	    	   test.log(LogStatus.INFO,test.addScreenCapture(capture(driver))+ "Step 5 : Access to Personal account");
	    	   
	    	   //personalaccountmodel.ValidateInformations(loginpageproperties.getProprety("firstname"), loginpageproperties.getProprety("Lastname"), loginpageproperties.getProprety("username"));
	    	   test.log(LogStatus.INFO,test.addScreenCapture(capture(driver))+ "Step 6 : assert that the personal information matches with your account information");
		 }
	 
	
	
	@AfterMethod
	public void Closeapplication()
	{
		this.driver.close();
		report.endTest(test);
		report.flush();
	}
    
}
