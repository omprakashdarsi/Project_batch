package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.GenericMethods.GenericMethods;
import com.applicationpages.RegisterationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc_03_reg2  extends GenericMethods{
	
	@Given("user is already on RegisterationPage")
	
	public static void regpage(){
		
	}
	
	@When("enter all the mandatory fields into the registeration form")
	public static void Regester_With_Mandate_Fields(){
		
		
		RegisterationPage repage=PageFactory.initElements(driver,RegisterationPage.class );
 		repage.Register_With_Mandateory_Fields();
		
	}
	
	
	@Then("click on Register  button to complete registeration")
	public static void Submit_Registeration_Mandate_fields(){

		RegisterationPage repage=PageFactory.initElements(driver,RegisterationPage.class );
 		repage.Submit_Registeration();	
		
	}
	@And("Verify registeration is successfull or not")
	public static void Successful_Register_Verification(){
		
		//Verify_Successful_Login_and_Register();
	}
	@And("click on home button")
	public static void goto_Home()
	{
		Goto_HomePage();
	}
	@Then("sign out from application")
	
	public static void Log_out()
	{
		
		logout();
	}
	
	/*@And("close Browser")
	public static void closebrowser(){
		
		closeBrowser();
		
	}*/

}
