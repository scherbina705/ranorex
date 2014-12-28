Meta: Adding VIP

Narrative:
As a user
I want to add VIP to table
So that I can increase VIPs in the DB

Lifecycle:
Before:
Given the user is on the VIP DB page
Given connection status should be Online

Scenario: Adding new VIP to empty table (without previous loading)
Given table is empty
When the user fill First Name with <firstName>
And the user fill Last Name with <lastName>
And the user select category <category>
And the user select gender <gender>
And the user click on Add button
Then new row added to the end of the table with values <firstName>, <lastName>, <gender>, <category>

Examples:|firstName|lastName|category|gender|
|Tom|Johns|Music|Male|

Scenario: Adding new VIP to table with loaded values
Given the user click on Load button
When the user fill First Name with <firstName>
And the user fill Last Name with <lastName>
And the user select category <category>
And the user select gender <gender>
And the user click on Add button
Then new row added to the end of the table with values <firstName>, <lastName>, <gender>, <category>

Examples:|firstName|lastName|category|gender|
|Steve|Hocking|Science|Female|

Scenario: Adding new VIP to table with empty First Name
When the user click on Add button
Then appear modal window with text: Please specify 'First Name' value

Scenario: Adding new VIP to table with empty Last Name
When the user fill First Name with <firstName>
And the user click on Add button
Then appear modal window with text: Please specify 'Last Name' value

Examples:|firstName|
|any name|
