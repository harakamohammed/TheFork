package com.thefork.appmobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thefork.utilities.PropetiesProvider;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePageMobile {

	
	public static AppiumDriver<AndroidElement> driver;
	public static final long WAIT = 10;
    public PropetiesProvider GlobalMobileproperties;
	
	
	public BasePageMobile(AppiumDriver<AndroidElement>  dr)
	{ 
		 driver = dr;
	}
	
	public void clickElement(AndroidElement e)
	 {   
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(e)).click();
		     
	 }
	
	public void InputText(AndroidElement e,String text)
	{
		  if (text != null) {
				new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(e)).clear();
				e.sendKeys(text);
			}
	 }
}
