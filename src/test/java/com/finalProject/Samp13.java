package com.finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Samp13 extends Base {
	WebDriver driver;
	String cmn = "Very good !!!";
	public By homePage, clickItem, addToCart, checkOut1, checkOut2, txtMail, txtPass, signIn, checkOut3, termOfService,
			checkOutShipping, checkOutPayment, paymentByCard, backToOrder, clickDetail, txtComment, sendComment,
			getComment;
	public Samp13(WebDriver driver) {
		this.driver = driver;
	}
	private void useField() {

		homePage = By.xpath("//*[@id=\"header_logo\"]/a/img"); // homePage

		clickItem = By.xpath("//*[@id=\"homefeatured\"]/li[1]"); // clickItem

		addToCart = By.xpath("//*[@id=\"add_to_cart\"]/button/span"); // addToCart

		checkOut1 = By.xpath("//span[contains(text(),'Proceed to checkout')]"); // checkOut1

		checkOut2 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"); // checkOut 2

		txtMail = By.xpath("//*[@id=\"email\"]"); // txtMail

		txtPass = By.xpath("//*[@id=\"passwd\"]"); // txtPass

		signIn = By.xpath("//*[@id=\"SubmitLogin\"]/span"); // signIn

		checkOut3 = By.xpath("//*[@id=\"center_column\"]/form/p/button/span"); // checkOut3

		termOfService = By.xpath("//*[@id=\"cgv\"]"); // termOfService

		checkOutShipping = By.xpath("//*[@id=\"form\"]/p/button/span"); // checkOutShipping

		checkOutPayment = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"); // checkOutPayment

		paymentByCard = By.xpath("//*[@id=\"cart_navigation\"]/button/span"); // paymentByCard

		backToOrder = By.xpath("//*[@id=\"center_column\"]/p/a"); // backToOrder

		clickDetail = By.xpath("//*[@id=\"order-list\"]/tbody/tr/td[7]/a[1]"); // clickDetail

		txtComment = By.xpath("//*[@id=\"sendOrderMessage\"]/p[3]/textarea"); // txtComment

		sendComment = By.xpath("//*[@id=\"sendOrderMessage\"]/div/button"); // sendComment

		getComment = By.xpath("//*[@id=\"block-order-detail\"]/div[5]/table/tbody/tr/td[2]"); // getComment
	}


	public void writeComment() {

		useField();
		implicitWait(driver, 10);
		click(driver, homePage);

		click(driver, clickItem);

		click(driver, addToCart);

		click(driver, checkOut1);

		click(driver, checkOut2);

		sendKey(driver, txtMail, "hoan98hanam@gmail.com");

		sendKey(driver, txtPass, "123456");

		click(driver, signIn);

		click(driver, checkOut3);

		click(driver, termOfService);

		click(driver, checkOutShipping);

		click(driver, checkOutPayment);

		click(driver, paymentByCard);

		click(driver, backToOrder);

		click(driver, clickDetail);

		sendKey(driver, txtComment, "Very good !!!");

		click(driver, sendComment);

		String s = getText(driver, getComment);

		System.out.println("My comment: "+s);
	}



}
