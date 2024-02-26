Feature: MyAccount-Login Feature
Description: Thgis feature will test a login functionality


#Scenario: Log-in with valid username and password
#Given open browser
#When Enter the url "https://practice.automationtesting.in/"
#And click on My Account Menu
#And Enter rigistered username and password
#And Click on login button
#Then User must successfully login to the web page

#login with parameters
#Scenario: Log-in with valid username and password
#Given open browser
#When Enter the url "https://practice.automationtesting.in/"
#And click on My Account Menu
#And Enter rigistered username "subhamkumar2695" and password "Selenium@123"
#And Click on login button
#Then User must successfully login to the web page


#login with scenario outline and example Keyword
#Scenario Outline: Log-in with valid username and password
#Given open browser
#When Enter the url "https://practice.automationtesting.in/"
#And click on My Account Menu
#And Enter rigistered username "<username>" and password "<password>"
#And Click on login button
#Then Verify login


#Examples:
#| username  | password	|
#| subhamkumar2695	| Selenium@123|
#| subhamkumar2696	| Selenium123@|
#| subhamkumar2697	| Selenium123@|


#simple login with Data table parameters

#Scenario: Log-in with valid username and password
#Given open browser
#When Enter the url "https://practice.automationtesting.in/"
#And click on My Account Menu
#And Enter rigistered username and password
#|subhamkumar2695|Selenium@123|
#And Click on login button
#Then User must successfully login to the web page

#simple login with Data table parameters with header
Scenario: Log-in with valid username and password
Given open browser
When Enter the url "https://practice.automationtesting.in/"
And click on My Account Menu
And Enter rigistered username and password
|user	|password	|
|subhamkumar2695|Selenium@123|
And Click on login button
Then User must successfully login to the web page








