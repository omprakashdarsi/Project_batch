package com.Util;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonPaeserFile {
	
	
	public static void parseJSONfile(JSONObject jsonObject)
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
	    JSONArray environments = (JSONArray)jsonObject.get("Generic_Testdata");


	    for(int i=0;i<=environments.size()-1;i++)

	    {
	    JSONObject item = (JSONObject)environments.get(i);

	         String env_Status = (String)item.get("Execute_Test");


	         if(env_Status.equalsIgnoreCase("yes"))
	         {

	         url = (String)item.get("url");

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
}

	
	
	
	


