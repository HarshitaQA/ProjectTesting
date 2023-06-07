package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.base.BasePO;

public class CommonPO extends BasePO {
    public CommonPO(WebDriver driver) {
        super(driver);
    }

    /**Dynamic locators: The locators which are having all the common fields except any one
     * is unique then we can use locators as below.
     *
     * @param headerNames
     */
    public void clickOnHeaderMenu(String headerNames){
        String headerName = "//div[@class = 'navbar-collapse']//a[contains(text(),'"+headerNames+"')]";
        selenium.javascriptClickOn(By.xpath(headerName));
    }
}
