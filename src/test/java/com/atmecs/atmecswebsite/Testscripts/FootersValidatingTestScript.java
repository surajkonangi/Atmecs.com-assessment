package com.atmecs.atmecswebsite.Testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.constants.PageAction;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.utils.Readproperties;
import com.atmecs.atmecswebsite.validation.ValidatingFooter;

public class FootersValidatingTestScript extends TestBase {
    @Test
	public void menuvalidate() throws IOException, InterruptedException {
    	Readproperties read = new Readproperties();
    	PageAction page = new PageAction();
    	
    	
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.homebutton.txt"));
    	ValidatingFooter.verifyfooter();
    	page.clickElement(driver,"XPATH" , read.readPropertiesFile("homepage.aboutusbutton.txt"));
    	ValidatingFooter.verifyfooter();
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.servicesbutton.txt"));
    	ValidatingFooter.verifyfooter();
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.partnersbutton.txt"));
    	ValidatingFooter.verifyfooter();
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.mediabutton.txt"));
    	ValidatingFooter.verifyfooter();
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.insightes.txt"));
    	ValidatingFooter.verifyfooter();
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.careers.txt"));
    	ValidatingFooter.verifyfooter();
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.contactus.txt"));
    	ValidatingFooter.verifyfooter();
    	
    	driver.quit();
    	
    	
}
    
    
}