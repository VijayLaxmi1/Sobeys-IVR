package com.ivr.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.ivr.util.*;



public class ConfigReader {
	 InputStream input;
	 
	 
	public String getURL(String services){
		
		Properties prop=new Properties();
		try{

			input=ConfigReader.class.getClassLoader().getResourceAsStream(Constant.CONFIG_FILE);
			prop.load(input);
			return prop.getProperty(services);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return prop.getProperty(services);
		


	}

}
