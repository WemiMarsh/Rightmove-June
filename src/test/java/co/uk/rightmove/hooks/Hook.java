package co.uk.rightmove.hooks;

import co.uk.rightmove.commons.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowserManager {
    @Before
    public void setUp(){
        launchBrowser("chrome");
    }
    @After
    public void tearDown(){
//        closeBrowser();
}

}
