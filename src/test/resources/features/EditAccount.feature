@EA
Feature: Edit Account Cases

  @EA1
  Scenario: EA1 - Account Name cannot be blank
    Given User open app with Username: "enes.erdogan" and Password: "Enes.1995"
    When General, Click, Edit Account Button
    Then Popup, Check Text, Title: "Edit account"
    When Popup, Clear, Account Name
    Then Popup, Should See, Disable Update Button

  @EA2
  Scenario: EA2 - A Number cannot be entered in Account Name
    Given User open app with Username: "enes.erdogan" and Password: "Enes.1995"
    When General, Click, Edit Account Button
    Then Popup, Check Text, Title: "Edit account"
    When Popup, SendKeys, Account Name: "1234"
    Then Popup, Should See, Disable Update Button

  @EA3
  Scenario: EA3 - Successfully update Account Name
    Given User open app with Username: "enes.erdogan" and Password: "Enes.1995"
    When General, Click, Edit Account Button
    Then Popup, Check Text, Title: "Edit account"
    When Popup, Clear, Account Name
    And Popup, SendKeys, Random Account Name
    And Popup, Click, Update Button
    Then My Account, Check Text, Random Account Name

