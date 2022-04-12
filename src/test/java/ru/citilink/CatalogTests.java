package ru.citilink;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.citilink.pages.CatalogPage;

import static io.qameta.allure.Allure.step;

@DisplayName("Тесты для проверки каталога товаров и поиска в нём")
public class CatalogTests extends TestBase {

    CatalogPage catalogPage = new CatalogPage();

    @Test
    @Owner("igor.glazov")
    @Feature("Каталог товаров")
    @DisplayName("Проверка наличия каталога товаров")
    @Severity(SeverityLevel.BLOCKER)
    public void catalogIsVisible() {
        step("Проверяем наличие каталога товаров", () ->
                catalogPage.checkCatalogIsAvailable());
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Каталог товаров")
    @DisplayName("Проверка загрузки каталога товаров")
    @Severity(SeverityLevel.BLOCKER)
    public void catalogLoading() {
        step("Проверяем загрузку каталога товаров", () -> {
            catalogPage.OpenCatalog();
            step("Лого каталога", () ->
                    catalogPage.checkCatalogLogo());
            step("Меню каталога", () -> {
                catalogPage
                        .checkCategories("Смартфоны и гаджеты")
                        .checkCategories("Ноутбуки и компьютеры")
                        .checkCategories("Телевизоры, аудио-видео, фото")
                        .checkCategories("Бытовая техника для дома и кухни")
                        .checkCategories("Строительство и ремонт")
                        .checkCategories("Дом и дача")
                        .checkCategories("Умный дом и системы безопасности")
                        .checkCategories("Автотовары")
                        .checkCategories("Канцтовары, Мебель и Офисная техника")
                        .checkCategories("Красота и здоровье")
                        .checkCategories("Детские товары")
                        .checkCategories("Спорт и отдых")
                        .checkCategories("Товары для геймеров");
            });
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Каталог товаров")
    @DisplayName("Проверка работы поиска в каталоге товаров")
    @Severity(SeverityLevel.BLOCKER)
    public void CatalogSearch() {
        step("Загружаем каталог товаров", () ->
                catalogPage.OpenCatalog());
        step("Осуществляем поиск", () -> {
            catalogPage
                    .typeSearchInput("Ноутбук HP")
                    .checkResultSearch("Ноутбуки HP");
        });
    }
}
