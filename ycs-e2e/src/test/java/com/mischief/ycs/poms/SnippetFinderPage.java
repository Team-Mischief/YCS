package com.mischief.ycs.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SnippetFinderPage {
	
	WebDriver driver;
	
	public SnippetFinderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
