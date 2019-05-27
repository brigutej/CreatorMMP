package com.iit.mmp.testcases;






import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.iit.mmp.testbase.BaseClass;
import com.iit.mmp.utilities.ExcelReader;



public class US_MMP_001_LoginDPXsls extends BaseClass {
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\excel\\Login.xlsx");
    	
	
    	
    	@Test(dataProvider = "dp")
    	public void TC_MMP_001_loginDPXlsxValid(String url,String username,String password)
    	{
        setUpBrowser();
        login(url,username,password);
        String actual_title = driver.getTitle();
        System.out.println(actual_title);
        String expected_title = "home";
        Assert.assertEquals(actual_title, expected_title);
        System.out.println("Test Passed");
        closeBrowser();
               	
        }
    	
    	public void TC_MMP_002_loginDPXlsxInvalid(String url,String username,String password)
    	{
        setUpBrowser();
        login(url,username,password);
       
        closeBrowser();
               	
        }
    	
    	
    	@DataProvider(name="dp")
    	public Object[][] getData(){
    		
    		String sheetName = "login";
    		int rows = excel.getRowCount(sheetName);
    		int cols = excel.getColumnCount(sheetName);
    		
    		System.out.println("No of rows" + rows);
    		System.out.println("No of cols" + cols);
    		
    		Object[][] data = new Object[rows-1][cols];
    		
    		for(int rowNum=2; rowNum<= rows; rowNum++) {
    			for(int colNum=0; colNum < cols; colNum++) {
    				//data[0][0]
    				data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
    			}
    		}
    		return data;
    	}
		
		
		
		}
		
