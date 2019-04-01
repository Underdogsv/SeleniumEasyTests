import Pages.CheckBoxPage;
import Pages.DropDownPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DropDownPageTest {
    private WebDriver driver;
    private DropDownPage dropDownPage;


    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\JetBrains\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        dropDownPage = new DropDownPage(driver);
    }
    @Test
    public void selectDayInDropDownTest(){
       dropDownPage.selectDayInDropDown("Monday");
       String selectedDay = dropDownPage.getDaysDropDownValue();
       Assert.assertEquals("Monday",selectedDay);
       String message = dropDownPage.getDisplayedMessageValue();
       String[] parts = message.split("- ");
       String displayDay = parts[1];
       Assert.assertEquals("Monday",displayDay);
    }

    @Test  //TODO
    public void MultiSelectListTest(){
        dropDownPage.selectState("Pennsylvania","New Jersey","Ohio");


    }



    @After
    public void tearDown(){

        driver.quit();
    }
}
