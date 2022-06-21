package com.thefork.appmobile.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PersonnalAccountMobilePage extends BasePageMobile{

	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id=\"com.lafourchette.lafourchette:id/first_name_edit_text\"]")
	AndroidElement FirstNameField;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id=\"com.lafourchette.lafourchette:id/last_name_edit_text\"]")
	AndroidElement LastNameField;
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.lafourchette.lafourchette:id/email_text_view\"]")
	AndroidElement EmailFiled;
	
	
	 
	
	public Boolean ValidateFirstName(String firstname)
	{
		//Get informations from page
		String FirstNameFromPage=FirstNameField.getText();
		return FirstNameFromPage.toUpperCase().contains(firstname.toUpperCase());
	 }
	
	public Boolean ValidateLastName(String lastname)
	{
		//Get informations from page
		String LastNameFieldFromPage=LastNameField.getText();
		return LastNameFieldFromPage.toUpperCase().contains(lastname.toUpperCase());
	 }
	
	public Boolean ValidateEmail(String email)
	{
		//Get informations from page
		String EmailFiledFromPage=EmailFiled.getText();
		return EmailFiledFromPage.toUpperCase().contains(email.toUpperCase());
	 }
	
	
	public PersonnalAccountMobilePage(AppiumDriver<AndroidElement> dr) {
		super(dr);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(dr), this);
	}

}
