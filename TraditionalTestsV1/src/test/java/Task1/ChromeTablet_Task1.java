package Task1;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

public class ChromeTablet_Task1 extends BaseTest {

    private String browser = "Chrome";
    private String viewport = "786x700";
    private String device = "Tablet";

    @Test
    public void verifyTopMenu() {
        setUpChromeTablet();
        goHomePage();
        boolean pass = false;
        if (device == "Laptop" && homePage.verify_TopMenu()) {
            pass = true;
        }
        else if ( device != "Laptop" && !homePage.verify_TopMenu()){
            pass = true;
        }
        hackathonReporter(1, "Verify the Top Menu", homePage.topMenu_id(), browser, viewport, device, pass);
    }

    @Test
    public void verifySearchBar() {
        setUpChromeTablet();
        goHomePage();
        boolean pass = false;
        if (device == "Mobile" && !homePage.verify_SearchBar()) {
            pass = true;
        }
        else if ( device != "Mobile" && homePage.verify_SearchBar()) {
            pass = true;
        }
        hackathonReporter(1, "Verify the Search Bar", homePage.searchBar_id(), browser, viewport, device, pass);
    }

    @Test
    public void verifyMagnifyingGlass() {
        setUpChromeTablet();
        goHomePage();
        boolean pass = false;
        if (device == "Mobile" && !homePage.verify_MagnifyingGlass()) {
            pass = true;
        }
        else if ( device != "Mobile" && homePage.verify_MagnifyingGlass()) {
            pass = true;
        }
        hackathonReporter(1, "Verify the Magnifying Glass", homePage.magnifyingGlass_id(), browser, viewport, device, pass);
    }

    @Test
    public void verifyWishList() {
        setUpChromeTablet();
        goHomePage();
        boolean pass = false;
        if (device == "Laptop" && homePage.verify_wishList()) {
            pass = true;
        }
        else if ( device != "Laptop" && !homePage.verify_wishList()){
            pass = true;
        }
        hackathonReporter(1, "Verify the Wishlist", homePage.wishList_id(), browser, viewport, device, pass);
    }

    @Test
    public void verifySideBar() {
        setUpChromeTablet();
        goHomePage();
        boolean pass = false;
        if (device == "Laptop" && homePage.verify_sideBar()) {
            pass = true;
        }
        else if ( device != "Laptop" && !homePage.verify_sideBar()){
            pass = true;
        }
        hackathonReporter(1, "Verify the Side Bar", homePage.sideBar_id(), browser, viewport, device, pass);
    }

    @Test
    public void verifyViewBar() {
        setUpChromeTablet();
        goHomePage();
        boolean pass = false;
        if (device == "Laptop" && homePage.verify_viewBar()) {
            pass = true;
        }
        else if ( device != "Laptop" && !homePage.verify_viewBar()){
            pass = true;
        }
        hackathonReporter(1, "Verify the View Bar", homePage.viewBar_id(), browser, viewport, device, pass);
    }

    @Test
    public void verifyFilterIcon() {
        setUpChromeTablet();
        goHomePage();
        boolean pass = false;
        if (device == "Laptop" && !homePage.verify_filterIcon()) {
            pass = true;
        }
        else if ( device != "Laptop" && homePage.verify_filterIcon()){
            pass = true;
        }
        hackathonReporter(1, "Verify the Filter Icon", homePage.filterIcon_id(), browser, viewport, device, pass);
    }

    @Test
    public void verifyFilterText() {
        setUpChromeTablet();
        goHomePage();
        boolean pass = false;
        if (device != "Tablet" && !homePage.verify_filterText()) {
            pass = true;
        }
        else if ( device == "Tablet" && homePage.verify_filterText()){
            pass = true;
        }
        hackathonReporter(1, "Verify the Filter Text", homePage.filterText_id(), browser, viewport, device, pass);
    }

    @Test
    public void verifyToolTips() {
        setUpChromeTablet();
        goHomePage();
        hackathonReporter(1, "Verify the Tool Tips", homePage.toolTips_id(), browser, viewport, device, homePage.verify_ToolTips());
    }

    @Test
    public void verifyBottomMenu_Columns() {
        setUpChromeTablet();
        goHomePage();
        hackathonReporter(1, "Verify the Bottom Nav Bar", homePage.bottomMenu_Columns_id(), browser, viewport, device, homePage.verify_bottomMenu_Columns());
    }

    @Test
    public void verifyEmailBar() {
        setUpChromeTablet();
        goHomePage();
        boolean pass = false;
        if (device == "Mobile" && !homePage.verify_EmailBar()) {
            pass = true;
        }
        else if ( device != "Mobile" && homePage.verify_EmailBar()){
            pass = true;
        }
        hackathonReporter(1, "Verify the Email Bar", homePage.emailBar_id(), browser, viewport, device, pass);
    }
}
