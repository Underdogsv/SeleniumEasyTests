package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxFormPage {

    WebDriver driver;

    public AjaxFormPage(WebDriver driver) {
        this.driver = driver;
    }

    private By headline = By.xpath("//div[@class='col-md-6 text-left']/h1");
    private By nameField = By.xpath("//input[@id='title']");
    private By commentsField = By.xpath("//textarea[@id='description']");
    private By submitButton = By.xpath("//input[@id='btn-submit']");
    private By displayedMessage = By.xpath("//div[text()='Form submited Successfully!']");


    public String getHeadline (){
        return driver.findElement(headline).getText();
    }

    public String getMessageValue (){
        return driver.findElement(displayedMessage).getText();
    }

    public AjaxFormPage waitingForMessage (){
        WebDriverWait wait =(new WebDriverWait(driver,6));
        wait.until(ExpectedConditions.presenceOfElementLocated(displayedMessage));

        return this;
    }

    public AjaxFormPage enterName (String name) {
        driver.findElement(nameField).sendKeys(name);
        return this;
    }

    public AjaxFormPage enterComment (String comment) {
        driver.findElement(commentsField).sendKeys(comment);
        return this;
    }
    public AjaxFormPage clickSubmit (){
        driver.findElement(submitButton).click();
        return this;
    }

    public AjaxFormPage sendForm (String name,String comment){
        this.enterName(name);
        this.enterComment(comment);
        this.clickSubmit();
        return this;
    }

}
