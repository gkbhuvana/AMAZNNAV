package com.Utlities;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageObjects.HomePage;
import com.webdrivermgr.Drivermanager;


public class CommonUtlis {
	
	public void loadproperties() throws IOException {
		Properties properties=new Properties();
		properties.load(getClass().getResourceAsStream("/ConfigAmazon.properties"));
		
		Constants.APP_URL=properties.getProperty("APP_URL");
		Constants.BROWSER_NAME=properties.getProperty("BROWSER_NAME");
		Constants.USER_NAME=properties.getProperty("USER_NAME");
		Constants.PASS_WORD=properties.getProperty("PASS_WORD");
		Constants.CHROME_DRIVER=properties.getProperty("CHROME_DRIVER");
		Constants.FIREFOX_DRIVER=properties.getProperty("FIREFOX_DRIVER");
	}
	
	public void initelements() {
		PageFactory.initElements(Drivermanager.getDriver(), HomePage.class);
		
	}
	
	public static void scrollthepage(WebElement scroll) {
		JavascriptExecutor js=(JavascriptExecutor)Drivermanager.getDriver();
		js.executeScript("arguments[0].scrollIntoView();", scroll);
	}
	
	public static void mousehover(WebElement moushover) {
		Actions actions=new Actions(Drivermanager.getDriver());
		actions.moveToElement(moushover).build().perform();
	}
	
	public static void waitmethod(WebElement wait) {
		WebDriverWait waits=new WebDriverWait(Drivermanager.getDriver(), Duration.ofSeconds(30));
		waits.until(ExpectedConditions.elementToBeClickable(wait));
	}
	

}
