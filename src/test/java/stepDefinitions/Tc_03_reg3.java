package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.GenericMethods.GenericMethods;
import com.applicationpages.CreateAccount;
import com.applicationpages.RegisterationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc_03_reg3 extends GenericMethods{

@Given("user is already on Registeration Page and fields are empty")
	
	public static void regpage(){
	
		System.out.println("welcome you are in optional verify");
		
	}
	
	@When("enter all the optional fields into the registeration form")
	public static void Regester_With_Optional_Fields(){
		
		CreateAccount cre=PageFactory.initElements(driver, CreateAccount.class);
		cre.create_account("latha.125673@gmail.com");
		RegisterationPage repage=PageFactory.initElements(driver,RegisterationPage.class );
 		repage.Register_With_Only_Optional_Fields();
		
	}
	
	
	@Then("click on Register  button to submit registeration")
	public static void Submit_Registeration_Mandate_fields(){

		RegisterationPage repage=PageFactory.initElements(driver,RegisterationPage.class );
 		repage.Submit_Registeration();	
		
	}
	@And("Verify registeration is Failed or not")
	public static void Failed_Register_Verification(){
		
		RegisterationPage repage=PageFactory.initElements(driver,RegisterationPage.class );
 		repage.Error_List_Of_MandateFields();
	}
	
	
	
	
	
	
	
	
}
