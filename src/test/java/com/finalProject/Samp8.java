package com.finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Samp8 extends Base {
	WebDriver driver;
	public By clickItem, btnAdd, btnCheckOut, btnContinue, totalProduct, totalShipping, totalTax, totalPrice;

	public Samp8(WebDriver driver) {
		this.driver = driver;
	}
	public void BuyItem() {
		useField();
		implicitWait(driver, 10);
		click(driver, clickItem);

		click(driver, btnAdd);

		click(driver, btnCheckOut);

		click(driver, btnContinue);

		click(driver, btnAdd);

		click(driver, btnCheckOut);

		click(driver, btnContinue);

		click(driver, btnAdd);

		click(driver, btnCheckOut);

		

		double s1 = Double.valueOf(getText(driver, totalProduct).substring(1));
		double s2 = Double.valueOf(getText(driver, totalShipping).substring(1));

		double s4 = Double.valueOf(getText(driver, totalTax).substring(1));

		double s5 = Double.valueOf(getText(driver, totalPrice).substring(1));

		double s6 = s1 + s2 + s4;
		System.out.println(s6);
		if (s6 == s5) {
			System.out.println("Your order on My Store is complete.");
		} else {
			System.out.println("Error !!!");
		}
	}

	private void useField() {

		clickItem = By.xpath("//*[@id=\"homefeatured\"]/li[1]");

		btnAdd = By.xpath("//*[@id=\"add_to_cart\"]/button");
		btnCheckOut = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
		btnContinue = By.xpath("//*[@id=\"center_column\"]/p[2]/a[2]");

		btnAdd = By.xpath("//*[@id=\"add_to_cart\"]/button");
		btnCheckOut = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
		btnContinue = By.xpath("//*[@id=\"center_column\"]/p[2]/a[2]");

		btnAdd = By.xpath("//*[@id=\"add_to_cart\"]/button");
		btnCheckOut = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
		btnContinue = By.xpath("//*[@id=\"center_column\"]/p[2]/a[2]");

		totalShipping = By.xpath("//*[@id=\"total_shipping\"]");
		totalTax = By.xpath("//*[@id=\"total_tax\"]");
		totalProduct = By.xpath("//*[@id=\"total_product\"]");
		totalPrice = By.xpath("//*[@id=\"total_price_container\"]");

	}



}
