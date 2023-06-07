package customer;

import base.BaseTest;
import common.CommonPO;
import common.FooterPO;
import common.HeaderPO;
import common.PaginationPO;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pageObjects.customer.homePage.HomePagePO;
import utilities.Constants;
import utilities.SeleniumHelper;

public class HomePageTests extends BaseTest {

    @Test
    public void verifyThatTheHeaderIsDisplayedWithHomeContactAboutusCartLoginSignupButtonsSuccessfully() throws InterruptedException {
        HeaderPO headerPO = new HeaderPO(driver);
        CommonPO commonPO = new CommonPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that Home Button,Contact Button, About Us, Cart, Login, Signup buttons are present or not");
        selenium.hardWait(3);
        String HomeLink = "Home";
        String ContactLink = "Contact";

        commonPO.clickOnHeaderMenu(HomeLink);
        commonPO.clickOnHeaderMenu(ContactLink);


        Assert.assertTrue(headerPO.isHomeLinkPresent(),"Home link is not present");
        Assert.assertTrue(headerPO.isContactButtonLinkPresent(),"Contact Button Link is not present");
        Assert.assertTrue(headerPO.isAboutUsButtonLinkPresent(),"About us button link is not present");
        Assert.assertTrue(headerPO.isCartButtonLinkPresent(),"Cart button link is not present");
        Assert.assertTrue(headerPO.isLoginButtonLinkPresent(),"Login button link is not present");
        Assert.assertTrue(headerPO.isSignUpButtonLinkPresent(),"SignUp Button link is not present");


    }

    @Test
    public void verifyThatIsSliderBoxPresentOrNot() throws InterruptedException {
        HomePagePO homePagePO = new HomePagePO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the slider box is present or not");
        selenium.hardWait(3);

        Assert.assertTrue(homePagePO.isSliderBoxPresent(), "Slider Box is not present");
    }

    @Test
    public void verifyThatIsSlidingImageOneTwoThreePresentOrNot() throws InterruptedException {
        HomePagePO homePagePO = new HomePagePO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the slider Image 1 is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(homePagePO.isSliderBoxOnePresent(),"Slider box one is not present");
        Assert.assertTrue(homePagePO.isSliderBoxTwoPresent(),"slider box two is not present");
        Assert.assertTrue(homePagePO.isSliderBoxThreePresent(),"Slider box three is not present");

    }
    @Test
    public void verifyThatIfPrevButtonIsPresentOrNot() throws InterruptedException {
        PaginationPO paginationPO = new PaginationPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the previous button is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(paginationPO.isPrevBtnPresent(),"Previous button is not present");
    }

    @Test
    public void verifyThatIfNextButtonIsPresentOrNot() throws InterruptedException {
        PaginationPO paginationPO = new PaginationPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the previous button is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(paginationPO.isNextBtnPresent(),"Next button is not present");
    }

    @Test
    public void verifyThatIfCategoriesMenuIsPresentOrNot() throws InterruptedException {
        HomePagePO homePagePO = new HomePagePO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the categories is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(homePagePO.isCategoriesPresent(),"Categories is not present");
    }

    @Test
    public void verifyThatIfPhonesMenuIsPresentOrNot() throws InterruptedException {
        HomePagePO homePagePO = new HomePagePO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Phones Menu is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(homePagePO.isPhonesMenuPresent(),"Phone menu is not present");
    }
    @Test
    public void verifyThatIfLaptopsMenuIsPresentOrNot() throws InterruptedException {
        HomePagePO homePagePO = new HomePagePO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Laptops Menu is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(homePagePO.isLaptopsMenuPresent(),"Laptop menu is not present");
    }

