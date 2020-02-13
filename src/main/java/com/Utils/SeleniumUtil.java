package com.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SeleniumUtil {

	public static String GetpropertyData(String key) throws IOException {
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\nitin.singh.kushwah\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\main\\java\\Resources\\data.properties");

		prop.load(fis);

		return prop.getProperty(key);
	}

}
