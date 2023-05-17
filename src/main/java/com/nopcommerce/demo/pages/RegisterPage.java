package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath= "//body[1]/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement nopCommerceLogo;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/h1[1]")
    WebElement registerTitle;
    @CacheLookup
    @FindBys(@FindBy( xpath ="//div[@class='gender']//label"))
    List<WebElement> genderMaleFemale;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dayofDateOfBirth;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthOfDateOfBirth;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearOfDateOfBirth;
    @CacheLookup
    @FindBy(name = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(css = "#register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath ="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement registrationCompleteMessage;

    public boolean verifyNopCommerceLogo(){
        log.info("Verify NopCommerce Logo  "+ nopCommerceLogo.toString());
        return nopCommerceLogo.isDisplayed();
    }
    public String getRegisterTitle(){
        log.info("Verify Register Title "+registerTitle.toString());
        return getTextFromElement(registerTitle);
    }
    public void selectGender(String gender){
        log.info("Click on Male or Female"+genderMaleFemale.toString());
       for(WebElement option : genderMaleFemale){
           if(option.getText().contains(gender)){
               clickOnElement(option);
               break;
           }
       }
    }
    public void enterFirstName(String firstname){
        log.info("Enter First Name "+firstNameField.toString());
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastName(String lastname){
        log.info("Enter Last Name "+lastNameField.toString());
        sendTextToElement(lastNameField,lastname);
    }
    public void selectDayOfDOfB(String day){
        log.info("Select Day from date of birth dropdown "+ dayofDateOfBirth.toString());
        selectByVisibleTextFromDropDown(dayofDateOfBirth,day);
    }
    public void selectMonthOfDOfB(String month){
        log.info("Select Month from date of birth dropdown "+ monthOfDateOfBirth.toString());
        selectByVisibleTextFromDropDown(monthOfDateOfBirth,month);
    }
    public void selectYearOfDOfB(String year){
        log.info("Select Year from date of birth dropdown "+ yearOfDateOfBirth.toString());
        selectByVisibleTextFromDropDown(yearOfDateOfBirth,year);
    }
    public void enterEmail(String email){
        log.info("Enter Email "+emailField.toString());
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        log.info("Enter Password "+passwordField.toString());
        sendTextToElement(passwordField,password);
    }
    public void enterConfirmPassword(String confirmPassword){
        log.info("Enter Confirm Password "+confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    public void clickOnRegisterButton(){
        log.info("Click on Register button "+ registerButton.toString());
        clickOnElement(registerButton);
    }
    public String getRegisterationCompleteMessage(){
        return getTextFromElement(registrationCompleteMessage);
    }



}
