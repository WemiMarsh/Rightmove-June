package co.uk.rightmove.pages;

import co.uk.rightmove.commons.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        DriverManager.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "ta_searchInput")
    private WebElement searchField;

    @FindBy(xpath = "//button[@data-testid='forSaleCta']")
    private WebElement forSaleButton;

    @FindBy(css = ".dsrm_button.dsrm_button--light.dsrm_large.dsrm_primary.dsrm_core.dsrm_width_content")
    private WebElement forSaleButton2;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookies;

    public void enterLocation(String location) throws InterruptedException {
        searchField.sendKeys(location);
        Thread.sleep(1000);

    }

    public SearchCriteriaPage clickForSaleButton() {
        forSaleButton.click();

        return new SearchCriteriaPage(driver);

    }

    public void clickAcceptCookies(){
        acceptCookies.click();
    }
}
