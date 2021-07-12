import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class W3schools_Table_HW {
    WebDriver wd;

    @BeforeMethod
    public void openChrome() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void testTable() {
        List<WebElement> rows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Number of rows: " + rows.size());

        List<WebElement> columns = wd.findElements(By.cssSelector("tr:first-child th"));
        System.out.println("Number of columns: " + columns.size());

        List<WebElement> theThirdRow = wd.findElements(By.cssSelector("tr:nth-child(3) td"));
        for(WebElement element: theThirdRow) {
            System.out.print(element.getText() + "   ");

        }
        System.out.println();

        List<WebElement> lastColumn = wd.findElements(By.cssSelector("tr td:last-child"));
        lastColumn.add(0, wd.findElement(By.cssSelector("tr th")));
        for(WebElement element: lastColumn) {
            System.out.println(element.getText());
        }

        System.out.println(wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)")).getText());
    }


    @AfterMethod
    public void closeChrome() {
        wd.close();
    }
}
