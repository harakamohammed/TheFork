package com.thefork.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

	
	// List of objects
			@FindBy(xpath="//button[@data-test=\"account-sidebar-button\"]")
			public WebElement AccountBtn;
			@FindBy(xpath="//button[@data-test=\"menu-icon\"]")
			public WebElement MenuBtn;
			@FindBy(xpath="//a[text()=\"Manage my account\"]")
			public WebElement ManageAccountBtn;
			 
			
	public HomePage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(dr, this);
	}
	
	
	//List Of Functions 
	
	public void AccessToPersonalAccount()
	{
		this.clickElement(AccountBtn);
		
		this.clickElement(ManageAccountBtn);
	
	}
	

}
