package com.session.test;

import org.openqa.selenium.By;

public class Locators {
	
	public static  By  loginLink = By.xpath("//a[text()='Login or register']");
	public static By continueBtn =  By.xpath("//button[@title ='Continue']");
	
	//////////////////////Sign up page locators//////////////////
	public static   By firstName = By.id("AccountFrm_firstname");
	public static   By lastName = By.id("AccountFrm_lastname");
	public static	By email = By.id("AccountFrm_email");
	public static	By telephone = By.id("AccountFrm_telephone");
	public static	By fax = By.id("AccountFrm_fax");
	public static	By company = By.id("AccountFrm_company");
	public static	By address1 = By.id("AccountFrm_address_1");
	public static	By city = By.id("AccountFrm_city");
	public static	By state = By.id("AccountFrm_zone_id");
	public static	By country = By.id("AccountFrm_country_id");
	public static	By loginName = By.id("AccountFrm_loginname");
	public static	By password = By.id("AccountFrm_password");
	public static	By confimPass = By.id("AccountFrm_confirm");

}
