Feature: RedBus 
Scenario: Book Ticket 
	Given The webpage of RedBus is loaded 
	When "Pune" and "Hyderabad" are provided 
	And journey date is provided 
	Then Book ticket for the corresponding details
	And Enter person details