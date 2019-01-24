package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.GenericMethods.GenericMethods;
import com.applicationpages.AuthenticationPage;
import com.applicationpages.CreateAccount;
import com.applicationpages.Homepage;
import com.applicationpages.RegisterationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc_02 extends GenericMethods {
	
@Given("launch the browser and enter the url")
	
	public static void launchBrowser()
	{
		// logic to launch the browser
		System.out.println("Launching browser");
		
		launchBrowser("ff","http://automationpractice.com/index.php");
			
		
	}
	@When("Browser is launched then click on signin to go to the auth page")
	public static void clickSignin()
	{
	 Homepage homepage=PageFactory.initElements(driver, Homepage.class);
	 homepage.clickSign_In();
	}
	
	@Then("enter invalid email Id in email address field")
	public static void validate_Invalid_EmialId_Error()
	{
        
		CreateAccount createaccount=PageFactory.initElements(driver,CreateAccount.class);
		createaccount.Verify_Invalid_Email_Error("latha.sab.com");
		
	}
	
	@And("enter valid email is and check for for the background color changes")
	public static void Verifying_valid_email_accpetance(){
		CreateAccount createaccount=PageFactory.initElements(driver,CreateAccount.class);
		createaccount.Verify_With_Valid_Email("latha.sab@gamil.com");
		
		
		
	}
	/*@And("click on registeration button")
	public static void Submitting_registeration_Empty(){
		
		
		RegisterationPage repage=PageFactory.initElements(driver, RegisterationPage.class);
		repage.Submit_Registeration();
		
	}*/
	
	
	
	//@And("check weather the given email address is valid email format or not")
    //@And("check for the color of the text box")
	
	
	
	
	

}
