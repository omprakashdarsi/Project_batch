Feature: Finding the search elements in a search box and comparing the results 
@Test_chrome
Scenario: Succssfull validation of search box and auto suggestions
 Given I open "https://in.yahoo.com/" page in "chrome"
 Then search for the desired word
 And list out all the maching search results and write it to excel 
 Then close browser
 @Test_ff
Scenario: Succssfull validation of search box and auto suggestions
 Given Given I open "https://in.yahoo.com/" page in "ff"
 Then search for the desired word
 And list out all the maching search results and write it to excel 
 Then close browser
 