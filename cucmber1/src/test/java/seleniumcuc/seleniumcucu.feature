Feature: login
login credentials

Scenario Outline: login functionality

Given Enter the url "http://10.232.237.143:443/TestMeApp/login.htm"
When user enter "<username>" as username
When user enter "<password>" as password
Then user Logins to TestMeApp

Examples:
|username |password   |
|Lalitha  |password123|
|Saravana |saravana123|