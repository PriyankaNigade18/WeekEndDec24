package com.TestNG.DataDrivenFrameworkUp.copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelFileREadingForDataDrivenTest {
  @Test
  public void excelData() throws IOException
  {
	  
	  //File path-File
	  
	  File f1=new File(System.getProperty("user.dir")+"//TestData2//Data.xlsx");
	  
	  //Read data in stream- FileInputStream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Object of XSSFWorkbook class
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //wb-->sheet--->row--->cell-->data
	  //Number of rows
	  
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	  System.out.println("Number of rows are: "+rows);//6
	  
	  //Number of cells
	  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Number of cells are: "+cells);//2
	  
	  //create an array of same size like file
	  Object data[][]=new Object[rows-1][cells];//read 5 rows
	  
	  //then iterate array and read data from file and store it into array
	  for(int r=1;r<rows;r++)//row
	  {
		  for(int c=0;c<cells;c++)
		  {
			  //array always start with indexing 0
			 data[r-1][c]= wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
			 System.out.print(data[r-1][c]+"   ");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
