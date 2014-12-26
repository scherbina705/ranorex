
Scenario: Adding new VIP to table without previous loading
Given the user is on the VIP DB page
And connection status should be Online
And table is empty
When the user fill <firstName>
And the user fill <lastName>
And the user select <category>
And the user select <gender>
And the user click on Add button
Then first row added to the table with values <firstName>, <lastName>, <gender>, <category>
And vip count value equals 1

Examples:|firstName|lastName|category|gender|
|*';$&^#@!/"=+|=+*';$&^#@!|Other|Male|
|--|--|Music|Male|
|Tom|Johns|Movie|Male|
|0123456789|0123456789|Science|Female|
|Tiger|Woods|Sport|Male|
|12345678901234567890123456789012345678901234567890|12345678901234567890123456789012345678901234567890|Politics|Female|


