package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.EventLogger;
import org.openqa.selenium.WebDriver;

public class Base { //Note to be noted: In this "Base.java" class, we will initialize our browser(s) and also read our ".properties" file, 
	//which we created in the "input" folder inside "src/test/resources" main folder; The ".properties" file that we created,
	//(in the "input" folder inside "src/test/resources" main folder) we will store the url(s) of 
	//the browser(s) so that Base.java class can get the url(s) from ".properties" file and run/launch it for us.
	//So, this is going to be our "Base" class.

	public static WebDriver driver; //Import "WebDriver" from (Import 'WebDriver' (org.openqa.selenium))...
	public static Properties properties;//Import "Properties" from (Import 'Properties' (java.util))...
	public static Logger logger; //Import "Logger" from (Import 'Logger' (org.apache.log4j))...
	private String propertyPath = "C:\\Users\\hamed\\eclipse-workspace\\com.mavenProjectPractice\\src\\test\\resources\\input\\properties.properties";
	                             //This above^ is going to be the path to the "properties.properties" file, which we created in the input folder;
	                             //To get the path of ".properties" file, you need to right click on your mouse on the ".properties" file, then 
		                         //click on "properties", and then copy the link of location and paste it as a "String" after equal sign 
	                             //in front of the above^ "propertyPath". And then we will use it later whenever we need it.
	private String log4jPath = "C:\\Users\\hamed\\eclipse-workspace\\com.mavenProjectPractice\\src\\test\\resources\\input\\log4j.properties"; 
	                             //This above^ is going to be the path to the "log4j.properties" file, which we created in the input folder;
                                 //To get the path of "log4j.properties" file, you need to right click on your mouse on the "log4j.properties" file, then
	                             //click on "properties", and then copy the link of location and paste as a "String" after equal sign 
                                 //in front of the above^ "log4jPath". And then we will use it later whenever we need it.
	@SuppressWarnings("static-access")
	public Base () {//This is going to be the "Constructor" to initialize our variables, since our variables here are private and they in the class level
		            //Note: If we create Constructor it has to have the same name as class (In here the class name is Base); Now inside this Constructor 
		            //we can write our method to read the .properties file; So whatever value we stored in .properties file, we should be able to read it
		            //and use it in our class. And to do that we can use the following:
		
		try {
			//Here we are creating BufferedReader class object in order to be able to read the data from properties file:
			//Here below "BufferredReader" is the class object, "reader" is the reference, then equal to "BufferedReader", then we can pass the 
			//"(new FileReader" instance, and then we use the path for .properties file "(propertyPath));
			BufferedReader reader = new BufferedReader(new FileReader (propertyPath));//Here on "new FileReader" we import the "try catch" block.
			//Here the following we are creating the object of .properties class:
			properties = new Properties();
			//Here the following we are loading the .properties file by creating "properties.load":
			properties.load(reader);//Here we import the "load(InputStream inStream)" and inside the closed bracket we copy paste the above "reader" reference.
		} catch (FileNotFoundException e) {                                           
			e.printStackTrace();
		} catch (IOException e) {//Here we through another catch for "IOException"
			e.printStackTrace();//Here import the "printStackTrace();"
		}
	//Note: So, by creating the above "public Base (){" Constructor and "try catch" block we will be able to read the ".properties" file which is the
	//url "url = http://tek-school.com/retail/", basically we can get the url that is in the "properties.properties" file, and we get the "chrome" browser
	//that is in the "properties.properties" file.
		
		logger = logger.getLogger("logger_File");
		PropertyConfigurator.configure(log4jPath);
	}
	//Here this method will basically return the url for the website for us that we have in the ".properties" file: 
	public static String getUrl() {
		String url = properties.getProperty("url");
		return url;
	}
	//Here this method will basically return the browser for us that we have in the ".properties" file:
	public static String getBrowser() {
		String browser = properties.getProperty("browser");
		return browser;
	}
	//Here this method will lauch the browser for us:
	public static void openBrowser() {
		driver.get(getUrl());
	}
	
	
}


