package training.home2.util;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class GeneralUtilities extends PageObject {

    public boolean validateTitle(WebElementFacade elementFacade){
        elementFacade.withTimeoutOf(Duration.ofSeconds(20)).waitUntilVisible();
        return elementFacade.isDisplayed();
    }
}
