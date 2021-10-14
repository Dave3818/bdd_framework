@allenv
Feature: BesyBuy Order details

  Background:
    Given User is already best buy member
    Given User is on best buy login page
    When User enters username
    And User enters password
    And User clicks on login
    Then User navigates to order page

  Scenario: Check order status
    When User click on order status
    Then Order summary is displayed

  Scenario: Check order delivery date
    When User click on order date
    Then Order delivery date is displayed

  Scenario: Check order shipping address
    When User click on order shipping address
    Then Order shipping address is displayed
