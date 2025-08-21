#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login

 Background: The User opens login Page
 Given User Launches Chrome Browser
 When User opens facebook  portal link
 Then User should see the  page title

Scenario Outline: Validating the Login functionality
    When User enters Username as "<username>" and Password as "<password>" 
    Then User clicks on Login button with expected status as "<status>"
    Then User should see the Facebook Home page on successful login status "<status>"
    
 Examples:
    | username | password   | status      |
    |          |            | Both Fail |
    | Valid    |            | Missing Password |    
    | Valid    | Valid      | Pass        |