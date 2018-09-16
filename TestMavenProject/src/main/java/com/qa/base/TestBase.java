package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.TestUtil;

public class TestBase{

	static WebDriver driver;
	static Properties prop;
	
	public TestBase() throws IOException{
		
		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("/TestMavenProject/src/main/java/com/qa/config/config.properties");
			prop.load(fis);	
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}	
		
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("WebDriver.chrome.driver", prop.getProperty("driverpath") +"/"+ "chromedriver");
			driver = new ChromeDriver();
			}
		else if	(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("WebDriver.gecko.driver", prop.getProperty("driverpath") +"/"+ "geckodriver");
			driver = new FirefoxDriver();
			}
		
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		    
		    driver.get(prop.getProperty("url"));
		    
		   
		}
		
	}
	
	
	
	
	
	
	
	


