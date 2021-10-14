Feature: User Registration
  Scenario: Register a new User
    Given User navigates to registration page
    When User enters following details
      | Dinesh | Matheswaran | dinesh@gmail.com | 1245 | San Antonio |
      | Pavithra | Siddardhan | pavi@gmail.com | 7878 | Irving |
      | Vignesh | Murugesan | vignesh@gmail.com | 9876 | Portland |
    Then User Registration should be successful

  Scenario: Register a new User with column Data
    Given User navigates to registration page with cols
    When User enters following details with columns
      |FirstName| LastName| Email | Phone | City |
      | Dinesh | Matheswaran | dinesh@gmail.com | 1245 | San Antonio |
      | Pavithra | Siddardhan | pavi@gmail.com | 7878 | Irving |
      | Vignesh | Murugesan | vignesh@gmail.com | 9876 | Portland |
    Then User Registration should be successful with cols