package class2;

import org.testng.annotations.Test;

public class PriortiyClass {

    @Test(priority = 3)
    public void firstTest() {
        System.out.println("I am first");
    }

    @Test(priority = 2, enabled = false) //if we use this the test will not be executed
    public void secondTest() {
        System.out.println("I am second");
    }

    @Test(priority = 1)
    public void thirdTest() {
        System.out.println("I am third");
    }
}
