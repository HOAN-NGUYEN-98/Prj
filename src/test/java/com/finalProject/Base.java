package com.finalProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	WebDriver driver;
	public void click(WebDriver driver, By by) {
		driver.findElement(by).click();
	}
	public void sendKey(WebDriver driver, By by, String text) {
		driver.findElement(by).sendKeys(text);
	}
	public void clear(WebDriver driver, By by) {
		driver.findElement(by).clear();
	}
	
	public String getText(WebDriver driver, By by) {
		return driver.findElement(by).getText();
	}
	
	
	public void explicitWaitInvisible(WebDriver driver, By by, long timeout) { 
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	public void implicitWait(WebDriver driver, long timeout) { 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	



}
