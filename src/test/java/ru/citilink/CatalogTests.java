package ru.citilink;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@DisplayName("Тесты для проверки каталога товаров")
public class CatalogTests extends TestBase{

    @Test
    @Owner("igor.glazov")
    @Feature("Каталог товаров")
    @DisplayName("Проверка наличия каталога товаров")
    @Severity(SeverityLevel.BLOCKER)
    public void catalogIsVisible(){
        step("Проверяем наличие каталога товаров", () -> {
            $("[data-label=\"Каталог товаров\"]").shouldBe(visible);
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Каталог товаров")
    @DisplayName("Проверка загрузки каталога товаров")
    @Severity(SeverityLevel.BLOCKER)
    public void headerTopLoading() {
        step("Проверяем загрузку каталога товаров", () -> {
            $(".MainHeader__catalog button").shouldBe(visible).click();
            step("Лого каталога", () -> {
                $(".CatalogMenu__logo").shouldBe(visible);
                    });
            step("Меню каталога", () -> {
                $(".CatalogMenu__category").shouldBe(visible).shouldBe(text("Смартфоны и гаджеты"),
                        text("Ноутбуки и компьютеры"), text("Телевизоры, аудио-видео, фото"),
                        text("Бытовая техника для дома и кухни"), text("Строительство и ремонт"), text("Дом и дача"),
                        text("Умный дом и системы безопасности"), text("Автотовары"), text("Канцтовары, Мебель и Офисная техника"),
                        text("Красота и здоровье"), text("Детские товары"), text("Спорт и отдых"),
                        text("Товары для геймеров"), text(""));
                    });
        });
    }
}