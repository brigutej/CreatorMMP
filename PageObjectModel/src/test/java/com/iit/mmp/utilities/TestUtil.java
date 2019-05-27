package com.iit.mmp.utilities;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import com.iit.mmp.testbase.BaseClass;

public class TestUtil extends BaseClass {
	
	
	@DataProvider(name="dp")
    public static Object[][] getData(){
		
		String sheetName = "US_MMP_015_SearchSymptomsDP";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		Object[][] data = new Object[rows-1][cols];
		
    	for (int rowNum =2;  rowNum <=rows; rowNum++) {
    		
    		for (int colNum=0; colNum < cols; colNum++) {
    			//data[0][0]
    			data[rowNum-2][colNum]= excel.getCellData(sheetName,colNum,rowNum);
    		}
    	}
    	return data;	
    }
	

}
