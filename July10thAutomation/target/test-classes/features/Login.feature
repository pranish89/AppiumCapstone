@Tag
Feature: Title of your feature
  I want to use this template for my feature file

 @webAppTest
  Scenario: Testing the login funcitonality of facebook application
    Given: user launches broswer
    When user attempts to login
    Then verify user had loggedIn

@MobileApp
  Scenario: Testing variables for the test cases
    Given user launches the application
    When user provides username "rakeshsinghraks" and password "hakonamatata"
    Then verify that the user is able to login to the application

@webAppTest
  Scenario: Testing the login funcitonality of facebook application
    Given: user launches broswer

    When user attempts to login
    Then verify user had loggedIn

  @outline @MobileApp
  Scenario Outline: parametertized test case
    Given: user launches broswer
    When user enters username as <username> and password as <password>
    Then verify user had loggedIn

    Examples: 
      | username         | password  |
      | rakeshsinghraks1 | password1 |
      | rakeshsinghraks2 | password2 |
      | rakeshsinghraks3 | password3 |
      | rakeshsinghraks4 | password4 |
      | rakeshsinghraks5 | passwor5  |
