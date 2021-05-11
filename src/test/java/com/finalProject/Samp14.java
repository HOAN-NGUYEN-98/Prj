package com.finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Samp14 extends Base {
	WebDriver driver;
	String cmn = "Very good !!!";
	public By clickSignOut, homPage, clickItem, sendFriend, nameFr, emailFr, sendEmail, closeAlert;

	public Samp14(WebDriver driver) {
		this.driver = driver;
	}
	public void writeCommentToFriend() {
		useField();
		implicitWait(driver, 10);
		click(driver, clickSignOut);
		click(driver, homPage);
		click(driver, clickItem);
		click(driver, sendFriend);

		sendKey(driver, nameFr, "Ngoc");
		sendKey(driver, emailFr, "ngocnv2.lqa@gmail.com");

		click(driver, sendEmail);
		click(driver, closeAlert);

	}

	private void useField() {

		clickSignOut = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a");// singout

		homPage = By.xpath("//*[@id=\"header_logo\"]/a/img");// homepage

		clickItem = By.xpath("//*[@id=\"homefeatured\"]/li");// click 1 sp

		sendFriend = By.xpath("//*[@id=\"send_friend_button\"]");

		nameFr = By.xpath("//*[@id=\"friend_name\"]");

		emailFr = By.xpath("//*[@id=\"friend_email\"]");

		sendEmail = By.xpath("//*[@id=\"sendEmail\"]");

		closeAlert = By.xpath("//*[@id=\"product\"]/div[2]/div/a");// close alert

	}

	

}
