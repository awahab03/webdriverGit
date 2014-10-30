package com.gitConnectTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleTest {

@Test
public void testGoogle(){
//	WebDriver driver= new InternetExplorerDriver();
	System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
    WebDriver driver=new InternetExplorerDriver();
	//WebDriver driver= new FirefoxDriver();
	driver.get("www.google.com");
	driver.quit();
	
	
}
}
