package co.uk.amazon.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserClass extends driverLib
{
    private WebDriver initChrome()
    {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    private  WebDriver initHeadLessChrome()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu", "--headless");
        return new ChromeDriver();
    }
    private WebDriver initFirefox()
    {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
    private WebDriver initInternetExplorrer()
    {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }
    public void launchBrowser(String browser)
    {
        switch (browser)
        {
            case "Chrome":
                driver = initChrome();
                break;
            case "Firefox":
                driver =initFirefox();
                break;
            case  "Headless":
                driver = initHeadLessChrome();
                break;
            case "ie":
            case "internet Explorrer":
            case "Internet Explorrer":
            case "internetexplorrer":
            case "InternetExplorrer":
            case "IE":
                driver = initInternetExplorrer();
                break;
            default:
                driver = initHeadLessChrome();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }
    public void closeBrowser()
    {
      driver.manage().deleteAllCookies();
      driver.quit();
    }


}
