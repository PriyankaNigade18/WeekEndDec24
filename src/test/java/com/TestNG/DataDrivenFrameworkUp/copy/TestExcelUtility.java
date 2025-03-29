package com.TestNG.DataDrivenFrameworkUp.copy;

import org.testng.annotations.Test;

import com.Generic.ExcelReadingUtil;

public class TestExcelUtility {
  @Test
  public void testStringData()
  {
	  String data=ExcelReadingUtil.getStringData("BookData",1,1);
	  System.out.println(data);
  }
  
  @Test
  public void testCellTypeData()
  {
	Object value=ExcelReadingUtil.getAsPerCellTypeData("BookData", 1, 2);
	  System.out.println(value);
  }
}
