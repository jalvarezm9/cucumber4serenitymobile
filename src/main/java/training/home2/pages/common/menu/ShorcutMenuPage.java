package training.home2.pages.common.menu;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import training.home2.util.GeneralUtilities;

import java.util.List;

public class ShorcutMenuPage extends PageObject {

    @Steps
    GeneralUtilities gutil;

    @AndroidFindBy(id = "txtView")
    private List<WebElementFacade> listOptionsShortcutMenu;

    public void selectOption(String value){
        gutil.selectItemOfListWhithCountLimit(listOptionsShortcutMenu,value);
    }

}
