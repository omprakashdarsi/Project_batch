package stepDefinitions;

import com.GenericMethods.GenericMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class CommonAnnotation extends GenericMethods{
	
@Given("^launch the \"([^\"]*)\" browser and pass the url$")
	
	public static void invokeapplication(String browser)
	{
	
	System.out.println(browser);
	
		// logic to launch the browser
		System.out.println("Launching browser");
		
		launchBrowser(browser,"http://automationpractice.com/index.php");
		
			
		
	}
@And("Close Browser")
    public static void ClosingBrowser()
    {
		System.out.println("closing browser");
		closeBrowser();
    }

}
