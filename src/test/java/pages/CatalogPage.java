package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends BasePage {
    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Электроника']")
    private WebElement electronicaButton;

    public ElectronicaPage getElectronicaPage () {
        electronicaButton.click();
        return new ElectronicaPage(driver);
    }
}
