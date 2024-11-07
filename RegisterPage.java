import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class RegisterPage
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        driver.findElement(By.name("firstname")).sendKeys("Bhavya");
       driver.findElement(By.name("lastname")).sendKeys("Scott");
        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
       Select s1=new Select(day);
       s1.selectByVisibleText("9");
        Select s2=new Select(month);
       s2.selectByVisibleText("Oct");
        Select s3=new Select(year);
        s3.selectByVisibleText("1994");
       driver.findElement(By.xpath("//span[@data-name='gender_wrapper']/ancestor::div[@class='mvm _5wa2 _5dbb']/descendant::input[@value='1']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9986653247");
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Nisha123!@");
        driver.findElement(By.xpath("//button[text()='Sign Up']/ancestor::div[@class='_1lch']/descendant::button[@type='submit']")).click();
       driver.close();
    }
}
