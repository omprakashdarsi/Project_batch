package com.applicationpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.GenericMethods.GenericMethods;

public class ShoppingFields extends GenericMethods {
	
	
	
	
	//****************************WebElements***************************
	
	//home button from successful login page
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='block_top_menu']/ul/li[1]")
	 public static WebElement  Link_Women_Menu;
	
	@FindBy(how=How.XPATH,using="//*[@class='breadcrumb clearfix']")
	 public static WebElement  breadcrumb_check;
	
	@FindBy(how=How.XPATH,using="//h2[@class='title_block']")
	public static WebElement  categories_block_left_Title_check;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@class='breadcrumb clearfix']")
	public static WebElement  Check_Breadcum;
	
    @FindBy(how=How.XPATH,using="//*[text()='Women']")
    public static WebElement  Link_Women_Menu2;
    
    @FindBy(how=How.XPATH,using="//*[@id='block_top_menu']/ul/li[2]/a")
    public static WebElement Link_Dresses_Hover_Menu;

    @FindBy(how=How.XPATH,using="//*[text()='Dresses']")
    public static WebElement  Link_Menu_Dresses;
    
    @FindBy(how=How.XPATH,using=" (//a[normalize-space(text())='Casual Dresses'])[3]")
    public static WebElement  Link_Sub_Menu_CasualDresses;
    
    @FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Evening Dresses'])[3]")
    public static WebElement  Link_Sub_Menu_Casual_Dresses;
   
    @FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Summer Dresses'])[3]")
    public static WebElement  Link_Sub_Menu_Summer_Dresses;
    
  //Mouse hover submenu
  	@FindBy(how=How.XPATH,using="//*[@id='block_top_menu']/ul/li[2]/a")
  	public static WebElement Mouse_Hover_casual_Dresses_subMenu;
  	
  //Mouse hover submenu
  	@FindBy(how=How.XPATH,using="//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")
  	public static WebElement Mouse_Hover_subMenu_casualdresses;
  	
  	//*[@id="block_top_menu"]/ul/li[2]/ul/li[1]/a
  	
    @FindBy(how=How.XPATH,using=" //*[@id='columns']/div[1]/span[3]")
    public static WebElement SubMenu_bread_Crumb;
    
    
   
	//********************************* Methods Implementation *******************************
	
			//============================================================================
			/*
			 * Method Name:Verify_BreadCrumbs_of_womenPage()
			 * 
			 * Purpose:this method is to verify breadcrumbs are navigating proprerly or not 
			 * 
			 * Input Parameter:
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
			
      public static void Verify_BreadCrumbs_of_womenPage(){
		
		
    	//click on women menu item 
    	  Navigate_to_main_menu_pages(Link_Women_Menu2);
    	
    		//waiting for 10 seconds after clicking button to let the page loaded and display message
		  
    	new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(Check_Breadcum));
	      
		  boolean visible=Check_Breadcum.isDisplayed();
		  if(visible){
		  
			  System.out.println("Bread crumb is visible on clicking womens menu successfully");
		
		  }	
			
			
		}
		
		  
      public static void mouseHover_onMainMenu(){
			
			
    	  System.out.println("checking menu items and hover over menu");
    	  mouseHoverONMainMenu(Link_Dresses_Hover_Menu,Mouse_Hover_subMenu_casualdresses);
		
    	  
         new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(SubMenu_bread_Crumb));
	      
		  boolean visible=SubMenu_bread_Crumb.isDisplayed();
		  if(visible){
		  
			  System.out.println("Bread crumb is visible on clicking casual dresses menu successfully");
		
		  }	
		  System.out.println("checking menu items and hover over menu success");
			
		}
    	  
    	  
    	 
		  
		  
		
	}
	


