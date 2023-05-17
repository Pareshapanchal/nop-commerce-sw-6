Feature: Electronics Page Test
 @sanity@regression
  Scenario:  verifyUserShouldNavigateToCellPhonesPageSuccessfully
    Given I am homepage
    When  I Mouse Hover on “Electronics” Tab
    And   I Mouse Hover on “Cell phones” and click
    Then  I Verify the text “Cell phones”
  @smoke@regression
  Scenario: verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully
    Given I am homepage
    When  I Mouse Hover on “Electronics” Tab
    And   I Mouse Hover on “Cell phones” and click
    And   I Verify the text “Cell phones”
    And   I click on List View Tab
    And   I click on product name “Nokia Lumia 1020” link
    And   I verify the text "Nokia Lumia 1020"
    And   I verify Nokia Lumia price "$349.00"
    And   I change quantity to "2"
    And   I click on “ADD TO CART” tab
    And   I verify the Message "The product has been added to your shopping cart" on Top  green Bar  After that close the bar clicking on the cross button.
    And   I mouseHover on "Shopping cart" and Click on "GO TO CART" button.
    And   I verify the message "Shopping cart" on shoppingcart page
    And   I verify the quantity is "2"
    And   I verify the Total "$698.00" on shopping cart page
    And   I click on checkbox "I agree with the terms of service"
    And   I click on "CHECKOUT"
    And   I verify the Text "Welcome, Please Sign In!" on homepage
    And   I click on “REGISTER” tab
    And   I verify the text "Register" on Register page
    And   I fill the mandatory fields
      | Shreya | Shah |shital1@gmail.com|shreya123|shreya123|
    And   I click on “REGISTER” Button
    And   I verify the message "Your registration completed" on next page
    And   I click on “CONTINUE” button
    And   I verify the text "Shopping cart" on next page
    And   I click on Login Link next
    And   I fill the mandatory fields on the login page
      |shital1@gmail.com|shreya123|shreya123|
    And   I click on Login Button on the login page
    And   I click on checkbox "I agree with the terms of service" after login
    And   I click on “CHECKOUT” button
    And   I fill the Mandatory fields on Billing page
    |India|Ahmedabad|3,Rivera 20|56982|9125468902|
    And   I click on “CONTINUE” on BIlling page
    And   I click on Radio Button "2nd Day Air ($0.00)" Electronics Page
    And   I click on “CONTINUE” on Shipping page Electronics page
    And   I select Radio Button “Credit Card” on Payment Method Electronics page
    And   I click on Continue button on Payment method page Electronics page
    And   I select “Visa” From Select credit card dropdown
    And   I fill all the details
      |Jayna Joshi |5499038136272371|04|2026|123|
    And   I click on “CONTINUE” on Payment info page
    And   I verify “Payment Method” is “Credit Card”
    And   I verify “Shipping Method” is “2nd Day Air”
    And   I verify Total is "$698.00" electronics page
    And   I click on “CONFIRM” button
    And   I verify the Text "Thank you" electronics page
    And   I verify the message "Your order has been successfully processed!" electronics page
    And   I click on “CONTINUE” on odrer complete page
    And   I verify the text "Welcome to our store" after completing order
    And   I click on “Logout” link
    And   I verify the URL is “https://demo.nopcommerce.com/”
