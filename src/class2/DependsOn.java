package class2;

import org.testng.annotations.Test;

public class DependsOn {

    @Test
    public void login() {
        System.out.println(" test");
    }

    @Test(dependsOnMethods = "login")
    public void verificationOfDashbaord() {
        System.out.println("I am dependt scenario");

    }
}
