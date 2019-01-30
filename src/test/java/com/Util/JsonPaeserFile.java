package com.Util;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.JsonObject;

public class JsonPaeserFile {
	
	public static JSONObject jsonObject;
	
	public static void parseJSONfile()
	{
	    JSONParser parser = new JSONParser();
	    try
	    {
	        Object object = parser.parse(new FileReader("data.json"));

	        //convert Object to JSONObject
	         jsonObject = (JSONObject)object;


	    }
	    catch(FileNotFoundException fe)
	    {
	        fe.printStackTrace();


	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static String geturl()

	{
	String url="";
	try
	{
	  //Reading the array
	    JSONArray environments = (JSONArray)jsonObject.get("GenericData");


	    for(int i=0;i<=environments.size()-1;i++)

	    {
	    JSONObject item = (JSONObject)environments.get(i);

	         String env_Status = (String)item.get("Sno");


	         if(env_Status.equalsIgnoreCase("2"))
	         {

	         url = (String)item.get("Values");

	         System.out.println(url);



	             break;

	         }

	    }


	    }

	    catch(Exception e)
	{
	    System.out.println("Unable to get the URL of the application");
	}
	return url;
	}
	
	
	
public static void main(String[] args) {
	parseJSONfile();
	
	geturl();
}	
}

	

	


