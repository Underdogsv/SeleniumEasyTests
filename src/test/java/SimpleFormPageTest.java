import Pages.SimpleFormPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SimpleFormPageTest {

    private WebDriver driver;
    private SimpleFormPage simpleFormPage;

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\JetBrains\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        simpleFormPage = new SimpleFormPage(driver);
    }

    @Test
    public void singleInputFieldTest(){
        simpleFormPage.enterMessage("Entered text for testing!@#$%");
        String displayedText = simpleFormPage.getDisplayedMessage();
        Assert.assertEquals("Entered text for testing!@#$%",displayedText);
    }

    @Test
    public void twoInputFieldsTest(){
        simpleFormPage.enterTwoValues("33", "44");
        String actualValue = simpleFormPage.getDisplayedTotalValue();
        Assert.assertEquals("77",actualValue);
    }

    @Test
    public void enterInvalidValueToInputFieldsTest(){
        String expectedMessage = "NaN";
        simpleFormPage.enterTwoValues("word","!@#$");
        String displayedMessage = simpleFormPage.getDisplayedTotalValue();
        Assert.assertEquals(expectedMessage,displayedMessage);
    }

    @After
    public void tearDown(){

        driver.quit();
    }
}
