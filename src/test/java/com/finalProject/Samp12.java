package com.finalProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

public class Samp12 extends Base {
	WebDriver driver;
	public By homePage, shareTwiter, email, pass, logIn;

	public Samp12(WebDriver driver) {
		this.driver = driver;
	}
	public void shareTwiter() {
		useField();
		implicitWait(driver, 10);
		click(driver, homePage);

		click(driver, shareTwiter);

		// Save window handle
		String parentWindowID = driver.getWindowHandle();
		System.out.println(parentWindowID);

		// get to popup twitter handle

		Set<String> handles = driver.getWindowHandles();
		String twitterPopupHandle = null;
		for (String h : handles) {
			if (!h.equals(parentWindowID)) {
				twitterPopupHandle = h;
				System.out.println(h);
			}
		}

		try {
			driver.switchTo().window(twitterPopupHandle);
			System.out.println("Share on Twiter:" + driver.getTitle());

			sendKey(driver, email, "0358979090");

			sendKey(driver, pass, "16041998");

			click(driver, logIn);

		} catch (NoSuchWindowException e) {
			System.out.println("Not avaiable to switch");
		}

		// close popup
		driver.close();

		System.out.println("Share thanh cong");

	}

	private void useField() {
		homePage = By.xpath("//*[@id=\"homefeatured\"]/li");
		shareTwiter = By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/p[7]/button[1]");
		email = By.xpath("//input[@name='session[username_or_email]']");
		pass = By.xpath("//input[@name='session[password]']");
		logIn = By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div/span/span/span");
	}

	

}
