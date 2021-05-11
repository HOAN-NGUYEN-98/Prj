package com.finalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Samp6 extends Base {
	WebDriver driver;
	String search = "Dress";
	int dem = 0;
	public By btnsearch, txtsearch, item;

	public Samp6(WebDriver driver) {
		this.driver = driver;
	}
	public void search() {
		useField();
		implicitWait(driver, 10);
		click(driver, btnsearch);
		sendKey(driver, txtsearch, search);

		List<WebElement> we = driver.findElements(item);

		for (WebElement webElement : we) {
			String s = webElement.getText();
			dem++;
			System.out.println("***** Suggested: " + s);
		}

		System.out.println("***** Quantity suggest: " + dem);

		String r = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]")).getText();
		if (r.contains("$")) {
			System.out.println("Thong tin gia ca san pham da duoc tim thay !!!");
		} else {
			System.out.println("San pham khong kem gia !!!");
		}
	}

	private void useField() {
		btnsearch = By.xpath("//*[@id=\"search_query_top\"]");
		txtsearch = By.xpath("//*[@id=\"search_query_top\"]");
		item = By.xpath("//*[@id=\"index\"]/div[2]/ul/li");
	}

	

}
