package training.home2.pages.menuMore.travel;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;

import org.openqa.selenium.support.FindBy;
import training.home2.util.Utilities;

import java.util.List;

public class TravelPage extends PageObject {

    @Steps
    private Utilities util;

    @AndroidFindBy(id = "android:id/action_bar_title")
    private WebElementFacade title;

    @FindBy(id = "Buscar país de destino")
    @AndroidFindBy(id = "tvCountry")
    private WebElementFacade lblBuscaDestino;

    @FindBy(id = "Añadir otro país")
    @AndroidFindBy (id = "btnAddCountry")
    private WebElementFacade btnAnadirPais;

    @FindBy(xpath = "//XCUIElementTypeTextField[@value='Fecha de ida']")
    @AndroidFindBy(id ="tvStartDate")
    private WebElementFacade chkFechaInicio;

    @FindBy(xpath = "//XCUIElementTypeTextField[@value='Fecha de regreso']")
    @AndroidFindBy(id ="tvEndDate")
    private WebElementFacade chkFechaFin;

    @FindBy(id = "Aceptar")
    @AndroidFindBy(id ="btnAction2")
    private WebElementFacade btnAceptarFecha;

    @FindBy(id = "Siguiente")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Siguiente']")
    private WebElementFacade btnSiguiente;

    @iOSXCUITFindBy(id = "Siguiente")
    @AndroidFindBy(id = "btnNextConfirmTravelNotice")
    private WebElementFacade btnSiguienteSelectTarjeta;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText")
    @AndroidFindBy(id = "tvAccountName")
    private List<WebElementFacade> listaTarjetas;

    public void selectCountryDestination() {
        lblBuscaDestino.click();
    }

    public void TouchCheck_FechaIda(){
        chkFechaInicio.click();
    }

    public void TouchCheck_FechaRetorno() {
        chkFechaFin.click();
    }

    public void aceptarFecha() {
        btnAceptarFecha.click();
    }

    public void selectNextButton() {
        btnSiguiente.click();
    }

    public void selectTarjeta(String value) {
        util.selectItemOfListWhithCountLimit(listaTarjetas,value);
    }
}
