
#Scenario Outline means that this Scenario will be executed "n" number of times where is the number of data set.
#{ This Scenario will be executed 3 times considering below example}

Feature: Verify Data Tables feature
 Verify If user can successfully login post entering valid credentials
  Scenario: Login to Gmail with multiple users
    Given I am on CW homepage
    When I will login with Username and Password
      | custom37@gmail.com | password |
      | custom34@gmail.com | password |
      | custom35@gmail.com | password |
    And I will click on Sign button
    Then Verify that user lands  homepage

  @manual
  @manual-result:passed
  Scenario: Test Manual reporting on Serenity Reporting
    Given Test Manual Scenario
    When Test Manual Scenario
    And Test Manual Scenario
    Then Test Manual Scenario