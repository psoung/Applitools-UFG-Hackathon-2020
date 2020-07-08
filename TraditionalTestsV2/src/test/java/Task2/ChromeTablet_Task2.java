package Task2;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

public class ChromeTablet_Task2 extends BaseTest {

    private String browser = "Chrome";
    private String viewport = "786x700";
    private String device = "Tablet";

    @Test
    public void verify_BlackShoes() {
        setUpChromeTablet();
        goHomePage();
        homePage.filterForBlackShoes_Tablet();
        boolean verified = false;
        if (homePage.verify_BlackShoe1() && homePage.verify_BlackShoe2() && homePage.numberOfItems() == 2) {
            verified = true;
        }
        hackathonReporter(2, "Verify Black Shoes",
                homePage.blackshoe1_id() + ", " + homePage.blackshoe2_id() + ", " + homePage.listOfShoes_id(),
                browser, viewport, device, verified);
    }

}
