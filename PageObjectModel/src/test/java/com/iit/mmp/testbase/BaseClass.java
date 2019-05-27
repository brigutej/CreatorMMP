package com.iit.mmp.testbase;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.iit.mmp.utilities.ExcelReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static WebDriver driver;
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\excel\\testdata.xlsx");
	
	
	public static void setUpBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
	}
	
	public static void login(String url, String username, String password) {
		driver.get(url);
		driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.name("submit")).click();


}
	
	public static void closeBrowser() {
		driver.close();
	}
			
}