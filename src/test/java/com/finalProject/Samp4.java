package com.finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Samp4 extends Base {
	WebDriver driver;
	String s = "hoan98hanam@gmail.com", order = "abcxyz", file = "C:\\Setup\\chromedriver.exe",
			mess = "dasdjkcajsdqwjd";
	public By buttonClick, mail, textOrder, fileup, message, submitmessage, outMessage;
	public Samp4(WebDriver driver) {
		this.driver = driver;
	}
	public void useField() {
		buttonClick = By.xpath("//*[@id=\"contact-link\"]/a");

		mail = By.xpath("//*[@id=\"email\"]");

		textOrder = By.xpath("//*[@id=\"id_order\"]");

		fileup = By.xpath("//*[@id=\"fileUpload\"]");

		message = By.xpath("//*[@id=\"message\"]");
		submitmessage = By.xpath("//*[@id=\"submitMessage\"]/span");
		outMessage = By.xpath("//*[@id=\"center_column\"]/p");

	}

	
	public void contactUs(){
		useField();
		implicitWait(driver, 10);
		click(driver, buttonClick);
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"id_contact\"]")));
		select.selectByVisibleText("Webmaster");
		sendKey(driver, mail, s);
		sendKey(driver, textOrder, order);
		sendKey(driver, fileup, file);
		sendKey(driver, message, mess);
		click(driver, submitmessage);
		String mes = getText(driver, outMessage);
		System.out.println(mes);
	}

	

}