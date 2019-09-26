package com.atmecs.atmecswebsite.validation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.constants.LogReports;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.utils.Readproperties;

public class ValidatingBlogPage extends TestBase {

	static String actualbreadcrumbhome;
	static String actualbreadcrumbai;
	static String actualbreadcrumbmyth;
	static String actualblogtitle;
	static String actualdate;
	static String actualcontent;
	static String expectedbreadcrumbhome="Home";
	static String expectedbreadcrumberai="AI";
	static String expectedbreadcrumbermyth="Debunking Myths about AI";
	static String expectedblogtitle="Debunking Myths about AI";
	static String expecteddate="March 15, 2019";
	static String expectedcontent="Of all the cutting-edge technologies today, Artificial Intelligence is arguably the most important one, given its wide range of potential and prominence. However, AI too has been a victim of some myths and misconceptions which usually surround anything that is popular. Here’s an infographic to debunk the most common myths about AI.";
	
	@Test
	public static void validateblog()throws IOException, InterruptedException {
		
		Readproperties read = new Readproperties();
		LogReports log = new LogReports();
		
		
		actualbreadcrumbhome=driver.findElement(By.xpath(read.readPropertiesFileblogelements("blogpage.breadcrumbhome.txt"))).getText();
		Assert.assertEquals(actualbreadcrumbhome,expectedbreadcrumbhome);
		log.info("breadcrumb home validated...");
		actualbreadcrumbai=driver.findElement(By.xpath(read.readPropertiesFileblogelements("blogpage.breadcrumbai.txt"))).getText();
		Assert.assertEquals(actualbreadcrumbai,expectedbreadcrumberai);
		log.info("breadcrumb ai validated...");
		actualbreadcrumbmyth=driver.findElement(By.xpath(read.readPropertiesFileblogelements("blogpage.breadcrumbmyth.txt"))).getText();
		Assert.assertEquals(actualbreadcrumbmyth,expectedbreadcrumbermyth);
		log.info("breadcrumb myth validated...");
		actualblogtitle=driver.findElement(By.xpath(read.readPropertiesFileblogelements("blogpage.blogtitle.txt"))).getText();
		Assert.assertEquals(actualblogtitle,expectedblogtitle);
		log.info("blog title validated...");
		actualdate=driver.findElement(By.xpath(read.readPropertiesFileblogelements("blogpage.datevalidate.txt"))).getText();
		Assert.assertEquals(actualdate,expecteddate);
		log.info("date validated...");
		actualcontent=driver.findElement(By.xpath(read.readPropertiesFileblogelements("blogpage.content.txt"))).getText();
		Assert.assertEquals(actualcontent,expectedcontent);
		log.info("blog content validated..");
		
		
}
}