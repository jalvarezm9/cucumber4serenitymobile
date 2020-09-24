package training.home2.util;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AndroidUtilities extends PageObject {

    private String ultimo="";

    public void selectProductTouch(List<WebElementFacade> listElements, String product){
        boolean found = false;
        do {
            if(ultimo.equals(listElements.get(listElements.size()-1).getText())) throw new NoSuchElementException("El producto '"+product+"' no se encuentra en lista");

            for (WebElementFacade elementFacade : listElements) {
                if (elementFacade.getText().equalsIgnoreCase(product)) {
                    found = true;
                    elementFacade.click();
                    break;
                }
            }
            if(!found){
                ultimo = listElements.get(listElements.size()-1).getText();
                swipeByElements(listElements.get(listElements.size()-1),listElements.get(0));
            }
        }while (!found);
    }

    private void swipeByElements(WebElementFacade startElement, WebElementFacade endElement) {

        //WebDriverWait wait = new WebDriverWait(getDriver(),10);
        WebDriver driver = ((WebDriverFacade) getDriver()).getProxiedDriver();

        //wait.until(ExpectedConditions.visibilityOf(startElement));
        //wait.until(ExpectedConditions.visibilityOf(endElement));
        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);

        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);

        new TouchAction((MobileDriver) driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }

    public void selectOption(String value) {
        getDriver().findElement(By.xpath("//android.widget.RadioButton[@text='"+value+"']")).click();
    }



}
