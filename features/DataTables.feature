
#Scenario Outline means that this Scenario will be executed "n" number of times where is the number of data set.
#{ This Scenario will be executed 3 times considering below example}

# Data Tables can be used WITH and WITHOUT headers
Feature:Verify Data Tables in Cucumber

  Scenario: Test Data Tables without headers via login on Jabong.com
    Given I am on Jabong homepage
    When I enter invalid credentials
      | customer1@gmail.com | Password@123 |
      | customer2@gmail.com | Password@123 |
      | customer3@gmail.com | Password@123 |
    And I hit Submit Button
    Then Error should be thrown


  Scenario: Test Data Tables with headers via login on Jabong.com
    Given I am on  homepage
    When I input invalid credentials
      |       UserName       |  Password    |
      | DataTable1@gmail.com | Password@123 |
      | DataTable2@gmail.com | Password@123 |
      | DataTable3@gmail.com | Password@123 |
    And press Submit Button
    Then Erros on Login form should be displayed