package com.TestNG.DataDrivenFrameworkUp.copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {

	@DataProvider(name="appData")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"smita","test123"},{"Admin","admin123"},{"parag","test123"}};
		return data;
	}
	
	public  XSSFWorkbook wb;
	
	@DataProvider(name="excelData")
	public Object[][] fileData()
	{
		  //File path-File
		  
		  File f1=new File(System.getProperty("user.dir")+"//TestData2//Data.xlsx");
		  
		  //Read data in stream- FileInputStream
		  FileInputStream fs;
		  Object data[][]=null;
		  
		try {
			fs = new FileInputStream(f1);
			
			//Object of XSSFWorkbook class
			  wb=new XSSFWorkbook(fs);
			  
			  //wb-->sheet--->row--->cell-->data
			  //Number of rows
			  
			  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
			  System.out.println("Number of rows are: "+rows);//6
			  
			  //Number of cells
			  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
			  System.out.println("Number of cells are: "+cells);//2
			  
			  //create an array of same size like file
			  data=new Object[rows-1][cells];//read 5 rows
			  
			  //then iterate array and read data from file and store it into array
			  for(int r=1;r<rows;r++)//row
			  {
				  for(int c=0;c<cells;c++)
				  {
					  //array always start with indexing 0
					 data[r-1][c]= wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
					 
				  }
				 
			  }
			  
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		return data;  
		
	}
}
