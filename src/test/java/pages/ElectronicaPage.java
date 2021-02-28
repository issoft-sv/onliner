package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ElectronicaPage extends BasePage {
    public ElectronicaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(text(),'Телевидение')]")
    private WebElement tv_and_videoButton;
    @FindBy(xpath = "//a[@href='https://catalog.onliner.by/tv']")
    private WebElement tvButton;

    public TvPage getTvPage () {
        Actions action = new Actions(driver);
        action.moveToElement(tv_and_videoButton).moveToElement(tvButton).click().build().perform();
        return new TvPage(driver);
    }
}
