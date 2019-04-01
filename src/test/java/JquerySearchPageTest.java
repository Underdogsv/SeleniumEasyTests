import Pages.AjaxFormPage;
import Pages.JqueryDropdownSearchPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class JquerySearchPageTest {

        private WebDriver driver;
        private JqueryDropdownSearchPage jqueryPage;


        @Before
        public void setUp (){
            System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\JetBrains\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
            driver.manage().window().maximize();
            driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
            jqueryPage = new JqueryDropdownSearchPage(driver);
        }


    @Test
    public void multiDropDownTest () {
        jqueryPage.selectMultipleValue("Alaska")
                  .selectMultipleValue("Florida")
                  .selectMultipleValue("Alabama")
                  .selectMultipleValue("Alabama");

        String result= jqueryPage.getDisplayedMultipleValue();
        String[] parts = result.split("\n");
        String country1 = parts[0].substring(1);
        String country2 = parts[1].substring(1);
        Assert.assertEquals("Alaska",country1);
        Assert.assertEquals("Florida",country2);
    }

    @Test
    public void categoryDropDownTest () {
        jqueryPage.selectElementCategoryDropDown("PHP");

        List<String> languages = new ArrayList<String>();
        languages.add("Python");
        languages.add("PHP");
        languages.add("Ruby");
        languages.add("C");
        languages.add("Java");
        languages.add("Net");
        languages.add("Unknown Script");
        languages.add("Other file");

        for (int i=0; i<languages.size();i++){
            jqueryPage.selectElementCategoryDropDown(languages.get(i));
            String selectedLanguage = jqueryPage.getDisplayedLanguageValue();
            //Add Assert

        }

    }
}
