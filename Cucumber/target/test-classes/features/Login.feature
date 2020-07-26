Feature: Application Login


Scenario: Login to Home Page
Given User should be on Netbanking landing page
When User login into the application with username "jin" and password "1234"
Then User should land on HomePage
And CreditCard details displayed are "true"



Scenario: Login to Home Page
Given User should be on Netbanking landing page
When User login into the application with username "john" and password "4321"
Then User should land on HomePage
And CreditCard details displayed are "false"
