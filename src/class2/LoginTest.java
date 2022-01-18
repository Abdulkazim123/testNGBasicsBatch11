package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver driver;

    //pre condition @before method -- launch browser and navigate url
    @BeforeMethod(alwaysRun = true)
    public void openBrowserAndLaunchApplication() {
        System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //@Test -- perform login

    @Test(groups = "regression", enabled = false)
    public void adminLogin() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
    }

    @Test(groups = "regression", enabled = false)
    public void validationOfTitle() {
        String actualTitle = driver.getTitle();

        String expectedTitile = "Human managment system";
        if (expectedTitile.equals(actualTitle)) {
            System.out.println("Test is pass");
        } else {
            System.out.println("Not work");
        }
    }


    //post condition @after method -- close browser
    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }

}
