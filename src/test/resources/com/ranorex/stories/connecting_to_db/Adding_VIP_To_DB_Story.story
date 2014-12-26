
Scenario: Adding new VIP to empty table (without previous loading)
Given the user is on the VIP DB page
And connection status should be Online
And table is empty
When the user fill First Name with <firstName>
And the user fill Last Name with <lastName>
And the user select category <category>
And the user select gender <gender>
And the user click on Add button
Then first row added to the table with values <firstName>, <lastName>, <gender>, <category>
And vip count value equals 1

Examples:|firstName|lastName|category|gender|
|Tom|Johns|Movie|Male|
|Tiger|Woods|Sport|Female|

Scenario: Adding new VIP to table with empty First Name
Given the user is on the VIP DB page
And connection status should be Online
When the user click on Add button
Then appear modal window with text Please specify 'First Name' value

Scenario: Adding new VIP to table with empty Last Name
Given the user is on the VIP DB page
And connection status should be Online
When the user fill First Name with <firstName>
And the user click on Add button
Then appear modal window with text Please specify 'Last Name' value

Examples:|firstName|
|any name|

Scenario: