package com.applicationpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericMethods.GenericMethods;

public class Homepage extends GenericMethods{
	 
	
	//******************************** WebElements **********************************
	
	@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Sign in']")
	public static WebElement Lnk_Signin;
	
	@FindBy(how=How.XPATH,using="//h1[text()='Authentication']")
	public static WebElement Auth_Header;
	
	
	
	
// ********************************* Methods Implementation ************************
	
	
	public static void clickSign_In()
	{
		boolean status=true;
		
		try
		{
			Lnk_Signin.click();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	//checking Authentication header 
	public boolean Check_Header(String expheader)
	{
		String expheader1=expheader;
		boolean header= false;
		//String actheader=null;
		try
		{
		   String actheader= Auth_Header.getText();
		   // Auth_Header.clear();
		    System.out.println(actheader);
			if(expheader1.equals(actheader)){
				header=true;
				
			}
		    
			
		}catch(Exception e){
			
			   System.out.println(e.getMessage());
		    }
		
		return header;
	}
	
	
}
