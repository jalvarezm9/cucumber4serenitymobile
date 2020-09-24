package training.home.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import training.home2.pages.common.ProductPage;

public class ProductosStepDef {

    @Steps
    ProductPage productPage;

    @Cuando("selecciona el producto (.*)")
    public void seleccionaUnProducto(String producto) {
        productPage.selectProduct(producto);
    }

    @Cuando("selecciona la cuenta (.*)")
    public void seleccionaUnaCuenta(String value) {
        productPage.selectProductAccount(value);
    }

    @Y("ingresa el numero de cuenta destino (.*)")
    public void ingresaElNumeroDeCuentaDestino(String numAccount) {
        productPage.sendAccountNumberIBK(numAccount);
    }

    @Y("selecciona el tipo de cuenta destino IBK (.*)")
    public void seleccionaElTipoDeCuentaIBK(String tipoCuentaDestino) {
        productPage.selectDestinationAccountType(tipoCuentaDestino);
    }

    @Y("ingresa el numero de CCI (.*)")
    public void ingresaElNumeroDeCCICuentaDestino(String numcci) {
        productPage.sendNumberCCI(numcci);
    }
}
