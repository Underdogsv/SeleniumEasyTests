package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleFormPage {

    private WebDriver driver;

    public SimpleFormPage(WebDriver driver) {
        this.driver = driver;
    }

    private By messageField = By.xpath("//input[@id='user-message']");

    private By showMessageButton = By.xpath("//button[text()='Show Message']");

    private By displayedMessage = By.xpath("//span[@id='display']");

    private By headline = By.xpath("//div[contains(@class, 'col-md-6 text-left')]/h3");

    private By inputField1 = By.xpath("//input[@id='sum1']");

    private By inputField2 = By.xpath("//input[@id='sum2']");

    private By getTotalButton = By.xpath("//button[text()='Get Total']");

    private By displayedTotalValue = By.xpath("//span[@id='displayvalue']");

    public SimpleFormPage enterMessage (String text) {
        driver.findElement(messageField).clear();
        driver.findElement(messageField).sendKeys(text);
        driver.findElement(showMessageButton).click();
        return this;
    }

    public SimpleFormPage typeValue1 (String text) {
        driver.findElement(inputField1).sendKeys(text);
        return this;
    }

    public SimpleFormPage typeValue2 (String text) {
        driver.findElement(inputField2).sendKeys(text);
        return this;
    }

    public SimpleFormPage enterTwoValues(String firstValue, String secondValue) {
        this.typeValue1(firstValue);
        this.typeValue2(secondValue);
        driver.findElement(getTotalButton).click();
        return this;
    }

    public String getHeadline(){
        return driver.findElement(headline).getText();
    }

    public String getDisplayedMessage (){
        return driver.findElement(displayedMessage).getText();
    }

    public String getDisplayedTotalValue (){
        return driver.findElement(displayedTotalValue).getText();
    }
}
