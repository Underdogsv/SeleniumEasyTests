import Pages.AjaxFormPage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AjaxFormPageTest {

    private WebDriver driver;
    private AjaxFormPage ajaxFormPage;
    static String message;

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\JetBrains\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
        ajaxFormPage = new AjaxFormPage(driver);
    }

    @Test
    public void MultiSelectListTest(){
        ajaxFormPage.sendForm("NAME","#$%^&*(");

        //Waiting when message will be displayed
        ajaxFormPage.waitingForMessage();
        message =ajaxFormPage.getMessageValue();
        Assert.assertEquals("Form submited Successfully!",message);
    }

}
