
Scenario: Last name of Sylvester Stallone should be in the 1 row and in the 3 column
Given the user is on the VIP DB page
And connection status should be Online
When the user click on Load button
Then last name Stallone is in the 2 row and in the 3 column