package training.home.stepdefinitions;

import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import training.home2.pages.common.ConstancyPage;

public class ConstanciaStepsDef {

    @Steps
    ConstancyPage constancyPage;

    @Entonces("la aplicacion muestra la Constancia de operacion")
    public void laAplicacionMuestraLaConstanciaDeOperacion() {
        constancyPage.isTitleVisible();
    }
}
