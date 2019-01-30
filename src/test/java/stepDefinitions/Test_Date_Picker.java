package stepDefinitions;

import java.util.Date;

import org.openqa.selenium.support.PageFactory;

import com.GenericMethods.GenericMethods;

import MakeMyTripDatePicker.DatePickerScenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Date_Picker extends GenericMethods{
	
	
	
	
	@Given("^I open \"([^\"]*)\" page \"([^\"]*)\"$")
	 public static void LaunchApp(String URL,String browser)
	 {
		
		launchBrowser(URL,browser);
		
	 }
	
	
	  @When("recieve date from user \"([^\"]*)\"$")
	  public static void Recievedate(Date date) throws Exception{
		  
		  DatePickerScenario obj= PageFactory.initElements(driver, DatePickerScenario.class);
		  obj.PickNextMonth(date);
		  
	  }
	 
	  @Then("pick the date from the app and verify")
	  public static void pick_date_Verify(){
		  
		  
		  
		  
	  }
	

}
