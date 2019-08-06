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
#SGROVER -- December 31st 2017
#Scenario Outline means that this Scenario will be executed "n" number of times where is the number of data set.
#{ This Scenario will be executed 3 times considering below example}
Feature: Verify Scenario Outline feature

  Scenario Outline: Login to Gmail with multiple users
    Given I am on Gmail homepage
    When I will login with Username "<username>" and Password "<password>"
    And I will click on Submit button
    Then Verify that user lands onto homepage

    #Example tables can be tagged
    @abc
    Examples: 
      | username           | password |
      | custom37@gmail.com | password |
      | custom34@gmail.com | password |
      | custom35@gmail.com | password |

    Examples: 
      | username           | password |
      | custom37@gmail.com | password |
      | custom34@gmail.com | password |
      | custom35@gmail.com | password |

