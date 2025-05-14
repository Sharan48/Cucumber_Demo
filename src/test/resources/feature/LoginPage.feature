Feature: Login page feature


Scenario: login credential
Given user is on login page
When user enter username "sharanu318@gmail.com"
And user enter password "#Sharanu48"
And click on login button
Then user navigate to home page
Then user get the title of the home page
And page title should be "Sell or Rent Home Online at Magicbricks"

Scenario: check rent page details
Given user is on login page
When user enter username "sharanu318@gmail.com"
And user enter password "#Sharanu48"
And click on login button
Then user navigate to home page
When user click on Rent link
Then rent page should be displayed

Scenario: check help center page details
Given user is on login page
When user enter username "sharanu318@gmail.com"
And user enter password "#Sharanu48"
And click on login button
Then user navigate to home page
When user click on help center link
Then help center page should be displayed
