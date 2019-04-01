
import Pages.RadioButtonPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButtonPageTest {
    private WebDriver driver;
    private RadioButtonPage radioButtonPage;
    static String message;

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\JetBrains\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        radioButtonPage = new RadioButtonPage(driver);
    }

    @Test
    public void selectingSexTest(){
        String noChecked = "Radio button is Not checked";
        String maleIsChecked = "Radio button 'Male' is checked";
        String femaleIsChecked = "Radio button 'Female' is checked";

        radioButtonPage.clickCheckValueButton();
        message = radioButtonPage.getDisplayedMessage();
        Assert.assertEquals(noChecked,message);
        radioButtonPage.selectMaleRadioButton();
        message = radioButtonPage.getDisplayedMessage();
        Assert.assertEquals(maleIsChecked,message);
        radioButtonPage.selectFemaleRadioButton();
        message = radioButtonPage.getDisplayedMessage();
        Assert.assertEquals(femaleIsChecked,message);
    }

    @Test  //Will be changed!
    public void selectingSexAndAgeTest(){
      radioButtonPage.clickValueButton();
      message =radioButtonPage.getGroupSexAndAgeMessage();
      Assert.assertEquals("Sex :\n" + "Age group:",message);

      radioButtonPage.selectFemaleGroutRadioButton();
      radioButtonPage.clickValueButton();
      message =radioButtonPage.getGroupSexAndAgeMessage();
      Assert.assertEquals("Sex : Female\n" + "Age group:",message);

      radioButtonPage.selectAge0to5();
      radioButtonPage.clickValueButton();
      message =radioButtonPage.getGroupSexAndAgeMessage();
      Assert.assertEquals("Sex : Female\n" + "Age group: 0 - 5",message);

      radioButtonPage.selectAge5to15();
      radioButtonPage.clickValueButton();
      message =radioButtonPage.getGroupSexAndAgeMessage();
      Assert.assertEquals("Sex : Female\n" + "Age group: 5 - 15",message);

      radioButtonPage.selectAge15to50();
      radioButtonPage.clickValueButton();
      message =radioButtonPage.getGroupSexAndAgeMessage();
      Assert.assertEquals("Sex : Female\n" + "Age group: 15 - 50",message);

      radioButtonPage.selectMaleGroutRadioButton();
      radioButtonPage.clickValueButton();
      message =radioButtonPage.getGroupSexAndAgeMessage();
      Assert.assertEquals("Sex : Male\n" + "Age group: 15 - 50",message);

      radioButtonPage.selectAge5to15();
      radioButtonPage.clickValueButton();
      message =radioButtonPage.getGroupSexAndAgeMessage();
      Assert.assertEquals("Sex : Male\n" + "Age group: 5 - 15",message);

      radioButtonPage.selectAge0to5();
      radioButtonPage.clickValueButton();
      message =radioButtonPage.getGroupSexAndAgeMessage();
      Assert.assertEquals("Sex : Male\n" + "Age group: 0 - 5",message);

    }

    @After
    public void tearDown(){

        driver.quit();
    }


}
