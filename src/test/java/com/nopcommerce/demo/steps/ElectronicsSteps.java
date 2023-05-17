package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class ElectronicsSteps {
    @When("^I Mouse Hover on “Electronics” Tab$")
    public void iMouseHoverOnElectronicsTab() {
        new ElectronicsPage().mouseHoverOnElectronics();
    }

    @And("^I Mouse Hover on “Cell phones” and click$")
    public void iMouseHoverOnCellPhonesAndClick() {
        new ElectronicsPage().mouseHoverAndClickOnCellPhones();
    }

    @Then("^I Verify the text “Cell phones”$")
    public void iVerifyTheTextCellPhones() {
        Assert.assertEquals(new ElectronicsPage().getCellphonesText(),"Cell phones","Cell phones not Displayed");
    }

    @And("^I click on List View Tab$")
    public void iClickOnListViewTab() throws InterruptedException {
        Thread.sleep(1000);
        new ElectronicsPage().clickOnListView();
    }

    @And("^I click on product name “Nokia Lumia (\\d+)” link$")
    public void iClickOnProductNameNokiaLumiaLink(int arg0) throws InterruptedException{
        Thread.sleep(1000);
        new ElectronicsPage().clickOnNokiaLumiaLink();
    }

    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String nokia)  {
        Assert.assertEquals(new ElectronicsPage().getNokialumia1020Text(),nokia,nokia+"not displayed");
    }
    @And("^I verify Nokia Lumia price \"([^\"]*)\"$")
    public void iVerifyNokiaLumiaPrice(String nokiaPrice)  {
        Assert.assertEquals(new ElectronicsPage().getPrice349(),nokiaPrice,nokiaPrice+"don't match");
    }
    @And("^I change quantity to \"([^\"]*)\"$")
    public void iChangeQuantityTo(String qty)  {
        new ElectronicsPage().changeQuantity(qty);
    }

    @And("^I click on “ADD TO CART” tab$")
    public void iClickOnADDTOCARTTab() {
        new ElectronicsPage().clickOnAddToCartButton();
    }
    @And("^I verify the Message \"([^\"]*)\" on Top  green Bar  After that close the bar clicking on the cross button\\.$")
    public void iVerifyTheMessageOnTopGreenBarAfterThatCloseTheBarClickingOnTheCrossButton(String message) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new ElectronicsPage().getProductAddedMessage(),message,message+"not displayed");
        Thread.sleep(1000);
        new ElectronicsPage().clickOnCrossButton();
    }


    @And("^I mouseHover on \"([^\"]*)\" and Click on \"([^\"]*)\" button\\.$")
    public void iMouseHoverOnAndClickOnButton(String arg0, String arg1)  throws InterruptedException{
        Thread.sleep(1000);
        new ElectronicsPage().mouseHoverOnShoppingCart();
        Thread.sleep(1000);
        new ElectronicsPage().clickOnGoToCart();
    }

    @And("^I verify the message \"([^\"]*)\" on shoppingcart page$")
    public void iVerifyTheMessageOnShoppingcartPage(String shoppingCartMessage)throws InterruptedException  {
        Thread.sleep(2000);
        Assert.assertEquals(new ElectronicsPage().getShoppingCartText(),shoppingCartMessage,shoppingCartMessage+"not displayed");
    }
       @And("^I verify the quantity is \"([^\"]*)\"$")
    public void iVerifyTheQuantityIs(String qty) {
        Assert.assertEquals(new ElectronicsPage().getQuantityText(),qty,"Quantity doesnot match");
       }

    @And("^I verify the Total \"([^\"]*)\" on shopping cart page$")
    public void iVerifyTheTotalOnShoppingCartPage(String total)  {
        Assert.assertEquals(new ElectronicsPage().getTotal(),total,"Total doesnot match");
    }

    @And("^I click on checkbox \"([^\"]*)\"$")
    public void iClickOnCheckbox(String arg0)  {
        new ElectronicsPage().clickOntermsAndConditionCheckbox();
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0)  {
        new ElectronicsPage().clickOnCheckOutButton();
    }
    @And("^I verify the Text \"([^\"]*)\" on homepage$")
     public void iVerifyTheTextOnHomepage(String welcome) {
        Assert.assertEquals(new ElectronicsPage().getWelcomeSignInText(),welcome,welcome+" not displayed");
    }

    @And("^I click on “REGISTER” tab$")
    public void iClickOnREGISTERTab() {
        new HomePage().clickOnRegisterLink();
    }

    @And("^I verify the text \"([^\"]*)\" on Register page$")
    public void iVerifyTheTextOnRegisterPage(String register) {
        Assert.assertEquals(new RegisterPage().getRegisterTitle(),register,register+" not displayed");
    }

    @And("^I fill the mandatory fields$")
    public void iFillTheMandatoryFields(DataTable dataTable)throws InterruptedException {
        List<List<String>> userList = dataTable.cells(0);

        new ElectronicsPage().fillFirstNameLastNameField(userList.get(0).get(0),userList.get(0).get(1));
        Thread.sleep(1000);

        new ElectronicsPage().fillEmailField(userList.get(0).get(2));
        Thread.sleep(1000);
        new ElectronicsPage().fillPasswordAndConfirmPassword(userList.get(0).get(3),userList.get(0).get(4));


    }
    @And("^I click on “REGISTER” Button$")
    public void iClickOnREGISTERButton() {
       new RegisterPage().clickOnRegisterButton();
    }
    @And("^I verify the message \"([^\"]*)\" on next page$")
    public void iVerifyTheMessageOnNextPage(String registerationComplete)  {
        Assert.assertEquals(new RegisterPage().getRegisterationCompleteMessage(),registerationComplete,"Your registration completed message not displayed");
    }

    @And("^I click on “CONTINUE” button$")
    public void iClickOnCONTINUEButton() {
        new ElectronicsPage().clickOnContinueButton();
    }

    @And("^I verify the text \"([^\"]*)\" on next page$")
    public void iVerifyTheTextOnNextPage(String shoppingCartText)  {
        Assert.assertEquals(new ElectronicsPage().getShoppingCartText(),shoppingCartText,shoppingCartText+"not displayed");
    }

    @And("^I click on Login Link next$")
    public void iClickOnLoginLinkNext() {
        new HomePage().clickOnLoginLink();
    }

    @And("^I fill the mandatory fields on the login page$")
    public void iFillTheMandatoryFieldsOnTheLoginPage(DataTable dataTable) throws InterruptedException {
        List<List<String>> data = dataTable.cells(0);
        new ElectronicsPage().fillEmailFieldInLoginPage(data.get(0).get(0));
        Thread.sleep(1000);
        new ElectronicsPage().fillPasswordInLoginpage(data.get(0).get(1));
    }

    @And("^I click on Login Button on the login page$")
    public void iClickOnLoginButtonOnTheLoginPage() {
        new ElectronicsPage().clickOnLoginbutton();
    }

    @And("^I click on checkbox \"([^\"]*)\" after login$")
    public void iClickOnCheckboxAfterLogin(String arg0) {
        new ElectronicsPage().clickOntermsAndConditionCheckbox();
    }

    @And("^I click on “CHECKOUT” button$")
    public void iClickOnCHECKOUTButton() {
        new ElectronicsPage().clickOnCheckOutButton();
    }

    @And("^I fill the Mandatory fields on Billing page$")
    public void iFillTheMandatoryFieldsOnBillingPage(DataTable dataTable) throws InterruptedException{
        List<List<String>> data = dataTable.cells(0);
        new ElectronicsPage().fillCountry(data.get(0).get(0));
        Thread.sleep(1000);
        new ElectronicsPage().fillCity(data.get(0).get(1));
        Thread.sleep(1000);
        new ElectronicsPage().fillAdress1(data.get(0).get(2));
        Thread.sleep(1000);
        new ElectronicsPage().fillPostCode(data.get(0).get(3));
        Thread.sleep(1000);
        new ElectronicsPage().fillPhoneNumber(data.get(0).get(4));
    }

    @And("^I click on “CONTINUE” on BIlling page$")
    public void iClickOnCONTINUEOnBIllingPage() {
        new ElectronicsPage().clickOnContinueButtonOnBillingPage();
    }
    @And("^I click on Radio Button \"([^\"]*)\" Electronics Page$")
    public void iClickOnRadioButtonElectronicsPage(String arg0)  {
        new ElectronicsPage().clickOnRadioButton2ndAir();
    }


    @And("^I click on “CONTINUE” on Shipping page Electronics page$")
    public void iClickOnCONTINUEOnShippingPageElectronicsPage() {
        new ElectronicsPage().clickOnContinueButtonShipping();
    }

    @And("^I select Radio Button “Credit Card” on Payment Method Electronics page$")
    public void iSelectRadioButtonCreditCardOnPaymentMethodElectronicsPage() {
        new ElectronicsPage().clickOnRadioButtonCrditCard();
    }

    @And("^I click on Continue button on Payment method page Electronics page$")
    public void iClickOnContinueButtonOnPaymentMethodPageElectronicsPage() {
        new ElectronicsPage().clickOnContinuePaymentMethod();
    }

    @And("^I select “Visa” From Select credit card dropdown$")
    public void iSelectVisaFromSelectCreditCardDropdown() {
        new ElectronicsPage().selectVisaFromDropdown("Visa");
    }

    @And("^I fill all the details$")
    public void iFillAllTheDetails(DataTable dataTable) {
        List<List<String>> data = dataTable.cells(0);
        new ElectronicsPage().fillCardHolderNameField(data.get(0).get(0));
        new ElectronicsPage().fillCardNumberField(data.get(0).get(1));
        new ElectronicsPage().fillExpiryMonthField(data.get(0).get(2));
        new ElectronicsPage().fillExpiryYearField(data.get(0).get(3));
        new ElectronicsPage().fillCardcodeField(data.get(0).get(4));
    }

    @And("^I click on “CONTINUE” on Payment info page$")
    public void iClickOnCONTINUEOnPaymentInfoPage() {
        new ElectronicsPage().clickOnContinueButtonPaymentInfo();
    }

    @And("^I verify “Payment Method” is “Credit Card”$")
    public void iVerifyPaymentMethodIsCreditCard() {
        Assert.assertEquals(new ElectronicsPage().getPaymentMethodText(),"Payment Method: Credit Card","Payment Method: Credit Card not displayed");
    }

    @And("^I verify “Shipping Method” is “(\\d+)nd Day Air”$")
    public void iVerifyShippingMethodIsNdDayAir(int arg0) {
        Assert.assertEquals(new ElectronicsPage().getShippingMethodText(),"Shipping Method: 2nd Day Air","Shipping Method: 2nd Day Air not displayed");
    }
    @And("^I verify Total is \"([^\"]*)\" electronics page$")
    public void iVerifyTotalIsElectronicsPage(String total)  {
        Assert.assertEquals(new ElectronicsPage().getTotal698Text(),total,total+" doesnot match");
    }
    @And("^I click on “CONFIRM” button$")
    public void iClickOnCONFIRMButton() {
        new ElectronicsPage().clickOnConfirmButton();
    }
    @And("^I verify the Text \"([^\"]*)\" electronics page$")
    public void iVerifyTheTextElectronicsPage(String thankyou)  {
        Assert.assertEquals(new ElectronicsPage().getThankYouText(),thankyou,thankyou+" not displayed");

    }

    @And("^I verify the message \"([^\"]*)\" electronics page$")
    public void iVerifyTheMessageElectronicsPage(String orderAddedMessage)  {
        Assert.assertEquals(new ElectronicsPage().getYourOrderMessage(),orderAddedMessage,orderAddedMessage+" not displayed");
    }

    @And("^I click on “CONTINUE” on odrer complete page$")
    public void iClickOnCONTINUEOnOdrerCompletePage() {
        new ElectronicsPage().clickOnContinueButtonCompleted();
    }

    @And("^I verify the text \"([^\"]*)\" after completing order$")
    public void iVerifyTheTextAfterCompletingOrder(String welcomeStore){
        Assert.assertEquals(new ElectronicsPage().getWelcomeStoreText(),welcomeStore,welcomeStore+" not display");
    }

    @And("^I click on “Logout” link$")
    public void iClickOnLogoutLink() {
        new ElectronicsPage().clickOnLogoutLink();
    }

    @And("^I verify the URL is “https://demo\\.nopcommerce\\.com/”$")
    public void iVerifyTheURLIsHttpsDemoNopcommerceCom() {
        String expectedUrl = "https://demo.nopcommerce.com/";
        Assert.assertEquals(new ElectronicsPage().getCurrentUrlText(),expectedUrl,"Url does not match");
    }








}
