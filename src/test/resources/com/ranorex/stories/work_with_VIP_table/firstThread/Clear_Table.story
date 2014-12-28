Meta: Clear table

Narrative:
As a user
I want to clear table
So that I can reload default values again

Lifecycle:
Before:
Given the user is on the VIP DB page
Given connection status should be Online

Scenario: Clear table values
Given the user click on Load button
When the user click on Clear button
Then table is cleared
