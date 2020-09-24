package training.home.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import training.home2.pages.common.ProductPage;
import training.home2.pages.login.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.is;

public class LoginStepDef {

    @Steps
    //LoginSteps katherine;
    LoginPage loginPage;

    @Steps
    ProductPage productPage;

    @Dado("que el usuario ha abierto la aplicación")
    public void queElUsuarioHaAbiertoLaAplicación() {
        //
    }

    @Cuando("el usuario digita su número de tarjeta (.*)")
    public void elUsuarioDigitaSuNúmeroDeTarjetaTarjeta(String nrotarjeta) {
        loginPage.sendCardNumber(nrotarjeta);
        //katherine.ingresarNumeroTarjeta(nrotarjeta);
    }

    @Y("selecciona como tipo de documento a (.*)")
    public void seleccionaComoTipoDeDocumentoATipoDocumento(String tipodoc) {
        //katherine.ingresarTipoDocumento(tipodoc);
        loginPage.selectDocumentType(tipodoc);
    }

    @Y("digita su número de documento (.*)")
    public void digitaSuNúmeroDeDocumentoNroDocumento(String nrodoc) {
        //katherine.ingresarNumeroDocumento(nrodoc);
        loginPage.sendDocumentNumber(nrodoc);
    }

    @Y("digita su clave web (.*)")
    public void digitaSuClaveWebPassword(String clave) {
        loginPage.sendPassword(clave);
    }

    @Y("selecciona el botón 'Ingresar'")
    public void seleccionaElBotónIngresar() {
        loginPage.pressLoginButton();
    }

    @Entonces("la aplicacion muestra la lista de mis productos")
    public void laAplicacionMuestraLaPáginaHome(){
        if (productPage.loginSuccessful()) System.out.println("Access verified to 'Login' page");
    }

    @Dado("que el usuario inicio sesión con numTarjeta \"(.*)\", tipoDoc \"(.*)\", numDocumento \"(.*)\" y claveWeb \"(.*)\".")
    public void elUsuarioInicioSesión(String numTarjeta, String tipoDoc, String numDocumento, String claveWeb) {
        loginPage.tryLogin(numTarjeta,tipoDoc,numDocumento,claveWeb);
    }

}
