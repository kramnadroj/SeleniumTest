package tests.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        strict = true,
        features = "src/test/resources",
        glue="tests"
)
public class CucumberTest {

    private static final String googleUrl = "https://www.google.com";
    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
        driver = new SafariDriver();
        driver.get(googleUrl);

    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
        driver.close();

    }

}
