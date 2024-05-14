import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homepage {


    WebDriver driver;

    @BeforeMethod
    public void TestLplHomePage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:3000/");
    }

    @Test
    public void testButtons(){

        boolean enabled = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[1]/div/button")).isEnabled();
        System.out.println("is Button is enabled" + enabled);

    }


}
