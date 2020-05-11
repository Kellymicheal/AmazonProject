package co.uk.amazon.pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;


public class SearchResultPage extends BasePage
{
    public SearchResultPage(WebDriver driver)
    {
        this. driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(css = ".a-color-state.a-text-bold")
    private WebElement title;
    @FindBy(css = ".a-size-medium.a-color-base.a-text-normal")
    private List<WebElement> results;



    public void isSearchResultDisplayed(String Product)
    {
        String titleText = title.getText();
        Assert.assertTrue(titleText.contains(Product));

    }
    public void isResultListDisplayed()
    {
        Assert.assertTrue(results.size()>0);
    }
    public ProductDetailsPage clickOnAnyResultsLink()
    {
       // results.get(5).click();
        Random random = new Random();
        int result = random.nextInt(results.size()-1);
        results.get(result).click();
        return new ProductDetailsPage(driver);
    }

}
