package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ElectronicsPage.class.getName());
    public ElectronicsPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronics ;
    @CacheLookup
    @FindBy(xpath="//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellPhonesLink  ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Cell phones']")
    WebElement cellphoneText ;
    @CacheLookup
    @FindBy(xpath="//a[normalize-space()='List']")
    WebElement listView;
    @CacheLookup
    @FindBy(xpath="//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumia1020link;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Nokia Lumia 1020']")
    WebElement getNokiaLumia1020Text ;
    @CacheLookup
    @FindBy(xpath="//span[@id='price-value-20']")
    WebElement price$349Text ;
    @CacheLookup
    @FindBy(xpath="//input[@id='product_enteredQuantity_20']")
    WebElement quantity ;
    @CacheLookup
    @FindBy(xpath="//button[@id='add-to-cart-button-20']")
    WebElement addToCartButton ;
    @CacheLookup
    @FindBy(xpath="//p[@class='content']")
    WebElement productAddedText ;
    @CacheLookup
    @FindBy(xpath="//span[@title='Close']")
    WebElement crossButton ;
    @CacheLookup
    @FindBy(xpath="//span[@class='cart-label']")
    WebElement shoppingCart ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Go to cart']")
    WebElement goToCartButton ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/h1[1]")
    WebElement shoppingCartTextAfterRegister;


    @CacheLookup
    @FindBy(xpath="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")
    WebElement quantityText ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]")
    WebElement totalText698;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]")
    WebElement totalText6981;
    @CacheLookup
    @FindBy(xpath="//span[@class='product-subtotal']")
    WebElement totalText;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Register']")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 checkout-as-guest-button']")
    WebElement registernewButton;
    @CacheLookup
    @FindBy(xpath="//input[@id='FirstName']")
    WebElement firstNameField ;
    @CacheLookup
    @FindBy(xpath="//input[@id='LastName']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath="//input[@id='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath="//input[@id='Password']")
    WebElement passwordField ;
    @CacheLookup
    @FindBy(xpath="//input[@id='ConfirmPassword']")
    WebElement confirmPassword ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Register']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/button[1]")
    WebElement registrationButton;
    @CacheLookup
    @FindBy(xpath="//div[@class='result']")
    WebElement registrationCompleteText ;
    @CacheLookup
    @FindBy(xpath="//a[normalize-space()='Continue']")
    WebElement continueButton ;
    @CacheLookup
    @FindBy(xpath="//a[normalize-space()='Log in']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath="//input[@name='Email']")
    WebElement loginEmailField;
    @CacheLookup
    @FindBy(xpath="//input[@name='Password']")
    WebElement loginPasswordField ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Log in']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath="//input[@id='termsofservice']")
    WebElement termsAndConditionCheckbox ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[3]/input[1]")
    WebElement termsAndConditionCheckbox1 ;

    @CacheLookup
    @FindBy(xpath="//button[@id='checkout']")
    WebElement checkoutButton ;
    @CacheLookup
    @FindBy(xpath="//button[@id='checkout']")
    WebElement checkoutButton1 ;
    @CacheLookup
    @FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
    WebElement countryField;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_City']")
    WebElement cityField;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
    WebElement address1Field;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postCodeField;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumberField ;
    @CacheLookup
    @FindBy(xpath="//button[@onclick='Billing.save()']")
    WebElement continueButtonBilling ;
    @CacheLookup
    @FindBy(xpath="//input[@id='shippingoption_2']")
    WebElement radioButton2ndDayAir;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButtonShipping ;
    @CacheLookup
    @FindBy(xpath="//input[@id='paymentmethod_1']")
    WebElement creditCardRadioButton ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement continueButtonatBillingAddress;
    @CacheLookup
    @FindBy(id="CreditCardType")
    WebElement cardOptions ;
    @CacheLookup
    @FindBy(xpath="//input[@id='CardholderName']")
    WebElement cardHolderNameField;
    @CacheLookup
    @FindBy(xpath="//input[@id='CardNumber']")
    WebElement cardNumberField;
    @CacheLookup
    @FindBy(xpath="//select[@id='ExpireMonth']")
    WebElement expiryMonthField;
    @CacheLookup
    @FindBy(xpath="//select[@id='ExpireYear']")
    WebElement expiryYearField ;
    @CacheLookup
    @FindBy(xpath="//input[@id='CardCode']")
    WebElement cardCodeField ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButtonPaymentInfo;
    @CacheLookup
    @FindBy(xpath="//li[@class='payment-method']")
    WebElement paymentMethodText ;
    @CacheLookup
    @FindBy(xpath="//li[@class='shipping-method']")
    WebElement shippingMethodText ;
    @CacheLookup
    @FindBy(xpath="//span[@class='value-summary']")
    WebElement totalSummaryText ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 confirm-order-next-step-button']")
    WebElement confirmButton ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Thank you']")
    WebElement thankYouText ;
    @CacheLookup
    @FindBy(xpath="//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement orderSuccessMessage ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 order-completed-continue-button']")
    WebElement continueButtonComplete;

    @CacheLookup
    @FindBy(xpath="//div[@class='topic-block-title']")
    WebElement welcomeStoreText;
    @CacheLookup
    @FindBy(linkText="Log out")
    WebElement logoutLink;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeSignin ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Register']")
    WebElement registerText ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 payment-method-next-step-button']")
   // @FindBy(name ="save")
    WebElement continueButtonPaymentmethod ;

    //**********************************Action Methods***************************************
    public void mouseHoverOnElectronics(){
        log.info("Mouse hover on Electronics" );
        mouseHoverToElement(electronics);
    }
//    public void clickOnRegisterButton(){
//        log("Click on Register button" );
//        CustomListeners.test.log(Status.PASS,"Click on Register button");
//        clickOnElement(registerButton);
//    }
//    public void clickOnRegistrationButton(){
//        log("Click on Registration button" );
//        CustomListeners.test.log(Status.PASS,"Click on Registration button");
//        clickOnElement(registrationButton);
//    }
//    public void clickOnLoginLink(){
//        log("Click on Login link" );
//        CustomListeners.test.log(Status.PASS,"Click on Login link");
//        clickOnElement(loginLink);
//    }
public void clickOnContinueButtonOnBillingAdd(){
        log.info("Click on continue");
        clickOnElement(continueButtonBilling);
}
    public void mouseHoverAndClickOnCellPhones(){
        log.info("Click on CellPhones" );
        mouseHoverToElementAndClick(cellPhonesLink);

    }
    public void clickOnListView(){
        log.info("Click on List view" );
        clickOnElement(listView);
    }
    public void clickOnRadioButton2ndAir(){
        log.info("Click on 2ndAir Radiao button" );

        clickOnElement(radioButton2ndDayAir);
    }
    public void clickOnNokiaLumia1020(){
        log.info("Click on NokiaLumia1020" );

        clickOnElement(nokiaLumia1020link);
    }
    public void clickOnAddToCartButton(){
        log.info("Click on ADDTOCART button" );
        clickOnElement(addToCartButton);
    }
    public void mouseHoverOnShoppingCart(){
        log.info("Mouse hover on Shopping Cart" );
        mouseHoverToElement(shoppingCart);

    }
    public void clickOnContinueButtonShipping(){
        log.info("Click on Continue button" );
        clickOnElement(continueButtonShipping);
    }

    public void clickOnGoToCart(){
        log.info("Click on GOTOCART button" );
        clickOnElement(goToCartButton);
    }
    public void clickOntermsAndConditionCheckbox(){
        log.info("Click on TermsAndCondition checkbox" );
        clickOnElement(termsAndConditionCheckbox);
    }

    public void clickOnCheckOutButton(){
        log.info("Click on Checkout " );
        clickOnElement(checkoutButton);
    }


    public void clickOnContinueButton(){
        log.info("Click on Continue button" );
        clickOnElement(continueButton);
    }
    public void clickOnLoginbutton(){
        log.info("Click on Login button" );
        clickOnElement(loginButton);
    }
    public void clickOnContinueButtonOnBillingPage(){
        log.info("Click on Continue " );
        clickOnElement(continueButtonBilling);
    }
    public void clickOnRadioButtonCrditCard(){
        log.info("Click on CreditCard radio button" +creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    public void clickOnCrossButton(){
        log.info("Click on Cross button" );
        clickOnElement(crossButton);
    }
    public void clickOnContinueButtonPaymentInfo(){
        log.info("Click on Continue" );
        clickOnElement(continueButtonPaymentInfo);
    }
    public void clickOnConfirmButton(){
        log.info("Click on Continue" );
        clickOnElement(confirmButton);
    }
    public void clickOnContinueButtonCompleted(){
        log.info("Click on Continue" );
        clickOnElement(continueButtonComplete);
    }
    public void clickOnLogoutLink(){
        log.info("Click on Logout" );
        clickOnElement(logoutLink);
    }
    public void clickOnContinuePaymentMethod(){
        log.info("Click on Continue" );
        clickOnElement(continueButtonPaymentmethod);
    }
    public void clickOnNokiaLumiaLink(){
        log.info("Click on NokiaLlumia" );
        clickOnElement(nokiaLumia1020link);
    }



    //**********************************Get Values Methods***********************************
    public String getCellphonesText(){
        log.info("Get CellPhone Text" );
        return getTextFromElement(cellphoneText);
    }
    public String getQuantityText(){
        log.info("Get Quantity" );
        return quantityText.getAttribute("value");
    }
    public String getNokialumia1020Text(){
        log.info("Get Nokialumia1020 Text" );
        return getTextFromElement(getNokiaLumia1020Text);
    }
    public String getProductAddedMessage(){
        log.info("Get ProductAdded Message" );
        return getTextFromElement(productAddedText);
    }
    public String getPrice349(){
        log.info("Get Price349" );
        return getTextFromElement(price$349Text);
    }
    public String getTotalSummary(){
        log.info("Get Total" );
        return getTextFromElement(totalSummaryText);
    }
    public String getShoppingCartText(){
        log.info("Get Shopping Cart text" );
        return getTextFromElement(shoppingCartText); }
    public String getTotal698Text1(){
        log.info("Get Total 698 text" );
        return getTextFromElement(totalText6981); }
    public String getTotal698Text(){
        log.info("Get Total 698 text" );
        return getTextFromElement(totalText698); }
    public String getWelcomeSignInText(){
        log.info("Get Welcome Sign in text" );
        return getTextFromElement(welcomeSignin);}
    public String getRegistrationCompleteText(){
        log.info("Get Registration Complete text" );
        return getTextFromElement(registrationCompleteText); }
    public String getShoppinCartTextAfterRegister(){
        log.info("Get Shopping Cart text" );
        return getTextFromElement(shoppingCartTextAfterRegister); }
    public String getPaymentMethodText(){
        log.info("Get Payment Method text" );
        return getTextFromElement(paymentMethodText); }
    public String getShippingMethodText(){
        log.info("Get Shipping Method text" );
        return getTextFromElement(shippingMethodText);}
    public String getTotal(){
        log.info("Get Total" );
        return getTextFromElement(totalText); }
    public String getThankYouText(){
        log.info("Get Thank You text" );
        return getTextFromElement(thankYouText); }
    public String getYourOrderMessage(){
        log.info("Get Your order message" );
        return getTextFromElement(orderSuccessMessage); }
    public String getWelcomeStoreText(){
        log.info("Get Welcome Store" );
        return getTextFromElement(welcomeStoreText);   }
    public String getRegisterText(){
        log.info("Get Register Text" );
        return getTextFromElement(registerText);
    }
    //**********************************Send Values Methods**********************************
    public void changeQuantity(String qty){
        log.info("Change Quantity "+qty );
        clearTextFromField(quantity);
        sendTextToElement(quantity,qty);
    }
    public void fillFirstNameLastNameField(String firstname,String lastname){
        log.info("Enter FirstName and LastName" );
        sendTextToElement(firstNameField,firstname);
        sendTextToElement(lastNameField,lastname);
    }
    public void fillEmailField(String email){
        log.info("Enter Email " );
        sendTextToElement(emailField,email);
    }
    public void fillPasswordAndConfirmPassword(String password,String confirmpassword){
        log.info("Enter Password and Confirm Password");

        sendTextToElement(passwordField,password);
        sendTextToElement(confirmPassword,confirmpassword);
    }
    public void fillEmailFieldInLoginPage(String email){
        log.info("Enter Email" );
        sendTextToElement(loginEmailField,email);
    }
    public void fillPasswordInLoginpage(String password){
        log.info("Enter password " );
        sendTextToElement(loginPasswordField,password);
    }
    public void fillAdress1(String address){
        log.info("Enter firstline of Address" );
        sendTextToElement(address1Field,address);
    }
    public void fillCountry(String country){
        log.info("Enter country" );
        selectByVisibleTextFromDropDown(countryField,country);
    }
    public void fillCity(String city){
        log.info("Enter City" );
        sendTextToElement(cityField,city);
    }
    public void fillPostCode(String postcode){
        log.info("Enter PostCode" );
        sendTextToElement(postCodeField,postcode);
    }
    public void fillPhoneNumber(String phonenumber){
        log.info("Enter Telephonenumber" );
        sendTextToElement(phoneNumberField,phonenumber);
    }
    public void fillCardHolderNameField(String name){
        log.info("Enter CardHolderName" );
        sendTextToElement(cardHolderNameField,name);
    }
    public void fillCardNumberField(String cardnumber){
        log.info("Enter CardNumber" );
        sendTextToElement(cardNumberField,cardnumber);
    }
    public void fillExpiryMonthField(String month){
        log.info("Enter Expiry Month" );
        sendTextToElement(expiryMonthField,month);
    }
    public void fillExpiryYearField(String year){
        log.info("Enter Expiry year" );
        sendTextToElement(expiryYearField,year);
    }
    public void fillCardcodeField(String cardcode){
        log.info("Enter Card Code" );
        sendTextToElement(cardCodeField,cardcode);
    }
    //**********************************Select From DropDownMethods**************************
    public void selectVisaFromDropdown(String cardtype){
        log.info("Select Visa from dropdown" );
        selectByContainsTextFromDropDown(cardOptions,cardtype);
    }
    public void clickOnContinueButtonOnPaymentMethod(){
        log.info("Click on Continue button on Payment method page");
        clickOnElement(continueButtonPaymentmethod);
    }
    public String getCurrentUrlText(){
        log.info("Current URL "+ driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }


}
