package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class LoginSteps {
    @Given("^I am homepage$")
    public void iAmHomepage() {
    }
    @When("^I click on Login Link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }
    @And("^I verify \"([^\"]*)\"$")
    public void iVerify(String text)throws InterruptedException  {
        Thread.sleep(1000);
        System.out.println(new LoginPage().getWelcomeText()+"    "+text);
        Assert.assertEquals(new LoginPage().getWelcomeText(), text, "Login page not displayed");
    }
    @When("^I enters following users login details$")
    public void iEntersFollowingUsersLoginDetails(DataTable data) throws InterruptedException{
        List<List<String>> userLoginDetail = data.cells(0);
        new LoginPage().enterEmailId(userLoginDetail.get(0).get(0));
        Thread.sleep(2000);
        new LoginPage().enterPassword(userLoginDetail.get(0).get(1));
    }

    @Then("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }






}
