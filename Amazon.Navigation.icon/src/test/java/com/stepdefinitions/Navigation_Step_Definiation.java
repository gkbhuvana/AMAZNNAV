package com.stepdefinitions;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Utlities.CommonUtlis;
import com.Utlities.Constants;
import com.github.dockerjava.api.model.Driver;
import com.pageObjects.HomePage;
import com.webdrivermgr.Drivermanager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

public class Navigation_Step_Definiation {

	public static final Logger LOGGER=LogManager.getLogger(Navigation_Step_Definiation.class);
	//CommonUtlis common=new
	
@Given("I am at the Amazon site")
public void i_am_at_the_amazon_site() {
	LOGGER.info("Launching Amazon Site");
	Drivermanager.getDriver().get(Constants.APP_URL);
	Drivermanager.getDriver().manage().window().maximize();
	
}

@When("I Check the left side, the Navigation icon is visible")
public void i_check_the_left_side_the_navigation_icon_is_visible() {
	LOGGER.info("Checking Navigation icon");
	Boolean Naviconvisibility=HomePage.Navicon.isDisplayed();
	if(Naviconvisibility) {
		LOGGER.info("Icon Visible");
		
	}
	else {
		LOGGER.info("Icon not visible");
		Assert.assertTrue(Naviconvisibility);
	}
}

@And("I Verify that the Navigation icon is clickable")
public void i_verify_that_the_navigation_icon_is_clickable() throws InterruptedException {
	HomePage.Navicon.click();
	Thread.sleep(3000);
	if(HomePage.Megamenu.isDisplayed()) {
		LOGGER.info("Nav icon is clicakble");
	}
	else {
		LOGGER.error("Nav icon is not clickable");
	}
	
}

@Then("I check the Main menus count")
public void i_check_the_main_menus_count() {
	LOGGER.info("Checking main menu size");
	int megamenuvalues=HomePage.Megamenus.size();
	if(megamenuvalues>=0) {
		LOGGER.info("More main menu displaying");
	}
	else {
		LOGGER.error("No menus are displayong");
	}
}

@When("Scroll to the shopcategory")
public static void scroll_to_the_shopcategory() throws InterruptedException {
	Thread.sleep(3000);
	LOGGER.info("Scrolling to the shopby category section");
	CommonUtlis.scrollthepage(HomePage.seeall);
	
}

@When("click on the see all option")
public void click_on_the_see_all_option() {
	LOGGER.info("Clicking the see all option");
	HomePage.seeall.click();
}

@Then("Check whether its showing more menus")
public void check_whether_its_showing_more_menus() throws InterruptedException {
	LOGGER.info("checking the menus of See all");
	Thread.sleep(3000);

	if(HomePage.seeallmenu.isDisplayed()) {
		LOGGER.info("See all menus are displaying");
	}else {
		LOGGER.error("See all menus are not displaying");
	}
}



@When("Click on the see less option")
public void click_on_the_see_less_option() {
	LOGGER.info("Clicking see less option");
	HomePage.seeless.click();
	
}

@Then("Check whether its closing the more menus")
public void check_whether_its_closing_the_more_menus() throws InterruptedException {
	Thread.sleep(3000);
	
	if(!HomePage.seeallmenu.isDisplayed()) {
		LOGGER.info("Its closing see more menu");
	}
	else {
		LOGGER.error("See less is not working");
	}
}

@When("click on the mobiles and computers")
public void click_on_the_mobiles_and_computers() {
	LOGGER.info("Clicking mobile from menu");
	HomePage.Mobile.click();
}

@Then("Check whether its showing sub menus")
public void check_whether_its_showing_sub_menus() {
	LOGGER.info("Checking submenu");
	if(HomePage.mobilemenu.isDisplayed()) {
		LOGGER.info("Sub menus are displaying");
	}
	else {
		LOGGER.error("Submenu is not displaying");
	}
}


@Then("Click on the sub menu back arrow")
public void click_on_the_sub_menu_back_arrow() throws InterruptedException {
	Thread.sleep(3000);
	HomePage.Mainmenuback.click();
	
}

@Then("Check whether its redirecting to Main menus or not")
public void check_whether_its_redirecting_to_main_menus_or_not() {
	if(HomePage.Mobile.isDisplayed()) {
		LOGGER.info("Submenu is redirected to main menu");
	}
	else {
		LOGGER.error("Mainmenu back is not working");
	}
}

@When("Click on the best seller")
public void click_on_the_best_seller() {
	LOGGER.info("Clicking Best sellers from the menu");
	HomePage.bestsellers.click();
	
}

@When("it should be redicting to product listing page")
public void it_should_be_redicting_to_product_listing_page() {
	if(Drivermanager.getDriver().getTitle().equalsIgnoreCase("Amazon.in Bestsellers: The most popular items on Amazon")) {
	LOGGER.info("Product listing page is displaying");
	}
	else {
		LOGGER.error("Product listing page is not getting displayed");
	}
}

@When("Change the language")
public void change_the_language() {
	LOGGER.info("Clicking language menu");
	CommonUtlis.waitmethod(HomePage.Languageselection);
	CommonUtlis.mousehover(HomePage.Languagemenu);
	LOGGER.info("Selecting Language");
	HomePage.Languageselection.click();
	
}

@When("Check whether the sign in menu is available or not")
public void check_whether_the_sign_in_menu_is_available_or_not() {
	CommonUtlis.scrollthepage(HomePage.signinnav);
	if(HomePage.signinnav.isDisplayed()) {
		LOGGER.info("Sign in button is available in the menu");
	}
	else {
		LOGGER.error("Sign in not available");
	}
}

@Then("Click on the sign in and check whether its redirecting to the sign in page")
public void click_on_the_sign_in_and_check_whether_its_redirecting_to_the_sign_in_page() {
	HomePage.signinnav.click();
	if(Drivermanager.getDriver().getTitle().equalsIgnoreCase("Amazon Sign In")) {
		LOGGER.info("Sign in page is getting redirected");
	}
	else {
		LOGGER.error("Sign in page not showing");
	}
}

@When("Click on the sign in button")
public void click_on_the_sign_in_button() {
	LOGGER.info("Clicking sign in button");
	HomePage.signinbutton.click();
}

@When("Enter user name and password and sign in")
public void enter_user_name_and_password_and_sign_in() {
	LOGGER.info("Entering username");
	HomePage.signinusername.sendKeys("9445910090");
	LOGGER.info("Entering password");
	HomePage.signinpwd.sendKeys("Testing@123");
	LOGGER.info("Clicking submit");
	HomePage.signsubmit.click();
}

@When("Check whether the sign out option displaying")
public void check_whether_the_sign_out_option_displaying() {
	LOGGER.info("Checking signout button");
	CommonUtlis.scrollthepage(HomePage.signourbutton);
	if(HomePage.signourbutton.isDisplayed()) {
		LOGGER.info("Sign out is displaying");
	}else {
		LOGGER.error("Sign out is not displaying");
	}
}

@When("Click on the sign out button")
public void click_on_the_sign_out_button() {
	LOGGER.info("Clicking sign out button");
	HomePage.signourbutton.click();
	
	
}

@Then("Check whether it is signing out or not")
public void check_whether_it_is_signing_out_or_not() {
	LOGGER.info("Checking signed out or not");
	if(HomePage.signinbutton.isDisplayed()) {
	LOGGER.info("Signed out successfully");
}
else {
	LOGGER.error("Signed out is not done");
}
}

@When("Check whether the {string} menu is available or not")
public void check_whether_the_menu_is_available_or_not(String string) {
	LOGGER.info("Check whether the amazon tv menu is available or not");
	HomePage.amazonminiTv.click();
}

@Then("Check whether its redirecting to the the entertainment page")
public void check_whether_its_redirecting_to_the_the_entertainment_page() {
	if(HomePage.amazonlogo.isDisplayed()) {
		LOGGER.info("Amazon TV Landing page is displaying");
	}
	else {
		LOGGER.error("Not displaying AMAZON TV page");
	}
}

/*
 * @When("Check whether its redirecting to the the entertainment page") public
 * void check_whether_its_redirecting_to_the_the_entertainment_page() { // Write
 * code here that turns the phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 */

@Then("Check whether the navigation icon is available or not")
public void check_whether_the_navigation_icon_is_available_or_not() {
	if(!HomePage.Navicon.isDisplayed()) {
		LOGGER.info("Not displaying Navigation option");
	}
	else {
		LOGGER.error("Displaying Nav icon");
	}
}







}
