import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class navbar {
    WebDriver driver;

    @BeforeMethod
    public void TestLplNavbarPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:3000/");
    }

    @Test
    public void testLinks() throws InterruptedException {
        WebElement LogInLink = driver.findElement(By.linkText("Log in"));
        LogInLink.click();
        Thread.sleep(3000);
        driver.navigate().back();

        WebElement HomeLink = driver.findElement(By.xpath("//*[@id='navbarNav']/ul/li[1]/a"));
        HomeLink.click();

        WebElement newsLink = driver.findElement(By.xpath("//*[@id='navbarNav']/ul/li[2]/a"));
        newsLink.click();
        driver.navigate().back();

        WebElement aboutUsLink = driver.findElement(By.xpath("//*[@id='navbarNav']/ul/li[3]/a"));
        aboutUsLink.click();
        driver.navigate().back();

        WebElement contactUsLink = driver.findElement(By.xpath("//*[@id='navbarNav']/ul/li[4]/a"));
        contactUsLink.click();
        driver.navigate().back();

    }

    @Test
    public void testButtons(){

        driver.findElement(By.xpath("//*[@id='navbarNav']/button")).click();


    }
}
