#Background: List of steps run before each of the scenarios in a Feature

Feature: Jabong Login Functionality
  Scenario: Login to Jabong.com
   Given I am a registered User with Jabong.com
    When I click on Sign In
    And  I enter valid credentials
    Then I am successfully logged in


  @manual
  @manual-result:passed
  @manual-last-tested:sprint-15
  Scenario: Manual scenario reported in Serenity without implementing steps
    Given Manual Step 1
    When Manual Step 2
    And  Manual Step 3
    Then Manual step 4