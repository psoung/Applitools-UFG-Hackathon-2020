package Tasks;

import Base.BaseTest;
import org.junit.jupiter.api.Test;

public class Task2 extends BaseTest {

    private void startTestSuite() {
        eyesManager.setBatchname("UFG Hackathon");
    }

    @Test
    public void task_2() {
        setUp();
        startTestSuite();
        homePage.filterForBlackShoes();
        eyesManager.validateElement(homePage.getListOfShoes(), "Filter Results");
    }
}