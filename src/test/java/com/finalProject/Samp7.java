package com.finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Samp7 extends Base{
	WebDriver driver;
	String searchr = "dresSSs";
	public By clickTxtSearch, txtsearch,btnButtonSearch,mes;
	public Samp7(WebDriver driver) {
		this.driver = driver;
	}
	public void search() {
		useField();
		implicitWait(driver, 10);
		click(driver, clickTxtSearch);
		sendKey(driver, txtsearch, searchr);
		click(driver, btnButtonSearch);
		String m=getText(driver, mes);
		System.out.println(m);
		
		
	}

	

	private void useField() {
		clickTxtSearch = By.xpath("//*[@id=\"search_query_top\"]");
		txtsearch = By.xpath("//*[@id=\"search_query_top\"]");
		btnButtonSearch=By.xpath("//*[@id=\"searchbox\"]/button");
		mes=By.xpath("//*[@id=\"center_column\"]/p");
		
	}

	

}
