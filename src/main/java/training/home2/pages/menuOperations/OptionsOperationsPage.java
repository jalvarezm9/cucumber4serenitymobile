package training.home2.pages.menuOperations;

import net.serenitybdd.core.pages.PageObject;

public class OptionsOperationsPage extends PageObject {

    public static final String ANDROID_OPTION_OPERATIONS = "//android.widget.TextView[@text='{0}']";

    public void seleccionarOpcionOperaciones(String value) {
        findBy(ANDROID_OPTION_OPERATIONS,value).click();
    }
}
