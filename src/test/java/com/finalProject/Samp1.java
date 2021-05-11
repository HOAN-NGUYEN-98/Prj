package com.finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Samp1 extends Base {
	WebDriver driver;
	String m = "abc123";
	public By openPage, signIn, textBoxAccount, createAccountButton, text;

	public Samp1(WebDriver driver) {
		this.driver = driver;
	}

	public String message;

	public void useField() {

		signIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

		textBoxAccount = By.xpath("//*[@id=\"email_create\"]");

		createAccountButton = By.xpath("//*[@id=\"SubmitCreate\"]/span");

		text = By.xpath("//*[@id=\"create_account_error\"]");
	}

	
	public void createAccount() {
		useField();
		implicitWait(driver, 10);
		click(driver, signIn);
		sendKey(driver, textBoxAccount, m);
		click(driver, createAccountButton);
		message = getText(driver, text);
		System.out.println(message);
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
