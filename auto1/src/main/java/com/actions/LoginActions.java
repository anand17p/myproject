package com.actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActions {
	public void googlelogin() throws Throwable {
		try {
			String baseurl = "https://accounts.google.com/signin";
			String driverpath = "E:\\Downloads\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverpath);
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(baseurl);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
