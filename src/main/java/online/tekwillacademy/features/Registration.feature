Feature: Registration Flow

  @run1
Scenario: Access the Account page after successful registration
  Given The Home Page is accessed
  And RegisterOption is selected from the header drop-down
  And The register form is populated with valid data
  And Privacy Toggle is enabled
  When The continue Button is clicked
  Then The page URL contains the "success" keyword

  @run1
  Scenario: User remains on Register Page when registering without accepting the privacy
    Given The Home Page is accessed
    And RegisterOption is selected from the header drop-down
    And The register form is populated with valid data
    When The continue Button is clicked
    Then The page URL contains the "route=account/register&language=en-gb" keyword

@run1
  Scenario: User remains on Register Page when registering without accepting the mandatory fields
    Given The Home Page is accessed
    And RegisterOption is selected from the header drop-down
    And Privacy Toggle is enabled
    When The continue Button is clicked
    Then The page URL contains the "route=account/register&language=en-gb" keyword