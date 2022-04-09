package ru.citilink.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CatalogPage {
    SelenideElement
    openCatalog = $(".MainHeader__catalog button"),
    searchInput = $(".CatalogMenu__search input"),
    subcategoryHeader = $(".Subcategory__header h1");

    public void setOpenCatalog(){
        openCatalog.click();
    }

    public void typeSearchInput(String subject){
        searchInput.setValue(subject).pressEnter();
    }

    public void checkResultSearch(String value){
        subcategoryHeader.shouldBe(visible);
        subcategoryHeader.shouldHave(text(value));
    }
}
