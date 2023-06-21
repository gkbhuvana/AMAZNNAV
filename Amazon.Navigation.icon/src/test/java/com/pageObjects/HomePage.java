package com.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	@FindBy(how=How.XPATH,using="//*[@class='hm-icon nav-sprite']")
	public static WebElement Navicon;
	
	@FindBy(how=How.XPATH,using="//ul[@class='hmenu hmenu-visible']/li/div[@class='hmenu-item hmenu-title ']")
	public static WebElement Megamenu;
	
	@FindBy(how=How.XPATH,using="//ul[@class='hmenu hmenu-visible']/li/div[@class='hmenu-item hmenu-title ']")
	public static List<WebElement> Megamenus;
	
	@FindBy(how=How.XPATH,using="//div[text()='shop by category']")
	public static WebElement Shopbycategory;
	
	@FindBy(how=How.XPATH,using="//div[text()='Mobiles, Computers']")
	public static WebElement Mobile;
	
	@FindBy(how=How.XPATH,using="//div[@id='CardInstancerbGCmLpPnZXpbZTFgbgoEg']/descendant::ul")
	public static WebElement seeallmenu;
	
	@FindBy(how=How.XPATH,using="//div[text()='see all']")
	public static WebElement seeall;
	
	@FindBy(how=How.XPATH,using="//div[text()='see less']")
	public static WebElement seeless;
	
	@FindBy(how=How.XPATH,using="//a[text()='Sign in']")
	public static WebElement signinnav;
	
	@FindBy(how=How.XPATH,using="//ul[@class='hmenu hmenu-visible hmenu-translateX']")
	public static WebElement mobilemenu;
	
	@FindBy(how=How.XPATH,using="//*[@class='icp-nav-link-inner']")
	public static WebElement Languagemenu;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-flyout-icp\"]/div[2]/a[3]/span/i")
	public static WebElement Languageselection;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='nav-link-accountList']")
	public static WebElement signinbutton;
	
	@FindBy(how=How.XPATH,using="//a[@class='hmenu-item'][text()='Sign out']")
	public static WebElement signourbutton;
	
	@FindBy(how=How.XPATH,using="//*[@class='AppNavbar_brandLogo__SjY_b']//*[@href='/minitv']")
	public static WebElement amazonlogo;
	
	
	@FindBy(how=How.XPATH,using="//ul[@class='hmenu hmenu-visible hmenu-translateX'][1]/li/a[@class='hmenu-item hmenu-back-button']")
	public static WebElement Mainmenuback;
	
	@FindBy(how=How.XPATH,using="//*[text()='Amazon miniTV- FREE entertainment']")
	public static WebElement amazonminiTv;
	
	@FindBy(how=How.XPATH,using="//ul[@class='hmenu hmenu-visible']/li[2]")
	public static WebElement bestsellers;
	
	@FindBy(how=How.XPATH,using="//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	public static WebElement signinusername;
	
	@FindBy(how=How.XPATH,using="//input[@id='continue']")
	public static WebElement continuebtn;
	
	@FindBy(how=How.XPATH,using="//input[@id='ap_password']")
	public static WebElement signinpwd;
	
	@FindBy(how=How.XPATH,using="//input[@id='signInSubmit']")
	public static WebElement signsubmit;
	
	
	
	
	
	
	

}
