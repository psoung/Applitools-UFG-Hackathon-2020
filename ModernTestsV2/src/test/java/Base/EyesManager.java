package Base;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EyesManager {

    private Eyes eyes;
    private WebDriver driver;
    private String appName;

    public EyesManager(WebDriver driver, String appName) {
        this.driver = driver;
        this.appName = appName;

        Configuration config = new Configuration();
        config.addBrowser(1200,700, BrowserType.CHROME);
        config.addBrowser(1200,700, BrowserType.FIREFOX);
        config.addBrowser(1200,700, BrowserType.EDGE_CHROMIUM);
        config.addBrowser(768,700, BrowserType.CHROME);
        config.addBrowser(768,700, BrowserType.FIREFOX);
        config.addBrowser(768,700, BrowserType.EDGE_CHROMIUM);
        config.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT);

        eyes = new Eyes(new VisualGridRunner(10));
        eyes.setApiKey(System.getProperty("applitools.api.key"));
        eyes.setConfiguration(config);
    }

    public void setBatchname(String batchName) {
        eyes.setBatch(new BatchInfo(batchName));
    }

    public void validateWindow(String stepname) {
        eyes.open(driver,appName, Thread.currentThread().getStackTrace()[2].getMethodName());
        eyes.setForceFullPageScreenshot(true);
        eyes.check(Target.window().fully().withName(stepname));
        eyes.close();
    }

    public void validateElement(By locator, String stepname) {
        eyes.open(driver,appName, Thread.currentThread().getStackTrace()[2].getMethodName());
        eyes.check(Target.region(locator).fully().withName(stepname));
        eyes.close();
    }
}