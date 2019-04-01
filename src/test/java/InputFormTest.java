import Pages.InputFormPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class InputFormTest {

    private WebDriver driver;
    private InputFormPage inputFormPage;

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\JetBrains\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
        inputFormPage = new InputFormPage(driver);
    }

    @Test
    public void InputPageTest(){
        inputFormPage.enterFirstName("Adam")
                .enterLastName("Rush")
                .enterEmail("adamrush@gmail.com")
                .enterPhone("+235634345")
                .enterZip("64734")
                .enterAddress("address")
                .enterSite("www.adamrush.com")
                .enterDescription("Some text")
                .selectYesRadioButton()
                .selectNoRadioButton()
                .selectState("Texac")
                .enterCity("Austin")
                .clickSendButton();
    }

    @After
    public void tearDown (){
        driver.quit();
    }
}
