package training.home2.pages.common;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import training.home2.util.GeneralUtilities;

public class ConstancyPage extends PageObject {

    @Steps
    GeneralUtilities gutil;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='android:id/action_bar']//android.widget.TextView[@text='Constancia']")
    private WebElementFacade tituloConstancia;

    public void isTitleVisible() {
        gutil.validateTitle(tituloConstancia);
    }

}
