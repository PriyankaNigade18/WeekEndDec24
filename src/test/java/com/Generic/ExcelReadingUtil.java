package com.Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingUtil
{
	public static XSSFWorkbook wb;

	public  static String getStringData(String sheetname,int row,int cell)
	{
		 //file path
		  File f1=new File(System.getProperty("user.dir")+"//TestData2//Data.xlsx");
		   //read in stream
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			//excel file
			  wb=new XSSFWorkbook(fs);
			  //wb-->sheet-->row-->cell--->value
							  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		  
		  
		
	}
	
	public static Object getAsPerCellTypeData(String sheetname,int row,int cell)
	{
		 //file path
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		   //read in stream
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			//excel file
			  wb=new XSSFWorkbook(fs);
			  //wb-->sheet-->row-->cell--->value
							  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		XSSFCell cellvalue=wb.getSheet(sheetname).getRow(row).getCell(cell);
		  Object data=null;
		  
		  CellType c=cellvalue.getCellType();

		  switch(c)
		  {
		  case STRING:
			 data=cellvalue.getStringCellValue();
			 break;
		  case NUMERIC: 
			  data=cellvalue.getNumericCellValue();
			  break;
		  case BOOLEAN:
			  data=cellvalue.getBooleanCellValue();
		  break;
			  
			  
			  
		  }
		  
		  return data;
	}
	
	
	
	
	
	
	
	
}
