import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class predictionpage {

    WebDriver driver;

    @BeforeMethod
    public void TestLplpredictionPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:3000/PreInput");
    }

    @Test
    public void testDropDown() throws InterruptedException {
        WebElement dropdown1 = driver.findElement(By.xpath("//*[@id='bowling_team']"));
        Select select1 = new Select(dropdown1);
        select1.selectByIndex(1);
        Thread.sleep(3000);
        select1.selectByVisibleText("Galle Titans");
        Thread.sleep(3000);

        WebElement dropdown2 = driver.findElement(By.xpath("//*[@id='batting_team']"));
        Select select2 = new Select(dropdown2);
        select2.selectByIndex(2);
        Thread.sleep(3000);
        select2.selectByVisibleText("B-Love Kandy");
        Thread.sleep(3000);

        WebElement dropdown3 = driver.findElement(By.xpath("//*[@id='city']"));
        Select select3 = new Select(dropdown3);
        select3.selectByIndex(1);
        Thread.sleep(3000);
        select3.selectByVisibleText("Hambantota");
        Thread.sleep(3000);
    }

    @Test
    public void testTextFields(){

        WebElement target = driver.findElement(By.xpath("//*[@id='target']"));
        target.sendKeys("199");

        WebElement score = driver.findElement(By.xpath("//*[@id='score']"));
        score.sendKeys("65");

        WebElement overs = driver.findElement(By.xpath("//*[@id='overs']"));
        overs.sendKeys("6");

        WebElement wickets = driver.findElement(By.xpath("//*[@id='wickets']"));
        wickets.sendKeys("2");
    }

    @Test
    public void testPredictionButton(){

        boolean enabled = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[1]/form/button")).isEnabled();
        System.out.println("is Button is enabled" + enabled);
    }

}
