package com.qa.ftseAuto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyDetails {
	
	@FindBy(xpath = "/html/body/main/div/div/div[1]/div[2]/div/div[1]/h1")
	private WebElement name;
	
	public String getCompanyName() {
		return this.name.getText();
	}

}
