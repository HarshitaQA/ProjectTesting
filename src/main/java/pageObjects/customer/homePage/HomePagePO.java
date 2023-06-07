package pageObjects.customer.homePage;

import common.HeaderPO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.base.BasePO;

public class HomePagePO extends BasePO {

    public HomePagePO(WebDriver driver) {
        super(driver);
    }

    HeaderPO headerPO = new HeaderPO(driver);
    @FindBy(xpath = "//div[@id = 'carouselExampleIndicators']")
    private WebElement SliderBox;

    @FindBy(xpath = "//div[@class = 'carousel-inner']//img[@alt = 'First slide']")
    private WebElement SliderBox1;

    @FindBy(xpath = "//div[@class = 'carousel-inner']//img[@alt = 'Second slide']")
    private WebElement SliderBox2;

    @FindBy(xpath = "//div[@class = 'carousel-inner']//img[@alt = 'Third slide']")
    private WebElement SliderBox3;

    @FindBy(xpath = "//a[@id = 'cat']")
    private WebElement CategoriesMenu;

    @FindBy(xpath = "//a[text() = 'Phones']")
    private WebElement PhonesMenu;

    @FindBy(xpath = "//a[text() = 'Laptops']")
    private WebElement LaptopsMenu;

    @FindBy(xpath = "//a[text() = 'Monitors']")
    private WebElement MonitorsMenu;

    @FindBy(xpath = "//div[@id = 'tbodyid']")
    private WebElement ListOfPhones;

    @FindBy(xpath ="//ul[@class='pagination']")
    private WebElement Pagination;

    public Boolean isSliderBoxPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(SliderBox);
        return selenium.isElementPresent(SliderBox);
    }

    public Boolean isSliderBoxOnePresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(SliderBox1);
        return selenium.isElementPresent(SliderBox1);
    }
    public Boolean isSliderBoxTwoPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(SliderBox2);
        return selenium.isElementPresent(SliderBox2);
    }
    public Boolean isSliderBoxThreePresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(SliderBox3);
        return selenium.isElementPresent(SliderBox3);
    }

    public Boolean isCategoriesPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(CategoriesMenu);
        return selenium.isElementPresent(CategoriesMenu);
    }

    public Boolean isPhonesMenuPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(PhonesMenu);
        return selenium.isElementPresent(PhonesMenu);
    }

    public Boolean isLaptopsMenuPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(LaptopsMenu);
        return selenium.isElementPresent(LaptopsMenu);
    }

    public Boolean isMonitorsMenuPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(MonitorsMenu);
        return selenium.isElementPresent(MonitorsMenu);
    }

    public Boolean isListOfPhonesPresent() throws InterruptedException {
        selenium.waitTillElementIsVisible(ListOfPhones);
        return selenium.isElementPresent(ListOfPhones);
    }

    public Boolean isPaginationPresent() throws InterruptedException{
        selenium.waitTillElementIsVisible(Pagination);
        return selenium.isElementPresent(Pagination);
    }

    public void clickOnCategoriesPresent() throws InterruptedException {
        selenium.clickOn(CategoriesMenu);
    }

    public void clickOnLaptopsButtonPresent() throws InterruptedException {
        selenium.clickOn(LaptopsMenu);
    }

    public void clickOnMonitorsMenuPresent() throws InterruptedException {
        selenium.clickOn(MonitorsMenu);
    }

    public void clickOnListOfPhonesMenuPresent() throws InterruptedException {
        selenium.clickOn(ListOfPhones);
    }


}
