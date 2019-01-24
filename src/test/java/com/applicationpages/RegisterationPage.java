package com.applicationpages;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.GenericMethods.GenericMethods;

public class RegisterationPage extends GenericMethods{
	
	//################################## WebElements ##################################
	
	 //Gender radio button 
	 @FindBy(how=How.XPATH,using="//input[@id='id_gender2']")
	 public static WebElement Txt_Cust_Gender;
	
	
	//locator for error header
	@FindBy(how=How.XPATH,using="//p[text()[contains(.,'There are')]]")
	public static WebElement Mandate_Field_Error_Heading;
	
	
	//locator for error header
		@FindBy(how=How.XPATH,using="//p[text()='There are 7 errors']")
		public static WebElement Mandate_Field_7_Error_Heading;
	
	//locator for list of errors
	@FindBy(how=How.XPATH,using="//div[@class='alert alert-danger']/ol")
	public static WebElement list_of_mandateField;
	
	//locator for customer_firstname field of registration form
	@FindBy(how= How.ID,using="customer_firstname")
	
	public static WebElement Txt_customer_firstname;
	
	//locator for customer_lastname field of registeration form
	
    @FindBy(how= How.ID,using="customer_lastname")
	
	public static WebElement Txt_customer_lastname;
    
    
    @FindBy(how=How.XPATH,using="//input[@id='email']")
    public static WebElement Txt_customer_email;
    
    @FindBy(how=How.XPATH,using="//input[@name='passwd']")
    public static WebElement Txt_Cuctomer_passwd;
    
    @FindBy(how=How.XPATH,using=" //select[@name='days']")
    
    public static WebElement Drp_Cuctomer_DOB_day;
    
    
@FindBy(how=How.XPATH,using=" //select[@id='months']")
    
    public static WebElement Drp_Cuctomer_DOB_month;
    

@FindBy(how=How.XPATH,using=" //select[@name='years']")

public static WebElement Drp_Cuctomer_DOB_year;


@FindBy(how=How.XPATH,using="//input[@name='newsletter']")

public static WebElement Check_NewsLwtter;

@FindBy(how=How.XPATH,using="//input[@name='optin']")

public static WebElement Check_Offers;

@FindBy(how=How.XPATH,using="//input[@name='firstname']")

public static WebElement Txt_Cust_Firstname;
@FindBy(how=How.XPATH,using="//input[@name='lastname']")

public static WebElement Txt_Cust_Lastname;
@FindBy(how=How.XPATH,using="//input[@name='company']")

public static WebElement Txt_Cust_Company;
@FindBy(how=How.XPATH,using="//input[@name='address1']")

public static WebElement Txt_Cust_Address;



@FindBy(how=How.XPATH,using="//input[@name='address2']")

public static WebElement Txt_Cust_Address2_Optional;

@FindBy(how=How.XPATH,using="//input[@name='city']")

public static WebElement Txt_Cust_City;

@FindBy(how=How.XPATH,using="//select[@id='id_state']")

public static WebElement Txt_Cust_State;

@FindBy(how=How.XPATH,using="//input[@name='postcode']")

public static WebElement Txt_Cust_City_postcode;

@FindBy(how=How.XPATH,using="//input[@name='postcode']")

public static WebElement Txt_Cust_City_Postcode;

@FindBy(how=How.XPATH,using="//select[@id='id_country']")

public static WebElement Txt_Cust_id_country;

    
@FindBy(how=How.XPATH,using="//input[@name='phone']")

public static WebElement Txt_Cust_HomePhone_opt;


@FindBy(how=How.XPATH,using="//input[@name='phone_mobile']")

public static WebElement Txt_Cust_Mobile_phone_man;

@FindBy(how=How.XPATH,using="//input[@name='alias']")

public static WebElement Txt_Cust_Address_Alias;

@FindBy(how=How.XPATH,using="//textarea[@name='other']")

public static WebElement Txt_Cust_Additional_info;


//Register button locator 
@FindBy(how=How.ID,using="submitAccount")
public static WebElement Btn_RegButton;





	
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
			
	
   public static void Submit_Registeration(){
	   
   	  Btn_RegButton.click();
   }
	   
   public static void Error_List_Of_MandateFields(){
	   
	   
       String Error_Header= Mandate_Field_Error_Heading.getText();
	   String expected_Error_Header="There are 8 errors";
	   
	  
	   
	   if(Error_Header.equals(expected_Error_Header)){
		   
		   
		   System.out.println("the error is message for mandatory fields is displayed successfully:"+Error_Header);
		   
		   java.util.List<WebElement> error_list=list_of_mandateField.findElements(By.tagName("li"));
		   
		   for(WebElement l: error_list){
		 
			   System.out.println("List of errors"+l.getText());
			   
		   }
		   
		   
	   }else{
		   
		   System.out.println("the error is message for mandatory fields is not  displayed successfully:"+Error_Header);
   
	   }
   }
   
   public static void Register_With_Mandateory_Fields(){
	   
	   
	  Txt_customer_firstname.sendKeys("Latha");
	  Txt_customer_lastname.sendKeys("sava");
	  Txt_Cuctomer_passwd.sendKeys("gopal");
	  String emails=Txt_customer_email.getAttribute("value");
	  if(emails.equals(CreateAccount.Valid_dynamic_Email_time))
	  {
		  System.out.println("correct");
		  
        		  
	  }
	  Txt_Cust_Firstname.sendKeys("latha");
	  Txt_Cust_Lastname.sendKeys("savalaaa");
	  Txt_Cust_Company.sendKeys("adobe");
	  Txt_Cust_Address.sendKeys("anantapur");
	  Txt_Cust_City.sendKeys("Texas");
	  Selector_Obj(Txt_Cust_State,4);
	  Txt_Cust_City_postcode.sendKeys("12345"); 
	  Selector_Obj(Txt_Cust_id_country,1);
	  Txt_Cust_Mobile_phone_man.sendKeys("123456789");
	  
	  Txt_Cust_Address_Alias.sendKeys("kurnool");
	   
   }
   
   
     
   
   public static void Register_With_Only_Optional_Fields(){
	   
	   
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;   
	   Selector_Obj(Drp_Cuctomer_DOB_day,5);
       Selector_Obj(Drp_Cuctomer_DOB_year,8);
	   Selector_Obj(Drp_Cuctomer_DOB_month,6);
	  
	   //News letter check box
	   
	   
	   boolean check_isselected_news = Check_NewsLwtter.isSelected();
		  if(!check_isselected_news){
			  Check_NewsLwtter.click();
			  
		  }
	     
	  boolean check_isselected = Check_Offers.isSelected();
	  if(!check_isselected){
		   Check_Offers.click();
		  
	  }
	   
	   Txt_Cust_Address2_Optional.sendKeys("Hyderabad");
	   Txt_Cust_Additional_info.sendKeys("this is for testing");
	   Txt_Cust_HomePhone_opt.sendKeys("9886029043");
	   
	   

   }
   
}





	
		
	

	
	
