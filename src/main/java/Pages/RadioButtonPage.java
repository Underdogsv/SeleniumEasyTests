package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {
    WebDriver driver;

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }


    private By headline =By.xpath("//div[contains(@class, 'col-md-6 text-left')]/h3");
    //Radio Button Demo window
    private By maleRadioBut =By.xpath("//div[@class='panel-body']/label[@class='radio-inline'][1]/input");
    private By femaleRadioBut =By.xpath("//div[@class='panel-body']/label[@class='radio-inline'][2]/input");
    private By clickGetCheckedValueButton =By.xpath("//button[@id='buttoncheck']");
    private By displayedMessage =By.xpath("//div[@class='panel-body']/p[@class='radiobutton']");

    //Group Radio Buttons
    // Demo window
    private By maleGroupRadioButton =By.xpath("//div[1]/label[@class='radio-inline'][1]/input");
    private By femaleGroupRadioButton =By.xpath("//div[1]/label[@class='radio-inline'][2]/input");
    //Age Group :
    private By age0to5 =By.xpath("//input[@value='0 - 5']");
    private By age5to15 =By.xpath("//input[@value='5 - 15']");
    private By age15to50 =By.xpath("//input[@value='15 - 50']");
    private By clickGroupValuesButton =By.xpath("//button[text()='Get values']");
    private By groupDisplayedMessage =By.xpath("//div[@class='panel-body']/p[@class='groupradiobutton']");


    public RadioButtonPage clickCheckValueButton () {
        driver.findElement(clickGetCheckedValueButton).click();
        return this;
    }

    public RadioButtonPage selectMaleRadioButton () {
        driver.findElement(maleRadioBut).click();
        this.clickCheckValueButton();
        return this;
    }

    public RadioButtonPage selectFemaleRadioButton () {
        driver.findElement(femaleRadioBut).click();
        this.clickCheckValueButton();
        return this;
    }
    //Get displayed message from the Radio Button Demo window
    public String getDisplayedMessage(){
        return driver.findElement(displayedMessage).getText();
    }

    public String getHeadline(){
        return driver.findElement(headline).getText();
    }

    public RadioButtonPage selectAge0to5  () {
        driver.findElement(age0to5).click();
        return this;
    }

    public RadioButtonPage selectAge5to15  () {
        driver.findElement(age5to15).click();
        return this;
    }

    public RadioButtonPage selectAge15to50  () {
        driver.findElement(age15to50).click();
        return this;
    }

    public RadioButtonPage clickValueButton  () {
        driver.findElement(clickGroupValuesButton).click();
        return this;
    }

    public RadioButtonPage selectMaleGroutRadioButton  () {
        driver.findElement(maleGroupRadioButton).click();
        return this;
    }

    public RadioButtonPage selectFemaleGroutRadioButton  () {
        driver.findElement(femaleGroupRadioButton).click();
        return this;
    }
    public String getGroupSexAndAgeMessage(){
        return driver.findElement(groupDisplayedMessage).getText();
    }

}


