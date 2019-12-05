Feature: Snippet Review

	Scenario: Rate a snippet
	
	Given The user is on the Snippet Review Page
	When The user clicks on beer rating
	Then The page says rating saved
	
	Scenario: Comment on a snippet
	
	Given The user is on the Snippet Review Page
	When The types into the comment paragraph 
	When The user presses save
	Then The page says comment saved
	
	