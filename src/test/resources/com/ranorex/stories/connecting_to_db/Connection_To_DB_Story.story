Meta:Connect from DB

Narrative:
As a user
I want to connect to DB
So that I can work with its info

Scenario: Disconnecting from vip db
Given the user is on the VIP DB page
When the user click on Disconnect button
Then connection status changed to Offline
And Load button is disabled
And Save button is disabled

Scenario: Connecting to vip db
Given the user is on the VIP DB page
And the user click on Disconnect button
When the user click on Connect button
And the user click on OK in modal window
Then connection status changed to Online