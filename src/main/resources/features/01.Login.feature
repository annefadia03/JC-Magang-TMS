Feature: Login User Admin
  Scenario: Admin successful login into web TMS
    Given Admin open browser and url
    When Admin enter valid username
    And Admin enter valid password
    And Admin click button login
    Then Admin go to page Dashboard

  Scenario: Admin invalid Login into web TMS
    When Admin click button logout
    And Admin enter invalid username
    And Admin enter invalid password
    And Admin click button login
    Then Admin get message invalid credential

#    user staff 1
  Scenario: User Staff1 Valid Login into web TMS
    And User staff1 enter valid username
    And User staff1 enter valid password
    And User staff1 click button login
    Then User staff1 go to page Dashboard

#    user staff 2
  Scenario: User Staff2 Valid Login into web TMS
    When User staff1 click button logout
    And User staff2 enter valid username
    And User staff2 enter valid password
    And User staff2 click button login
    Then User staff2 go to page Dashboard

#    user staff 3
  Scenario: User Staff3 Valid Login into web TMS
    When User staff2 click button logout
    And User staff3 enter valid username
    And User staff3 enter valid password
    And User staff3 click button login
    Then User staff3 go to page Dashboard

#    user staff 4
  Scenario: User Staff4 Valid Login into web TMS
    When User staff3 click button logout
    And User staff4 enter valid username
    And User staff4 enter valid password
    And User staff4 click button login
    Then User staff4 go to page Dashboard

#    user staff 5
  Scenario: User Staff5 Valid Login into web TMS
    When User staff4 click button logout
    And User staff5 enter valid username
    And User staff5 enter valid password
    And User staff5 click button login
    Then User staff5 go to page Dashboard

#    user staff nul password
  Scenario: User staff invalid null password login into web TMS
    When User staff5 click button logout
    And User enter valid username
    And User enter null password
    And User click button login
    Then User get message invalid null

#    user staff nul username
  Scenario:User staff invalid null username login into web TMS
    And User enter null username
    And User staff enter password
    And Staff click button login
    Then User get message invalid login

#    user staff nul password dan null username
  Scenario:User staff invalid null username dan null password login into web TMS
    And User enter null username
    And Staff enter null password
    And User Staff click button login
    Then User Staff get message invalid login

#    user admin input invalid password
  Scenario:User Admin invalid password login into web TMS
    And Admin1 enter valid username
    And Admin1 enter invalid password
    And User Admin1 click button login
    Then Admin1 get message invalid credential

#    user admin input invalid username dan password
  Scenario:User Admin invalid login into web TMS
    And Admin2 enter invalid username
    And Admin2 enter invalid password
    And User Admin2 click button login
    Then Admin2 get message invalid credential

#    user admin input null password
  Scenario:User Admin input null password login into web TMS
    And Admin3 enter username
    And Admin3 enter null password
    And User Admin3 click button login
    Then User Admin3 get message invalid login

#  user admin input null username
  Scenario:User Admin input null username login into web TMS
    And Admin4 enter null username
    And Admin4 enter password
    And User Admin4 click button login
    Then User Admin4 get message invalid login

