package training.home2.pages.common.menu;

import net.serenitybdd.core.pages.PageObject;
import static training.home2.util.Plataforma.*;

public class GeneralMenuPage extends PageObject {

    public static final String ANDROID_OPTION_MENU_PRINCIPAL = "//android.widget.LinearLayout[@resource-id='pe.com.interbank.mobilebanking.test:id/llnTabsController']//android.widget.TextView[@text='{0}']";

    public void selectOption(String value){
        if(isAndroid()) {
                findBy(ANDROID_OPTION_MENU_PRINCIPAL, value).click();
        }else {

        }
    }
}
