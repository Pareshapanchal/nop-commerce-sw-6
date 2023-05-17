Feature: Computer Page Test
 @smoke@regression
  Scenario:verify Product Arrange In AlphaBatical Order
    Given I am on the Homepage
    When  I click on Computer Menu
    And   I click on Desktop
    And   I select Sort By position "Name: Z to A"
    Then  I verify the Product will arrange in Descending order
   @sanity@regression
  Scenario:Verify Product Added To ShoppingCart SuccessFully
    Given I am on the homepage computer
    When  I click on Computer Menu
    And   I click on Desktops
    And   I select Sort By position "Name: A to Z"
    And   I click on "Add To Cart" on Desktops page
    And   I verify the Text "Build your own computer"
    And   I select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    And   I select Ram "8GB [+$60.00]"
    And   I select HDD radio "400 GB [+$100.00]"
    And   I select OS radio "Vista Premium [+$60.00]"
    And   I click on two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
    And   I verify the price "$1,470.00"
    And   I click on "ADD TO CARD" Button on Buildyourownpage
    And   I verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
    And   I mouseHover on "Shopping cart" and Click on "GO TO CART" button
    And   I verify the message "Shopping cart"
    And   I change the Qty to "2" and Click on "Update shopping cart"
    And   I verify the Total "$2,960.00"
    And   I click on checkbox “I agree with the terms of service”
    And   I click on “CHECKOUT”
    And   I verify the Text “Welcome, Please Sign In!”
    And   I click on “CHECKOUT AS GUEST” Tab
    And   I Fill the all mandatory field
    |jayna|joshi|jayjoshi1234@gmail.com|India|Ahmedabad|3,SamaRoad|40056|91258654423|
    And   I click on “CONTINUE” on Billing Address
    And   I click on Radio Button "Next Day Air($0.00)" Computer page
    And   I click on “CONTINUE” on shipping method Computer page
    And   I select Radio Button "Credit Card" Computer page
    And   I click on Continue button on Payment method page on Computer page
    And   I select “Master card” From Select credit card dropdown
    And   I Fill all the details
    |Jayna Joshi |5499038136272371|04|2026|123|
    And   I click on “CONTINUE” on Payment information
    And   I verify “Payment Method: Credit Card”
    And   I verify “Shipping Method: Next Day Air”
    And   I verify Total is "$2,950.00"
    And   I click on “CONFIRM”
    And   I verifythe Text "Thank you"
    And   I verifythe message "Your order has been successfully processed!"
    And   I click on “CONTINUE” on Thank you page
    And   I verify "Welcome to our store" text