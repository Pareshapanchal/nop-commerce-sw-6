package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    public ComputerPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computer ;
    @CacheLookup
    @FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
    WebElement desktop ;
    @CacheLookup
    @FindBy(xpath="//select[@name='products-orderby']")
    WebElement positionDropDown ;
    @CacheLookup
    @FindBys(@FindBy(xpath="//h2[@class='product-title']"))
    List<WebElement> productTitle ;
    public void clickOnComputerFromTopMenu(){
        log.info("clickOnComputerFromTopMenu"+ computer.toString());
        mouseHoverToElement(computer);
         }
    public void clickOnDesktop(){
        log.info("clickOnDesktop" + desktop.toString());
        mouseHoverToElementAndClick(desktop);
         }
    public void sortTheDisplayTitlesFromSortBy(String text){
        log.info("sortTheDisplayTitlesFromSortBy" );
        selectByVisibleTextFromDropDown(positionDropDown,text);
    }
    public List<String> getExpectedList(){

        List<String> expectedTitle = getTheListOfElementFromTheList(productTitle);
        Collections.sort(expectedTitle);
        log.info("getExpectedList "+ expectedTitle);
        return expectedTitle;
    }
    public List<String> getAcctualList(){
       log.info("getAcctualList" );
       List<String> acctualList = getTheListOfElementFromTheList(productTitle);
        return acctualList;
    }

}
