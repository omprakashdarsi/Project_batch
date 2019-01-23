package com.AjaxScenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Yahoo_Search_Ajax_Work {
	
	
	@FindBy(how = How.XPATH,using=("//input[@id='uh-search-box']"))
	public static WebElement search_Box ;
	
	
	
	@FindBy(how = How.XPATH,using=("//div[@id='yui_3_18_0_3_1548053174389_769']/div/div/ul/li"))
	public static WebElement search_Result;
	
	
	
	
	public static void SearchResult(){
		
		
		search_Box.sendKeys("welcome");
		search_Box.click();
		System.out.println(search_Result.getText());
		
		
	}
	
	
	

}
