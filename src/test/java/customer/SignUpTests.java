package customer;

import base.BaseTest;
import common.HeaderPO;
import dataFactory.customer.SignUpData;
import dataObjects.customer.SignUp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pageObjects.customer.homePage.SignUpPO;
import utilities.Constants;
import utilities.SeleniumHelper;

import java.time.Duration;

public class SignUpTests extends BaseTest {

    @Test
    public void verifyThatUserIsAbleToSignUp() throws InterruptedException {
        //Page Object
        SignUpPO signUpPO = new SignUpPO(driver);
        HeaderPO headerPO = new HeaderPO(driver);

        //Data Factory
        SignUp signUpData = new SignUpData().addSignUpData();
        String headerTextForSignInModel = "Sign up";

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Click on SignUp button and verify that the signup pop up is opened.");
        headerPO.isSignUpButtonLinkPresent();
        headerPO.clickOnSignUpButtonLink();
        Assert.assertEquals(signUpPO.getHeaderTextForSignInModel(),headerTextForSignInModel,"Sign Up Model Header Text is not matched");

        Reporter.log("Step 3: Enter Sign In model Details and click on 'Sign Up' button");
        signUpPO.addUserNameAndPasswordAndClickOnSignUpButton(signUpData);

        Reporter.log("Step 4: Verify that if the alert box of SignUp is successful and closed after clicking on OK button.");

        try{

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());

            alert.accept();
            System.out.println("Accepted the alert successfully.");
            }catch(Throwable e){
                System.err.println("Error came while waiting for the alert popup. "+e.getMessage());
            }
    }
    @Test
    public void verifyThatSignUpModelIsClosedAfterClickingOnCloseButton() throws InterruptedException {
        //Page Object
        pageObjects.customer.homePage.SignUpPO signUpPO = new pageObjects.customer.homePage.SignUpPO(driver);
        HeaderPO headerPO = new HeaderPO(driver);

        //Data Factory
        SignUp signUpData = new SignUpData().addSignUpData();
        String headerTextForSignInModel = "Sign up";

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Click on SignUp button and verify that the signup pop up is opened.");
        headerPO.isSignUpButtonLinkPresent();
        headerPO.clickOnSignUpButtonLink();
        Assert.assertEquals(signUpPO.getHeaderTextForSignInModel(),headerTextForSignInModel,"Sign Up Model Header Text is not matched");

        Reporter.log("Step 3: Enter Sign In model Details and click on 'Close' button");
        signUpPO.addUserNameAndPasswordAndClickOnCloseButton(signUpData);

    }
    @Test
    public void verifyThatErrorAlertIsDisplayedAfterNotEnteringUserNamePasswordAndClickingOnSignUpButton() throws InterruptedException {
        //Page Object
        pageObjects.customer.homePage.SignUpPO signUpPO = new pageObjects.customer.homePage.SignUpPO(driver);
        HeaderPO headerPO = new HeaderPO(driver);

        //Data Factory
        String headerTextForSignInModel = "Sign up";

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Click on SignUp button and verify that the signup pop up is opened.");
        headerPO.isSignUpButtonLinkPresent();
        headerPO.clickOnSignUpButtonLink();
        Assert.assertEquals(signUpPO.getHeaderTextForSignInModel(),headerTextForSignInModel,"Sign Up Model Header Text is not matched");

        Reporter.log("Step 3: Click on 'Sign Up' button");
        signUpPO.clickOnSignUpButton();

        Reporter.log("Step 4: Verify that if the alert box of Error Message is displayed.");

        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());

            alert.accept();
            System.out.println("Accepted the alert successfully.");
        }catch(Throwable e){
            System.err.println("Error came while waiting for the alert popup. "+e.getMessage());
        }
    }
}
