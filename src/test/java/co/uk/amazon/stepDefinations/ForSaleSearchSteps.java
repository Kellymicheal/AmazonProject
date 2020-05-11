package co.uk.amazon.stepDefinations;

import co.uk.amazon.pages.BasePage;
import co.uk.amazon.pages.Homepage;

import co.uk.amazon.pages.ProductDetailsPage;
import co.uk.amazon.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.PageFactory;

public class ForSaleSearchSteps extends BasePage {
    Homepage homepage = PageFactory.initElements(driver, Homepage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver,SearchResultPage.class);
    ProductDetailsPage productDetailsPage = PageFactory.initElements(driver,ProductDetailsPage.class);

    @Given("I navigate to amazon homepage")
    public void i_navigate_to_amazon_homepage()
    {
       launchurl();

    }

    @When("I enter my {string} on search textbox")
    public void i_enter_my_on_search_textbox(String Product)
    {
      homepage.enterProduct(Product);
    }

    @When("Click on searchbutton")
    public void click_on_searchbutton()
    {
        searchResultPage = homepage.clickOnSubmitButton();

    }

    @Then("New {string} detail is displayed")
    public void new_detail_is_displayed(String Product)
    {
        searchResultPage.isSearchResultDisplayed(Product);
        searchResultPage.isResultListDisplayed();


    }

    @Then("I click on any of the result to view more detail")
    public void i_click_on_any_of_the_result_to_view_more_detail()
    {
        productDetailsPage = searchResultPage.clickOnAnyResultsLink();

    }

    @When("I left my {string} detail emty")
    public void i_left_my_detail_emty(String Product) {

    }
    @When("click on sendbutton")
    public void click_on_sendbutton() {

    }

    @Then("same page remain")
    public void same_page_remain() {

    }


}
