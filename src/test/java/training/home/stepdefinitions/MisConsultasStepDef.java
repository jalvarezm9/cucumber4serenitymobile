package training.home.stepdefinitions;

import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import training.home2.pages.common.MyQueriesPage;

public class MisConsultasStepDef {

    @Steps
    MyQueriesPage myQueriesPage;

    @Y("selecciona el 'ShortcutMenu'")
    public void selectOptionShortcutMenu(){
        myQueriesPage.selectOptionShortcutMenu();
    }

}
