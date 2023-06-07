package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.base.BasePO;

public class PaginationPO extends BasePO {

    public PaginationPO(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//button[@id= 'prev2']")
    private WebElement previousBtn;
    @FindBy(xpath = "//button[@id= 'next2']")
    private WebElement nextBtn;


    public Boolean isPrevBtnPresent(){
        selenium.waitTillElementIsVisible(previousBtn);
        return selenium.isElementPresent(previousBtn);
    }

    public void isPrevBtnClickable() throws InterruptedException {
        selenium.clickOn(previousBtn);
    }

    public Boolean isNextBtnPresent(){
        selenium.waitTillElementIsVisible(nextBtn);
        return selenium.isElementPresent(nextBtn);
    }

    public void isNextBtnClickable() throws InterruptedException {
        selenium.clickOn(nextBtn);
    }



}
