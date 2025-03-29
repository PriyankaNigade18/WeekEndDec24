package com.TestNG.DataPassingUp.copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DataPassingUsingPropertiesfile
{
  @Test
  public void fileReading() throws IOException
  {
	  //path of file-File class
	  
	  File f1=new File(System.getProperty("user.dir")+"//ConfigData//config.properties");
	  
	  ///Read data in a stream- FileInputStream class
	  
	  FileInputStream fs=new FileInputStream(f1);
	    
	  //create instance of Properties class(java.util)
	  Properties p1=new Properties();
	  
	  
	  //load the file- load()
	  p1.load(fs);
	  
	  
	  //read the data using getProperty(Key)
	  System.out.println("Browser Name is: "+p1.getProperty("browserName"));
	  System.out.println("Browser version is: "+p1.getProperty("browserVersion"));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
