package training.home2.pages.common;
import static training.home2.util.Plataforma.*;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.support.FindBy;
import training.home2.util.AndroidUtilities;
import training.home2.util.GeneralUtilities;
import training.home2.util.Utilities;

import java.time.Duration;
import java.util.List;

public class ProductPage extends PageObject {

    @Steps
    AndroidUtilities autil;

    @Steps
    GeneralUtilities gutil;

    @Steps
    Utilities util;

    @iOSXCUITFindBy(id = "Productos")
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='android:id/action_bar']//android.widget.TextView[@text='Productos']")
    private WebElementFacade tituloProductos;

    @iOSXCUITFindBy(id = "Productos")
    @AndroidFindBy(id = "android:id/action_bar_title")
    WebElementFacade tituloProductosLogin;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@height=21]")
    @AndroidFindBy(id= "item_account_title_tv")
    List<WebElementFacade> listNameProducts;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@height=21]")
    @AndroidFindBy(id= "txtTitle")
    List<WebElementFacade> listNameAccount;

    @FindBy(id = "accountNumberTxt")
    @AndroidFindBy(id = "edtNumberAccount")
    WebElementFacade txtAccountNumber;

    @AndroidFindBy(id = "txtCCI")
    WebElementFacade txtNumberCCI;

    public boolean loginSuccessful(){
        return gutil.validateTitle(tituloProductosLogin);
    }

    public void selectProduct(String producto){
        if(isAndroid()) {
            autil.selectProductTouch(listNameProducts,producto);
        }else{
            //iOSUtil.selectAccountIOS(producto);
        }
    }

    public void selectProductAccount(String producto){
        if(isAndroid()) {
            autil.selectProductTouch(listNameAccount,producto);
        }else{
            //iOSUtil.selectAccountIOS(producto);
        }
    }

    public void sendAccountNumberIBK(String accountNumber){
        txtAccountNumber.click();
        txtAccountNumber.sendKeys(accountNumber);
        util.hideKeyboard();
    }

    public void selectDestinationAccountType(String tipoCuentaDestinoIbk){
        if(isAndroid()){
            autil.selectOption(tipoCuentaDestinoIbk);
        }else{

        }
    }

    public void sendNumberCCI(String nrocci){
        txtNumberCCI.click();
        txtNumberCCI.sendKeys(nrocci);
        util.hideKeyboard();
    }

}
