@ADD
Feature: Add Money Cases

  @ADD1
  Scenario: ADD1 - Areas cannot be blank
    Given User open app with Username: "enes.erdogan" and Password: "Enes.1995"
    When General, Click, Add Money Button
    And Popup, Click, Add Button
    Then Popup, Check Text, Card Number Required: "Required"
    And Popup, Check Text, Card Holder Required: "Required"
    And Popup, Check Text, Expiry Date Required: "Required"
    And Popup, Check Text, CVV Required: "Required"
    And Popup, Check Text, Add Money Amount Required: "Required"

  @ADD2
  Scenario: ADD2 - A String cannot be entered in Amount
    Given User open app with Username: "enes.erdogan" and Password: "Enes.1995"
    When General, Click, Add Money Button
    And Popup, SendKeys, Card Number: "1234123412341234"
    And Popup, SendKeys, Card Holder: "Enes Erdogan"
    And Popup, SendKeys, Expiry Date: "1026"
    And Popup, SendKeys, CVV: "110"
    And Popup, SendKeys, Add Money Amount: "Enes"
    And Popup, Click, Add Button
    Then Popup, Check Text, Add Money Amount Required: "amount must be a "

  @ADD3
  Scenario: ADD3 - Successfully update Account Name
    Given User open app with Username: "enes.erdogan" and Password: "Enes.1995"
    When General, Click, Add Money Button
    And Popup, SendKeys, Card Number: "1234123412341234"
    And Popup, SendKeys, Card Holder: "Enes Erdogan"
    And Popup, SendKeys, Expiry Date: "1026"
    And Popup, SendKeys, CVV: "110"
    And Popup, SendKeys, Add Money Amount: "100"
    And Popup, Click, Add Button
    Then Transactions, Check Text, Last Sender: "Enes Erdogan"
    And Transactions, Check Text, Last Amount: "100"

