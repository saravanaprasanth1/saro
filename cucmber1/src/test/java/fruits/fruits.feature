Feature:Eating fruits
This feature explains about fruits
 
 Scenario Outline: Eating
 Given There are "<Start>" fruits
 
  | type     | with |
  | apples   | me   |
  | oranges  | mary | 
  | cucumbers| john |
  
  When I eat "<eat>" fruits
  Then I have "<left>" fruits
  
  Examples:
  
  |Start | eat | left|
  | 12   |  5  | 7   |
  | 10   |   4 | 6   |
 