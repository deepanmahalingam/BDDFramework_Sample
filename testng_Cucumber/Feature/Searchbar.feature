Feature: Verify Search bar present
Scenario: Verify Search Tab is present in Google
Given user is provided with URL
When user is navigated to home page
And check for input tab
Then close the browser successfully