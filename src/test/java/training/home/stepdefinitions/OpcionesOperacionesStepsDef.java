package training.home.stepdefinitions;

import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import training.home2.pages.common.OptionsOperationsPage;

public class OpcionesOperacionesStepsDef {

    @Steps
    private OptionsOperationsPage optionsOperationsPage;

    @Y("selecciona la opción '(.*)'")
    public void seleccionaElMenuTransferencias(String value) {
        optionsOperationsPage.seleccionarOpcionOperaciones(value);
    }
}
