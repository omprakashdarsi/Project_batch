package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.AjaxScenario.Yahoo_Search_Ajax_Work;
import com.GenericMethods.GenericMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Test_search_Results extends GenericMethods{
	
	@Given("^I open \"([^\"]*)\" page in \"([^\"]*)\"$")
	//@Given("^open the \"([^\"]*)\ page in \"([^\"]*)\ browser")
	public static void launchpage(String url,String browser){
		
		launchBrowser(url,browser);
		
	}
	@Then("search for the desired word")
	public static void search_word()
	{
		Yahoo_Search_Ajax_Work obj=PageFactory.initElements(driver, Yahoo_Search_Ajax_Work.class);
		
		obj.SearchResult();

	}
	@And("list out all the maching search results and write it to excel")
	public static void verify_and_write_to_Excel()
	
	{
		
		Yahoo_Search_Ajax_Work obj=PageFactory.initElements(driver, Yahoo_Search_Ajax_Work.class);
		
		obj.writeExcelData();
		
		
	}
	
	@Then("close browser")
	public static void close_browser1(){
		
		closeBrowser();
	}

	
	
	
	
	

}
