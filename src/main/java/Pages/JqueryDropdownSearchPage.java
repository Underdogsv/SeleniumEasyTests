package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JqueryDropdownSearchPage {
    WebDriver driver;

    public JqueryDropdownSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    private By headline = By.xpath("//div[contains(@class, 'col-md-6 text-left')]/h2");
    private By singleCountryDropDown = By.xpath("//span [@dir='ltr']//span[@id='select2-country-container']");
    private By multiCountryDropDown = By.xpath("//input[contains(@class,'select2-search__field')]");
    private By selectedCountryDropDown = By.xpath("//ul [@class='select2-selection__rendered']");
    private By displayedCountryResult = By.xpath("//li [@class='select2-results__option select2-results__option--highlighted']");

    private By categoryDropDown = By.xpath("//select [@id='files']");

    //Drop Down with Disabled values
    private By disabledTerritorDropDown = By.xpath("//input [@class='select2-search__field']");


    public String getHeadline(){
        return driver.findElement(headline).getText();
    }

    public String getDisplayedCountry(){
        return driver.findElement(headline).getAttribute("textContent");
    }
   ///Need to change xpath
    public JqueryDropdownSearchPage searchCountry(String country) {
        driver.findElement(singleCountryDropDown).click();
        driver.findElement(singleCountryDropDown).sendKeys(country);
        return this;
    }

    //Select Multiple Values
    public JqueryDropdownSearchPage selectMultipleValue(String country) {
        driver.findElement(multiCountryDropDown).click();
        driver.findElement(multiCountryDropDown).sendKeys(country);
        driver.findElement(displayedCountryResult).click();
        return this;
    }

    public JqueryDropdownSearchPage clickToCategoryDropDown(){
        driver.findElement(categoryDropDown).click();
        return this;
    }

    public JqueryDropdownSearchPage selectElementCategoryDropDown(String element){
        this.clickToCategoryDropDown();
        driver.findElement(categoryDropDown).sendKeys(element);
        this.clickToCategoryDropDown();
        return this;
    }

    public String getDisplayedMultipleValue(){
        return driver.findElement(selectedCountryDropDown).getText();
    }

    public String getDisplayedLanguageValue(){
        return driver.findElement(categoryDropDown).getText();
    }



}
