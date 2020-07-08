package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage {
    private WebDriver driver;

    private String topMenu = "UL____21";
    private String searchBar = "INPUTtext____42";
    private String search_MagnifyingGlass = "BUTTONsubmit____43";
    private String wishList = "A__wishlist__52";
    private String sideBar = "filter_col";

    private String viewBar = "LI____201";

    private String filterIcon = "ti-filter";
    private String filterText = "SPAN____209";
    private String toolTips = "UL____223";

    private String bottomMenu_Columns = "DIV__row__420";

    private String emailBar = "DIV__formgroup__451";

    private String blackShoe1 = "A____215";
    private String blackShoe2 = "A____239";
    private String listOfShoes = "grid_item";
    private By blackFilterBox = By.id("SPAN__checkmark__107");
    private By filterBtn = By.id("filterBtn");


    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public boolean verify_MagnifyingGlass() { return driver.findElement(By.id(search_MagnifyingGlass)).isDisplayed(); }
    public String magnifyingGlass_id() { return search_MagnifyingGlass; }
    public boolean verify_SearchBar() { return driver.findElement(By.id(searchBar)).isDisplayed(); }
    public String searchBar_id() { return searchBar; }
    public boolean verify_TopMenu() { return driver.findElement(By.id(topMenu)).isDisplayed(); }
    public String topMenu_id() { return topMenu; }
    public boolean verify_wishList() { return driver.findElement(By.id(wishList)).isDisplayed(); }
    public String wishList_id() { return wishList; }
    public boolean verify_sideBar() { return driver.findElement(By.id(sideBar)).isDisplayed(); }
    public String sideBar_id() { return sideBar; }
    public boolean verify_viewBar() {
        Dimension dimension = driver.findElement(By.id(viewBar)).getSize();
        if (dimension.getHeight() == 25 && dimension.getWidth() == 10) {
            return false;
        } else {
            return true;
        }
    }
    public String viewBar_id() { return viewBar; }
    public boolean verify_filterIcon() { return driver.findElement(By.id(filterIcon)).isDisplayed(); }
    public String filterIcon_id() { return filterIcon; }
    public boolean verify_filterText() { return driver.findElement(By.id(filterText)).isDisplayed(); }
    public String filterText_id() { return filterText; }
    public boolean verify_bottomMenu_Columns() { return driver.findElement(By.id(bottomMenu_Columns)).isDisplayed(); }
    public String bottomMenu_Columns_id() { return bottomMenu_Columns; }
    public boolean verify_EmailBar() { return driver.findElement(By.id(emailBar)).isDisplayed(); }
    public String emailBar_id() { return emailBar; }
    public boolean verify_ToolTips() { return driver.findElement(By.id(toolTips)).isDisplayed(); }
    public String toolTips_id() { return toolTips; }

    public boolean verify_BlackShoe1() { return driver.findElement(By.id(blackShoe1)).isDisplayed(); }
    public String blackshoe1_id() { return blackShoe1; }
    public boolean verify_BlackShoe2() { return driver.findElement(By.id(blackShoe2)).isDisplayed(); }
    public String blackshoe2_id() { return blackShoe2; }
    public int numberOfItems() { return driver.findElements(By.className(listOfShoes)).size(); }
    public String listOfShoes_id() { return listOfShoes; }

    public void filterForBlackShoes_Laptop() {
        Actions actions = new Actions(driver);
        scrollToElement(blackFilterBox);
        actions.moveToElement(driver.findElement(blackFilterBox)).click().perform();
        scrollToElement(filterBtn);
        actions.moveToElement(driver.findElement(filterBtn)).click().perform();
    }

    public void filterForBlackShoes_Tablet() {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);
        actions.moveToElement(driver.findElement(By.id(filterIcon))).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(blackFilterBox)));
        actions.moveToElement(driver.findElement(blackFilterBox)).click().perform();
        scrollToElement(filterBtn);
        actions.moveToElement(driver.findElement(filterBtn)).click().perform();
    }

    public BlackShoePage goToBlackShoePage() {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);
        scrollToElement(By.id(blackShoe1));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(blackShoe1))));
        if (driver.findElement(By.id(blackShoe1)).isDisplayed() == true) {
            actions.moveToElement(driver.findElement(By.id(blackShoe1))).click().perform();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        }

        return new BlackShoePage(driver);
    }

    public void scrollToElement(By id) {
        WebElement element = driver.findElement(id);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

}