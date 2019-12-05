Feature: Snippet Finder 

		
	Scenario: View all snippets
	
	Given The user is on the Snippet Finder page
	When The user clicks view all
	Then A list of all snippets is paginated
	Then The url is finder
	
	
	Scenario: Find a snippet 
	
	Given The user is on the Snippet Finder page
	When The user types a query in the search bar
	When The user clicks find
	Then A list of snippets is populated
	
	
	Scenario: Sort by beers ascending
	
	Given The user is on the Snippet Finder page
	When The user clicks view all
	When The user clicks order by beers
	Then A list of snippets ordered by beers ascending is generated
	
	
	Scenario: Sort by descending
	
	Given The user is on the Snippet Finder page
	When The user clicks view all
	When The user clicks order by beers
	Then A list of snippets ordered by beers descending is generated
	
	
	Scenario: Analyze a snippet
	
	Given The user is on the Snippet Finder page
	When The user clicks view all
	When The user clicks a snippet
	Then The url is review 
	
	
	
	
	