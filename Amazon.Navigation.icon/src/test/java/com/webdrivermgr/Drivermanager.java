package com.webdrivermgr;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.Utlities.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivermanager {
	
	public static final Logger LOGGER=LogManager.getLogger(Drivermanager.class);
	
	private static WebDriver driver;
	
	public static void lauchbrowser() {
		try {
			switch (Constants.BROWSER_NAME) {
			case "chrome":
				LOGGER.info("Launching" +Constants.BROWSER_NAME);
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "firefox":
				LOGGER.info("Launching" +Constants.BROWSER_NAME);
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
			default:
				LOGGER.info("Launching" +Constants.BROWSER_NAME);
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
