package com.thefork.mobile.tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.thefork.appmobile.pages.LoginMobilePage;
import com.thefork.appmobile.pages.PersonnalAccountMobilePage;
import com.thefork.pages.HomePage;
import com.thefork.pages.LoginPage;
import com.thefork.pages.PersonnalAccountPage;
import com.thefork.utilities.PropetiesProvider;

import io.appium.java_client.android.AndroidDriver;

public class LoginPageMobileTest extends BasePageMobileTests {

	private PropetiesProvider loginmobilepageproperties;  //Properties in test page
	private LoginMobilePage loginmobilepagemodel;
	private PersonnalAccountMobilePage personalaccountmobilemodel;
	 
	 
	
	public LoginPageMobileTest()
	{     super();
		  
	}
	
	@BeforeMethod
	public void Init()
	{
		 loginmobilepageproperties=new PropetiesProvider("loginmobile_page");//Properties in test page
		 //loginmobilepagemodel=new LoginMobilePage(this.driver);
		 loginmobilepagemodel=new LoginMobilePage(this.driver); 
		 personalaccountmobilemodel=new PersonnalAccountMobilePage(this.driver); 
	}
	
	 @Test
		public void ValidatePersonalInformations() throws IOException
		 {      
	    	   test = report.startTest("validate the personal informations"); 
	    	   loginmobilepagemodel.GoToLoginPage();
	    	   test.log(LogStatus.INFO,test.addScreenCapture(capture(driver))+ "Step 1 : Open The Fork application and Go to Login Page");
	    	   
	    	    
	    	   loginmobilepagemodel.TypeUsername(loginmobilepageproperties.getProprety("username"));
	    	   test.log(LogStatus.INFO,test.addScreenCapture(capture(driver))+ "Step 2 : Input The Email");
	    	   
	    	   loginmobilepagemodel.ConfirmeEmail();
	    	   test.log(LogStatus.INFO,test.addScreenCapture(capture(driver))+ "Step 3 : Confirme the email");
	    	   
	    	   loginmobilepagemodel.TypePassword(loginmobilepageproperties.getProprety("password"));
	    	   test.log(LogStatus.INFO,test.addScreenCapture(capture(driver))+ "Step 4 : Input The Password");
	    	   
	    	   //Validate First Name 
	    	   if(personalaccountmobilemodel.ValidateFirstName(loginmobilepageproperties.getProprety("firstname")))
	    		   test.log(LogStatus.PASS,test.addScreenCapture(capture(driver))+ "Step 5 : Validation of First name");
	    	   else
	    		   test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Step 5 : Validation of First name");
	    	  //Validate Last Name  
	    	   if(personalaccountmobilemodel.ValidateLastName( loginmobilepageproperties.getProprety("lastname")))
	    	       test.log(LogStatus.PASS,test.addScreenCapture(capture(driver))+ "Step 5 : Validation of Last name");
	    	   else
	    		   test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Step 5 : Validation of Last name");
	    	  //Validate Email
	    	   if(personalaccountmobilemodel.ValidateEmail( loginmobilepageproperties.getProprety("username")))
	    	       test.log(LogStatus.PASS,test.addScreenCapture(capture(driver))+ "Step 5 : Validation of Email");
	    	   else
	    		   test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Step 5 : Validation of Email");
	     }
	 
	
	
	@AfterMethod
	public void Closeapplication()
	{
		this.driver.closeApp();
		report.endTest(test);
		report.flush();
	}
 
}
