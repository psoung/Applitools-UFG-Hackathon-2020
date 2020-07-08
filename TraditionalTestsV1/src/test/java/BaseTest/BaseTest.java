package BaseTest;

import Pages.HomePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
        private WebDriver driver;
        protected HomePage homePage;

        public void setUpChrome() {
            System.setProperty("webdriver.chrome.driver","resources/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(1200,700));
            goHomePage();
        }

        public void setUpFirefox() {
            System.setProperty("webdriver.gecko.driver","resources/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().setSize(new Dimension(1200,700));
            goHomePage();
        }

        public void setUpEdge() {
            System.setProperty("webdriver.edge.driver","resources/msedgedriver");
            driver = new EdgeDriver();
            driver.manage().window().setSize(new Dimension(1200,700));
            goHomePage();
        }

        public void setUpChromeTablet() {
            System.setProperty("webdriver.chrome.driver","resources/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(768,700));
            goHomePage();
        }

        public void setUpFireFoxTablet() {
        System.setProperty("webdriver.gecko.driver","resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().setSize(new Dimension(768,700));
        goHomePage();
        }

        public void setUpEdgeTablet() {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver");
        driver = new EdgeDriver();
        driver.manage().window().setSize(new Dimension(768,700));
        goHomePage();
        }

        public void setUpChromeMobile() {
            System.setProperty("webdriver.chrome.driver","resources/chromedriver");
            Map<String, String> mobileEmulation = new HashMap<>();
            mobileEmulation.put("deviceName", "iPhone X");

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
            driver = new ChromeDriver(chromeOptions);
            goHomePage();
        }

        public void goHomePage() {
            driver.get("https://demo.applitools.com/gridHackathonV1.html");
            homePage = new HomePage(driver);
        }

    public boolean hackathonReporter(int task, String testName, String domId, String browser, String viewport, String device, boolean comparisonResult) {
        try(var writer = new BufferedWriter(new FileWriter("Traditional-V1-TestResults.txt", true))){
            writer.write("Task: " + task + ", Test Name: " + testName +", DOM Id: " + domId + ", Browser: " + browser
                    + ", Viewport: " + viewport + ", Device: " + device + ", Status: " + (comparisonResult ? "Pass" : "Fail"));
            writer.newLine();
        }catch(Exception e){
            System.out.println("Error writing to report file");
            e.printStackTrace();
        }
        return comparisonResult;
    }

        @AfterMethod
        public void teardown() {
            driver.quit();
        }
    }
