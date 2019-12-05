package com.mischief.ycs.steps;

import org.openqa.selenium.WebDriver;

import com.mischief.ycs.runners.YCSRunnerRouting;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class RoutingSteps {
	
	public static WebDriver driver = YCSRunnerRouting.driver;
	public static String url = YCSRunnerRouting.url;
	
	
	@Given("^The user is on the Login Page$")
	public void the_user_is_on_the_Login_Page() throws Throwable {
	    driver.get(url +"/register");
	}
	
	@Given("^The user is on the Snippet Review Page$")
	public void the_user_is_on_the_Snippet_Review_Page() throws Throwable {
		driver.get(url +"/review");
	}

	@Given("^The user is on the Snippet Finder Page$")
	public void the_user_is_on_the_Snippet_Finder_Page() throws Throwable {
		  driver.get(url +"/finder");
	}


	@Given("^The user is on the Snippet Creator Page$")
	public void the_user_is_on_the_Snippet_Creator_Page() throws Throwable {
		 driver.get(url +"/creator");
	}
	

	@Then("^The url is finder$")
	public void the_url_is_finder() throws Throwable {
		driver.get(url +"/finder");
	}

	@Then("^The url is creator$")
	public void the_url_is_creator() throws Throwable {
	    Assert.assertEquals(url+"/creator", driver.getCurrentUrl());
	}

	@Then("^The url is review$")
	public void the_url_is_review() throws Throwable {
	    Assert.assertEquals(url+"/review", driver.getCurrentUrl());
	}
	
	@Then("^The url is register$")
	public void the_url_is_register() throws Throwable {
	    Assert.assertEquals(url+"/register", driver.getCurrentUrl());
	}



}
