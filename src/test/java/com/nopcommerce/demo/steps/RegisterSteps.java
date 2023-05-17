package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class RegisterSteps {
    @Given("^I am Homepage and verify nopCommerce logo$")
    public void iAmHomepageAndVerifyNopCommerceLogo() {
        Assert.assertTrue( new RegisterPage().verifyNopCommerceLogo());
    }

    @When("^I click on Register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("^I verify \"([^\"]*)\" title$")
    public void iVerifyTitle(String title)  {
        Assert.assertEquals(new RegisterPage().getRegisterTitle(),title,"Register not displayed");
    }

    @And("^I enters following users details$")
    public void iEntersFollowingUsersDetails(DataTable dataTable) throws InterruptedException{
        List<List<String>> userList = dataTable.cells(0);
        new RegisterPage().selectGender(userList.get(0).get(0));
        Thread.sleep(1000);
        new RegisterPage().enterFirstName(userList.get(0).get(1));
        Thread.sleep(1000);
        new RegisterPage().enterLastName(userList.get(0).get(2));
        Thread.sleep(1000);
        new RegisterPage().selectDayOfDOfB(userList.get(0).get(3));
        Thread.sleep(1000);
        new RegisterPage().selectMonthOfDOfB(userList.get(0).get(4));
        Thread.sleep(1000);
        new RegisterPage().selectYearOfDOfB(userList.get(0).get(5));
        Thread.sleep(1000);
        new RegisterPage().enterEmail(userList.get(0).get(6));
        Thread.sleep(1000);
        new RegisterPage().enterPassword(userList.get(0).get(7));
        Thread.sleep(1000);
        new RegisterPage().enterConfirmPassword(userList.get(0).get(8));


    }
    @And("^I click on Register Button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }


    @Then("^I verify \"([^\"]*)\" message$")
    public void iVerifyMessage(String text)  {
        Assert.assertEquals(new RegisterPage().getRegisterationCompleteMessage(),text,"Your registration completed message not displayed");

    }
}
