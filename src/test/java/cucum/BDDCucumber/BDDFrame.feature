Feature: Login to Mercury Tour
@smoke
Scenario: Login with valid credentials
Given user is in loging page
When user enters user name
And User enters the password
 
Then user be able to see the flight details

@adHoc
Scenario: Logout from Browser
Given user is in Flight details page
When user click on (X) to close the page
Then Browser is closed