package base;
import dataObjects.customer.User;
import dataObjects.customer.Users;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.Constants;
import utilities.DriverManager;
import utilities.JavaHelpers;
import utilities.SeleniumHelper;

import java.io.IOException;

public class BaseTest {

    protected static User logInUser;
    protected WebDriver driver;
    protected SeleniumHelper selenium;
    protected DriverManager driverManager;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) {
        driverManager = new DriverManager();
        driver = driverManager.setUp(browser);
        selenium = new SeleniumHelper(driver);
    }
    /*@BeforeMethod
    @Parameters("browser")
    public void setUp(String browser) throws Exception {
        if(browser.equalsIgnoreCase("chrome")){
            driverManager = new DriverManager();
            driver = driverManager.setUp(browser);
            selenium = new SeleniumHelper(driver);
        }else if(browser.equalsIgnoreCase("edge")){
            driverManager = new DriverManager();
            driver = driverManager.setUp(browser);
            selenium = new SeleniumHelper(driver);
        }else if(browser.equalsIgnoreCase("firefox")){
            driverManager = new DriverManager();
            driver = driverManager.setUp(browser);
            selenium = new SeleniumHelper(driver);
        }else{
            //If no browser is passed throw exception
            throw new Exception("Incorrect Browser");
        }
    }*/

    @AfterMethod
    public void tearDown(ITestResult result) {
        try {
            //capturing screenshot if failed
            if (ITestResult.FAILURE == result.getStatus()) {
                selenium.takeScreenshot(result.getName());
            }
        } catch (Exception e) {
            //ignore
        }
        driverManager.tearDown();
    }

    @BeforeSuite
    public void beforeSuite() throws IOException, ParseException {
        //Deletes screenshots
        logInUser = this.setUserDataByDescription("LogInUser");
        new JavaHelpers().deleteAllFilesFromFolder(Constants.SCREENSHOT_LOCATION);
    }
    public User setUserDataByDescription(String userType) throws IOException, ParseException {
        String USERS_JSON = "src/main/resources/users-local.json";
        return JavaHelpers.jsonDeserialization(JavaHelpers.jsonToString(USERS_JSON), Users.class).getUsers().stream().filter(x -> x.getDescription().equalsIgnoreCase(userType)).findFirst().get();
    }
}
