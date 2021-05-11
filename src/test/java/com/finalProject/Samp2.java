package com.finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Samp2 extends Base {
	String result = "MY ACCOUNT";
	WebDriver driver;
	Select select;
	String m = "huyencvbasddhoan1sfda64127@gmail.com";
	String firstname = "Hoan", lastname = "Nguyen", pass = "123456";
	String mobilenum = "0358979090", city = "Phủ Lý", address = "Ha nam";
	int zippostcost = 12345;

	public By signIn, textEmail, buttonCreate, buttonClick, buttonRegister, message, textFirstNmae, textLastName,
			textPass, textCompany, textAddress, textCity, textPostcode, textPhone, btnSubmitAccount, messageAlert;

	public Samp2(WebDriver driver) {
		this.driver = driver;
	}
	public void createAccount() {
		useField();
		implicitWait(driver, 10);
		click(driver, signIn);
		
		sendKey(driver, textEmail, m);

		click(driver, buttonCreate);

		sendKey(driver, textFirstNmae, firstname);

		sendKey(driver, textLastName, lastname);
		sendKey(driver, textPass, pass);
		select = new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
		select.selectByIndex(16);
		select = new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
		select.selectByIndex(04);

		select = new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
		select.selectByValue("1998");
		sendKey(driver, textCompany, "LQA");

		sendKey(driver, textAddress, address);
		sendKey(driver, textCity, city);
		select = new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
		select.selectByVisibleText("Utah");
		sendKey(driver, textPostcode, String.valueOf(zippostcost));
		sendKey(driver, textPhone, mobilenum);
		click(driver, btnSubmitAccount);
		String v = getText(driver, messageAlert);
		if (v.equals(result)) {
			System.out.println("Create successful !!!");
		}

	}

	public void useField() {

		signIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
		textEmail = By.xpath("//*[@id=\"email_create\"]");
		buttonCreate = By.xpath("//*[@id=\"SubmitCreate\"]/span");

		textFirstNmae = By.xpath("//*[@id=\"customer_firstname\"]");

		textLastName = By.xpath("//*[@id=\"customer_lastname\"]");

		textPass = By.xpath("//*[@id=\"passwd\"]");

		textCompany = By.xpath("//*[@id=\"company\"]");

		textAddress = By.xpath("//*[@id=\"address1\"]");

		textCity = By.xpath("//*[@id=\"city\"]");

		textPostcode = By.xpath("//*[@id=\"postcode\"]");

		textPhone = By.xpath("//*[@id=\"phone_mobile\"]");

		btnSubmitAccount = By.xpath("//*[@id=\"submitAccount\"]/span");

		messageAlert = By.xpath("//*[@id=\"center_column\"]/h1");

	}

	

}
