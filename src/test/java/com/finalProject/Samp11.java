package com.finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Samp11 extends Base {
	WebDriver driver;

	public By clickHome, clickImage, clickZoomImage, clearQuantity, addQuantityValue, addToCart, closeAlert, checkOut;

	public Samp11(WebDriver driver) {
		this.driver = driver;
	}
	public void detailItem() {
		useField();
		implicitWait(driver, 10);
		click(driver, clickHome);

		click(driver, clickImage);

		click(driver, clickZoomImage);

		clear(driver, clearQuantity);

		sendKey(driver, addQuantityValue, "0");

		click(driver, addToCart);

		click(driver, closeAlert);

		clear(driver, clearQuantity);

		sendKey(driver, addQuantityValue, "1");

		click(driver, addToCart);

		click(driver, checkOut);

	}

	private void useField() {

		clickHome = By.xpath("//*[@id=\"homefeatured\"]/li");

		clickImage = By.xpath("//*[@id=\"bigpic\"]");

		clickZoomImage = By.xpath("//*[@id=\"product\"]/div[2]/div/a");

		clearQuantity = By.xpath("//*[@id=\"quantity_wanted\"]");

		addQuantityValue = By.xpath("//*[@id=\"quantity_wanted\"]");

		addToCart = By.xpath("//*[@id=\"add_to_cart\"]/button/span");

		closeAlert = By.xpath("//*[@id=\"product\"]/div[2]/div/div/a");

		clearQuantity = By.xpath("//*[@id=\"quantity_wanted\"]");

		addQuantityValue = By.xpath("//*[@id=\"quantity_wanted\"]");

		addToCart = By.xpath("//*[@id=\"add_to_cart\"]/button/span");

		checkOut = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	}

	

}
