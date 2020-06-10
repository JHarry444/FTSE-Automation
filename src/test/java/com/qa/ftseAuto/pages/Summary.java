package com.qa.ftseAuto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Summary {
	@FindBy(xpath = "//*[@id=\"cookie-policy-overlay\"]/div/a[2]")
	private WebElement cookieOverlay;

	@FindBy(css = "#view-constituents > ul > li:nth-child(2) > a")
	private WebElement risers;
	
	@FindBy(xpath = "/html/body/main/div/div/div[3]/div/div[4]/div[1]/ul/li[3]/a")
	private WebElement fallers;

	@FindBy(xpath = "/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[2]/a")
	private WebElement topRiser;
	
	@FindBy(xpath = "/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[2]/a")
	private WebElement topFaller;
	
	private void closeOverlay() {
		this.cookieOverlay.click();
	}

	public void viewRisers(WebDriver driver) {
		this.closeOverlay();
		this.risers.click();
	}
	
	public void viewFallers(WebDriver driver) {
		this.closeOverlay();
		this.fallers.click();
	}

	public void selectTop(WebDriver driver) {
		this.topRiser.click();
	}

}
