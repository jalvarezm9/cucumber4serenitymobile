package training.home2.util;

import io.appium.java_client.MobileDriver;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.List;

public class GeneralUtilities extends PageObject {

    public boolean validateTitle(WebElementFacade elementFacade){
        elementFacade.withTimeoutOf(Duration.ofSeconds(20)).waitUntilVisible();
        return elementFacade.isDisplayed();
    }

    public void hideKeyboard() {
        WebDriver driver = ((WebDriverFacade) getDriver()).getProxiedDriver();
        ((MobileDriver) driver).hideKeyboard();
    }

    public void selectItemOfListWhithCountLimit(List<WebElementFacade> listElements, String value){
        for (WebElementFacade element : listElements) {
            if (element.getText().replaceAll("\n", " ").equals(value)) {
                element.click();
                break;
            }

            if(element.getText().equals(listElements.get(listElements.size()-1).getText())){
                throw new NoSuchElementException("Element '"+value+"' no ubicado");
            }
        }
    }
}
