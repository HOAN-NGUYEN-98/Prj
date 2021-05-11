package com.finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Samp3 extends Base {
	WebDriver driver;
	String s = "hoan98hanam@gmail.com";
	public By textLetter, btnClick, getText;

	public Samp3(WebDriver driver) {
		this.driver = driver;
	}
	public void newLetter() {
		useField();
		implicitWait(driver, 10);
		sendKey(driver, textLetter, s);
		click(driver, btnClick);
		String m = getText(driver, getText);
		System.out.println(m);
	}

	public void useField() {

		textLetter = By.xpath("//*[@id=\"newsletter-input\"]");
		btnClick = By.xpath("//*[@id=\"newsletter_block_left\"]/div/form/div/button");
		getText = By.xpath("//*[@id=\"columns\"]/p");

	}

	

}
