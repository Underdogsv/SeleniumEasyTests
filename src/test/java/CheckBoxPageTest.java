import Pages.CheckBoxPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class CheckBoxPageTest {

    private WebDriver driver;
    private CheckBoxPage checkBoxPage;
    static String buttonValue;

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\JetBrains\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        checkBoxPage = new CheckBoxPage(driver);
    }

    @Test
    public void singleCheckbox(){
        String expectedMessage = "Success - Check box is checked";
        checkBoxPage.selectSingleCheckbox();
        String displayedMessage = checkBoxPage.getDisplayedMessage();
        Assert.assertEquals(expectedMessage,displayedMessage);
    }


    @Test
    public void GroupOfCheckboxesTest(){
       buttonValue = checkBoxPage.getCheckBoxButtonValue();
       Assert.assertEquals("Check All",buttonValue);
       checkBoxPage.selectEachCheckBoxes();
       buttonValue = checkBoxPage.getCheckBoxButtonValue();
       Assert.assertEquals("Uncheck All",buttonValue);
       checkBoxPage.selectCheckBox(3);
       buttonValue = checkBoxPage.getCheckBoxButtonValue();
       Assert.assertEquals("Check All",buttonValue);
    }

    @After
    public void tearDown(){

        driver.quit();
    }

}
