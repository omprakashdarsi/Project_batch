package MakeMyTripDatePicker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DatePickerScenario {
	
	//====================================WebEleemnts========================================================
	
	@FindBy(how=How.XPATH,using="//input[@id='hp-widget__depart']")
	public static WebElement Depart_date_element;
	
	
	@FindBy(how =How.XPATH,using="//span[@class='ui-datepicker-month']")
	public static WebElement Present_displayed_month;
			
	@FindBy(how =How.XPATH,using="//span[@class='ui-datepicker-year']")
	public static WebElement Present_displayed_year;

	@FindBy(how=How.XPATH,using="(//a[@class='ui-datepicker-next ui-corner-all']//span[text()='Next'])[1]")
	public static WebElement Next_Button;
	
	
	
	//====================================Methods ========================================================
	
	public static void PickNextMonth(String date) throws Exception{
		
       SimpleDateFormat sdf=new SimpleDateFormat("DD/MM/YYYY");
		
		sdf.format(new Date());
		
		System.out.println(sdf.format(new Date()));
		
		
		
		
		
		
		System.out.println(datetoselect);
		String month=new SimpleDateFormat("MMMM").format(datetoselect);
		String year = new SimpleDateFormat("YYYY").format(datetoselect);
		System.out.println(month);
		System.out.println(year);
		
		Depart_date_element.click();
		System.out.println("date picker clicked");
		
		
		String currentmonth=Present_displayed_month.getText();
		System.out.println(currentmonth);
		String currentyaer=Present_displayed_year.getText();
		System.out.println(currentyaer);
		
		
		if(month.toUpperCase().equals(currentmonth) && (year.equals(currentyaer))){
			
			System.out.println("date provided is current date so pick the date  ");
			
			
			Next_Button.click();
			
			
		}
		
		//Next_Button.click();
		
		
		
	}
	
	
	
	

}
