package ReviewTestNg;

import org.testng.annotations.*;

public class Annotation {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before suite annotation");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }

@BeforeClass
public void beforeclassAnotation(){
    System.out.println("I am before class annotation");
}
@AfterClass
    public void afterclassAnotation() {
    System.out.println("I am before class annotation");
}
    @BeforeMethod
    public void before(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("I am a after method");
    }
    @Test
    public void test(){
        System.out.println("I am test case no 1");
    }
    @Test
    public void stest(){
        System.out.println("I am a test case no 2");
    }
}
