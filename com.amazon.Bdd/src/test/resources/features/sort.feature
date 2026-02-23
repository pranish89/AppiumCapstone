Feature: To sort the search results
@smoke
Scenario: Sort search results by price low to high
Given User naviagtes to the amazon home page
  When user searches for "iphone"
  And user sorts results by "Price: Low to High"
  Then search results should be displayed