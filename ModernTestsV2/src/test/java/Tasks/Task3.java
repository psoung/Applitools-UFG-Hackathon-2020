package Tasks;

import Base.BaseTest;
import org.junit.jupiter.api.Test;

public class Task3 extends BaseTest {

    private void startTestSuite() {
        eyesManager.setBatchname("UFG Hackathon");
    }

    @Test
    public void task_3() {
        setUp();
        startTestSuite();
        homePage.filterForBlackShoes();
        homePage.goToBlackShoePage();
        eyesManager.validateWindow("Product Details test");
    }
}
