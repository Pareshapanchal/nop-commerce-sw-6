$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("computer.feature");
formatter.feature({
  "line": 1,
  "name": "Computer Page Test",
  "description": "",
  "id": "computer-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4171443200,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "verify Product Arrange In AlphaBatical Order",
  "description": "",
  "id": "computer-page-test;verify-product-arrange-in-alphabatical-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on the Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on Computer Menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on Desktop",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I select Sort By position \"Name: Z to A\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify the Product will arrange in Descending order",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerPageSteps.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 50226200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnComputerMenu()"
});
formatter.result({
  "duration": 161631100,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnDesktop()"
});
formatter.result({
  "duration": 1072954700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name: Z to A",
      "offset": 27
    }
  ],
  "location": "ComputerPageSteps.iSelectSortByPosition(String)"
});
formatter.result({
  "duration": 1114397000,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iVerifyTheProductWillArrangeInDescendingOrder()"
});
formatter.result({
  "duration": 70880500,
  "status": "passed"
});
formatter.after({
  "duration": 581950500,
  "status": "passed"
});
formatter.before({
  "duration": 2042926600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify Product Added To ShoppingCart SuccessFully",
  "description": "",
  "id": "computer-page-test;verify-product-added-to-shoppingcart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@sanity"
    },
    {
      "line": 9,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on the homepage computer",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on Computer Menu",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click on Desktops",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select Sort By position \"Name: A to Z\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on \"Add To Cart\" on Desktops page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify the Text \"Build your own computer\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select \"2.2 GHz Intel Pentium Dual-Core E2200\" using Select class",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select Ram \"8GB [+$60.00]\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select HDD radio \"400 GB [+$100.00]\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select OS radio \"Vista Premium [+$60.00]\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on two Check boxes \"Microsoft Office [+$50.00]\" and \"Total Commander[+$5.00]\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify the price \"$1,470.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on \"ADD TO CARD\" Button on Buildyourownpage",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I verify the Message \"The product has been added to your shopping cart\" on Top green Bar After that close the bar clicking on the cross button.",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I mouseHover on \"Shopping cart\" and Click on \"GO TO CART\" button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I verify the message \"Shopping cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I change the Qty to \"2\" and Click on \"Update shopping cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I verify the Total \"$2,960.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click on checkbox “I agree with the terms of service”",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on “CHECKOUT”",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I verify the Text “Welcome, Please Sign In!”",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on “CHECKOUT AS GUEST” Tab",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I Fill the all mandatory field",
  "rows": [
    {
      "cells": [
        "jayna",
        "joshi",
        "jayjoshi1234@gmail.com",
        "India",
        "Ahmedabad",
        "3,SamaRoad",
        "40056",
        "91258654423"
      ],
      "line": 34
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on “CONTINUE” on Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on Radio Button \"Next Day Air($0.00)\" Computer page",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click on “CONTINUE” on shipping method Computer page",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I select Radio Button \"Credit Card\" Computer page",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click on Continue button on Payment method page on Computer page",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I select “Master card” From Select credit card dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I Fill all the details",
  "rows": [
    {
      "cells": [
        "Jayna Joshi",
        "5499038136272371",
        "04",
        "2026",
        "123"
      ],
      "line": 42
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I click on “CONTINUE” on Payment information",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I verify “Payment Method: Credit Card”",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I verify “Shipping Method: Next Day Air”",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I verify Total is \"$2,950.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I click on “CONFIRM”",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I verifythe Text \"Thank you\"",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I verifythe message \"Your order has been successfully processed!\"",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I click on “CONTINUE” on Thank you page",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I verify \"Welcome to our store\" text",
  "keyword": "And "
});
formatter.match({
  "location": "ComputerPageSteps.iAmOnTheHomepageComputer()"
});
formatter.result({
  "duration": 19200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnComputerMenu()"
});
formatter.result({
  "duration": 141681400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnDesktops()"
});
formatter.result({
  "duration": 987421300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name: A to Z",
      "offset": 27
    }
  ],
  "location": "ComputerPageSteps.iSelectSortByPosition(String)"
});
formatter.result({
  "duration": 1125591900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add To Cart",
      "offset": 12
    }
  ],
  "location": "ComputerPageSteps.iClickOnOnDesktopsPage(String)"
});
formatter.result({
  "duration": 1078451100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Build your own computer",
      "offset": 19
    }
  ],
  "location": "ComputerPageSteps.iVerifyTheText(String)"
});
formatter.result({
  "duration": 1146076300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2.2 GHz Intel Pentium Dual-Core E2200",
      "offset": 10
    }
  ],
  "location": "ComputerPageSteps.iSelectUsingSelectClass(String)"
});
formatter.result({
  "duration": 73176200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8GB [+$60.00]",
      "offset": 14
    }
  ],
  "location": "ComputerPageSteps.iSelectRam(String)"
});
formatter.result({
  "duration": 57370800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400 GB [+$100.00]",
      "offset": 20
    }
  ],
  "location": "ComputerPageSteps.iSelectHDDRadio(String)"
});
formatter.result({
  "duration": 1082406900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vista Premium [+$60.00]",
      "offset": 19
    }
  ],
  "location": "ComputerPageSteps.iSelectOSRadio(String)"
});
formatter.result({
  "duration": 68485300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Microsoft Office [+$50.00]",
      "offset": 28
    },
    {
      "val": "Total Commander[+$5.00]",
      "offset": 61
    }
  ],
  "location": "ComputerPageSteps.iClickOnTwoCheckBoxesAnd(String,String)"
});
formatter.result({
  "duration": 1110810100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,470.00",
      "offset": 20
    }
  ],
  "location": "ComputerPageSteps.iVerifyThePrice(String)"
});
formatter.result({
  "duration": 26586800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADD TO CARD",
      "offset": 12
    }
  ],
  "location": "ComputerPageSteps.iClickOnButtonOnBuildyourownpage(String)"
});
formatter.result({
  "duration": 45925000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The product has been added to your shopping cart",
      "offset": 22
    }
  ],
  "location": "ComputerPageSteps.iVerifyTheMessageOnTopGreenBarAfterThatCloseTheBarClickingOnTheCrossButton(String)"
});
formatter.result({
  "duration": 1102642600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 17
    },
    {
      "val": "GO TO CART",
      "offset": 46
    }
  ],
  "location": "ComputerPageSteps.iMouseHoverOnAndClickOnButton(String,String)"
});
formatter.result({
  "duration": 1598120300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 22
    }
  ],
  "location": "ComputerPageSteps.iVerifyTheMessage(String)"
});
formatter.result({
  "duration": 34644500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    },
    {
      "val": "Update shopping cart",
      "offset": 38
    }
  ],
  "location": "ComputerPageSteps.iChangeTheQtyToAndClickOn(String,String)"
});
formatter.result({
  "duration": 1682623300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$2,960.00",
      "offset": 20
    }
  ],
  "location": "ComputerPageSteps.iVerifyTheTotal(String)"
});
formatter.result({
  "duration": 39560500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnCheckboxIAgreeWithTheTermsOfService()"
});
formatter.result({
  "duration": 101026700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnCHECKOUT()"
});
formatter.result({
  "duration": 548449300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iVerifyTheTextWelcomePleaseSignIn()"
});
formatter.result({
  "duration": 41153300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnCHECKOUTASGUESTTab()"
});
formatter.result({
  "duration": 667362600,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iFillTheAllMandatoryField(DataTable)"
});
formatter.result({
  "duration": 3882390300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnCONTINUEOnBillingAddress()"
});
formatter.result({
  "duration": 91832300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Next Day Air($0.00)",
      "offset": 25
    }
  ],
  "location": "ComputerPageSteps.iClickOnRadioButtonComputerPage(String)"
});
formatter.result({
  "duration": 1101101200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnCONTINUEOnShippingMethodComputerPage()"
});
formatter.result({
  "duration": 2080575100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Credit Card",
      "offset": 23
    }
  ],
  "location": "ComputerPageSteps.iSelectRadioButtonComputerPage(String)"
});
formatter.result({
  "duration": 2083927900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnContinueButtonOnPaymentMethodPageOnComputerPage()"
});
formatter.result({
  "duration": 1087968500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iSelectMasterCardFromSelectCreditCardDropdown()"
});
formatter.result({
  "duration": 344027500,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iFillAllTheDetails(DataTable)"
});
formatter.result({
  "duration": 589617200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnCONTINUEOnPaymentInformation()"
});
formatter.result({
  "duration": 89346400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iVerifyPaymentMethodCreditCard()"
});
formatter.result({
  "duration": 310026700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iVerifyShippingMethodNextDayAir()"
});
formatter.result({
  "duration": 38891500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$2,950.00",
      "offset": 19
    }
  ],
  "location": "ComputerPageSteps.iVerifyTotalIs(String)"
});
formatter.result({
  "duration": 36661400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnCONFIRM()"
});
formatter.result({
  "duration": 67940200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you",
      "offset": 18
    }
  ],
  "location": "ComputerPageSteps.iVerifytheText(String)"
});
formatter.result({
  "duration": 812601200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order has been successfully processed!",
      "offset": 21
    }
  ],
  "location": "ComputerPageSteps.iVerifytheMessage(String)"
});
formatter.result({
  "duration": 33582200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnCONTINUEOnThankYouPage()"
});
formatter.result({
  "duration": 476837400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to our store",
      "offset": 10
    }
  ],
  "location": "ComputerPageSteps.iVerifyText(String)"
});
formatter.result({
  "duration": 31128600,
  "status": "passed"
});
formatter.after({
  "duration": 596182900,
  "status": "passed"
});
formatter.uri("electronics.feature");
formatter.feature({
  "line": 1,
  "name": "Electronics Page Test",
  "description": "",
  "id": "electronics-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3629024100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "verifyUserShouldNavigateToCellPhonesPageSuccessfully",
  "description": "",
  "id": "electronics-page-test;verifyusershouldnavigatetocellphonespagesuccessfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I Mouse Hover on “Electronics” Tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I Mouse Hover on “Cell phones” and click",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I Verify the text “Cell phones”",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmHomepage()"
});
formatter.result({
  "duration": 62600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iMouseHoverOnElectronicsTab()"
});
formatter.result({
  "duration": 148765000,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iMouseHoverOnCellPhonesAndClick()"
});
formatter.result({
  "duration": 900559700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyTheTextCellPhones()"
});
formatter.result({
  "duration": 20308300,
  "status": "passed"
});
formatter.after({
  "duration": 583090800,
  "status": "passed"
});
formatter.before({
  "duration": 3121585500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully",
  "description": "",
  "id": "electronics-page-test;verifythattheproductaddedsuccessfullyandplaceordersuccessfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    },
    {
      "line": 8,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I Mouse Hover on “Electronics” Tab",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I Mouse Hover on “Cell phones” and click",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Verify the text “Cell phones”",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on List View Tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on product name “Nokia Lumia 1020” link",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify the text \"Nokia Lumia 1020\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I verify Nokia Lumia price \"$349.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I change quantity to \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on “ADD TO CART” tab",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I verify the Message \"The product has been added to your shopping cart\" on Top  green Bar  After that close the bar clicking on the cross button.",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I mouseHover on \"Shopping cart\" and Click on \"GO TO CART\" button.",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify the message \"Shopping cart\" on shoppingcart page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I verify the quantity is \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I verify the Total \"$698.00\" on shopping cart page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on checkbox \"I agree with the terms of service\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on \"CHECKOUT\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify the Text \"Welcome, Please Sign In!\" on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on “REGISTER” tab",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I verify the text \"Register\" on Register page",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I fill the mandatory fields",
  "rows": [
    {
      "cells": [
        "Shreya",
        "Shah",
        "shital1@gmail.com",
        "shreya123",
        "shreya123"
      ],
      "line": 31
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on “REGISTER” Button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I verify the message \"Your registration completed\" on next page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on “CONTINUE” button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I verify the text \"Shopping cart\" on next page",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on Login Link next",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I fill the mandatory fields on the login page",
  "rows": [
    {
      "cells": [
        "shital1@gmail.com",
        "shreya123",
        "shreya123"
      ],
      "line": 38
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click on Login Button on the login page",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click on checkbox \"I agree with the terms of service\" after login",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on “CHECKOUT” button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I fill the Mandatory fields on Billing page",
  "rows": [
    {
      "cells": [
        "India",
        "Ahmedabad",
        "3,Rivera 20",
        "56982",
        "9125468902"
      ],
      "line": 43
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I click on “CONTINUE” on BIlling page",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I click on Radio Button \"2nd Day Air ($0.00)\" Electronics Page",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I click on “CONTINUE” on Shipping page Electronics page",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I select Radio Button “Credit Card” on Payment Method Electronics page",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I click on Continue button on Payment method page Electronics page",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I select “Visa” From Select credit card dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I fill all the details",
  "rows": [
    {
      "cells": [
        "Jayna Joshi",
        "5499038136272371",
        "04",
        "2026",
        "123"
      ],
      "line": 51
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I click on “CONTINUE” on Payment info page",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I verify “Payment Method” is “Credit Card”",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I verify “Shipping Method” is “2nd Day Air”",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I verify Total is \"$698.00\" electronics page",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I click on “CONFIRM” button",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I verify the Text \"Thank you\" electronics page",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I verify the message \"Your order has been successfully processed!\" electronics page",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "I click on “CONTINUE” on odrer complete page",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "I verify the text \"Welcome to our store\" after completing order",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I click on “Logout” link",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "I verify the URL is “https://demo.nopcommerce.com/”",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iAmHomepage()"
});
formatter.result({
  "duration": 25800,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iMouseHoverOnElectronicsTab()"
});
formatter.result({
  "duration": 139697500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iMouseHoverOnCellPhonesAndClick()"
});
formatter.result({
  "duration": 1005857200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyTheTextCellPhones()"
});
formatter.result({
  "duration": 23548800,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnListViewTab()"
});
formatter.result({
  "duration": 1066734400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1020",
      "offset": 37
    }
  ],
  "location": "ElectronicsSteps.iClickOnProductNameNokiaLumiaLink(int)"
});
formatter.result({
  "duration": 2240572000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nokia Lumia 1020",
      "offset": 19
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheText(String)"
});
formatter.result({
  "duration": 18192700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$349.00",
      "offset": 28
    }
  ],
  "location": "ElectronicsSteps.iVerifyNokiaLumiaPrice(String)"
});
formatter.result({
  "duration": 14780900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 22
    }
  ],
  "location": "ElectronicsSteps.iChangeQuantityTo(String)"
});
formatter.result({
  "duration": 102649400,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnADDTOCARTTab()"
});
formatter.result({
  "duration": 52561000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The product has been added to your shopping cart",
      "offset": 22
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheMessageOnTopGreenBarAfterThatCloseTheBarClickingOnTheCrossButton(String)"
});
formatter.result({
  "duration": 2076467300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 17
    },
    {
      "val": "GO TO CART",
      "offset": 46
    }
  ],
  "location": "ElectronicsSteps.iMouseHoverOnAndClickOnButton(String,String)"
});
formatter.result({
  "duration": 3062284800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 22
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheMessageOnShoppingcartPage(String)"
});
formatter.result({
  "duration": 2031112400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 26
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheQuantityIs(String)"
});
formatter.result({
  "duration": 26316000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$698.00",
      "offset": 20
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheTotalOnShoppingCartPage(String)"
});
formatter.result({
  "duration": 19811100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I agree with the terms of service",
      "offset": 21
    }
  ],
  "location": "ElectronicsSteps.iClickOnCheckbox(String)"
});
formatter.result({
  "duration": 50582800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CHECKOUT",
      "offset": 12
    }
  ],
  "location": "ElectronicsSteps.iClickOn(String)"
});
formatter.result({
  "duration": 588158800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome, Please Sign In!",
      "offset": 19
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheTextOnHomepage(String)"
});
formatter.result({
  "duration": 22008000,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnREGISTERTab()"
});
formatter.result({
  "duration": 357573100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 19
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheTextOnRegisterPage(String)"
});
formatter.result({
  "duration": 21234700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iFillTheMandatoryFields(DataTable)"
});
formatter.result({
  "duration": 2334195000,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnREGISTERButton()"
});
formatter.result({
  "duration": 522259300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your registration completed",
      "offset": 22
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheMessageOnNextPage(String)"
});
formatter.result({
  "duration": 19074200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCONTINUEButton()"
});
formatter.result({
  "duration": 381821100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 19
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheTextOnNextPage(String)"
});
formatter.result({
  "duration": 18903900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnLoginLinkNext()"
});
formatter.result({
  "duration": 397316600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iFillTheMandatoryFieldsOnTheLoginPage(DataTable)"
});
formatter.result({
  "duration": 1120513100,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnLoginButtonOnTheLoginPage()"
});
formatter.result({
  "duration": 619021700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I agree with the terms of service",
      "offset": 21
    }
  ],
  "location": "ElectronicsSteps.iClickOnCheckboxAfterLogin(String)"
});
formatter.result({
  "duration": 33816700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCHECKOUTButton()"
});
formatter.result({
  "duration": 1298762700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iFillTheMandatoryFieldsOnBillingPage(DataTable)"
});
formatter.result({
  "duration": 4413784000,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCONTINUEOnBIllingPage()"
});
formatter.result({
  "duration": 36908800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2nd Day Air ($0.00)",
      "offset": 25
    }
  ],
  "location": "ElectronicsSteps.iClickOnRadioButtonElectronicsPage(String)"
});
formatter.result({
  "duration": 400820300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCONTINUEOnShippingPageElectronicsPage()"
});
formatter.result({
  "duration": 33381800,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iSelectRadioButtonCreditCardOnPaymentMethodElectronicsPage()"
});
formatter.result({
  "duration": 262756200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnContinueButtonOnPaymentMethodPageElectronicsPage()"
});
formatter.result({
  "duration": 27599500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iSelectVisaFromSelectCreditCardDropdown()"
});
formatter.result({
  "duration": 296412400,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iFillAllTheDetails(DataTable)"
});
formatter.result({
  "duration": 200677600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCONTINUEOnPaymentInfoPage()"
});
formatter.result({
  "duration": 40765100,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyPaymentMethodIsCreditCard()"
});
formatter.result({
  "duration": 349519900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 31
    }
  ],
  "location": "ElectronicsSteps.iVerifyShippingMethodIsNdDayAir(int)"
});
formatter.result({
  "duration": 14199500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$698.00",
      "offset": 19
    }
  ],
  "location": "ElectronicsSteps.iVerifyTotalIsElectronicsPage(String)"
});
formatter.result({
  "duration": 14004600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCONFIRMButton()"
});
formatter.result({
  "duration": 31119800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you",
      "offset": 19
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheTextElectronicsPage(String)"
});
formatter.result({
  "duration": 740823700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order has been successfully processed!",
      "offset": 22
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheMessageElectronicsPage(String)"
});
formatter.result({
  "duration": 16497100,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCONTINUEOnOdrerCompletePage()"
});
formatter.result({
  "duration": 402407000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to our store",
      "offset": 19
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheTextAfterCompletingOrder(String)"
});
formatter.result({
  "duration": 26493000,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnLogoutLink()"
});
formatter.result({
  "duration": 783362600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyTheURLIsHttpsDemoNopcommerceCom()"
});
formatter.result({
  "duration": 11890500,
  "status": "passed"
});
formatter.after({
  "duration": 593088500,
  "status": "passed"
});
formatter.uri("homepage.feature");
formatter.feature({
  "line": 2,
  "name": "HomePage Test",
  "description": "As user I want to Register with into nop commerce website and login successfully on the website",
  "id": "homepage-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 2984688100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should Register on the NopCommerce website sucessfully",
  "description": "",
  "id": "homepage-test;user-should-register-on-the-nopcommerce-website-sucessfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am Homepage and verify nopCommerce logo",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Register link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify \"Register\" title",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enters following users details",
  "rows": [
    {
      "cells": [
        "Female",
        "Siya",
        "Patel",
        "2",
        "February",
        "2001",
        "siya21@gmail.com",
        "siya123",
        "siya123"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Register Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify \"Your registration completed\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.iAmHomepageAndVerifyNopCommerceLogo()"
});
formatter.result({
  "duration": 36479700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 791019400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 10
    }
  ],
  "location": "RegisterSteps.iVerifyTitle(String)"
});
formatter.result({
  "duration": 27717800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iEntersFollowingUsersDetails(DataTable)"
});
formatter.result({
  "duration": 8665862700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 579990300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your registration completed",
      "offset": 10
    }
  ],
  "location": "RegisterSteps.iVerifyMessage(String)"
});
formatter.result({
  "duration": 15032300,
  "status": "passed"
});
formatter.after({
  "duration": 582477800,
  "status": "passed"
});
formatter.before({
  "duration": 2249236700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should Login successfully with valid credential to the NopCommerce website",
  "description": "",
  "id": "homepage-test;user-should-login-successfully-with-valid-credential-to-the-nopcommerce-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@sanity"
    },
    {
      "line": 12,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on Login Link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I verify \"Welcome, Please Sign In!\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enters following users login details",
  "rows": [
    {
      "cells": [
        "siya21@gmail.com",
        "siya123"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmHomepage()"
});
formatter.result({
  "duration": 17200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 371923900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome, Please Sign In!",
      "offset": 10
    }
  ],
  "location": "LoginSteps.iVerify(String)"
});
formatter.result({
  "duration": 1051936800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEntersFollowingUsersLoginDetails(DataTable)"
});
formatter.result({
  "duration": 2109697600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 688872900,
  "status": "passed"
});
formatter.after({
  "duration": 583264500,
  "status": "passed"
});
});