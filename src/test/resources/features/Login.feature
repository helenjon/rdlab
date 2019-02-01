Feature: Login section



  Scenario: Login to Facebook

    Given I am on the Chrome search page
    When I enter "Facebook" in search field, run search, click login to Facebook
    And  enter "username" and "password" to login
    Then I should see url contains