import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ContactTest {

    WebDriver wd;

    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
    }

    @Test
    public void loginTest() {
        List<WebElement> list = wd.findElements(By.tagName("a"));
        System.out.println(list.size());
        int last = list.size()-1;
        WebElement element = list.get(last);
        element.click();
    }

    @AfterMethod
    public void postCondition() {
        wd.quit();
    }


}

