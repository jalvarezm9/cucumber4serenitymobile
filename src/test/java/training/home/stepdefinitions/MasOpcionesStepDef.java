package training.home.stepdefinitions;

import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import training.home2.pages.common.menu.MasOpcionesPage;

public class MasOpcionesStepDef {

    @Steps
    MasOpcionesPage masOpcionesPage;

    @Y("selecciona la opcion 'MeVoyDeViaje'")
    public void selecciona_la_opcion() {
        masOpcionesPage.seleccionarMeVoyDeViaje();
    }
}
