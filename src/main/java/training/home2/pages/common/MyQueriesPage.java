package training.home2.pages.common;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyQueriesPage extends PageObject {

    @iOSXCUITFindBy(id ="more options")
    @AndroidFindBy(id = "iv_options")
    private WebElementFacade menuShortCut;

    public void selectOptionShortcutMenu(){
        menuShortCut.click();
    }
}
