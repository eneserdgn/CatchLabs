@TM
Feature: Transfer Money Cases

  @TM1
  Scenario Outline: TM1 - Money transfers should be possible between all accounts
    Given User open app with Username: "enes.erdogan" and Password: "Enes.1995"
    When General, Click, Transfer Money Button
    And Popup, Click List Item, Receiver Account: "<receiverAccount>"
    And Popup, SendKeys, Transfer Amount: "<amount>"
    And Popup, Click, Send Button
    Then Transactions, Check Text, Last Receiver: "<receiverAccount>"
    And Transactions, Check Text, Last Amount: "<amount>"
    Examples:
      | receiverAccount | amount |
      | Testinium-1     | 100    |
      | Testinium-2     | 100    |
      | Testinium-3     | 100    |
      | Testinium-4     | 100    |
      | Testinium-5     | 100    |
