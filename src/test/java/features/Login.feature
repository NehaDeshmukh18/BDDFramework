Feature:
  As a user
  I want to be able to add new clients in the system
  So that i can add accounting data for that client

  Scenario: Sign in to FREE CRM Application
    Given the user is on landing page
    When she chooses to sign in
    Then she should be logged in to the application