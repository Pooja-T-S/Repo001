package com.testyantra.demowebshop.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * It helps us to read the common data from properties file
 * 
 * @author Pooja TS
 *
 */
public class FileUtility {
	
	/**
	 * It gives us the value, of associated key, to be read in the form of String 
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readPropertyFileData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/demowebshop.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String keyValue = pobj.getProperty(key);
		return keyValue;
	}
	
	public String readPropertyFileDataDWS(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/demowebshop.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String keyValue = pobj.getProperty(key);
		return keyValue;
	}

}
