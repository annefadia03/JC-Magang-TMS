Feature: Login User Admin
  Scenario: Admin successful login into web TMS
    Given Admin open browser and url
    When Admin enter valid username
    And Admin enter valid password
    And Admin click button login
    Then Admin go to page Dashboard

  Scenario: User invalid Login into web TMS
    When User click button logout
    And User enter invalid username
    And User enter invalid password
    Then User get message invalid credential