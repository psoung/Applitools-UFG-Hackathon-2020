package Task1;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

public class EdgeTablet_Task1 extends BaseTest {

    private String browser = "Edge";
    private String viewport = "786x700";
    private String device = "Tablet";

    @Test
    public void verifyTopMenu() {
        setUpEdgeTablet();
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
        setUpEdgeTablet();
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
        setUpEdgeTablet();
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
        setUpEdgeTablet();
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
        setUpEdgeTablet();
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
        setUpChrome();
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
        setUpEdgeTablet();
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
        setUpEdgeTablet();
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
        setUpEdgeTablet();
        goHomePage();
        hackathonReporter(1, "Verify the Tool Tips", homePage.toolTips_id(), browser, viewport, device, homePage.verify_ToolTips());
    }

    @Test
    public void verifyBottomMenu_Columns() {
        setUpEdgeTablet();
        goHomePage();
        hackathonReporter(1, "Verify the Bottom Nav Bar", homePage.bottomMenu_Columns_id(), browser, viewport, device, homePage.verify_bottomMenu_Columns());
    }

    @Test
    public void verifyEmailBar() {
        setUpEdgeTablet();
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