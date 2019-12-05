package com.mischief.ycs.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SnippetReviewPage {
	
	WebDriver driver;
	
	public SnippetReviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
