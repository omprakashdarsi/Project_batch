package com.applicationpages;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;

import com.GenericMethods.GenericMethods;

public class AuthenticationPage extends GenericMethods{
	
	//**************************WebElements************************
	
	@FindBy(how = How.XPATH,using="//input[@name='email_create']")			
	
	public static WebElement emailaddress;
	
	
	//********************Methods Implementation************************
	public static void ValidateEmailField(String email){
		
		try
		{
			
			emailaddress.sendKeys(email);
			
			String textBoxColor=emailaddress.getCssValue("background-color");
			String hex_val=Color.fromString(textBoxColor).asHex();
			
			System.out.println(textBoxColor);
			
			
			if(hex_val.equals("textBoxColor"));
			{
				
				System.out.println("invalid email");
				
			}
		}catch(Exception e){
			
			System.out.println(e);
		}
		
		
	}
	
	
	
	
	
	
	

}
