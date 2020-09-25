package training.home2.pages.menuOperations;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import training.home2.util.AndroidUtilities;
import training.home2.util.GeneralUtilities;

import static training.home2.util.Plataforma.*;

public class OperationDetailPage extends PageObject {

    @Steps
    AndroidUtilities autil;

    @Steps
    GeneralUtilities gutil;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='pe.com.interbank.mobilebanking.test:id/edtAmount'] | //android.widget.EditText[@resource-id='pe.com.interbank.mobilebanking.test:id/etAmountPayment']")
    private WebElementFacade txtAmount;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Siguiente']")
    WebElementFacade btnSiguiente;

    public void selectTypeMoney(String moneda){
        if(isAndroid()){
            autil.selectOption(moneda);
        }else{

        }
    }

    public void sendAmount(String monto){
        txtAmount.click();
        if(isIOS()){
            monto = monto.replace(".","");
        }
        txtAmount.sendKeys(monto);
        gutil.hideKeyboard();
    }

    public void pressNextButton(){
        btnSiguiente.click();
    }


}
