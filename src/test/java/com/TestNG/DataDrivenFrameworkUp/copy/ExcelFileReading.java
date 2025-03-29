package com.TestNG.DataDrivenFrameworkUp.copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelFileReading {
  @Test
  public void fileReading() throws IOException
  {
	  //file path
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  	  
	  //read in stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //excel file
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //wb-->sheet-->row-->cell--->value
	  
	 String name=wb.getSheet("BookData").getRow(4).getCell(1).getStringCellValue();
	  System.out.println("Author name is: "+name);
	  
	 double price= wb.getSheet("BookData").getRow(2).getCell(2).getNumericCellValue();
	 int p=(int)price;
	 System.out.println("Book Price is: "+p);
	  /*
	  XSSFSheet sheet1=wb.getSheet("BookData");
	  //read 3rd row and 2nd column- indexing starts with 0
	  XSSFRow row3=sheet1.getRow(2);
	  
	  XSSFCell cell2=row3.getCell(1);
	  
	  String value=cell2.getStringCellValue();
	  System.out.println("Author name is: "+value);
	  */
	  
  }
}
