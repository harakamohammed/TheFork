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
	  
	  
	  
	  
}
