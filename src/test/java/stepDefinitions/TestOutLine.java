package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestOutLine {
	
	@Given("^a precondition has value value(\\d+)_(\\d+)$")
	public void a_precondition_has_value_value__(int arg1, int arg2) throws Throwable {
	    System.out.println(arg1+arg2);
	   
	}

	@And("^something with value(\\d+)_(\\d+)$")
	public void something_with_value__(int arg1, int arg2) throws Throwable {
		   System.out.println(arg1+arg2);
		   
	   
	}

	@Then("^check value(\\d+)_(\\d+) is the output$")
	public void check_value___is_the_output(int arg1, int arg2) throws Throwable {
	 
		   System.out.println(arg1+arg2);
		   
	}

}
