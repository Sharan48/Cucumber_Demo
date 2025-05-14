package com.bdd.magicbricks.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
private Properties prop;
	
	public Properties init_prop() throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Asus\\eclipse-workspace2\\com.bdd.magicbricks\\src\\test\\resources\\config\\config.properties");
		
		prop=new Properties();
		
		prop.load(file);
		
		return prop;
	}

}
