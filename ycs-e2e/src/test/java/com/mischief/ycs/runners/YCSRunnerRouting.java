package com.mischief.ycs.runners;

import static org.junit.Assert.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Routing.feature", glue = "com.mischief.ycs.steps")
public class YCSRunnerRouting {
		
	public static WebDriver driver;
	public static String url = "http://localhost:3000/";
	
	@BeforeClass 
	public static void  setUp(){
		File file = new File("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		
	}
	
	@AfterClass 
	public static void tearDown() {
		driver.quit();
	}



}
