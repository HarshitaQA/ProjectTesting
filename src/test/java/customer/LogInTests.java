package customer;

import base.BaseTest;
import common.HeaderPO;
import dataFactory.customer.LoginData;
import dataObjects.customer.LogIn;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pageObjects.customer.homePage.LogInPO;
import utilities.Constants;
import utilities.SeleniumHelper;

import java.time.Duration;

public class LogInTests extends BaseTest {
        @Test
        public void verifyThatUserIsAbleToLogInSuccessfullyWithRegisteredUser() throws InterruptedException {
            //Page Object

            HeaderPO headerPO = new HeaderPO(driver);
            LogInPO logInPO = new LogInPO(driver);

            //Data Factory
            LogIn logInData = new LoginData().addLogInData();
            String headerTextForLogInModel = "Log in";

            Reporter.log("Step 1: Navigate to the customer home page");
            SeleniumHelper.navigateToPage(Constants.User_URL);

            Reporter.log("Step 2: Click on Login button and verify that the signup pop up is opened.");
            headerPO.isLoginButtonLinkPresent();
            headerPO.clickOnLoginButtonLink();
            Assert.assertEquals(logInPO.getHeaderTextForLogInModel(),headerTextForLogInModel,"Log In Model Header Text is not matched");

            Reporter.log("Step 3: Enter Log In model Details and click on 'LogIn' button");
            logInPO.addUserNameAndPasswordAndClickOnLoginButton(logInUser.getUserName(),logInUser.getPassword());

            Reporter.log("Step 4: Verify that if the alert box of LogIn is successful and closed after clicking on OK button.");

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
