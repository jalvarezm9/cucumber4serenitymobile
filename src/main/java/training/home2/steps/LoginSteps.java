package training.home2.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import training.home2.pages.login.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Step
    public void ingresarNumeroTarjeta(String nrotarjeta) {
        loginPage.sendCardNumber(nrotarjeta);
    }

    @Step
    public void ingresarTipoDocumento(String tipodoc) {
    }

    @Step
    public void ingresarNumeroDocumento(String nrodoc) {
    }
}
