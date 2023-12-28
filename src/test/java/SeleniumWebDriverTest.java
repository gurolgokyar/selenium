import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriverTest {

    @Test
    void testSeleniumVebDriver(){
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://www.baeldung.com/page/7?s=format+plugins");

        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");

        WebDriver driver3 = new EdgeDriver();
        driver3.get("https://www.youtube.com/watch?v=VVscNWiqp-o");


    }
}
