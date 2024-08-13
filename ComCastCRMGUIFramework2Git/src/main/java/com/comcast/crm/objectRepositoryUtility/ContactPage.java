package com.comcast.crm.objectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement createContactbtn;
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateContactbtn() {
		return createContactbtn;
	}
	
	@FindBy(name="Search")
	private WebElement ele1;
	
	@FindBy(name="Searchbtn2")
	private WebElement ele2;
	
	@FindBy(xpath = "sss")
	private WebElement ele3;
}
