package training.home2.pages.common.menu;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MasOpcionesPage extends PageObject {

    @iOSXCUITFindBy(id = "Me voy de viaje")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Me voy')]")
    WebElementFacade opcionMeVoyDeViaje;

    public void seleccionarMeVoyDeViaje(){
        opcionMeVoyDeViaje.click();
    }

}
