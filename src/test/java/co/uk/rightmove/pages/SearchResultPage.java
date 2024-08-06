package co.uk.rightmove.pages;

import co.uk.rightmove.commons.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage {
    public SearchResultPage (WebDriver driver){
        DriverManager.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "propertyCard-priceValue")
    List<WebElement> searchResults;

    public PropertyDetailsPage clickFirstProperty(){
        searchResults.get(0).click();
        return new PropertyDetailsPage(driver);
    }
}
