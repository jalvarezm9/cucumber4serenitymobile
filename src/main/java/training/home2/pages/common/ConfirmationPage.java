package training.home2.pages.common;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import training.home2.util.GeneralUtilities;
import training.home2.util.Utilities;

public class ConfirmationPage extends PageObject {

    @Steps
    GeneralUtilities gutil;

    @Steps
    Utilities util;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='android:id/action_bar']//android.widget.TextView[@text='Confirmación']")
    private WebElementFacade tituloConfirmacion;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[starts-with(@name,'Ingresa tu e-mail')]//following-sibling::XCUIElementTypeTextField")
    @AndroidFindBy(id = "edtUserEmail")
    WebElementFacade txtEmail;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[starts-with(@name,'Ingresa tu teléfono')]//following-sibling::XCUIElementTypeTextField")
    @AndroidFindBy(id = "edtPhoneNumber")
    WebElementFacade txtPhoneNumber;

    @iOSXCUITFindBy(id = "confirmBtn")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Confirmar']")
    WebElementFacade btnConfirmation;

    public boolean isTitleVisible() {
       return gutil.validateTitle(tituloConfirmacion);
    }

    public void pressConfirmButton() {
        btnConfirmation.click();
    }

    private void enterValueOn(WebElementFacade webElement, String value) {
        webElement.click();
        webElement.type(value);
        util.hideKeyboard();
    }

    public void tryConfirmationCustomerTrip(String email, String movil){
        enterValueOn(this.txtEmail,email);
        enterValueOn(this.txtPhoneNumber,movil);
    }

}
