package co.uk.amazon.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForSaleSearchSteps {
    WebDriver driver;

    @Given("I navigate to amazon homepage")
    public void i_navigate_to_amazon_homepage()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.co.uk/");

    }

    @When("I enter my {string} on search textbox")
    public void i_enter_my_on_search_textbox(String Product) {

    }

    @When("Click on searchbutton")
    public void click_on_searchbutton() {

    }

    @Then("New {string} detail is displayed")
    public void new_detail_is_displayed(String Product) {

    }

    @Then("I click on product detail")
    public void i_click_on_product_detail() {

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
