@F1
Feature: Validating login functionality of adactin webpage

  @reg
  Scenario: validating login with invalid username and valid password
    Given user is on Adactin page
    When user should enter invalid username and valid password
    And User should click login button
    Then user should validate

  @smoke
  Scenario: Validating login with valid username and invalidpassword
    Given user is on Adactin page
    When user need to enter valid username and invalid password
    And User should click login button
    Then user should validate

  @sanity
  Scenario: Validating login with blank username and blank password
    Given user is on Adactin page
    When user need to enter blank username and blank password
    And User should click login button
    Then user should validate

  @E2E
  Scenario: Validating login with blank username and valid password
    Given user is on Adactin page
    When user need to enter blank username and valid password
    And User should click login button
    Then user should validate
