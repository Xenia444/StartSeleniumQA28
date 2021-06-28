import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

    WebDriver wd;

    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();
        // login before
    }

    @Test
    public void startGoogle() {
        wd.get("https://www.google.com");
        //add new contact
    }

    @Test
    public void loginTest() {
        //add new contact
    }

    @AfterTest
    public void postCondition() {
        wd.quit();

    }



}
