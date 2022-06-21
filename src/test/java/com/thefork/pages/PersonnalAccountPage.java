package com.thefork.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonnalAccountPage extends BasePage{

	
	// List of objects
		 @FindBy(xpath="//input[@name=\"firstName\"]")
		 public WebElement FirstnameInput;
		 @FindBy(xpath="//input[@name=\"lastName\"]")
		 public WebElement LastnameInput;
		 @FindBy(xpath="//input[@name=\"email\"]")
		 public WebElement EmailInput;
				
				
	public PersonnalAccountPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(dr, this);
	}

	
	public void ValidateInformations(String firstname,String lastname,String email)
	{
		assertEquals(firstname, FirstnameInput.getText());
		assertEquals(lastname, LastnameInput.getText());
		assertEquals(email, EmailInput.getText());
		
	}
	
}
