package com.atmecs.atmecswebsite.validation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.atmecs.atmecswebsite.constants.LogReports;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.utils.Readproperties;

public class ValidatingFooter extends TestBase {
	//static String actualsitefootertable;
	static String actualsitemapfooter;
	static String actualservicesfooter;
	static String actualcareersfooter;
	static String actualcontactusfooter;
//	static String expectedsitefootertable="Home\r\n" + 
//			"About Us\r\n" + 
//			"Services\r\n" + 
//			"Partners\r\n" + 
//			"Case Studies old\r\n" + 
//			"News\r\n" + 
//			"Careers\r\n" + 
//			"Contact Us\r\n" + 
//			"";
	static String expectedsitemapfooter ="Sitemap";
	static String expectedservicesfooter="Services";
	static String expectedcareersfooter="Careers";
	static String expectedcontactusfooter="Contact Us";

	public static void verifyfooter() throws IOException, InterruptedException {

		Readproperties read = new Readproperties();
		LogReports log = new LogReports();
		
		//actualsitefootertable=driver.findElement(By.xpath(read.readPropertiesFile("homepage.sitemapvalidate.txt"))).getText();
		//Assert.assertEquals(actualsitefootertable,expectedsitefootertable);
		//log.info("site table validated..");
		actualsitemapfooter = driver.findElement(By.xpath(read.readPropertiesFilefooter("homepage.sitemapfooter.txt"))).getText();
		Assert.assertEquals(actualsitemapfooter,expectedsitemapfooter);
		log.info("sitemap verified...");
		actualservicesfooter=driver.findElement(By.xpath(read.readPropertiesFilefooter("homepage.servicesfooter.txt"))).getText();
		Assert.assertEquals(actualservicesfooter,expectedservicesfooter);
		log.info("services footer validated...");
		actualcareersfooter=driver.findElement(By.xpath(read.readPropertiesFilefooter("homepage.careersfooter.txt"))).getText();
		Assert.assertEquals(actualcareersfooter,expectedcareersfooter);
		log.info("careers footer validated...");
		actualcontactusfooter=driver.findElement(By.xpath(read.readPropertiesFilefooter("homepage.contactusfooter.txt"))).getText();
		Assert.assertEquals(actualcontactusfooter,expectedcontactusfooter);
		log.info("contactus footer validated...");
		
		 
	}

}
