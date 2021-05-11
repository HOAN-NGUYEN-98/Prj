package com.finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Samp5 extends Base {
	WebDriver driver;
	String search = "Dress";
	public By btnSearch, textSearch;

	public Samp5(WebDriver driver) {
		this.driver = driver;
	}
	public void Search() {
		useField();
		implicitWait(driver, 10);
		click(driver, btnSearch);
		sendKey(driver, textSearch, search);
		clear(driver, textSearch);
		
	}

	

	private void useField() {

		btnSearch=	By.xpath("//*[@id=\"search_query_top\"]");
		textSearch=	By.xpath("//*[@id=\"search_query_top\"]");
		textSearch=	By.xpath("//*[@id=\"search_query_top\"]");
		
	}

	

}