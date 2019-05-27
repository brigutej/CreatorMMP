package com.iit.mmp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	
	
	public boolean validateSymptom(String expected) {
		WebElement e= driver.findElement(By.xpath(".//*[@id='show']/table//tr/td[1]"));
		String actualstr= e.getText();
		System.out.println(actualstr);
		return expected.equals(actualstr);
		
	}
	
	public void searchSymptoms(String symptom) throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Search Symptoms')]")).click();
		driver.findElement(By.id("search")).click();
		driver.findElement(By.id("search")).sendKeys(symptom);
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		
	}
	
	public void logOutMenu() {		
		driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		String actual = driver.findElement(By.xpath(".//*[@id='main']//div/p")).getText();
		System.out.println(actual);
	
}
	public boolean clickonMenuItem(String menuName,String expected ) throws InterruptedException
    {
        driver.findElement(By.xpath("//span[contains(text(),'"+menuName+"')]")).click();
        String actual = driver.findElement(By.xpath("//h3[@class='panel-title']")).getText();
        Thread.sleep(3000);
        return expected.equals(actual);
    }
       
}