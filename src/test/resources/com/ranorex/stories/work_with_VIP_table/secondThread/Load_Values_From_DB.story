Meta:Load from DB

Narrative:
As a user
I want to load values from DB
So that I can see the list of VIPs

Lifecycle:
Before:
Given the user is on the VIP DB page
Given connection status should be Online

Scenario: Loading of default values to the table from DB
When the user click on Load button
Then rows appear in the table
And vip count number should equal table rows number

