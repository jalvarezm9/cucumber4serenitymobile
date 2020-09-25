package training.home2.pages.menuOperations;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.support.FindBy;
import training.home2.util.AndroidUtilities;
import training.home2.util.GeneralUtilities;

import java.util.List;

public class PaymentServicesPage extends PageObject {

    @Steps
    AndroidUtilities autil;

    @Steps
    GeneralUtilities gutil;

    @iOSXCUITFindBy(id = "searchCompanyBtn")
    @AndroidFindBy(id = "etSearchOtherCompany")
    WebElementFacade txtSearchCompany;

    @iOSXCUITFindBy(id = "searchCompanyTxt")
    @AndroidFindBy(id = "etSearchField")
    WebElementFacade txtSearchCompanyFilter;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@height=44]")
    @AndroidFindBy(id = "tvItemSearchCompany")
    WebElementFacade lblCompany;

    @iOSXCUITFindBy(id = "servicesTxt") //combo de servicio rest
    @AndroidFindBy(id = "tvItemSearchCompany")
    List<WebElementFacade> listaServicios;

    @iOSXCUITFindBy(id = "servicesTxt") //combo de servicio rest
    @AndroidFindBy(id = "spServicios")
    WebElementFacade cmbServicios;

    @iOSXCUITFindBy(id = "supplyTxt")
    @AndroidFindBy(id = "edtServiceNumber")
    WebElementFacade txtDebtCode;

    @iOSXCUITFindBy(id = "searchBtn")
    @AndroidFindBy(id = "btnNext")
    WebElementFacade btnSearch;

    public void searchAndSelectCompanOrInstitution(String company){
        txtSearchCompany.click();
        txtSearchCompanyFilter.click();
        txtSearchCompanyFilter.sendKeys(company);
        lblCompany.click();
    }

    public void selectService(String service){
        if(listaServicios.size()==1){
            cmbServicios.click();
        }
        autil.selectProductTouch(listaServicios,service);
    }

    public void sendDebtCode(String value) {
        txtDebtCode.click();
        txtDebtCode.sendKeys(value);
        gutil.hideKeyboard();
    }

    public void selectSearchDebt() {
        btnSearch.click();
    }

}
