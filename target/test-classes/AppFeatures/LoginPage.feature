Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"

Scenario: Forgot password link
Given user is on login page
Then forgot password link should be displayed


Scenario: Login with correct credentials
Given user is on login page
When user enters username "vishaljadon5@yahoo.com"
And user enters password "Vish@l8952"
And user clicks on Login button
Then user gets the title of the page
And page title should be "My account - My Store"