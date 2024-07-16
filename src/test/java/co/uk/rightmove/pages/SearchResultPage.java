package co.uk.rightmove.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage {
    public SearchResultPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "proprtyCard-priceValue")
    List<WebElement> searchResults;

    public PropertyDetailsPage clickFirstProperty(){
        searchResults.get(0).click();
        return new PropertyDetailsPage(driver);
    }
}
