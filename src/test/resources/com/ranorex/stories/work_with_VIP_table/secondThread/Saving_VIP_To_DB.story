Meta: Saving VIP

Narrative:
As a user
I want to save added data to DB
So that I can commit and save my added VIPs

Lifecycle:
Before:
Given the user is on the VIP DB page
Given connection status should be Online

Scenario: Saving VIP that was added to the table without loaded values
Given the user added VIP to the table with values <firstName>, <lastName>, <gender>, <category>
When the user click on Save button
Then appear modal window with text: VIP(s) stored sucessfully

Examples:|firstName|lastName|category|gender|
|anyName|anyName|Science|Male|

Scenario: Saving VIP that was added to the table with loaded values
Given the user click on Load button
And the user added VIP to the table with values <firstName>, <lastName>, <gender>, <category>
When the user click on Save button
Then appear modal window with text: VIP(s) stored sucessfully

Examples:|firstName|lastName|category|gender|
|anyName|anyName|Science|Female|