package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='b-main-navigation__text'][text()='Каталог']")
    private WebElement catalogButton;

    public CatalogPage getCatalogPage () {
        catalogButton.click();
        return new CatalogPage(driver);
    }

}
