package pageObjects.customer.homePage;

import dataFactory.customer.LoginData;
import dataObjects.customer.LogIn;
import dataObjects.customer.SignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.base.BasePO;

public class LogInPO extends BasePO {
    public LogInPO(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id = 'loginusername']")
    private WebElement loginUserName;

    @FindBy (xpath = "//input[@id = 'loginpassword']")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[@id='logInModal']//button[text()='Close']")
    private WebElement closeBtn;

    @FindBy(xpath = "//h5[@id = 'logInModalLabel']")
    private WebElement logInModelLabel;

    /**
     * Enter User name
     *
     * @param UserName
     *
     */
    public void enterUserName(String UserName){
        selenium.enterText(loginUserName,UserName,true);
    }

    /**
     * Enter Password
     * @param passWord
     */
    public void enterPassWord(String passWord){
        selenium.enterText(loginPassword,passWord,true);
    }

    /**
     * Click on Login button
     * @throws InterruptedException
     */
    public void clickOnLoginButton() throws InterruptedException {
        selenium.clickOn(loginBtn);
    }

    /**
     * Click on Close button
     * @throws InterruptedException
     */
    public void clickOnCloseButton() throws InterruptedException {
        selenium.clickOn(closeBtn);
    }
    /**
     * Get Header Text
     *
     * @return header Text
     */
    public String getHeaderTextForLogInModel() {
        return selenium.getText(logInModelLabel);
    }

    /**
     * Enter Username and Password & click on
     * Login button
     */
    public void addUserNameAndPasswordAndClickOnLoginButton(String userName, String password) throws InterruptedException {
        selenium.clearTextBoxUsingKeys(loginUserName);
        selenium.enterText(loginUserName,userName,true);
        selenium.clearTextBoxUsingKeys(loginPassword);
        selenium.enterText(loginPassword,password,true);
        clickOnLoginButton();
    }

}
