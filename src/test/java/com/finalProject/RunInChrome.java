package com.finalProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RunInChrome {
	WebDriver driver;

//	@Test
//	public void bai1() {
//		Samp1 sam1 = new Samp1(driver);
//		sam1.createAccount();
//	}

	@Test
	public void bai7() {
		Samp7 sam7 = new Samp7(driver);
		sam7.search();
	}

	@Test
	public void bai3() {
		Samp3 sam3 = new Samp3(driver);
		sam3.newLetter();
	}

	@Test
	private void bai4() {
		Samp4 sam4 = new Samp4(driver);
		sam4.useField();
	}

	@Test
	public void bai5() {
		Samp5 sam5 = new Samp5(driver);
		sam5.Search();
	}

	@Test
	public void bai6() {
		Samp6 sam6 = new Samp6(driver);
		sam6.search();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Setup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
