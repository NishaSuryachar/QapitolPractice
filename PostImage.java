import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PostImage
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("nishams22839@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("nisha123!");
        driver.findElement(By.name("login")).click();
        driver.close();
    }
}
