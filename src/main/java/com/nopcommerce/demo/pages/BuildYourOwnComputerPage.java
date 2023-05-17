package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());
    public BuildYourOwnComputerPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-name']//h1")
    WebElement productNameText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_3']//li/label")
    List<WebElement> hDDRadios;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']//li/label")
    List<WebElement> oSRadios;
    @CacheLookup
    @FindBy(id="product_attribute_5_10")
    WebElement microsoftOffice;
    @CacheLookup
    @FindBy(id="product_attribute_5_11")
    WebElement acrobatReader;
    @CacheLookup
    @FindBy(id="product_attribute_5_12")
    WebElement totalCommander;
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//li/label")//ul[data-attr='5']//li.
    List<WebElement> softwareCheckBoxes;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[8]/div[1]/button[1]")
    WebElement addToCartBtn;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddeMessage;
    @CacheLookup
    @FindBy(xpath="//span[@class='price-value-1']")
    WebElement productPrice ;
    @CacheLookup
    @FindBy(xpath="//button[@id='add-to-cart-button-1']")
    WebElement addToCart ;
    @CacheLookup
    @FindBy(xpath="//p[@class='content']")
    WebElement productAddedToCartMessage ;
    @CacheLookup
    @FindBy(xpath="//span[@title='Close']")
    WebElement closeTheBarButton;
    @CacheLookup
    @FindBy(xpath="//span[@class='cart-label']")
    WebElement shoppingCart ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Go to cart']")
    WebElement gotoCart ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartMessage ;
    @CacheLookup
    @FindBy(xpath="//input[@class='qty-input']")
    WebElement quantity ;
    @CacheLookup
    @FindBy(id="updatecart")
    WebElement updateCartButton ;
    @CacheLookup
    @FindBy(xpath="//tr[@class='order-total']//span[@class='value-summary']")
    WebElement total;
    @CacheLookup
    @FindBy(id="termsofservice")
    WebElement tearmsAndCondition ;
    @CacheLookup
    @FindBy(id="checkout")
    WebElement checkoutButton ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeMessage ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Checkout as Guest']")
    WebElement checkOutAsGuestButton ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")
    WebElement firstName ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_LastName']")
    WebElement lastName ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_Email']")
    WebElement email ;
    @CacheLookup
    @FindBy(xpath="//select[@name='BillingNewAddress.CountryId']")
    WebElement country ;
    @CacheLookup
    @FindBy(xpath="//select[@name='BillingNewAddress.StateProvinceId']")
    WebElement state ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_City']")
    WebElement city ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
    WebElement address1 ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postCode ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber ;
    @CacheLookup
    @FindBy(xpath="//button[@onclick='Billing.save()']")
    WebElement continueButton ;
    @CacheLookup
    @FindBy(id="shippingoption_1")
    WebElement nextDayAir;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 shipping-method-next-step-button']")
    WebElement shippingContinueButton ;
    @CacheLookup
    @FindBy(xpath="//input[@id='paymentmethod_1']")
    WebElement creditCardRadioButton ;


    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButtonPaymentMethod ;
    @CacheLookup
    @FindBy(xpath="//select[@id='CreditCardType']")
    WebElement masterCard ;
    @CacheLookup
    @FindBy(id="CardholderName")
    WebElement cardHolderName ;
    @CacheLookup
    @FindBy(id="CardNumber")
    WebElement cardNumber ;
    @CacheLookup
    @FindBy(xpath="//select[@id='ExpireMonth']")
    WebElement cardExpiryMonth ;
    @CacheLookup
    @FindBy(xpath="//select[@id='ExpireYear']")
    WebElement cardYear ;
    @CacheLookup
    @FindBy(id="CardCode")
    WebElement cardCode ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButtonPaymentInfo ;
    @CacheLookup
    @FindBy(xpath="//li[@class='payment-method']")
    WebElement paymentMethod;
    @CacheLookup
    @FindBy(xpath="//li[@class='shipping-method']")
    WebElement shippingMethodMessage ;
    @CacheLookup
    @FindBy(xpath="//span[@class='value-summary']")
    WebElement totalCost ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 confirm-order-next-step-button']")
    WebElement confirmButton ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Thank you']")
    WebElement thankYouText ;
    @CacheLookup
    @FindBy(xpath="//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement orderSuccessfully ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 order-completed-continue-button']")
    WebElement continueButtonOrderComplete ;
    @CacheLookup
    @FindBy(xpath="//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeStore ;


    public String getProductNameText() {
        log.info("Get productName text : " + productNameText.getText() );
        return getTextFromElement(productNameText);
    }

    public void selectProcessor(String processorName) {
        selectByVisibleTextFromDropDown(processor, processorName);
        log.info("Select processor '" + processorName + "'" + "<br>");
    }

    public void selectRam(String ramGB) {
        selectByVisibleTextFromDropDown(ram, ramGB);
        log.info("Select RAM '" + ramGB + "'" + "<br>");
    }

    public void selectHDD(String hDdGB) {
        for (WebElement hdd : hDDRadios) {
            if (hdd.getText().equals(hDdGB)) {
                clickOnElement(hdd);
                log.info("Select HDD '" + hDdGB + "'" + "<br>");
                break;
            }
        }
    }

    public void selectOS(String oSName) {
        for (WebElement os : oSRadios) {
            if (os.getText().equals(oSName)) {
                clickOnElement(os);
                log.info("Select HDD '" + oSName + "'" + "<br>");
                break;
            }
        }
    }
    public void clickOnMicrosoftOffice(){
        log.info("Click on Microsoft Office [+$50.00]" );
        if(!microsoftOffice.isSelected()){
            clickOnElement(microsoftOffice);}
    }
    public void clickOnAcrobatReader(){
        log.info("Click on Acrobat Reader [+$10.00]" );
        clickOnElement(acrobatReader);
    }
    public void clickOnTotalCommander(){
        log.info("Click on Total Commander [+$5.00]" );
        clickOnElement(totalCommander);
    }
    public void selectSoftware(String software){

        for(WebElement softW : softwareCheckBoxes) {
            if (softW.getText().equals(software)){
                log.info("Click on Software "+softW.getText());
                clickOnElement(softW);
                break;
            }

        }
    }
    public void clickOnAddToCartDesktopsPage(){
        log.info("Click on Add To Cart button"+addToCartButton.toString());
        clickOnElement(addToCartButton);
    }
    public void clickOnAddToCartBuildYourOwnPage(){
        log.info("Click on Add To Cart button"+addToCartBtn.toString());
        clickOnElement(addToCartBtn);
    }
    public String getProductAddedMessage(){
        log.info("Get Product Added message "+addToCartBtn.toString());
        return getTextFromElement(productAddeMessage);
    }
    public String getActualProductPrice(){
       log.info("getActualProductPrice" + productPrice);
        return getTextFromElement(productPrice);
    }
    public String getActualProductAddedMessage(){
        log.info("getActualProductAddedMessage" + productAddeMessage);
        return getTextFromElement(productAddedToCartMessage);
    }
    public void setCloseTheBarButton() {
        log.info("setCloseTheBarButton" );
        clickOnElement(closeTheBarButton);
    }
    public void gotoSoppingCart() {
        log.info("gotoSoppingCart" );
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnGoToCart() {
        log.info("clickOnGoToCart" );
        clickOnElement(gotoCart);
    }
    public String getShoppingCartMessage(){
        log.info("getShoppingCartMessage" );
        return getTextFromElement(shoppingCartMessage);
    }
    public void changeQuantity(String value ){
        log.info("changeQuantity" + quantity.toString());
        clearTextFromField(quantity);
        sendTextToElement(quantity,value);
    }
    public void clickOnUpdateShoppingCartButton(){
        log.info("clickOnUpdateShoppingCartButton " + updateCartButton.toString());
        clickOnElement(updateCartButton);
    }
    public String getTotal(){
        log.info("Get Total" );
        return getTextFromElement(total);
    }
    public void clickOnTearmsAndCondition(){
        log.info("clickOnTearmsAndCondition" );
        clickOnElement(tearmsAndCondition);
    }
    public void clickOnCheckoutButton(){
        log.info("clickOnCheckoutButton" );
        clickOnElement(checkoutButton);
    }
    public String getWelcomeMessage(){
        log.info("getWelcomeMessage" );
        return getTextFromElement(welcomeMessage); }

    public void clickOnCheckoutAsGuest(){
        log.info("clickOnCheckoutAsGuest" );
        clickOnElement(checkOutAsGuestButton);
    }
    public void fillFirstnameLastnameEmailPhonenumber(String firstname, String lastname, String email1, String phonenumber){
        log.info("fillFirstnameLastnameEmailPhonenumber" );
        sendTextToElement(firstName,firstname);
        sendTextToElement(lastName,lastname);
        sendTextToElement(email,email1);
        sendTextToElement(phoneNumber,phonenumber);
    }
    public void fillCountry(String country1){
       log.info("fillCountry" );
       selectByVisibleTextFromDropDown(country,country1);}
    public void fillState(String state1){
        log.info("fillState" );
        selectByVisibleTextFromDropDown(state,state1);
    }
    public void fillCity(String city1)
    {   log.info("fillCity" );
        sendTextToElement(city,city1);
    }
    public void fillFirstlineAddressPostcode(String firstlineaddress,String postcode){
        log.info("fillFirstlineAddressPostcode" );
        sendTextToElement(address1,firstlineaddress);
        sendTextToElement(postCode,postcode);
    }
    public void clickOnContinueButton(){
        log.info("clickOnContinueButton" );
        clickOnElement(continueButton);
    }
    public void clickOnNextDayAir(){
        log.info("clickOnNextDayAir" );
        clickOnElement(nextDayAir);
    }
    public void clickOnContinueButtonPayementMethodPage(){
        log.info("clickOnContinueButtonPayementMethodPage" );
        clickOnElement(continueButtonPaymentMethod);
    }
    public void clickOnContinueButtonShipping(){
        log.info("clickOnContinueButtonShipping" );
        clickOnElement(shippingContinueButton);
    }
    public void clickOnCreditCardRadioButton(){
        log.info("clickOnCreditCardRadioButton" );
        clickOnElement(creditCardRadioButton);
    }
    public void clickOnContinueButtonPaymentMethod(){
        log.info("clickOnContinueButtonPaymentMethod" );
        clickOnElement(continueButtonPaymentMethod);
    }
    public void selectMasterCardFromSelectCreditCard(){
        log.info("selectMasterCardFromSelectCreditCard" );
        selectByVisibleTextFromDropDown(masterCard,"Master card");
    }
    public void sendCardHolderNameAndCardNumber(String name, String creditcardnumber){
        log.info("sendCardHolderNameAndCardNumber" );
        sendTextToElement(cardHolderName,name);
        sendTextToElement(cardNumber,creditcardnumber);
    }
    public void sendCardExpiryMonthAndYear(String month, String year){
        log.info("sendCardExpiryMonthAndYear" );
        selectByVisibleTextFromDropDown(cardExpiryMonth,month);
        selectByVisibleTextFromDropDown(cardYear,year);
    }
    public void sendCardCode(String cCode){
        log.info("sendCardCode" );
        sendTextToElement(cardCode,cCode);
    }
    public void clickOnContinueButtonOnPaymentInfoPage(){
        log.info("clickOnContinueButtonOnPaymentInfoPage" );
        clickOnElement(continueButtonPaymentInfo);
    }
    public String getPaymentMethodIsCreditCard(){
        log.info("getPaymentMethodIsCreditCard" );
        return getTextFromElement(paymentMethod);
    }
    public String getShippingMethodIsNextDayAir(){
        log.info("getShippingMethodIsNextDayAir" );
        return getTextFromElement(shippingMethodMessage);
    }
    public String getTotalAmount(){
        log.info("getTotalAmount" );
        return getTextFromElement(totalCost);
    }
    public void clickOnConfirmButton(){
        log.info("clickOnConfirmButton" );
        clickOnElement(confirmButton);
    }
    public String getThankYouText(){
        log.info("getThankYouText" );
        return getTextFromElement(thankYouText);
    }
    public String getOrderSuccessfullyMessage(){
        log.info("getOrderSuccessfullyMessage" );
        return getTextFromElement(orderSuccessfully);
    }
    public void clickOnContinueButtonOrderComplete(){
        log.info("clickOnContinueButtonOrderComplete" );
        clickOnElement(continueButtonOrderComplete);
    }
    public String getWelcomeStoreMessage(){
        log.info("getWelcomeStoreMessage" );
        return getTextFromElement(welcomeStore);
    }


}
