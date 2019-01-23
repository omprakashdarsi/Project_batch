package stepDefinitions;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.GenericMethods.GenericMethods;
import com.applicationpages.Homepage;
import com.applicationpages.ShoppingFields;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc_05_Shopping extends GenericMethods{
	
		
	@Then("click on sign in link and login with \"([^\"]*)\" and \"([^\"]*)\"")
	public static void clickSignin_and_Verify_Welcome(String userid,String password)
	{
	 Homepage homepage=PageFactory.initElements(driver, Homepage.class);
	 homepage.clickSign_In();
	 
	 
	 login(userid,password);
		
	 
	 
	}
	@And("verify welcome message and goto home page")
	
	public static void verify_Welcome_Msg(DataTable data){
		
		
		
		List<List<String>> table=data.raw();
		
		String message=table.get(0).get(0);
		
		Verify_Successful_Login_and_Register(message);
		
		
		//gotohome page
		
		Goto_HomePage();
	}
	
	@When("user is on hoe page click on women menu link") 
	public static void verify_Women_Link_opened()
	{
		ShoppingFields shoppingpage=PageFactory.initElements(driver, ShoppingFields.class);
		shoppingpage.Verify_BreadCrumbs_of_womenPage();
		
	}
	@Then("Hover on Dresses menu and click on casual dresses submenu")
	public static void verifysubmenuitems()
	{	
		ShoppingFields shoppingpage=PageFactory.initElements(driver, ShoppingFields.class);
		shoppingpage.mouseHover_onMainMenu();
		
	}
		
	
	
	
	
	
	
	
	
	

}
