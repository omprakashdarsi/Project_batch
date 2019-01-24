package com.applicationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.GenericMethods.GenericMethods;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateAccount extends GenericMethods{
	
	public static String Valid_dynamic_Email_time;
	
	//##################################WebElements##################################
	//email address field xpath 
	@FindBy(how = How.XPATH,using="//input[@name='email_create']")			
	public static WebElement Eamil_Field_Element;
	
	//create account button xpath
	@FindBy(how=How.XPATH,using="//button[@id='SubmitCreate']")
	public static WebElement Btn_CreateAccount;
	
	@FindBy(how=How.XPATH,using="//li[text()='Invalid email address.']")
    public static WebElement Invalid_email_address;
	
	//webelemnt xpath for the invalid email id textbox
	@FindBy(how=How.XPATH,using=("//input[@class='is_required validate account_input form-control'][1]"))
    public static WebElement BackGround_color_for_emailfield;
	
	//Xpath of the Create An account page heading
	@FindBy(how=How.XPATH,using="//h1[@class='page-heading']")
	public static WebElement Create_account_Page_Header;
    @FindBy(id="")
  
    public static WebElement Create_acount_Page_Header;
	//********************************* Methods Implementation *******************************
	
		//============================================================================
		/*
		 * Method Name:Verify_Invalid_Email_Error(Stirng EmailId)
		 * 
		 * Purpose:this method is to verify the error message on providing invalid email format 
		 *         to the Email field in createaccount page 
		 * 
		 * Input Parameter:Invalid EmailID :abcd.com
		 * 
		 * OutPut Parameter:
		 * 
		 * Dependency:
		 * 
		 * Designer:Latha
		 * 
		 * Design Date:1/3/2019
		 * 
		 * 
		 */
		//============================================================================
		
	  public static void Verify_Invalid_Email_Error(String emailId){
		  
		  //enter invalid email address 
		  
		  Eamil_Field_Element.click();
		  Eamil_Field_Element.sendKeys("abcd.ab.com");
		  
		  //click on create account button
		  Btn_CreateAccount.click();
		  
		  //waiting for 10 seconds after clicking button to let the page loaded and display message
		  new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(Invalid_email_address));
	      
		  
		  //verifying error message with expected and actual values 
	      
	       String actual_Error="Invalid email address.";
	       String expected_Error=Invalid_email_address.getText();
	       
	       //verifying weather the bg color of the email address textbox is changing or not 
	       //on giving the invalid email address
	       
	       String actual_color="#fff1f2";
	       String expected_color=BackGround_color_for_emailfield.getCssValue("background-color");
	       String expected_hex_color=Color.fromString(expected_color).asHex();
	       
	       
	       
	       if(expected_Error.equals(actual_Error) && expected_hex_color.equals(actual_color)  ){
	    	   
	    	   System.out.println("Proper error message is displayed and text box color changed");
	    	   
	    	   
	       }else
	       {
	    	   
	    	   System.out.println("Proper error message not displayed  and textbox color not changed");
	    	   
	       }
	       
	       Eamil_Field_Element.clear();
	  }
	  
	  
	  public static void create_account(String emailid){
		  
		  Eamil_Field_Element.sendKeys(emailid);
		  
		  Btn_CreateAccount.click();
		  
		  
		  
	  }
	  
	  
	//********************************* Methods Implementation *******************************
		
			//============================================================================
			/*
			 * Method Name:Verify_With_Valid_Email(Stirng EmailId)
			 * 
			 * Purpose:This method is to verify the color of the text box on providing valid email format 
			 *         to the Email field in create account page 
			 * 
			 * Input Parameter:Valid EmailID :abcd.lat@gamil.com
			 * 
			 * OutPut Parameter:
			 * 
			 * Dependency:
			 * 
			 * Designer:Latha
			 * 
			 * Design Date:1/3/2019
			 * 
			 * 
			 */
			//============================================================================
	
	
	
	public static String Verify_With_Valid_Email(String validEmailId){
		
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		
		Date date = new Date();
		
		String systemdateandtime= dateFormat.format(date);
		
		System.out.println("Current date and time: --- "+systemdateandtime);
		
		
		systemdateandtime=systemdateandtime.replace(':','.');
		//String[] splits=validEmailId.split(".");
		Valid_dynamic_Email_time=systemdateandtime.concat(validEmailId);
		System.out.println("emails: "+Valid_dynamic_Email_time);
		//Valid_dynamic_Email_time=Valid_dynamic_Email_time.concat(splits[1]);
		
		System.out.println("email id is:"+Valid_dynamic_Email_time);
		Eamil_Field_Element.click();
		Eamil_Field_Element.clear();
		Eamil_Field_Element.sendKeys(Valid_dynamic_Email_time);
		driver.findElement(By.xpath("//html")).click();
		
		
		//waiting for 10 seconds after clicking button to let the page loaded and display message
		 new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(Eamil_Field_Element));
		
		
		String actual_color="#ddf9e1";
		String Expect_color=BackGround_color_for_emailfield.getCssValue("background-color");
		String color_hex=Color.fromString(Expect_color).asHex();
		if(color_hex.equals(actual_color)){
			
			System.out.println("valid email is accepted successfully ");
			//click on create account button
			  Btn_CreateAccount.click();
			  new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElement(Create_account_Page_Header, "CREATE AN ACCOUNT"));
			  
			  String header=Create_account_Page_Header.getText();
			  String Actual_header="CREATE AN ACCOUNT";
			  if(header.equals(Actual_header)){
				  
				  System.out.println(" create account page successfully opened ");
			
				  
			  }else
			  {
				  
				  System.out.println(" create account page is not loaded");
				 
				  
			  }	
			
		}else
		 {
			
			System.out.println("valid email id is not accepted by the eamil id field");  
			  
		 }
		
		return Valid_dynamic_Email_time;
		
	}

}
