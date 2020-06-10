package com.qa.ftseAuto.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.qa.ftseAuto.consts.Constants;
import com.qa.ftseAuto.pages.CompanyDetails;
import com.qa.ftseAuto.pages.Summary;


public class TestFTSE {
	
	private WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty(Constants.PROPERTY, Constants.PATH);
		ChromeOptions opts = new ChromeOptions();
		opts.setHeadless(true);
		this.driver = new ChromeDriver(opts);
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void findTopRiser() {
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
		Summary summaryPage = PageFactory.initElements(driver, Summary.class);
		summaryPage.viewRisers(driver);
		summaryPage.selectTop(driver);
		CompanyDetails topRiserPage = PageFactory.initElements(driver, CompanyDetails.class);
		System.out.println(topRiserPage.getCompanyName());
	}
	
	@Test
	public void findTopFaller() {
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
		Summary summaryPage = PageFactory.initElements(driver, Summary.class);
		summaryPage.viewFallers(driver);
		summaryPage.selectTop(driver);
		CompanyDetails topRiserPage = PageFactory.initElements(driver, CompanyDetails.class);
		System.out.println(topRiserPage.getCompanyName());
	}
	
	
	@After
	public void tearDown() {
		this.driver.close();
	}

}
