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
  @SmokeTest
  Feature: Duplicate feature
  @SanityTest
  Scenario: Login functionality exists
    Given A am Sankalp
    When I want to open Google
    Then Verify Loginn button

#Step Definitions include the business flow and is not responsible for nay of the Configurations
#Therefore it is defined in Feature File and Before Hook generally includes reporting work and and browser configurations

  #Background: User is Logged In
    #Given I navigate to the login page
    #When I submit username and password
    #Then I should be logged in


