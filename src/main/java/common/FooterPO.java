package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.base.BasePO;

public class FooterPO extends BasePO {
    public FooterPO(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//div[@id = 'footc']")
    private WebElement Footer;

    @FindBy(xpath = "//p[text() = 'Copyright © Product Store 2017']")
    private WebElement copyRight;

    @FindBy(xpath = "//div[@class = 'caption']//h4[@class='grrrr']//b[text()='About Us']")
    private WebElement aboutUs;

    @FindBy(xpath = "//*[contains(text(),'performance')]")
    private WebElement aboutUsParagraph;

    @FindBy(xpath = "//div[@class = 'caption']//h4[@class='grrrr']//b[text()='Get in Touch']")
    private WebElement getInTouch;

    @FindBy(xpath = "//*[contains(text(),'Address')]")
    private WebElement getInTouchAddress;

    @FindBy(xpath = "//*[contains(text(),'Phone')]")
    private WebElement getInTouchPhone;

    @FindBy(xpath = "//*[contains(text(),'blazemeter')]")
    private WebElement getInTouchEmail;

    public boolean isFooterPresent(){
        selenium.waitTillElementIsVisible(Footer);
        return selenium.isElementPresent(Footer);
    }

    public boolean isCopyRightPresent(){
        selenium.waitTillElementIsVisible(copyRight);
        return selenium.isElementPresent(copyRight);
    }

    public boolean isAboutUsPresent(){
        selenium.waitTillElementIsVisible(aboutUs);
        return selenium.isElementPresent(aboutUs);
    }

    public boolean isAboutUsParagraphTextPresent(){
        selenium.waitTillElementIsVisible(aboutUsParagraph);
        return selenium.isElementPresent(aboutUsParagraph);
    }

    public boolean isGetInTouchPresent(){
        selenium.waitTillElementIsVisible(getInTouch);
        return selenium.isElementPresent(getInTouch);
    }

    public boolean isGetInTouchEmailPresent(){
        selenium.waitTillElementIsVisible(getInTouchEmail);
        return selenium.isElementPresent(getInTouchEmail);
    }

    public boolean isGetInTouchPhonePresent(){
        selenium.waitTillElementIsVisible(getInTouchPhone);
        return selenium.isElementPresent(getInTouchPhone);
    }

    public boolean isGetInTouchAddressPresent(){
        selenium.waitTillElementIsVisible(getInTouchAddress);
        return selenium.isElementPresent(getInTouchAddress);
    }
}
