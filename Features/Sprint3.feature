Feature: MakemyTrip Date picker 

@Date_Pick
Scenario: Select the user given date from the date picker
  Given I open "https://www.makemytrip.com/" page "chrome"
  When recieve date from user "07/09/2018"
  Then pick the date from the app and verify 
  