package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlackShoePage {
    private WebDriver driver;

    private String shoeName = "shoe_name";
    private String reviews = "EM____82";
    private String stockUnitNumber = "SMALL____84";
    private String itemDescription = "P____83";
    private String currentItemSize = "current";
    private String new_price = "new_price";
    private String old_price = "old_price";
    private String discount = "discount";
    private String addToCart_Btn = "A__btn__114";

    public BlackShoePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getShoeName() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(shoeName))));
        return driver.findElement(By.id(shoeName)).getText();
    }
    public String shoeName_id() { return shoeName; }

    public String getReviews() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(reviews))));
        return driver.findElement(By.id(reviews)).getText(); }
    public String reviews_id() { return reviews; }

    public String getStockUnitNumber() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(stockUnitNumber))));
        return driver.findElement(By.id(stockUnitNumber)).getText(); }
    public String stockUnitNumber_id() { return stockUnitNumber; }

    public String getItemDescription() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(itemDescription))));
        return driver.findElement(By.id(itemDescription)).getText(); }
    public String itemDescription_id() { return itemDescription; }

    public String getCurrentItemSize() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(currentItemSize))));
        return driver.findElement(By.className(currentItemSize)).getText(); }
    public String currentItemSize_id() { return currentItemSize; }

    public String getNew_price() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(new_price))));
        return driver.findElement(By.id(new_price)).getText(); }
    public String new_Price_id() { return new_price; }

    public String getOld_price() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(old_price))));
        return driver.findElement(By.id(old_price)).getText(); }
    public String old_price_id() { return old_price; }

    public String getDiscount() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(discount))));
        return driver.findElement(By.id(discount)).getText(); }
    public String discount_id() { return discount; }

    public String getAddToCart_Btn() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(addToCart_Btn))));
        return driver.findElement(By.id(addToCart_Btn)).getText(); }
    public String addToCart_Btn_id() { return addToCart_Btn; }

}
