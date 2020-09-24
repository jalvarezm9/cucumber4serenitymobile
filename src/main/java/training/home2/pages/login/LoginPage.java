package training.home2.pages.login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import static training.home2.util.Plataforma.*;
import training.home2.util.Utilities;

import java.time.Duration;
import java.util.List;

public class LoginPage extends PageObject {

    @Steps
    Utilities util;

    @iOSXCUITFindBy(id = "numberCardTxt")
    @AndroidFindBy(id = "edt_account")
    WebElementFacade txtNroTarjeta;

    @iOSXCUITFindBy(id = "typeDocumentTxt")
    @AndroidFindBy(id = "tvItemSearchCompany")
    WebElementFacade cboTipoDocumento;

    @AndroidFindBy(id = "tvItemSearchCompany")
    List<WebElementFacade> listTypeDocuments;

    @iOSXCUITFindBy(id = "numberDocumentTxt")
    @AndroidFindBy(id = "txtNroDocumento")
    WebElementFacade txtNroDocumento;

    @iOSXCUITFindBy(id = "pwdWebTxt")
    @AndroidFindBy(id = "edt_pass")
    WebElementFacade txtClaveWeb;

    @iOSXCUITFindBy(id = "loginBtn")
    @AndroidFindBy(id = "btn_login")
    WebElementFacade btnLogin;

    public void sendCardNumber(String value) {
        txtNroTarjeta.withTimeoutOf(Duration.ofSeconds(20)).waitUntilClickable().click();
        txtNroTarjeta.type(value);
        util.hideKeyboard();
    }

    public void sendDocumentNumber(String value) {
        txtNroDocumento.click();
        txtNroDocumento.type(value);
        util.hideKeyboard();
    }

    public void sendPassword(String value) {
        txtClaveWeb.click();
        txtClaveWeb.type(value);
        util.hideKeyboard();
    }

    public void selectDocumentType(String value){
        cboTipoDocumento.click();
        if(isAndroid()){
            util.selectItemOfListWhithCountLimit(listTypeDocuments,value);
        }else{
            System.out.println("Camino de iOS");
        }
    }

    public void pressLoginButton() {
        btnLogin.click();
    }

    private void enterValueOn(WebElementFacade webElement, String value) {
        webElement.withTimeoutOf(Duration.ofSeconds(20)).waitUntilClickable().click();
        webElement.clear();
        webElement.sendKeys(value);
        util.hideKeyboard();
    }

    public void tryLogin(String numTarjeta, String tipoDoc, String numDocumento, String claveWeb) {
        enterValueOn(this.txtNroTarjeta, numTarjeta);
        selectDocumentType(tipoDoc);
        enterValueOn(this.txtNroDocumento, numDocumento);
        enterValueOn(this.txtClaveWeb, claveWeb);
        pressLoginButton();
    }

}
