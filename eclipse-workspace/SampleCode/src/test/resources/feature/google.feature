Feature: visit search page in google
Scenario Outline: search for a text and select any result.
@regression @smoke
#test for search
Given the user navigates to "<urlToLuanch>"
When i search for "<searchText>"
Then i am able to select any result.
Examples:
| urlToLuanch | searchText |
| www.google.com | text |