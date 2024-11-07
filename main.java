import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class main
{
   public  WebDriver driver;
   public void LoginPage(WebDriver driver)
   {
       this.driver = driver;
   }
    public void registerPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void Login()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
}
