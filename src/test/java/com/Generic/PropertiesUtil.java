package com.Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil 
{
	public Properties p1;
	
	//load the file-constructor
	public PropertiesUtil(String filename)
	{ 
		//create instance of Properties class(java.util)
		   p1=new Properties();
		
		 //path of file-File class
		  File f1=new File(System.getProperty("user.dir")+"//ConfigData2//"+filename+".properties");
		  
		  //Read data in a stream- FileInputStream class
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			//load the file- load()
			  p1.load(fs);
			  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//read the file-method
	public String getData(String key)
	{
		return p1.getProperty(key);
	}
	
}
