package com.thefork.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.thefork.utilities.PropetiesProvider;

public class BasePage {

	
	protected WebDriver driver=null; 
	public PropetiesProvider Globalproperties;
	
	
	public BasePage(WebDriver dr)
	{ 
	   driver=dr;
	  
	}
	
    public void OpenApplication(String URL)
	{
		 //Open app
		   driver.get(URL);
	 }
	
	public void clickElement(WebElement e)
	 {   
		     new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(e)).click(); 
	 }
	
	public void InputText(WebElement e,String text)
	{
		  if (text != null) {
				new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(e)).clear();
				e.sendKeys(text);
			}
     
	}
	public void VerifyElementIfExist(WebElement e)
	{
		 
		Assert.assertEquals(true,e.isDisplayed());
	 
	}
}
