package com.Week5.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesfileReading {

	public static void main(String[] args) throws Exception 
	{
		//path of file to read
		File f1=new File(System.getProperty("user.dir")+"//config.properties");
		
		//read a file in a stream
		FileInputStream fs=new FileInputStream(f1);
		
		//properties class object
		Properties p1=new Properties();
			
		//load the file
		p1.load(fs);
		
		//getProperty(Key)---->read value
		System.out.println("Name is: "+p1.getProperty("un"));
		System.out.println("BrowserName: "+p1.getProperty("browserName"));
		
		
		
		
		

	}

}
