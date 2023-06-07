package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.base.BasePO;


public class HeaderPO extends BasePO {
    public HeaderPO(WebDriver driver) {
        super(driver);
    }

    /*
     * All WebElements are identified by @FindBy annotation
     * @FindBy can accept tagName, partialLinkText, name, linkText, id, css, className, xpath as attributes.
     */

    @FindBy(xpath = "//button//following-sibling::a[@href='index.html'][@id='nava']")
    private WebElement logoLink;

    @FindBy(xpath = "//div[@class='navbar-collapse']//ul[@class = 'navbar-nav ml-auto']/child::li[@class = 'nav-item active']")
    private WebElement HomeButtonLink;

    @FindBy(xpath = "//div[@class='navbar-collapse']//ul[@class = 'navbar-nav ml-auto']/child::li[@class = 'nav-item active']//following-sibling::li//a[text()='Contact']")
    private WebElement ContactButtonLink;

    @FindBy(xpath = "//div[@class='navbar-collapse']//ul[@class = 'navbar-nav ml-auto']/child::li[@class = 'nav-item active']//following-sibling::li//a[text()='About us']")
    private WebElement AboutusButtonLink;

    @FindBy(xpath = "//div[@class='navbar-collapse']//ul[@class = 'navbar-nav ml-auto']/child::li[@class = 'nav-item active']//following-sibling::li//a[text()='Cart']")
    private WebElement CartButtonLink;

    @FindBy(xpath = "//ul[@class = 'navbar-nav ml-auto']//a[@id = 'login2']")
    private WebElement LoginButtonLink;

    @FindBy(css = "#navbarExample a#signin2")
    private WebElement SignUpButtonLink;
    ////div[@id = 'navbarExample']//a[@id = 'signin2']

    /*@FindBy(css = "button+a#nava")
    private WebElement logoLink1;*/

    /**
     * Is Logo Present
     *
     * @return true or false
     */
    /**
     * Is Login Button Present
     *
     * @return true or false
     */
    public Boolean isLogoPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(logoLink);
        return selenium.isElementPresent(logoLink);
    }
    public void clickOnLogoLink() throws InterruptedException {
        selenium.clickOn(logoLink);
    }
    public Boolean isHomeLinkPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(HomeButtonLink);
        return selenium.isElementPresent(HomeButtonLink);
    }
    public void clickOnHomeButtonLink() throws InterruptedException {
        selenium.clickOn(HomeButtonLink);
    }
    public Boolean isContactButtonLinkPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(ContactButtonLink);
        return selenium.isElementPresent(ContactButtonLink);
    }
    public void clickOnContactButtonLink() throws InterruptedException {
        selenium.clickOn(ContactButtonLink);
    }

    public Boolean isAboutUsButtonLinkPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(AboutusButtonLink);
        return selenium.isElementPresent(AboutusButtonLink);
    }

    public void clickOnCartButtonLink() throws InterruptedException {
        selenium.clickOn(CartButtonLink);
    }

    public void clickOnAboutUsButtonLink() throws InterruptedException {
        selenium.clickOn(AboutusButtonLink);
    }

    public Boolean isCartButtonLinkPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(CartButtonLink);
        return selenium.isElementPresent(CartButtonLink);
    }
    public Boolean isLoginButtonLinkPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(LoginButtonLink);
        return selenium.isElementPresent(LoginButtonLink);
    }
    public void clickOnLoginButtonLink() throws InterruptedException {
        selenium.clickOn(LoginButtonLink);
    }

    public Boolean isSignUpButtonLinkPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(SignUpButtonLink);
        return selenium.isElementPresent(SignUpButtonLink);
    }

    public void clickOnSignUpButtonLink() throws InterruptedException {
        selenium.clickOn(SignUpButtonLink);
    }


    public void isLogoButtonClickable() {
        selenium.waitTillElementIsClickable(logoLink);
    }


}
