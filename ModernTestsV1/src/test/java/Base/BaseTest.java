package Base;

import Pages.HomePage;

import com.applitools.eyes.selenium.Eyes;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {

    protected static WebDriver driver;
    protected static HomePage homePage;
    protected static Eyes eyes;
    protected static EyesManager eyesManager;

    @BeforeClass
    public static void setUp() {
        Properties props = System.getProperties();
        try {
            props.load(new FileInputStream(new File("resources/test.properties")));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        driver = new ChromeDriver();
        eyesManager = new EyesManager(driver, "UFG Hackathon");

        driver.get("https://demo.applitools.com/gridHackathonV1.html");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
        eyes.abortIfNotClosed();
    }
}
