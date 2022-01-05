package com.pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGxml {
	
	@Parameters({"browser"})
	@Test
	public void launchbrowser(String browser1) {
if(browser1.equals("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver1 = new FirefoxDriver();
	driver1.get("https://www.amazon.in/");
}
else if (browser1.equals("chrome")){
	WebDriverManager.chromedriver().setup();
	WebDriver driver2 = new ChromeDriver();
	driver2.get("https://www.amazon.in/");

}

else if(browser1.equals("edge")) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver3 = new EdgeDriver();
	driver3.get("https://www.amazon.in/");
}







	}
	
	
	
	

}
