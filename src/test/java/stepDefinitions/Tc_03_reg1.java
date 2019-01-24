package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.GenericMethods.GenericMethods;
import com.applicationpages.RegisterationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc_03_reg1 extends GenericMethods{
	
 	@Given("user is on RegisterationPage")
 	public static void on_current_page(){
 		
 			}
 	@When("click on Register submit button to complete registeration")
 	public static void submit_Reg_with_no_data(){
 		
 		RegisterationPage repage=PageFactory.initElements(driver,RegisterationPage.class );
 		repage.Submit_Registeration();	
 	}
	
	@Then("validate error header and list of mandatory fields errors")
	public static void check_List_of_Errors()
	{
		RegisterationPage repage=PageFactory.initElements(driver,RegisterationPage.class );
 		repage.Error_List_Of_MandateFields();	
		
	}
	/*//closing browser
	@And("closeBrowser")
	public static void close_Browser(){
		closeBrowser();
		
	}
*/
}
