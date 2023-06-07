package pageObjects.customer.homePage;

import dataObjects.customer.SignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.base.BasePO;


public class SignUpPO extends BasePO {
    public SignUpPO(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//input[@id = 'sign-username']")
    private WebElement UserName;

    @FindBy (xpath = "//input[@id = 'sign-password']")
    private WebElement Password;

    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    private WebElement signUpBtn;

    @FindBy(xpath = "//div[@id='signInModal']//button[text()='Close']")
    private WebElement closeBtn;

    @FindBy(xpath = "//h5[@id = 'signInModalLabel']")
    private WebElement signInModelLabel;
    /**
     * Enter User name
     *
     * @param userName
     *
     */
    public void enterUserName(String userName){
        selenium.enterText(UserName,userName,true);
    }

    /**
     * Enter Password
     * @param passWord
     */
    public void enterPassWord(String passWord){
        selenium.enterText(Password,passWord,true);
    }

    /**
     * Click on Signup button
     * @throws InterruptedException
     */
    public void clickOnSignUpButton() throws InterruptedException {
        selenium.clickOn(signUpBtn);
    }

    /**
     * Click on Close button
     *
     * @throws InterruptedException
     */

    public void clickOnCloseButton() throws InterruptedException {
        selenium.clickOn(closeBtn);
    }

    /**
     * Enter Username and Password & click on
     * Signup button
     */
    public void addUserNameAndPasswordAndClickOnSignUpButton(SignUp signUpData) throws InterruptedException {
            selenium.clickOn(UserName);
            enterUserName(signUpData.getUserName());
            selenium.clickOn(Password);
            enterPassWord(signUpData.getPassWord());
            clickOnSignUpButton();
    }
    /**
     * Enter Username and Password & click on
     * Signup button
     */
    public void addUserNameAndPasswordAndClickOnCloseButton(SignUp signUpData) throws InterruptedException {
        selenium.clickOn(UserName);
        enterUserName(signUpData.getUserName());
        selenium.clickOn(Password);
        enterPassWord(signUpData.getPassWord());
        clickOnCloseButton();
    }
    /**
     * Get Header Text
     *
     * @return header Text
     */
    public String getHeaderTextForSignInModel() {
        return selenium.getText(signInModelLabel);
    }





}
