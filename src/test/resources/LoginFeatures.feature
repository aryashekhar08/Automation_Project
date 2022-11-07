Feature: Login Features

  @login
  Scenario: Login with valid credentials
    Given When i entered url i am on login page
    When When i entered my "<Username>" and "<Password>"
    Then I should Successfully logged in
