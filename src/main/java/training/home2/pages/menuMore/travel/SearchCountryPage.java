package training.home2.pages.menuMore.travel;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SearchCountryPage extends PageObject {

    @iOSXCUITFindBy(id = "Buscar país")
    @AndroidFindBy(id = "etSearchField")
    WebElementFacade lblPais;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@visible='true']")
    @AndroidFindBy(id = "tvItemSearchCompany")
    WebElementFacade opcionPais;

    public void searchCountry(String country) {
        lblPais.clear();
        lblPais.sendKeys(country);
    }

    public void selectCountry() {
        opcionPais.click();
    }

}
