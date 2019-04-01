package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownPage {
    WebDriver driver;

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    private By headline = By.xpath("//div[contains(@class, 'col-md-6 text-left')]/h3");
    private By daysOfTheWeekDropDown = By.xpath("//select [@class='form-control']");
    private By daySelectedMessage = By.xpath("//div[@class='panel-body']/p[@class='selected-value']");
    private By StatesList = By.xpath("//select[@name='States']");
    private By FirstSelectedButton = By.xpath("//button[text()='First Selected']");
    private By GetAllSelectedButton = By.xpath("//button[text()='Get All Selected']");


    public DropDownPage selectState (String state) {

        driver.findElement(StatesList).click();
        driver.findElement(StatesList).sendKeys(state);
        driver.findElement(StatesList).click();
        return this;
    }

    public DropDownPage selectState (String state,String state2) {
        driver.findElement(StatesList).click();
        driver.findElement(StatesList).sendKeys(state);
        driver.findElement(StatesList).click();
        return this;
    }

    public DropDownPage selectState (String state,String state2,String state3) {
        driver.findElement(StatesList).click();
        driver.findElement(StatesList).sendKeys(state);
        driver.findElement(StatesList).sendKeys(state2);
        driver.findElement(StatesList).click();
        driver.findElement(StatesList).sendKeys(state3);
        return this;
    }

    public DropDownPage selectDayInDropDown (String day) {
        driver.findElement(daysOfTheWeekDropDown).click();
        driver.findElement(daysOfTheWeekDropDown).sendKeys(day);
        driver.findElement(daysOfTheWeekDropDown).click();
        return this;
    }

    public DropDownPage clickFirstSelectedButton () {
        driver.findElement(FirstSelectedButton).click();
        return this;
    }

    public DropDownPage clickGetAllSelectedButton () {
        driver.findElement(GetAllSelectedButton).click();
        return this;
    }

    public String getDaysDropDownValue () {
        return driver.findElement(daysOfTheWeekDropDown).getAttribute("value");
    }

    public String getHeadline (){
        return driver.findElement(headline).getText();
    }

    public String getDisplayedMessageValue (){
        return driver.findElement(daySelectedMessage).getText();
    }
}
