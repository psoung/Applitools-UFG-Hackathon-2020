package Task3;
import BaseTest.BaseTest;
import Pages.BlackShoePage;
import org.testng.annotations.Test;

public class FirefoxLaptop_Task3 extends BaseTest {

    private String browser = "Firefox";
    private String viewport = "1200x700";
    private String device = "Laptop";

    @Test
    public void verifyShoeName() {
        setUpFirefox();
        homePage.filterForBlackShoes_Laptop();
        BlackShoePage blackShoePage = homePage.goToBlackShoePage();
        boolean correct = false;
        if (blackShoePage.getShoeName().equals("Appli Air x Night")) {
            correct = true;
        }
        hackathonReporter(3, "Check Shoe Name", blackShoePage.shoeName_id(), browser, viewport, device, correct);
    }

    @Test
    public void verifyReviews() {
        setUpFirefox();
        homePage.filterForBlackShoes_Laptop();
        BlackShoePage blackShoePage = homePage.goToBlackShoePage();
        boolean correct = false;
        if (blackShoePage.getReviews().equals("4 reviews")) {
            correct = true;
        }
        hackathonReporter(3, "Check Reviews", blackShoePage.reviews_id(), browser, viewport, device, correct);
    }

    @Test
    public void verifyStockUnitNumber() {
        setUpFirefox();
        homePage.filterForBlackShoes_Laptop();
        BlackShoePage blackShoePage = homePage.goToBlackShoePage();
        boolean correct = false;
        if (blackShoePage.getStockUnitNumber().equals("SKU: MTKRY-001") && !blackShoePage.getStockUnitNumberColor().equals("rgba(255, 255, 255, 1)")) {
            correct = true;
        }
        hackathonReporter(3, "Check Stock Unit Number", blackShoePage.stockUnitNumber_id(), browser, viewport, device, correct);
    }

    @Test
    public void verifyItemDescription() {
        setUpFirefox();
        homePage.filterForBlackShoes_Laptop();
        BlackShoePage blackShoePage = homePage.goToBlackShoePage();
        boolean correct = false;
        String toBeCompared = blackShoePage.getItemDescription();
        toBeCompared = toBeCompared.substring(15);
        if (toBeCompared.equals("These boots are comfortable enough to wear all day. Well made. I love the “look”. " +
                "Best Used For Casual Everyday Walk fearlessly into the cooler months in the Sorel Joan Of Arctic Wedge" +
                " II Chelsea Boot. Boasting the iconic wedge platform that's as comfortable as it is stylish, this boot" +
                " features a waterproof upper")) {
            correct = true;
        }
        hackathonReporter(3, "Check Item Description", blackShoePage.itemDescription_id(), browser, viewport, device, correct);
    }

    @Test
    public void verifyCurrentItemSize() {
        setUpFirefox();
        homePage.filterForBlackShoes_Laptop();
        BlackShoePage blackShoePage = homePage.goToBlackShoePage();
        boolean correct = false;
        if (blackShoePage.getCurrentItemSize().equals("Small (S)")) {
            correct = true;
        }
        hackathonReporter(3, "Check Current Item Size", blackShoePage.currentItemSize_id(), browser, viewport, device, correct);
    }

    @Test
    public void verifyNew_Price() {
        setUpFirefox();
        homePage.filterForBlackShoes_Laptop();
        BlackShoePage blackShoePage = homePage.goToBlackShoePage();
        boolean correct = false;
        if (blackShoePage.getNew_price().equals("$33.00")) {
            correct = true;
        }
        hackathonReporter(3, "Check New Price", blackShoePage.new_Price_id(), browser, viewport, device, correct);
    }

    @Test
    public void verifyOld_Price() {
        setUpFirefox();
        homePage.filterForBlackShoes_Laptop();
        BlackShoePage blackShoePage = homePage.goToBlackShoePage();
        boolean correct = false;
        if (blackShoePage.getOld_price().equals("$48.00")) {
            correct = true;
        }
        hackathonReporter(3, "Check Old Price", blackShoePage.old_price_id(), browser, viewport, device, correct);
    }

    @Test
    public void verifyDiscount() {
        setUpFirefox();
        homePage.filterForBlackShoes_Laptop();
        BlackShoePage blackShoePage = homePage.goToBlackShoePage();
        boolean correct = false;
        if (blackShoePage.getDiscount().equals("-30% discount")) {
            correct = true;
        }
        hackathonReporter(3, "Check Discount", blackShoePage.discount_id(), browser, viewport, device, correct);
    }

    @Test
    public void verifyAddToCart_Btn() {
        setUpFirefox();
        homePage.filterForBlackShoes_Laptop();
        BlackShoePage blackShoePage = homePage.goToBlackShoePage();
        boolean correct = false;
        if (blackShoePage.getAddToCart_Btn().equals("Add to Cart")) {
            correct = true;
        }
        hackathonReporter(3, "Check Add to Cart Btn", blackShoePage.addToCart_Btn_id(), browser, viewport, device, correct);
    }
}