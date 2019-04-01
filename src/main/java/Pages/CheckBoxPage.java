package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {
    WebDriver driver;
    private WebDriver driver1;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    private By headline = By.xpath("//div[contains(@class, 'col-md-6 text-left')]/h3");
    private By singleCheckBox = By.xpath("//input[@id='isAgeSelected']");
    private By successMessage = By.xpath("//div[text()='Success - Check box is checked']");
    private By checkBox1 = By.xpath("//div[@class='panel panel-default'][2]//div[@class='checkbox'][1]/label");
    private By checkBox2 = By.xpath("//div[@class='panel panel-default'][2]//div[@class='checkbox'][2]/label");
    private By checkBox3 = By.xpath("//div[@class='panel panel-default'][2]//div[@class='checkbox'][3]/label");
    private By checkBox4 = By.xpath("//div[@class='panel panel-default'][2]//div[@class='checkbox'][4]/label");
    private By checkBoxButton = By.xpath("//input[@class='btn btn-primary']");


    public String getHeadline() {
       return driver.findElement(headline).getText();

    }

    public CheckBoxPage selectSingleCheckbox () {
        driver.findElement(singleCheckBox).click();
        return this;
    }

    public String getDisplayedMessage (){
        return driver.findElement(successMessage).getText();
    }

    public CheckBoxPage selectEachCheckBoxes () {
        driver.findElement(checkBox1).click();
        driver.findElement(checkBox2).click();
        driver.findElement(checkBox3).click();
        driver.findElement(checkBox4).click();
        return this;
    }

    public CheckBoxPage selectCheckBox (int number) {
        switch (number) {
            case 1: {
                driver.findElement(checkBox1).click();
                break;
            }
            case 2: {
                driver.findElement(checkBox2).click();
                break;
            }
            case 3: {
                driver.findElement(checkBox3).click();
                break;
            }
            case 4: {
                driver.findElement(checkBox4).click();
                break;
            }
        }
        return this;
    }

        public CheckBoxPage clickCheckBoxButton () {
            driver.findElement(checkBoxButton).click();
            return this;
        }

        public String getCheckBoxButtonValue () {
            return driver.findElement(checkBoxButton).getAttribute("defaultValue");

        }

    }


