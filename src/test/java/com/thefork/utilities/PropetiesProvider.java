package com.thefork.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropetiesProvider {

	private Properties prop;
	public PropetiesProvider(String filename){
		
		prop = new Properties();
		 try {
		        prop.load(new FileInputStream("src/test/resources/"+filename+".properties"));
		      
		  } 
		 catch (IOException ex) {
		     ex.printStackTrace();
		 }
	}
	
	public String getProprety(String key)
	{
		  return prop.getProperty(key);
	}
	
}
