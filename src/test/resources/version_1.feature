Feature: test 1
Scenario: navigate and submit data
    Given I navigate to AutomationTutorials
    And click on "Sign Up Free" page
    Then I enter "emailAddress" as "spiderman@oscorp.com"
    Then I enter "password" as "2019"
    Then I enter "siteTitle" as "Kanchan"
    Then I close my browser