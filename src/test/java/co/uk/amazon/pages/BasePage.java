package co.uk.amazon.pages;

import co.uk.amazon.common.driverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends driverLib
{
    public String BASE_URL = "https://www.amazon.co.uk/";
    public Select select;
    public  void launchurl()
    {
        driver.navigate().to(BASE_URL);
    }
    public void AcceptCookies()
    {

    }
    public void selectElementByVisibleText(WebElement element,String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void selectElementByValue(WebElement element, String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }
    public void selectElementByIndex(WebElement element, int index)
    {
        select = new Select(element);
        select.selectByIndex(index);
    }
}
