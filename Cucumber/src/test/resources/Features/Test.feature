@login
Feature: Login feature
sdfgfx
dfg
sg


@negative
Scenario Outline: Invalid username and password
Given I am able to access magento Homepage
And I click on user_icon
When i update the user_name as "natarajan@gmail.com"
And  I update password as "test123"
And I click on Sign_in
Then I should get the error message as "Invalid Username or password."
Examples:
|email|pwd|
|test@gmail.com|test123|


@positive
Scenario: Valid username and password
Given I am able to access magento Homepage
And I click on user_icon
When i update the user_name as "natarajan.ramanathan93@gmail.com"
And  I update password as "Welcome123"
And I click on Sign_in
Then I should get the user ID as "ID: MAG003417822"