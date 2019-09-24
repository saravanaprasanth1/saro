Feature: Test Calculator
This file describes calculator functionality

@sanity @smoke
Scenario: Add two numbers
Given I enter 50 in this calculator
And I press add
And I have entered 50 in this calculator  
When I press equal symbol
Then The result should be 100 on the screen 


@sanity
Scenario: sub two numbers
Given I enter 40 in this calculator
And I press add
And I have entered 50 in this calculator
When I press equal symbol
Then The result should be 100 on the screen