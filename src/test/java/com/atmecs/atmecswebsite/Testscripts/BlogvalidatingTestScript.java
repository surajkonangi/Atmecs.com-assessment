package com.atmecs.atmecswebsite.Testscripts;

import java.io.IOException;
import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.constants.PageAction;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.utils.Readproperties;
import com.atmecs.atmecswebsite.validation.ValidatingBlogPage;

public class BlogvalidatingTestScript extends TestBase{
    @Test
	public void blogvalidate() throws IOException, InterruptedException {
    	Readproperties read = new Readproperties();
    	PageAction page = new PageAction();
    	
    	
    	page.clickElement(driver, "XPATH", read.readPropertiesFilehomemenu("homepage.insights.txt"));
    	page.clickElement(driver, "XPATH", read.readPropertiesFilehomemenu("homepage.blog.txt"));
    	page.clickElement(driver, "XPATH", read.readPropertiesFilehomemenu("blogpage.selectblog.txt"));
    	page.clickElement(driver, "XPATH", read.readPropertiesFilehomemenu("blogpage.postcomment.txt"));
    	
    	ValidatingBlogPage.validateblog();
    	
    
    
    	driver.quit();
}
    
}