    @Test
    public void verifyThatIfMonitorsMenuIsPresentOrNot() throws InterruptedException {
        HomePagePO homePagePO = new HomePagePO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Monitors Menu is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(homePagePO.isMonitorsMenuPresent(),"Monitor menu is not present.");
    }
    @Test
    public void verifyThatIfTheListOfPhonesIsPresentOrNot() throws InterruptedException {
        HomePagePO homePagePO = new HomePagePO(driver);

        Reporter.log("Step1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the List of Phones is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(homePagePO.isListOfPhonesPresent(),"Phones List is not present.");

    }
    @Test
    public void verifyThatIfThePaginationIsPresentOrNot() throws InterruptedException {
        HomePagePO homePagePO = new HomePagePO(driver);

        Reporter.log("Step1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the List of Phones is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(homePagePO.isPaginationPresent(),"Pagination is not present.");

    }

    @Test
    public void verifyThatIfTheFooterIsPresent() throws InterruptedException {
        FooterPO footerPO = new FooterPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Footer is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(footerPO.isFooterPresent(),"Footer is not present.");
    }

    @Test
    public void verifyThatIfCopyRightIsPresent() throws InterruptedException {
        FooterPO footerPO = new FooterPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the CopyRight is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(footerPO.isCopyRightPresent(),"Copy right is not present");
    }

    @Test
    public void verifyThatIfAboutUsIsPresent() throws InterruptedException {
        FooterPO footerPO = new FooterPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the AboutUs is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(footerPO.isAboutUsPresent(),"About us is not present.");
    }

    @Test
    public void verifyThatIfAboutUsParagraphIsPresent() throws InterruptedException {
        FooterPO footerPO = new FooterPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the AboutUs Paragraph is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(footerPO.isAboutUsParagraphTextPresent(),"About us Paragraph is not present");
    }

    @Test
    public void verifyThatIfGetInTouchIsPresent() throws InterruptedException {
        FooterPO footerPO = new FooterPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Get in Touch is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(footerPO.isGetInTouchPresent(),"get in touch is not present");
    }

    @Test
    public void verifyThatIfGetInTouchAddressIsPresent() throws InterruptedException {
        FooterPO footerPO = new FooterPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the AboutUs is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(footerPO.isAboutUsParagraphTextPresent(),"Get in touch Address is not present");
    }

    @Test
    public void verifyThatIfGetInTouchPhoneIsPresent() throws InterruptedException {
        FooterPO footerPO = new FooterPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the AboutUs is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(footerPO.isGetInTouchPhonePresent(),"get in touch phone is not present");
    }

    @Test
    public void verifyThatIfGetInTouchEmailIsPresent() throws InterruptedException {
        FooterPO footerPO = new FooterPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the getInTouch email is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(footerPO.isGetInTouchEmailPresent(),"get in touch email is not present");
    }

    @Test
    public void verifyThatIfLogoButtonIsClickableOrNot() throws InterruptedException {
        HeaderPO headerPO = new HeaderPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Home Link is clickable or not");
        selenium.hardWait(3);
        Assert.assertTrue(headerPO.isLogoPresent(),"Logo is not present");
        headerPO.clickOnLogoLink();
    }

    @Test
    public void verifyThatIfHomeButtonLinkIsClickableOrNot() throws InterruptedException {
        HeaderPO headerPO = new HeaderPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Home Button Link is clickable or not");
        selenium.hardWait(3);
        Assert.assertTrue(headerPO.isHomeLinkPresent(),"Home Button Link is not present");
        headerPO.clickOnHomeButtonLink();
    }

    @Test
    public void verifyThatIfContactLinkIsClickableOrNot() throws InterruptedException {
        HeaderPO headerPO = new HeaderPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Contact Link is clickable or not");
        selenium.hardWait(3);
        Assert.assertTrue(headerPO.isContactButtonLinkPresent(),"Contact Button Link is not present");
        headerPO.clickOnContactButtonLink();

    }
    @Test
    public void verifyThatIfAboutUsLinkIsClickableOrNot() throws InterruptedException {
        HeaderPO headerPO =  new HeaderPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the About us Link is clickable or not");
        selenium.hardWait(3);
        headerPO.clickOnAboutUsButtonLink();
    }

    @Test
    public void verifyThatIfCartLinkIsClickableOrNot() throws InterruptedException {
        HeaderPO headerPO = new HeaderPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the cart link is clickabe or not");
        selenium.hardWait(3);
        headerPO.clickOnCartButtonLink();
    }

    @Test
    public void verifyThatIfLoginLinkIsClickableOrNot() throws InterruptedException {
        HeaderPO headerPO = new HeaderPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the login link is clickabe or not");
        selenium.hardWait(3);
        headerPO.clickOnLoginButtonLink();
    }
    @Test
    public void verifyThatIfSignUpLinkIsClickableOrNot() throws InterruptedException {
        HeaderPO headerPO = new HeaderPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Signup link is clickabe or not");
        selenium.hardWait(3);
        headerPO.clickOnSignUpButtonLink();
    }

    @Test
    public void verifyThatIfPrevButtonIsClickableOrNot() throws InterruptedException {
        PaginationPO paginationPO = new PaginationPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Previous button is clickable or not");
        selenium.hardWait(3);
        paginationPO.isPrevBtnClickable();
    }

    @Test
    public void verifyThatIfNextButtonIsClickableOrNot() throws InterruptedException {
        PaginationPO paginationPO = new PaginationPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Previous button is clickable or not");
        selenium.hardWait(3);
        paginationPO.isNextBtnClickable();
    }
    @Test
    public void verifythatIfCategoriesButtonIsClickableOrNot() throws InterruptedException {
        HomePagePO homePagePO = new HomePagePO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Categories button is clickable or not");
        selenium.hardWait(3);
        homePagePO.clickOnCategoriesPresent();
    }
    @Test
    public void verifyThatIfPhonesButtonIsClickableOrNot() throws InterruptedException {
        HomePagePO homePagePO = new HomePagePO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Phones button is clickable or not");
        selenium.hardWait(3);
        homePagePO.clickOnListOfPhonesMenuPresent();
    }

    @Test
    public void verifyThatIfLaptopsButtonIsClickableOrNot() throws InterruptedException {
        HomePagePO homePagePO = new HomePagePO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Phones button is clickable or not");
        selenium.hardWait(3);
        homePagePO.clickOnLaptopsButtonPresent();
    }
    @Test
    public void verifyThatIfMonitorsButtonIsClickableOrNot() throws InterruptedException {
        HomePagePO homePagePO = new HomePagePO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Phones button is clickable or not");
        selenium.hardWait(3);
        homePagePO.clickOnMonitorsMenuPresent();
    }

    @Test
    public void verifyThatIfCopyRightIsPresentOrNot() throws InterruptedException {
        FooterPO footerPO = new FooterPO(driver);

        Reporter.log("Step 1: Navigate to the customer home page");
        SeleniumHelper.navigateToPage(Constants.User_URL);

        Reporter.log("Step 2: Verify that the Get in Touch is present or not");
        selenium.hardWait(3);
        Assert.assertTrue(footerPO.isCopyRightPresent(),"Copy right is not present");
    }
}
