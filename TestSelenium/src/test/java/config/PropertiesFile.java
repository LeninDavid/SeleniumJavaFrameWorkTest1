package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.TestNG_Demo;

public class PropertiesFile {

	static Properties prop = new Properties();
	static String P = System.getProperty("user.dir");
	public static void main(String[] args) throws IOException {
		getProperties();
		setProperties();
		getProperties();

	}

	public static void getProperties() throws IOException
	{
		
		
		InputStream input = new FileInputStream(P+"\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println("Browser used is "+ browser);
		TestNG_Demo.browserName = browser;
	}
	
	public static void setProperties() throws IOException
	{
		OutputStream output = new FileOutputStream(P+"\\src\\test\\java\\config\\config.properties");
		prop.setProperty("result", "pass");
		prop.store(output, null);
	}

}
