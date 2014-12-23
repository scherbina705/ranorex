
Scenario: Disconnecting from vip db
Given the user is on the VIP DB page
When the user click on Disconnect button
Then the status changed to Offline
And Load button is disabled
And Save button is disabled

Scenario: Connecting to vip db
Given the user is on the VIP DB page
And the user click on Disconnect button
When the user click on Connect button
And the user click on OK in modal window
Then the status changed to Online