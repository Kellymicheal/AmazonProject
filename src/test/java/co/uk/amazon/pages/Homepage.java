package co.uk.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage extends BasePage
{
    public Homepage(WebDriver Driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "twotabsearchtextbox")
    private WebElement productField;
    @FindBy(className = "nav-input")
    private WebElement submitbutton;

public void enterProduct(String Product)
{
    productField.clear();
    productField.sendKeys(Product);
    productField.click();

}

public SearchResultPage clickOnSubmitButton()
{
submitbutton.click();
return new SearchResultPage(driver);
}

}