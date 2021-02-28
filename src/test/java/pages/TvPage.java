package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TvPage extends BasePage {
    public TvPage(WebDriver driver) {
        super(driver);
    }

    private By compareCheckbox;
    private By compareButton = By.className("compare-button__sub compare-button__sub_main");
    @FindBy(xpath = "//ul[@class='schema-filter__list']//input[@value='lg']/following-sibling::span")
    private WebElement brandCheckbox;
    @FindBy(xpath = "//span[contains(text(),'OLED')][@class='schema-filter__checkbox-text']")
    private WebElement technologyCheckbox;
    @FindBy(xpath = "//span[contains(text(),'65')][@class='schema-filter__checkbox-text']")
    private WebElement diagonalCheckbox;

    public TvPage selectBrand () {
        brandCheckbox.click();
        return this;
    }

    public TvPage selectTechology () {
        technologyCheckbox.click();
        return this;
    }

    public TvPage selectDiagonal () {
        diagonalCheckbox.click();
        return this;
    }

    public TvPage selectTvToCompare (String modelname) {
        compareCheckbox = By.xpath(String.format("//span[contains(text(),'%s')]/ancestor::div[@class='schema-product']//span[@class='i-checkbox__faux']", modelname));
        driver.findElement(compareCheckbox).click();
        return this;
    }

    public Boolean isCompareButtonDisplayed () {
        Boolean isDisplayed = driver.findElements(compareButton).size() > 0;
        return isDisplayed;
    }

}
