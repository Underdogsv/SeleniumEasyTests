package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFormPage {
    WebDriver driver;

    public InputFormPage(WebDriver driver) {
        this.driver = driver;
    }

    private By headline = By.xpath("//div[contains(@class, 'col-md-6 text-left')]/h3");
    private By firstNameField = By.xpath("//input[@name='first_name']");
    private By lastNameFiled = By.xpath("//input[@name='last_name']");
    private By emailFiled = By.xpath("//input[@name='email']");
    private By phoneField = By.xpath("//input[@name='phone']");
    private By addressField = By.xpath("//input[@name='address']");
    private By cityField = By.xpath("//input[@name='city']");
    private By countryField = By.xpath("//select[@name='state']");
    private By zipField = By.xpath("//input[@name='zip']");
    private By siteField = By.xpath("//input[@name='website']");
    private By yesRadio = By.xpath("//input[@value='yes']");
    private By noRadio = By.xpath("//input[@value='no']");
    private By projectDescription = By.xpath("//textarea[@name='comment']");
    private By sendButton = By.xpath("//button[@class='btn btn-default']\n");

    public String getHeadline (){
        return driver.findElement(headline).getText();
    }

    public InputFormPage enterFirstName (String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
        return this;
    }
    public InputFormPage enterLastName (String fastName) {
        driver.findElement(lastNameFiled).sendKeys(fastName);
        return this;
    }

    public InputFormPage enterEmail (String email) {
        driver.findElement(emailFiled).sendKeys(email);
        return this;
    }

    public InputFormPage enterPhone (String phone) {
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }

    public InputFormPage enterAddress (String address) {
        driver.findElement(addressField).sendKeys(address);
        return this;
    }

    public InputFormPage enterCity (String city) {
        driver.findElement(cityField).sendKeys(city);
        return this;
    }


    public InputFormPage enterZip (String zip) {
        driver.findElement(zipField).sendKeys(zip);
        return this;
    }

    public InputFormPage enterSite (String site) {
        driver.findElement(siteField).sendKeys(site);
        return this;
    }

    public InputFormPage selectYesRadioButton () {
        driver.findElement(yesRadio).click();
        return this;
    }

    public InputFormPage selectNoRadioButton () {
        driver.findElement(noRadio).click();
        return this;
    }

    public InputFormPage enterDescription (String description) {
        driver.findElement(projectDescription).sendKeys(description);
        return this;
    }

    public InputFormPage clickSendButton () {
        driver.findElement(sendButton).click();
        return this;
    }

    public InputFormPage selectState (String state) {
        driver.findElement(countryField).click();
        driver.findElement(countryField).sendKeys(state);
        driver.findElement(countryField).click();
        return this;
    }


}
