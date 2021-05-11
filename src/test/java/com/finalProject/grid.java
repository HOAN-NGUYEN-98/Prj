package com.finalProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class grid {

	WebDriver driver;

	@Test
	public void testGrid() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://kenh14.vn");
		System.out.println(driver.getTitle());
	}

	@BeforeMethod
	public void beforeMethod() throws MalformedURLException {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL("http://10.10.31.30:4444/wd/hub"), capabilities);
		
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
