import Pages.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MainTests {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\JetBrains\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/");
        mainPage = new MainPage(driver);
    }

    @Test
    public void loadingCheckBoxesPageTest(){
        CheckBoxPage checkBoxPage = mainPage.selectCheckBoxMenuItem();
        String headline = checkBoxPage.getHeadline();
        Assert.assertEquals("This would be a basic example to start with checkboxes using selenium.",headline);
    }

    @Test
    public void loadingInputFieldPageTest(){
        SimpleFormPage simplePage = mainPage.selectSimpleFormDemoItem();
        String headline = simplePage.getHeadline();
        Assert.assertEquals("This would be your first example to start with Selenium.",headline);
    }

    @Test
    public void loadingRadioButtonPageTest(){
        RadioButtonPage radioButtonPage = mainPage.selectRadioButtonsMenuItem();
        String headline = radioButtonPage.getHeadline();
        Assert.assertEquals("This is again simple example to start working with radio buttons using Selenium.",headline);
    }

    @Test
    public void loadingDropDownPageTest(){
        DropDownPage dropDownPage = mainPage.selectDropdownMenuItem();
        String headline = dropDownPage.getHeadline();
        Assert.assertEquals("This would be your first example on select dropd down list to with Selenium.",headline);
    }
   @Test
    public void loadingInputFormPageTest(){
        InputFormPage inputFormPage = mainPage.selectInputFormMenuItem();
        String headline = inputFormPage.getHeadline();
        Assert.assertEquals("Input form with validations",headline);
    }

    @Test
    public void loadingAjaxFormPageTest(){
        AjaxFormPage ajaxFormPage = mainPage.selectAjaxFormMeuItem();
        String headline = ajaxFormPage.getHeadline();
        Assert.assertEquals("Ajax Form Submit with Loading icon",headline);
    }

    @Test
    public void loadingJquerySearchPageTest(){
        JqueryDropdownSearchPage jqueryPage = mainPage.selectJQueryDropdownMeuItem();
        String headline = jqueryPage.getHeadline();
        Assert.assertEquals("Single Select - Search and Select country",headline);
    }

    @After
    public void tearDown (){
        driver.quit();
    }
}
