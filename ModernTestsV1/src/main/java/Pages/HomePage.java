package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage {
    private WebDriver driver;

    private By blackFilterBox = By.id("SPAN__checkmark__107");
    private By filterBtn = By.id("filterBtn");
    private String filterIcon = "ti-filter";

    private String blackShoe1 = "FIGURE____213";
    private By listOfShoes = By.id("product_grid");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void filterForBlackShoes() {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);

        Dimension dimension = driver.manage().window().getSize();
        if (dimension.getWidth() != 1200) {
            actions.moveToElement(driver.findElement(By.id(filterIcon))).click().perform();
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(blackFilterBox)));
        }
        actions.moveToElement(driver.findElement(blackFilterBox)).click().perform();
        scrollToElement(filterBtn);
        actions.moveToElement(driver.findElement(filterBtn)).click().perform();
    }

    public BlackShoePage goToBlackShoePage() {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        scrollToElement(By.id(blackShoe1));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(blackShoe1))));
        if (driver.findElement(By.id(blackShoe1)).isDisplayed() == true) {
            actions.moveToElement(driver.findElement(By.id(blackShoe1))).click().perform();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return new BlackShoePage(driver);
    }

    public By getListOfShoes() {
     return listOfShoes;
    }

    public void scrollToElement(By id) {
        WebElement element = driver.findElement(id);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
