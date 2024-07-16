package co.uk.rightmove.pages;

import co.uk.rightmove.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager {

    public String BASE_URL = "https://www.rightmove.co.uk/";

    public void launchURL (){
        driver.navigate().to(BASE_URL);
    }
    private Select select;

    public void selectElementByText(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void selectElementByValue(WebElement element, String value){
        select = new Select(element);
        select.selectByValue(value);
    }
    public void selectByIndex(WebElement element, int index){
        select = new Select(element);
        select.selectByIndex(index);
    }

}
