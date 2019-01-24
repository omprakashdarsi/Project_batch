package com.GenericMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	
	public static WebDriver driver;
	//************************************************************
	
	@FindBy(how=How.XPATH,using="//i[@class='icon-home']")
	public static WebElement Home_Button;
	
	@FindBy(how=How.XPATH,using="//a[@class='logout']")
	public static WebElement Logout_Link;
	
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	public static WebElement Txt_Login_Email;
	
	@FindBy(how=How.XPATH,using="//input[@id='passwd']")
	public static WebElement Txt_Login_Passowrd;
	
	@FindBy(how=How.XPATH,using="//button[@name='SubmitLogin']")
	public static WebElement Txt_Login_Submit;
	
	//verify successful login	
	
	@FindBy(how=How.XPATH,using="//h1[text()='My account']")
	public static WebElement Header_My_Account_Page;


	//welcome verification string
	@FindBy(how=How.XPATH,using="//p[text()='Welcome to your account. Here you can manage all of your personal information and orders.']")
	public static WebElement Header_Welcome_String;
	//p[text()='Welcome to your account. Here you can manage all of your personal information and orders.']
     
	
	//*[@id="block_top_menu"]/ul/li[2]/ul/li[1]/a
	
	
	public static boolean launchBrowser(String url,String browsertype)
	{
		boolean status=true;
		
		try
		{
			switch(browsertype.toLowerCase())
			{
			case "ff":
				driver=new FirefoxDriver();
				break;
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Downloads\\New_Setup_Files\\chromedriver.exe");
				driver=new ChromeDriver();
				
						
			}
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
			driver.get(url);
			driver.manage().window().maximize();	
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
	
	
	public static void closeBrowser(){
		
		driver.close();
		
		
	}
	
	
	public static void Selector_Obj(WebElement element,int index){
		
		element.click();
		Select sel_drop= new Select(element);
		sel_drop.selectByIndex(index);
		
		element.click();
	}
	
	
	public static void refresh_Page(){
		
		driver.navigate().refresh();
		
		
	}
	
	
	public static void Goto_HomePage(){
		
		
		Home_Button.click();
		
		
	}
	
	public static void logout(){
		
		System.out.println("loging out from app");
		Logout_Link.click();
	}
	public static void login(String username,String Password ){
		
		
		System.out.println("loging in to app");
		Txt_Login_Email.click();
		Txt_Login_Email.sendKeys(username);
		
		Txt_Login_Passowrd.click();
		Txt_Login_Passowrd.sendKeys(Password);
		//click on sign in button
		Txt_Login_Submit.click();
		
		
		
		//*[@id="block_top_menu"]/ul/li[2]/a
	}
	
	public static void Verify_Successful_Login_and_Register(String expectedmessage){
		   
		   String ex_Header="MY ACCOUNT";
		   
		   String ac_Header=Header_My_Account_Page.getText();
		  // String ex_Welcome_Msg="Welcome to your account. Here you can manage all of your personal information and orders.";	   
		   
		   String ac_Welcome_Msg=Header_Welcome_String.getText();
		   if(ac_Header.equals(ex_Header) &&(ac_Welcome_Msg.equals(expectedmessage))){
			   System.out.println("welcome page is opened on login or registeration");
			   
			   
		   }else{
			   
			   System.out.println("Login_or_Registeration is Not successfull");
			   
			   
		   }
		   
	   }
	public static void Navigate_to_main_menu_pages(WebElement element){
		
		
		//click on elemnt 
		element.click();
		
		
	}
	
	
	public static void mouseHoverONMainMenu(WebElement MainMenu,WebElement SubMenu){
		
		Actions act=new Actions(driver);
		//act.build().perform();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		act.moveToElement(MainMenu).build().perform();

	//	act.moveToElement(Mouse_Hover_subMenu_casualdresses).click().build().perform();
		
		SubMenu.click();
		
		
		
	}
	
	

}
