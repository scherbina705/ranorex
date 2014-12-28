Meta: Delete values

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Lifecycle:
Before:
Given the user is on the VIP DB page
Given connection status should be Online

Scenario: Delete last row in the table
Given the user click on Load button
And the user added VIP to the table with values <firstName>, <lastName>, <gender>, <category>
When the user check radio button of added VIP in the table
And the user click on Delete button
Then VIP with <firstName>, <lastName>, <gender>, <category> is removed from the table

Examples:|firstName|lastName|category|gender|
|anyName|anyName|Science|Male|