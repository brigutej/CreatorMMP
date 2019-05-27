package com.iit.mmp.testcases;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.iit.mmp.testbase.BaseClass;




public class US_MMP_001_LoginDataProvider extends BaseClass {
	
    	
    	@Test(dataProvider = "dp")
    	public  void TC_MMP_001_loginDPXlsxValid(String url,String username,String password) {
    	setUpBrowser();
    	login(url,username,password);
        String actual_title = driver.getTitle();
        System.out.println(actual_title);
        String expected_title = "home";
        Assert.assertEquals(actual_title, expected_title);
        closeBrowser();
               	
        }
    	
    	
    	@DataProvider(name="dp")
    	public Object[][] getData(){
    		
    		return new Object[][] {
    			{"http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000","ria1", "Ria12345"}
    			
    			
    		};
    	}
    		
    	
    	
    		
		}
		
		
	
		
