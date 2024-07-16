package co.uk.rightmove.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BrowserManager extends DriverManager {

    /*
    How do we initialise chromedriver or edgedriver?
    How do we run test in headless mode?
    How do we launch browser and tell which browser launched?
    How do we close the browser?
    */

    public WebDriver initChrome(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public WebDriver initEdge(){
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    public WebDriver initFirefox(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    public WebDriver initSafari(){
        WebDriverManager.safaridriver().setup();
        return new SafariDriver();
    }

    public WebDriver initHeadless(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable gpu","--headless");
        return new ChromeDriver(options);
    }

    public void launchBrowser(String browser){
        switch (browser){
            case "chrome":
                driver = initChrome();
                break;
            case "edge":
                driver = initEdge();
                break;
            case "firefox":
                driver = initFirefox();
                break;
            case "safari":
                driver = initSafari();
                break;
            default:
                driver = initChrome();
            break;
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
