package com.iit.mmp.testcases;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.iit.mmp.pages.HomePage;
import com.iit.mmp.testbase.BaseClass;

import com.iit.mmp.utilities.TestUtil;


public class US_MMP_015_SearchSymptomsDP extends BaseClass {
	
	
	@Test(dataProviderClass= TestUtil.class,dataProvider="dp")
	public void TC_001_searchSymptoms(String url,String username,String password,String symptom) throws InterruptedException{
		
		setUpBrowser();
		login(url,username,password);
		HomePage home = new HomePage(driver);
		home.searchSymptoms(symptom);
		
		closeBrowser();

	}	
	
	
	
	
}

