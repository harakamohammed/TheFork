package com.thefork.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage{

	// List of objects
		@FindBy(xpath="//input[@name=\"username\"]")
		public WebElement UsernameInput;
		@FindBy(xpath="//input[@name=\"password\"]")
		public WebElement PasswordInput;
		@FindBy(xpath="//button[text()=\"Connect\"]")
		public WebElement ConnectBtn;
		@FindBy(xpath="//*[@id=\"_evidon-accept-button\"]")
		public WebElement CookiesBtnXpath;
		
		public LoginPage(WebDriver dr) {
			super(dr);
			// TODO Auto-generated constructor stub
			 PageFactory.initElements(dr, this);
		}

		
	//List of Funtions
	 
	public void TypeUsername(String username)
	{
		this.InputText(UsernameInput, username);
		
	}
	
	public void TypePassword(String password)
	{
		this.InputText(PasswordInput, password);
		
	}
	
	public void ClickOnConnect()
	{
		this.clickElement(ConnectBtn);
		
	}
	
	public void AcceptCookies()
	{  
		this.clickElement(CookiesBtnXpath) ;
	}
	
	
	public void ValidateInformation(String user,String pass)
	{
		driver.navigate().refresh();
		assertEquals(user,UsernameInput.getText());
		assertEquals(pass,PasswordInput.getText());
	 
	}
	
}
