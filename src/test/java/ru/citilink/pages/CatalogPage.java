package ru.citilink.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CatalogPage {
    SelenideElement
            catalogIsAvailable = $("[data-label=\"Каталог товаров\"]"),
            catalogButton = $(".MainHeader__catalog button"),
            catalogMenuLogo = $(".CatalogMenu__logo"),
            catalogMenuCategory = $(".CatalogMenu__category"),
            searchInput = $(".CatalogMenu__search input"),
            subcategoryHeader = $(".Subcategory__header h1");

    public CatalogPage checkCatalogIsAvailable() {
        catalogIsAvailable.shouldBe(visible);

        return this;
    }

    public CatalogPage checkCatalogLogo() {
        catalogMenuLogo.shouldBe(visible);

        return this;
    }

    public CatalogPage checkCategories(String value) {
        catalogMenuCategory.shouldBe(visible).shouldHave(text(value));

        return this;
    }

    public CatalogPage OpenCatalog() {
        catalogButton.click();

        return this;
    }

    public CatalogPage typeSearchInput(String subject) {
        searchInput.setValue(subject).pressEnter();

        return this;
    }

    public CatalogPage checkResultSearch(String value) {
        subcategoryHeader.shouldBe(visible).shouldHave(text(value));

        return this;
    }
}
