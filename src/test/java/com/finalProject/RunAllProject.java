package com.finalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunAllProject {
	WebDriver driver;

	@Test
	public void bai1() {
		Samp1 sam1 = new Samp1(driver);
		sam1.createAccount();
	}

	
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
	
	
	@Test
	private void bai10() {
		Samp10 sam10 = new Samp10(driver);
		sam10.Buy();
	}

	@Test
	private void bai11() {
		Samp11 sam11 = new Samp11(driver);
		sam11.detailItem();
	}

//	@Test
//	private void bai12() {
//		Samp12 sam12 = new Samp12(driver);
//		sam12.shareTwiter();
//	}

	@Test
	private void bai13() {
		Samp13 sam13 = new Samp13(driver);
		sam13.writeComment();
	}

	@Test
	private void bai14() {
		Samp14 sam14 = new Samp14(driver);
		sam14.writeCommentToFriend();
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
