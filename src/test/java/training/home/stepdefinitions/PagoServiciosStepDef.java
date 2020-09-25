package training.home.stepdefinitions;

import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import training.home2.pages.menuOperations.PaymentServicesPage;

public class PagoServiciosStepDef {

    @Steps
    PaymentServicesPage paymentServicesPage;

    @Y("busca y selecciona una empresa o institucion (.*)")
    public void buscaYSeleccionaUnaEmpresaOInstitucion(String empresa) {
        paymentServicesPage.searchAndSelectCompanOrInstitution(empresa);
    }

    @Y("selecciona un servicio (.*)")
    public void seleccionaUnServicioServicio(String servicio) {
        paymentServicesPage.selectService(servicio);
    }

    @Y("ingresa un codigo de deuda (.*)")
    public void ingresaUnCodigoDeDeuda(String codigo) {
        paymentServicesPage.sendDebtCode(codigo);
    }

    @Y("selecciona el boton 'BuscarRecibos'")
    public void seleccionaElBotonDeBuscarRecibos() {
        paymentServicesPage.selectSearchDebt();
    }

    @Y("ingresa el codigo SMS")
    public void ingresaElCodigoSMS() {
    }
}
