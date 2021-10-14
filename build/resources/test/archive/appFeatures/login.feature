Feature: SwagLabs
  Scenario: Login to SwagLab
  Given I have launched Swaglab "url"
  When I entered the "username" and "password" credentials
  Then Swaglab home page should be displayed.
