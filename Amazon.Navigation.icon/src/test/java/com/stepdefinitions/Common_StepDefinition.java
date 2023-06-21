package com.stepdefinitions;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver.Navigation;

import com.Utlities.CommonUtlis;
import com.webdrivermgr.Drivermanager;

import io.cucumber.core.gherkin.Feature;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Common_StepDefinition {
	public static final Logger LOGGER=LogManager.getLogger(Common_StepDefinition.class);
	
	@BeforeAll
	public static void beforeall()  {
		try {
			LOGGER.info("Intantaniating Broswer");
			CommonUtlis Utlities=new CommonUtlis();
			Utlities.loadproperties();
			if(Drivermanager.getDriver()==null) {
				Drivermanager.lauchbrowser();
			Utlities.initelements();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	@After
	public static void afterscenario() {
		LOGGER.info("=========End of Scenario=========");
	}

}
