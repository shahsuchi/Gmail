Feature: Google Search feature
  I want to use this template for my feature file

  Scenario: Validate Gmail Login and email service
    Given Open chrome Browser
    And Enter Gmail URL
    And Enter Username
    And Enter Password
    And SignIn button
    Then Click on Compose Mail
    And Add To Email
    And Add Subject Line
    And Add Email Body
    And Click on Send Button
