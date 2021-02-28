package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.TvPage;


public class CompareButtonTest extends BaseTest {

    @Test
    public void checkCompareButtonTest () {
        TvPage tvPage = homePage.getCatalogPage().getElectronicaPage().getTvPage();
        Boolean isCompareButtonDisplayed =  tvPage.selectBrand().selectDiagonal().selectTechology().selectTvToCompare("OLED65BXRLB").isCompareButtonDisplayed();
        Assertions.assertTrue(isCompareButtonDisplayed);
    }

}
