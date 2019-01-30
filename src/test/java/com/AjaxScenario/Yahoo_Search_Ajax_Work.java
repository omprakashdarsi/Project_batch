package com.AjaxScenario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericMethods.GenericMethods;

public class Yahoo_Search_Ajax_Work extends GenericMethods{
	
	
	@FindBy(how = How.XPATH,using=("//input[@id='uh-search-box']"))
	public static WebElement search_Box ;
	
	public static List<String> searchResults;
	
    public static void SearchResult(){
	   searchResults=new ArrayList<String>();
		
	   
	   
	   
		search_Box.sendKeys("welcome");
		search_Box.click();
		//System.out.println(search_Result.getText());
		
		
		int size_li=driver.findElements(By.xpath("//table//td[1]//li")).size();
		
		System.out.println("size d list:"+size_li);
		
		int elecount=size_li;
		
		int counter=0;
		
		for(int i=1;i<=size_li;i++){
			//dynamic xpath
			String val=driver.findElement(By.xpath("//table//td[1]//li["+i+"]")).getText();
			
			searchResults.add(val);
			if(val.trim().toLowerCase().startsWith("welcome")){
				
				System.out.println(val);
				counter++;	
			}
		}
	
		if(elecount==counter){
			
			System.out.println("all the elements streted with welcome");
		}else
			
			System.out.println("all the elements not streted with welcome");
		
		
}
	
	public static void writeExcelData(){
		
		
		try {
			
			boolean columnexist=true;
			//FileOutputStream fos=new FileOutputStream(f);			
			XSSFWorkbook workbook= new  XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("Results"); 				
			
			sheet.createRow(0).createCell(0).setCellValue("Search Result");
			sheet.getRow(0).createCell(1).setCellValue("Status");
			
     			for(int r=1;r<=searchResults.size()-1;r++){
				//creating header
				if(columnexist)
				{
					
					Row row= sheet.createRow(r);
					sheet.createRow(0).createCell(0).setCellValue(searchResults.get(r));
					sheet.createRow(r+1).createCell(0).setCellValue("true");
					columnexist=false;
				}else
				{
					int getRowCount=sheet.getPhysicalNumberOfRows();
					sheet.createRow(getRowCount+1).createCell(0).setCellValue("welcome");
					sheet.getRow(0).createCell(1).setCellValue("true");
					
					
				}
				
				
			}
			
		    File file= new File(System.getProperty("user.dir")+"\\"+"testoutput4.xlsx");
			System.out.println("file created "+file);
			FileOutputStream out = new FileOutputStream(file);
            workbook.write(out);
            out.close();
            System.out.println("testoutput.xlsx written successfully on disk");
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
