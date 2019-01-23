package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.AjaxScenario.Yahoo_Search_Ajax_Work;
import com.GenericMethods.GenericMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Test_search_Results extends GenericMethods{
	
	
	@Given("open the URL page in browser browser")
	public static void launchpage(){
		
		launchBrowser("ff");
		
		
		
		
	}
	
	
	
	
	@Then("search for the desired word")
	public static void search_word()
	{
		Yahoo_Search_Ajax_Work obj=PageFactory.initElements(driver, Yahoo_Search_Ajax_Work.class);
		
		obj.SearchResult();
		
		
		
	}
	
	
	
	
	
	

}
