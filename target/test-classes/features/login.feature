Feature: Login into Application

Scenario Outline: Positive test alidating login
Given Initilize the browser with chrone
And Navigate to the "http://www.qaclickacademy.com/" Site
And Click on Login link in home page to land on secure signin page
When User enters <username> and <password> and logsin
Then verify that user is successfully logged in
And Close browsers

Examples:
|username			|password	|
|test99@gmail.com	|123456     |	
|test123@gmail.com	|12345      |