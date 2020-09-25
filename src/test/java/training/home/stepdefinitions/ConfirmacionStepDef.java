package training.home.stepdefinitions;

import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import training.home2.pages.common.ConfirmationPage;

public class ConfirmacionStepDef {

    @Steps
    ConfirmationPage confirmationPage;

    @Y("se muestra la pantalla de confirmacion")
    public void seMuestraLaPantallaDeConfirmacion() {
        if (confirmationPage.isTitleVisible()) System.out.println("Access verified to 'Confirmation' page");
    }

    @Y("ingresa un email (.*) y celular (.*)")
    public void ingresaUnEmailEmailYCelularCelular(String email,String numCell) {
        confirmationPage.tryConfirmationCustomerTrip(email,numCell);
    }

    @Y("selecciona el boton 'Confirmar'")
    public void seleccionaElBotonConfirmar() {
        confirmationPage.pressConfirmButton();
    }


}
