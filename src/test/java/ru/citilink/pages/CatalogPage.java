package ru.citilink.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CatalogPage {
    SelenideElement
            catalogButton = $(".MainHeader__catalog button"),
            catalogMenuLogo = $(".CatalogMenu__logo"),
            catalogMenuCategory = $(".CatalogMenu__category"),
            searchInput = $(".CatalogMenu__search input"),
            subcategoryHeader = $(".Subcategory__header h1");

    public void checkCataloLogo() {
        catalogMenuLogo.shouldBe(visible);
    }

    public void checkCategories(String value) {
        catalogMenuCategory.shouldBe(visible);
        catalogMenuCategory.shouldHave(text(value));
    }

    public void OpenCatalog() {
        catalogButton.shouldBe(visible);
        catalogButton.click();
    }

    public void typeSearchInput(String subject) {
        searchInput.setValue(subject).pressEnter();
    }

    public void checkResultSearch(String value) {
        subcategoryHeader.shouldBe(visible);
        subcategoryHeader.shouldHave(text(value));
    }
}
