package training.home.stepdefinitions.menu;

import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import training.home2.pages.common.menu.GeneralMenuPage;

public class MenuGeneralStepDef {

    @Steps
    GeneralMenuPage generalMenuPage;

    @Y("selecciona la opcion '(.*)' del MenuPrincipal")
    public void seleccionaOpcionMenuPrincipal(String value){
        generalMenuPage.selectOption(value);
    }

}
