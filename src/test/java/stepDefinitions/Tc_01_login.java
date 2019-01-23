package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.GenericMethods.GenericMethods;
import com.applicationpages.Homepage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Tc_01_login extends GenericMethods {
	
//new data
	
	 @When("Browser is launched , click on signin")
	 public static void clickSignin()
		{
		 Homepage homepage=PageFactory.initElements(driver, Homepage.class);
		 homepage.clickSign_In();
		}
	
	
	 @Then("verify Authentication page is opened")
	 public static void checkHeader(){
		 Homepage homepage=PageFactory.initElements(driver, Homepage.class);
	     boolean auth=homepage.Check_Header("Authentication");
	    	 
	     if(auth== true){
	    	
	       System.out.println("authentication page displayed");
	    	 
	     }
	     
	     
	 }
	 @And("close the browser")
	
	 public static void close_Browser(){
		 
		     System.out.println("cloasing browser");
			 //Homepage homepage=PageFactory.initElements(driver, Homepage.class);
			// homepage.closeBrowser();
		     closeBrowser();
		 }
	
	

}
