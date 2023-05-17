package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class ComputerPageSteps {
    @Given("^I am on the Homepage$")
    public void iAmOnTheHomepage() {
    }

    @When("^I click on Computer Menu$")
    public void iClickOnComputerMenu() {
        new ComputerPage().clickOnComputerFromTopMenu();
    }

    @And("^I click on Desktop$")
    public void iClickOnDesktop() {
        new ComputerPage().clickOnDesktop();
    }

    @And("^I select Sort By position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String text) throws InterruptedException {
        Thread.sleep(1000);
        new ComputerPage().sortTheDisplayTitlesFromSortBy(text);
    }

    @Then("^I verify the Product will arrange in Descending order$")
    public void iVerifyTheProductWillArrangeInDescendingOrder() {
        Assert.assertEquals(new ComputerPage().getAcctualList(),new ComputerPage().getExpectedList(),"products are not sorted ");
    }

    @Given("^I am on the homepage computer$")
    public void iAmOnTheHomepageComputer() {
    }

    @And("^I click on Desktops$")
    public void iClickOnDesktops() {
        new ComputerPage().clickOnDesktop();
    }

    @And("^I click on \"([^\"]*)\" on Desktops page$")
    public void iClickOnOnDesktopsPage(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnAddToCartDesktopsPage();

    }

    @And("^I verify the Text \"([^\"]*)\"$")
    public void iVerifyTheText(String text) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new BuildYourOwnComputerPage().getProductNameText(),"Build your own computer","Title doesnot match");
    }

    @And("^I select \"([^\"]*)\" using Select class$")
    public void iSelectUsingSelectClass(String processor)  {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }
    @And("^I select Ram \"([^\"]*)\"$")
    public void iSelectRam(String ram)  {
        new BuildYourOwnComputerPage().selectRam(ram);
    }
    @And("^I select HDD radio \"([^\"]*)\"$")
    public void iSelectHDDRadio(String hdd) throws InterruptedException{
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }
    @And("^I select OS radio \"([^\"]*)\"$")
    public void iSelectOSRadio(String os)  {
        new BuildYourOwnComputerPage().selectOS(os);
    }
    @And("^I click on  Check box \"([^\"]*)\"$")
    public void iClickOnCheckBox(String software) throws InterruptedException {
        Thread.sleep(1000);

       new BuildYourOwnComputerPage().clickOnMicrosoftOffice();

    }
    @And("^I check  check boxe \"([^\"]*)\"$")
    public void iCheckCheckBoxe(String software)throws InterruptedException  {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("^I verify the price \"([^\"]*)\"$")
    public void iVerifyThePrice(String price) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getActualProductPrice(), price, "Price doesn't match");
    }

    @And("^I click on \"([^\"]*)\" Button on Buildyourownpage$")
    public void iClickOnButtonOnBuildyourownpage(String arg0)  {
        new BuildYourOwnComputerPage().clickOnAddToCartBuildYourOwnPage();

    }

    @And("^I verify the Message \"([^\"]*)\" on Top green Bar After that close the bar clicking on the cross button\\.$")
    public void iVerifyTheMessageOnTopGreenBarAfterThatCloseTheBarClickingOnTheCrossButton(String message) throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals(new BuildYourOwnComputerPage().getActualProductAddedMessage(),message,"Message does not match");
        new BuildYourOwnComputerPage().setCloseTheBarButton();
    }

    @And("^I mouseHover on \"([^\"]*)\" and Click on \"([^\"]*)\" button$")
    public void iMouseHoverOnAndClickOnButton(String arg0, String arg1) throws InterruptedException {
        new BuildYourOwnComputerPage().gotoSoppingCart();
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnGoToCart();

    }

    @And("^I verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String shoppingcart) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getShoppingCartMessage(),shoppingcart,"Shopping Cart message not dispalyed");
    }

    @And("^I change the Qty to \"([^\"]*)\" and Click on \"([^\"]*)\"$")
    public void iChangeTheQtyToAndClickOn(String qty, String arg1) throws InterruptedException {
        new BuildYourOwnComputerPage().changeQuantity(qty);
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnUpdateShoppingCartButton();
    }
    @And("^I verify the Total \"([^\"]*)\"$")
    public void iVerifyTheTotal(String total)  {
        Assert.assertEquals(new BuildYourOwnComputerPage().getTotal(),total,"Total doesn't match");
    }

    @And("^I click on checkbox “I agree with the terms of service”$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfService() {
        new BuildYourOwnComputerPage().clickOnTearmsAndCondition();
    }

    @And("^I click on “CHECKOUT”$")
    public void iClickOnCHECKOUT() {
        new BuildYourOwnComputerPage().clickOnCheckoutButton();
    }

    @And("^I verify the Text “Welcome, Please Sign In!”$")
    public void iVerifyTheTextWelcomePleaseSignIn() {
        Assert.assertEquals(new BuildYourOwnComputerPage().getWelcomeMessage(),"Welcome, Please Sign In!","Message doesnot match");
    }

    @And("^I click on “CHECKOUT AS GUEST” Tab$")
    public void iClickOnCHECKOUTASGUESTTab() {
        new BuildYourOwnComputerPage().clickOnCheckoutAsGuest();
    }

    @And("^I Fill the all mandatory field$")
    public void iFillTheAllMandatoryField(DataTable dataTable)throws InterruptedException {
        List<List<String>> data = dataTable.cells(0);
        new BuildYourOwnComputerPage().fillFirstnameLastnameEmailPhonenumber(data.get(0).get(0),
                data.get(0).get(1),data.get(0).get(2),data.get(0).get(7));
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().fillFirstlineAddressPostcode(data.get(0).get(5),data.get(0).get(6));
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().fillCountry(data.get(0).get(3));
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().fillCity(data.get(0).get(4));
    }

    @And("^I click on “CONTINUE” on Billing Address$")
    public void iClickOnCONTINUEOnBillingAddress() {
        new BuildYourOwnComputerPage().clickOnContinueButton();
    }
    @And("^I click on Radio Button \"([^\"]*)\" Computer page$")
    public void iClickOnRadioButtonComputerPage(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnNextDayAir();
    }
    @And("^I click on “CONTINUE” on shipping method Computer page$")
    public void iClickOnCONTINUEOnShippingMethodComputerPage()throws InterruptedException {
        Thread.sleep(2000);
        new BuildYourOwnComputerPage().clickOnContinueButtonShipping();
    }
    @And("^I select Radio Button \"([^\"]*)\" Computer page$")
    public void iSelectRadioButtonComputerPage(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        new BuildYourOwnComputerPage().clickOnCreditCardRadioButton();
    }
    @And("^I click on Continue button on Payment method page on Computer page$")
    public void iClickOnContinueButtonOnPaymentMethodPageOnComputerPage() throws InterruptedException{
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnContinueButtonPaymentMethod();
    }

    @And("^I select “Master card” From Select credit card dropdown$")
    public void iSelectMasterCardFromSelectCreditCardDropdown() {
        new BuildYourOwnComputerPage().selectMasterCardFromSelectCreditCard();
    }

    @And("^I Fill all the details$")
    public void iFillAllTheDetails(DataTable dataTable) {
        List<List<String>> data = dataTable.cells(0);
        new BuildYourOwnComputerPage().sendCardHolderNameAndCardNumber(data.get(0).get(0),data.get(0).get(1));
        new BuildYourOwnComputerPage().sendCardExpiryMonthAndYear(data.get(0).get(2),data.get(0).get(3));
        new BuildYourOwnComputerPage().sendCardCode(data.get(0).get(4));
    }

    @And("^I click on “CONTINUE” on Payment information$")
    public void iClickOnCONTINUEOnPaymentInformation() {
        new BuildYourOwnComputerPage().clickOnContinueButtonOnPaymentInfoPage();
    }

    @And("^I verify “Payment Method: Credit Card”$")
    public void iVerifyPaymentMethodCreditCard() {
        Assert.assertEquals(new BuildYourOwnComputerPage().getPaymentMethodIsCreditCard(),"Payment Method: Credit Card","\"Payment Method: Credit Card\"is not displayed");

    }

    @And("^I verify “Shipping Method: Next Day Air”$")
    public void iVerifyShippingMethodNextDayAir() {
        Assert.assertEquals(new BuildYourOwnComputerPage().getShippingMethodIsNextDayAir(),"Shipping Method: Next Day Air","\"Shipping Method: Next Day Air\"is not displayed");

    }
    @And("^I verify Total is \"([^\"]*)\"$")
    public void iVerifyTotalIs(String total)  {
        Assert.assertEquals(new BuildYourOwnComputerPage().getTotal(),"$2,960.00","Price doesn't match");
    }
    @And("^I click on “CONFIRM”$")
    public void iClickOnCONFIRM() {
    new BuildYourOwnComputerPage().clickOnConfirmButton();
    }


    @And("^I verifythe Text \"([^\"]*)\"$")
    public void iVerifytheText(String thankyou) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getThankYouText(),"Thank you","Thank you not displayed");
    }

    @And("^I verifythe message \"([^\"]*)\"$")
    public void iVerifytheMessage(String orderSuccess)  {
        Assert.assertEquals(new BuildYourOwnComputerPage().getOrderSuccessfullyMessage(),orderSuccess,orderSuccess+"not dispalyed");
    }

    @And("^I click on “CONTINUE” on Thank you page$")
    public void iClickOnCONTINUEOnThankYouPage() {
        new BuildYourOwnComputerPage().clickOnContinueButtonOrderComplete();
    }
    @And("^I verify \"([^\"]*)\" text$")
    public void iVerifyText(String welcomeStore)  {
    Assert.assertEquals(new BuildYourOwnComputerPage().getWelcomeStoreMessage(),welcomeStore,welcomeStore+" not displayed");
    }



    @And("^I click on two Check boxes \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iClickOnTwoCheckBoxesAnd(String microsoft, String acrobat) throws InterruptedException {
        //new BuildYourOwnComputerPage().clickOnMicrosoftOffice();
        Thread.sleep(1000);

        new BuildYourOwnComputerPage().clickOnAcrobatReader();
    }






}
