Feature: This feature is design to validate register user functionality
@Test3
Scenario: this scenario is design to validate wheter the given user id is resigstered in the application
    Given launch the "chrome" browser and pass the url
    When Browser is launched , click on signin
    Then verify Authentication page is opened 
    And close the browser

 Scenario: This is to validate emailaddress field in authentication page
    Given launch the chrome browser and pass the url
 	When Browser is launched then click on signin to go to the auth page
 	Then enter invalid email Id in email address field
 	And enter valid email is and check for for the background color changes

 Scenario: Successfull validation of RegisterationPage Error on submission of empty fields of reg_form
 	Given user is on RegisterationPage 
 	When click on Register submit button to complete registeration
 	Then validate error header and list of mandatory fields errors

Scenario: Successfull validation of Registeration with only mandatory fields
	Given launch the chrome browser and pass the url
	When enter all the mandatory fields into the registeration form 
	Then click on Register  button to complete registeration
	And Verify registeration is successfull or not
	Then sign out from application
@Test1	
Scenario: Verification of Failed registration with only optional values
 	Given launch the "ff" browser and pass the url
 	When enter all the optional fields into the registeration form
 	Then click on Register  button to submit registeration
 	And Verify registeration is Failed or not
@Test	
Scenario: Successfull verification of links and breadcumbs in shopping page
   Given launch the "chrome" browser and pass the url
   Then click on sign in link and login with "11.01.54latha.sab@gamil.com" and "gopal"
   And verify welcome message and goto home page
   |Welcome to your account. Here you can manage all of your personal information and orders.|
   When user is on hoe page click on women menu link 
   Then Hover on Dresses menu and click on casual dresses submenu 
   And Close Browser
   
   
   
   
   
   
   
   
   