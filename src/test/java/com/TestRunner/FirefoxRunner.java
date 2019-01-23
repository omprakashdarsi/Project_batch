package com.TestRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"}
		,glue={"stepDefinitions"},
		 tags={"@Test_ff,"},monochrome = true
		
		)
public class FirefoxRunner {

	
	
}
