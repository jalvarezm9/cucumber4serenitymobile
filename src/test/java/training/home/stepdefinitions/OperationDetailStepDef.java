package training.home.stepdefinitions;

import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import training.home2.pages.common.OperationDetailPage;

public class OperationDetailStepDef {

    @Steps
    private OperationDetailPage operationDetailPage;

    @Y("selecciona la moneda (.*)")
    public void seleccionaLaMonedaMoneda(String moneda) {
        operationDetailPage.selectTypeMoney(moneda);
    }

    @Y("ingresa el monto (.*)")
    public void transferenciaIngresaElMontoMonto(String monto) {
        operationDetailPage.sendAmount(monto);
    }

    @Y("selecciona el boton 'Siguiente'")
    public void seleccionaElBotonSiguiente() {
        operationDetailPage.pressNextButton();
    }

}
