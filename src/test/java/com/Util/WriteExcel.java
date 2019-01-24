package com.Util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

import gherkin.formatter.model.Row;

public class WriteExcel  {

	
	
	public static void main(String[] args) 
		{ 
			// Blank workbook 
		XSSFWorkbook workbook = new XSSFWorkbook(); 

			// Create a blank sheet 
			XSSFSheet sheet = workbook.createSheet("student Details"); 

			// This data needs to be written (Object[]) 
			Map<String, Object[]> data = new TreeMap<String, Object[]>(); 
			data.put("1", new Object[]{ "searchstring", "present"}); 
			data.put("2", new Object[]{  "welcome", "yes" }); 
			
			// Iterate over data and write to sheet 
			Set<String> keyset = data.keySet(); 
			int rownum = 0; 
			for (String key : keyset) { 
				// this creates a new row in the sheet 
				XSSFRow row = sheet.createRow(rownum++); 
				Object[] objArr = data.get(key); 
				int cellnum = 0; 
				for (Object obj : objArr) { 
					// this line creates a cell in the next column of that row 
					XSSFCell cell = row.createCell(cellnum++); 
					if (obj instanceof String) 
						cell.setCellValue((String)obj); 
					else if (obj instanceof Integer) 
						cell.setCellValue((Integer)obj); 
				} 
			} 
			try { 
				// this Writes the workbook gfgcontribute 
				FileOutputStream out = new FileOutputStream(new File("gfgcontribute.xlsx")); 
				workbook.write(out); 
				out.close(); 
				System.out.println("gfgcontribute.xlsx written successfully on disk."); 
			} 
			catch (Exception e) { 
				e.printStackTrace(); 
			} 
		} 
	} 

	

