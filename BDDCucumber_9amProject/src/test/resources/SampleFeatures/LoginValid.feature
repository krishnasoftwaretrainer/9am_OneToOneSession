Feature: SwagLabs Signup
Scenario: Valid Login on SwagLabs
    Given The user is on the signup page
    When The user enters a username "standard_user" and user enters a password "secret_sauce"
    And The user clicks the signup button
    Then The user should see a signup successful alert
