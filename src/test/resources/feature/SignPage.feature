Feature: Sign Page feature


Scenario: Succesfully login with credentials
Given User is on the sign Page
When User enters the username "sharantest" and password "password"
And user click on the sign button
Then User should be logged in successfully
Then User get the sign page title

