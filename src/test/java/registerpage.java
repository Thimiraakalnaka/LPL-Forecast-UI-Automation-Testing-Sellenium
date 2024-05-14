import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class registerpage {


    WebDriver driver;

    @BeforeMethod
    public void TestLplRegisterPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:3000/Register");
    }

    @Test
    public void testTextFields(){

        WebElement name = driver.findElement(By.xpath("//*[@id='name']"));
        name.sendKeys("Akalanka");

        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        email.sendKeys("Akalanka123@gamil.com");

        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("12345");
    }

    @Test
    public void testRegisterButton(){

        driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[1]/form/button")).click();
    }

    @Test
    public void testLink() throws InterruptedException {

        WebElement LoginLink = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[1]/form/p/a"));
        LoginLink.click();
        Thread.sleep(3000);
        driver.navigate().back();
    }
}
