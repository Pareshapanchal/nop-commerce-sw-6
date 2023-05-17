@smoke@regression
Feature: HomePage Test
  As user I want to Register with into nop commerce website and login successfully on the website
  Scenario: User should Register on the NopCommerce website sucessfully
    Given I am Homepage and verify nopCommerce logo
    When  I click on Register link
    And   I verify "Register" title
    And   I enters following users details
      |Female| diya  |Patel |2 |February|2001|diay@gmail.com|diya123|diya123  |
    And   I click on Register Button
    Then  I verify "Your registration completed" message
@sanity@regression
  Scenario: User should Login successfully with valid credential to the NopCommerce website
      Given I am homepage
      When I click on Login Link
      And  I verify "Welcome, Please Sign In!"
      And  I enters following users login details
      |siya21@gmail.com|siya123|
      Then I click on Login Button

