package training.home.stepdefinitions.menu;

import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import training.home2.pages.common.menu.ShorcutMenuPage;

public class ShorcutStepDef {

    @Steps
    ShorcutMenuPage shorcutMenuPage;

    @Y("selecciona la opcion shortcut '(.*)'")
    public void seleccionaLaOpcionShortcutMeVoyDeViaje(String opcion) {
        shorcutMenuPage.selectOption(opcion);
    }
}
