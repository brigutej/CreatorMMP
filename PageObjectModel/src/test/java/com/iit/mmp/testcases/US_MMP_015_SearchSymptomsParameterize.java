package com.iit.mmp.testcases;




import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.iit.mmp.pages.HomePage;
import com.iit.mmp.testbase.BaseClass;

public class US_MMP_015_SearchSymptomsParameterize extends BaseClass {
	
	
	@Parameters({"url","username","password", "symptom"})
	@Test
	public void TC_001_searchSymptoms(String url,String username,String password,String symptom) throws InterruptedException{
		
		setUpBrowser();
		login(url,username,password);
		HomePage home = new HomePage(driver);
		home.searchSymptoms(symptom);
		HomePage home1 = new HomePage(driver);
		boolean sym = home1.validateSymptom("fever");
		Assert.assertTrue(sym);
		closeBrowser();
		
	}	
	
	
		
	}
	
		