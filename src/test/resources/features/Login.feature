Feature: Login section

  @Smoketest
  Scenario Outline: Login to Facebook - passed

    Given I am on the Chrome search page
    When I enter "Facebook" in search field, run search, click login to Facebook
    And  enter "<username>" and "<password>" to login
    Then I should see "<url>" contains

  Examples:
    |      username                |   password       | url  |
    |  mokina.workbench@gmail.com  |   Welcom_e654321 |   https://www.facebook.com/?sk=welcome  |




  Scenario Outline: Login to Facebook - failed to login

    Given I am on the Chrome search page
    When I enter "Facebook" in search field, run search, click login to Facebook
    And  enter "<username>" and "<password>" to login
    Then I should see url contains "<test>"

  Examples:
  |      username                |   password       | test  |
  |  mokina.workbench@gmail.com  |   Welcom         | Вы ввели неверный пароль. Забули пароль? |
  |  mokina.work@gmail.com       |   Welcome1       | Указана електронна адреса не відповідає жодному обліковому запису. Зареєструйте новий обліковий запис. |


