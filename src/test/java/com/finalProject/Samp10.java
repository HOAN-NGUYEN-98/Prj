package com.finalProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Samp10 extends Base {
	WebDriver driver;
	public By bestSeller, addToCart, checkOut1, checkOut2, mail, pass, subMitLogin, checkOut3, clickTerm, checkOut4,
			clickMethodPay, clickConfirmOrder, backToOrder;

	public Samp10(WebDriver driver) {
		this.driver = driver;
	}
	public void Buy() {
		useField();
		implicitWait(driver, 10);

		List<WebElement> ele = driver.findElements(bestSeller);
		for (WebElement e : ele) {
			String s = e.getText();
			if (s.contains("20%")) {
				e.click();

				click(driver, addToCart);
				click(driver, checkOut1);
				click(driver, checkOut2);

				sendKey(driver, mail, "hoan98hanam@gmail.com");
				sendKey(driver, pass, "123456");

				click(driver, subMitLogin);
				click(driver, checkOut3);
				click(driver, clickTerm);
				click(driver, checkOut4);
				click(driver, clickMethodPay);
				click(driver, clickConfirmOrder);
				click(driver, backToOrder);

				break;
			}
		}
	}

	private void useField() {
		bestSeller = By.xpath("//*[@id=\"blockbestsellers\"]/li");

		addToCart = By.xpath("//*[@id=\"add_to_cart\"]/button/span");

		checkOut1 = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");

		checkOut2 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");

		mail = By.xpath("//*[@id=\"email\"]");

		pass = By.xpath("//*[@id=\"passwd\"]");

		subMitLogin = By.xpath("//*[@id=\"SubmitLogin\"]/span");

		checkOut3 = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
		clickTerm = By.xpath("//*[@id=\"cgv\"]");
		checkOut4 = By.xpath("//*[@id=\"form\"]/p/button/span");
		clickMethodPay = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
		clickConfirmOrder = By.xpath("//*[@id=\"cart_navigation\"]/button/span");
		backToOrder = By.xpath("//*[@id=\"center_column\"]/p/a");

	}

	

}
