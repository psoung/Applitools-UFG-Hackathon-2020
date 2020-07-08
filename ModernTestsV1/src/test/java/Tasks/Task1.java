package Tasks;

import Base.*;
import org.junit.jupiter.api.Test;

public class Task1 extends BaseTest {

    private void startTestSuite() {
        eyesManager.setBatchname("UFG Hackathon");
    }

    @Test
    public void task_1() {
        setUp();
        startTestSuite();
        eyesManager.validateWindow("Cross-Device Elements Test");
    }

}
