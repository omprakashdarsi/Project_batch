Feature: Finding the search elements in a search box and comparing the results 
@Test_Chrome
Scenario: Succssfull validation of search box and auto suggestions
 Given open the "https://in.yahoo.com/" page in "chrome" browser
 Then search for the desired word
 And list out all the maching search results and write it to excel 

 @Test_ff
Scenario: Succssfull validation of search box and auto suggestions
 Given launch the "ff" browser and pass the url
 Then search for the desired word
 #And list out all the maching search results and write it to excel 
 
 