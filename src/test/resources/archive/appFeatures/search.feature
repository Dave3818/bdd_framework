@allenv
Feature: BesyBuy Search
  @test
  Scenario: Search a Apple Product
  Given I have a search field on Best Buy Page
  When I search for a product with name "Apple MacBook Pro" and price 1000
  Then Product with name Apple MacBook Pro should be displayed.
  Then click on the product

  @dev
  Scenario: Search a Microsoft Product
    Given I have a search field on Best Buy Page
    When I search for a product with name "Microsoft Surface" and price 1000
    Then Product with name Apple MacBook Pro should be displayed.

  @prod @test
  Scenario: Search a Asus Product
    Given I have a search field on Best Buy Page
    When I search for a product with name "ASUS VIVOBOOK" and price 1000
    Then Product with name Apple MacBook Pro should be displayed.