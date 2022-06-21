package com.thefork.appmobile.pages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thefork.pages.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import javafx.util.Duration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class LoginMobilePage extends BasePageMobile{

	//General objects:
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.lafourchette.lafourchette:id/next_button\"]")
	AndroidElement GetStartedBtn ;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.lafourchette.lafourchette:id/next_button\"]")
	AndroidElement NextBtn;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.lafourchette.lafourchette:id/consent_button\"]")
	AndroidElement AcceptAndContinueBtn;
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.lafourchette.lafourchette:id/icon_search_container\"]")
	AndroidElement MenuBtn ;
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id=\"com.lafourchette.lafourchette:id/ic_person\"]")
	 AndroidElement PersonnalAccountBtn ;
 
	//Login Page objects
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id=\"com.lafourchette.lafourchette:id/login_email\"]")
	AndroidElement UsernameInput;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id=\"com.lafourchette.lafourchette:id/login_password\"]")
	AndroidElement PasswordInput;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.lafourchette.lafourchette:id/button_continue\"]")
	AndroidElement ContinueBtn;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.lafourchette.lafourchette:id/button_connect\"]")
	AndroidElement ConnectBtn ;	 
    		   
	 
	//Personnal account Objects
	
	 public LoginMobilePage(AppiumDriver<AndroidElement>  dr) {
		super(dr);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	} 
	
	 
	  public void GoToLoginPage()
	  {
		  //Click On Get Started
		  this.clickElement(GetStartedBtn);
		  //Click on Next
		  this.clickElement(NextBtn);
		  // Click on Accept and continue
		  this.clickElement(AcceptAndContinueBtn);
		  
	  }
	  
	  public void TypeUsername(String username)
	  {
		  //Write the Username
		  this.InputText(UsernameInput, username);
		  
		  //Click on Continue
		  this.clickElement(ContinueBtn);
		  
	  }
	  
	  public void TypePassword(String password)
	  {
		  //Write the Password
		  this.InputText(PasswordInput, password);
		  
		  //Click on Connect
		  this.clickElement(ConnectBtn);
		  
	  }
	  
	  public void ConfirmeEmail()
	  {
		  //Go To PersonnalAccount
		  this.clickElement(MenuBtn);
		  
		  //Click On Personnal Account
		  this.clickElement(PersonnalAccountBtn);
		  
		  //Confirm the email
		  this.clickElement(ContinueBtn);
		  
		  
	  }
	  
	  public static void main(String args[]) throws MalformedURLException, InterruptedException {
	    DesiredCapabilities caps = new DesiredCapabilities();
 
	    
	    
	    String firstnamefrompage="Med first name";
	    
	    String firstname="xxx";
	    
	    
	   System.out.println(firstnamefrompage.contains(firstname));
	  /*  caps.setCapability("device", "Samsung Galaxy S8 Plus");
	    caps.setCapability("os_version", "7.0");
	    caps.setCapability("project", "My First Project");
	    caps.setCapability("build", "My First Build");
	    caps.setCapability("name", "Bstack-[Java] Sample Test");
	    caps.setCapability("app", "bs://bcb1b72e481cfbe6dd90b14051633d693535ee1e");
	   
	    AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
	  
	    
	  ok  AndroidElement GetStartedBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
	    ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id=\"com.lafourchette.lafourchette:id/next_button\"]")));
	    GetStartedBtn.click();
	    
	    
	ok    AndroidElement NextBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
	    	    ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id=\"com.lafourchette.lafourchette:id/next_button\"]")));
	    NextBtn.click();
	    	    
	ok    AndroidElement AcceoctAndContinueBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
	    	    ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id=\"com.lafourchette.lafourchette:id/consent_button\"]")));
	    AcceoctAndContinueBtn.click();	    
	    	
		
	    
	    
	    
	  ok  	AndroidElement UsernameInput = (AndroidElement) new WebDriverWait(driver, 30).until(
	        ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id=\"com.lafourchette.lafourchette:id/login_email\"]")));
	    	UsernameInput.sendKeys("haraka.mohammed@gmail.com");
	    	 
	    ok	 AndroidElement ContinueBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
	 	    	    ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id=\"com.lafourchette.lafourchette:id/button_continue\"]")));
	    	 ContinueBtn.click();	    
	 	    	
	 		
	    	
	   
	    		 
	    		 ok		 AndroidElement MenuBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
	    			 	 ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"com.lafourchette.lafourchette:id/icon_search_container\"]")));
	    		    	 MenuBtn.click();	
	    		  	    
	    		    	 
	    		ok    	 AndroidElement PersonnalAccountBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
	    		   		 	  ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@resource-id=\"com.lafourchette.lafourchette:id/ic_person\"]")));
	    		    	 PersonnalAccountBtn.click();
	    		    	 
	    		    	 ContinueBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
	    			 	    	    ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id=\"com.lafourchette.lafourchette:id/button_continue\"]")));
	    			    	 ContinueBtn.click();	    
	    			 	    	
	    	 
	  	    	
	      		ok	AndroidElement PasswordInput = (AndroidElement) new WebDriverWait(driver, 30).until(
		    	    ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id=\"com.lafourchette.lafourchette:id/login_password\"]")));
		    		PasswordInput.sendKeys("Kouka@2022");
		    		
		    	ok	AndroidElement ConnectBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
		    		ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id=\"com.lafourchette.lafourchette:id/button_connect\"]")));
		    		ConnectBtn.click();	 
		    		  
		    		
		    		
		    		AndroidElement FirstName = (AndroidElement) new WebDriverWait(driver, 30).until(
				    	    ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id=\"com.lafourchette.lafourchette:id/first_name_edit_text\"]")));
		    		 
		    		AndroidElement LastName = (AndroidElement) new WebDriverWait(driver, 30).until(
				    	    ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id=\"com.lafourchette.lafourchette:id/last_name_edit_text\"]")));
		    		 
		    		AndroidElement Email = (AndroidElement) new WebDriverWait(driver, 30).until(
				    	    ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id=\"com.lafourchette.lafourchette:id/email_text_view\"]")));
		    		 
		    		     
		    		
		    		System.out.println("Firstname:|"+FirstName.getAttribute("Text")+"|");
		    		System.out.println("Lastname:|"+LastName.getAttribute("Text")+"|");
		    		System.out.println("Email:|"+Email.getText()+"|");
	    	
	    // The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
	    driver.quit();
	    
	      */
	  }
	  
	  
}
