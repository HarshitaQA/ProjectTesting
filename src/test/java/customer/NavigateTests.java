package customer;

import base.BaseTest;
import common.HeaderPO;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utilities.Constants;
import utilities.SeleniumHelper;

public class NavigateTests extends BaseTest {
    @Test
    public void verifyThatPageIsLoadedSuccessfully() throws InterruptedException {
        HeaderPO headerPO = new HeaderPO(driver);
        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that logo is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(headerPO.isLogoPresent());

        Reporter.log("Step 2: Verify that logo is present or not");
        headerPO.clickOnLogoLink();
    }

    @Test
    public void verifyThatIfTheBrowserTakesLongerTimeToLoadOrNot() {
        HeaderPO headerPO = new HeaderPO(driver);
        long BeforeTime = System.currentTimeMillis();

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the logo is clickable and get time");
        headerPO.isLogoButtonClickable();
        long AfterTime = System.currentTimeMillis();

        Reporter.log("Step 3: Calculate the actual time");
        long actualTime = AfterTime - BeforeTime;

        /**
         * Ideal time for loading any wesite page is 0-2 seconds, it can be allowed
         * to 3 seconds as well but not greater than 3 seconds
         */
        System.out.println("Page load time in milliseconds is:"+actualTime);
        long standardTime = 2000;

        Assert.assertTrue(standardTime>=actualTime);
    }
    /*@Test
    public void verifyThatPageIsLoadedSucccessfullyOnEdgeBrowser() throws Exception {
        HeaderPO headerPO = new HeaderPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that logo is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(headerPO.isLogoPresent());

        Reporter.log("Step 2: Verify that logo is present or not");
        headerPO.clickOnLogoLink();
    }*/
    /*@Test
    public void verifyThatPageIsLoadedSucccessfullyOnFirefoxBrowser() throws Exception {
        HeaderPO headerPO = new HeaderPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that logo is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(headerPO.isLogoPresent());

        Reporter.log("Step 2: Verify that logo is present or not");
        headerPO.clickOnLogoLink();
    }*/

   }
