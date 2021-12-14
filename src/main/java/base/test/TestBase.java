package base.test;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    private static WebDriver driver;
    private static final String CHROME_KEY = "webdriver.chrome.driver";
    private static final String CHROME_VALUE = "./drivers/chromedriver";

    @Before
    public void before() {
        System.setProperty(CHROME_KEY, CHROME_VALUE);
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @After(order = 1)
    public void tearDown(Scenario scenario) {
        driver.close();
    }
}
