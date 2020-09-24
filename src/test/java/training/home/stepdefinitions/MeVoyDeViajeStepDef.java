package training.home.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import training.home2.pages.menuMore.travel.SearchCountryPage;
import training.home2.pages.menuMore.travel.TravelPage;

public class MeVoyDeViajeStepDef {

    @Steps
    TravelPage travelPage;

    @Steps
    SearchCountryPage searchCountryPage;

    @Y("selecciona el Pais destino (.*)")
    public void seleccionaElPaisDestino(String pais) {
        travelPage.selectCountryDestination();
        searchCountryPage.searchCountry(pais);
        searchCountryPage.selectCountry();
    }

    @Y("selecciona la fecha de salida y retorno")
    public void seleccionaLaFechaDeSalidaYRetorno() {
        travelPage.TouchCheck_FechaIda();
        travelPage.aceptarFecha();
        travelPage.TouchCheck_FechaRetorno();
        travelPage.aceptarFecha();
    }

    @Y("[Travel] selecciona el boton 'Siguiente'")
    public void travelSeleccionaElBotonSiguiente() {
        travelPage.selectNextButton();
    }

    @Y("selecciona la tarjeta (.*)")
    public void seleccionaLaTarjetaTarDebito(String card) {
        travelPage.selectTarjeta(card);
    }

}
