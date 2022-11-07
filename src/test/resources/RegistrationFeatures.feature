Feature: Registration Features

  @Registration
  Scenario:Register account
    Given i am on registration page
    And  i entered my details
    When i click on register
    Then i should get 'Your registration completed' message
