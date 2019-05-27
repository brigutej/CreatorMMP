package com.iit.mmp.testcases;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.iit.mmp.pages.HomePage;
import com.iit.mmp.testbase.BaseClass;



public class US_MMP_006_ValidateMenu2 extends BaseClass {
	
	//public HomePage homepage = new HomePage(driver);
	@Parameters({"url","username","password"})
	@Test
	public void TC_001_validateMenuHome(String url,String username, String password) throws InterruptedException {
		setUpBrowser();
        login(url,username,password);
        HomePage homepage = new HomePage(driver);
        boolean result = homepage.clickonMenuItem("HOME","Patient Portal");
        Assert.assertTrue(result);
        closeBrowser();
	}
	@Parameters({"url","username","password"})
	@Test
	public void TC_002_validateMenuProfile(String url,String username, String password) throws InterruptedException {
		setUpBrowser();
        login(url,username,password);
        HomePage homepage = new HomePage(driver);
        boolean result2 = homepage.clickonMenuItem("Profile","Personal Details");
        Assert.assertTrue(result2);
        closeBrowser();
		
	}
	@Parameters({"url","username","password"})
	@Test
	public void TC_003_validateMenuScheduleAppointment(String url,String username, String password) throws InterruptedException {
		setUpBrowser();
        login(url,username,password);
        HomePage homepage = new HomePage(driver);
		boolean result3 = homepage.clickonMenuItem("Schedule Appointment","Current Appointments");
        Assert.assertTrue(result3);
        closeBrowser();
	}
	@Parameters({"url","username","password"})
	@Test
	public void TC_004_validateMenuInformation(String url,String username, String password) throws InterruptedException {
		setUpBrowser();
        login(url,username,password);
        HomePage homepage = new HomePage(driver);
		boolean result4 = homepage.clickonMenuItem("Information","Information");
        Assert.assertTrue(result4);
        closeBrowser();
	}
	@Parameters({"url","username","password"})
	@Test
	public void TC_005_validateMenuFees(String url,String username, String password) throws InterruptedException {
		setUpBrowser();
        login(url,username,password);
        HomePage homepage = new HomePage(driver);
		boolean result5 = homepage.clickonMenuItem("Fees","Fees");
        Assert.assertTrue(result5);
        closeBrowser();
	}
	@Parameters({"url","username","password"})
	@Test
	public void TC_006_validateMenuSearchSymptoms(String url,String username, String password) throws InterruptedException {
		setUpBrowser();
        login(url,username,password);
        HomePage homepage = new HomePage(driver);
		boolean result6 = homepage.clickonMenuItem("Search Symptoms","Search Symptoms");
        Assert.assertTrue(result6);
        closeBrowser();
	}
	@Parameters({"url","username","password"})
	@Test
	public void TC_007_validateMenuMessages(String url,String username, String password) throws InterruptedException {
		setUpBrowser();
        login(url,username,password);
        HomePage homepage = new HomePage(driver);
		boolean result7 = homepage.clickonMenuItem("Messages","Messages");
        Assert.assertTrue(result7);
        closeBrowser();
	}
	
	@Parameters({"url","username","password"})
	@Test
	public void TC_008_validateMenuLogOut(String url,String username, String password) throws InterruptedException {
		setUpBrowser();
        login(url,username,password);
        HomePage homepage = new HomePage(driver);
        homepage.logOutMenu();
        closeBrowser();
	}
	
	
		
        
		
	
}
		
		
	  
