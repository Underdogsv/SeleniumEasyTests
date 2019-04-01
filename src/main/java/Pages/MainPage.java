package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

 private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }



    @FindBy (xpath = "//ul//a[text()='Date pickers']")
    private WebElement DataPickers;

    private By InputForm = By.xpath("//ul//a[text()='Input Forms']");

    //InputForms Menu Items
    private By SimpleFormMenuItem = By.xpath("//li[@class='tree-branch']//a[text()='Simple Form Demo']");
    private By CheckBoxMenuItem = By.xpath("//li[@class='tree-branch']//a[text()='Checkbox Demo']");
    private By RadioButtonsMenuItem = By.xpath("//li[@class='tree-branch']//a[text()='Radio Buttons Demo']");
    private By SelectDropdownMenuItem = By.xpath("//li[@class='tree-branch']//a[text()='Select Dropdown List']");
    private By InputFormSubmitMenuItem = By.xpath("//li[@class='tree-branch']//a[text()='Input Form Submit']");
    private By AjaxFormSubmitMenuItem = By.xpath("//li[@class='tree-branch']//a[text()='Ajax Form Submit']");
    private By JQueryDropdownMenuItem = By.xpath("//li[@class='tree-branch']//a[text()='JQuery Select dropdown']");



    public MainPage selectInput ()
    {
        driver.findElement(InputForm).click();
        return this;
    }

    public SimpleFormPage selectSimpleFormDemoItem ()
    {
        driver.findElement(InputForm).click();
        driver.findElement(SimpleFormMenuItem).click();
        return new SimpleFormPage(driver);
    }

    public CheckBoxPage selectCheckBoxMenuItem ()
    {
        driver.findElement(InputForm).click();
        driver.findElement(CheckBoxMenuItem).click();
        return new CheckBoxPage(driver);
    }

    public RadioButtonPage selectRadioButtonsMenuItem ()
    {
        driver.findElement(InputForm).click();
        driver.findElement(RadioButtonsMenuItem).click();
        return new RadioButtonPage(driver);
    }

    public DropDownPage selectDropdownMenuItem ()
    {
        driver.findElement(InputForm).click();
        driver.findElement(SelectDropdownMenuItem).click();
        return new DropDownPage(driver);
    }

    public InputFormPage selectInputFormMenuItem()
    {
        driver.findElement(InputForm).click();
        driver.findElement(InputFormSubmitMenuItem).click();
        return new InputFormPage(driver);
    }

    public InputFormPage selectInputFormMeuItem()
    {
        driver.findElement(InputForm).click();
        driver.findElement(SelectDropdownMenuItem).click();
        return new InputFormPage(driver);
    }

    public AjaxFormPage selectAjaxFormMeuItem()
    {
        driver.findElement(InputForm).click();
        driver.findElement(AjaxFormSubmitMenuItem).click();
        return new AjaxFormPage(driver);
    }

    public JqueryDropdownSearchPage selectJQueryDropdownMeuItem()
    {
        driver.findElement(InputForm).click();
        driver.findElement(JQueryDropdownMenuItem).click();
        return new JqueryDropdownSearchPage(driver);
    }

}
