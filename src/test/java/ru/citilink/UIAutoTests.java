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
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class UIAutoTests extends TestBase{

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
    @DisplayName("Проверка загрузки header")
    @Severity(SeverityLevel.BLOCKER)
    public void headerLoading() {
        step("Открыть страницу:", () -> {
            open("https://www.citilink.ru/");
        });
        step("Проверяем загрузку header", () -> {
            $(".Container").shouldBe(visible);
            $(".Container .MainHeader__logo").shouldBe(visible);
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
    @DisplayName("Специальный падающий тест")
    @Severity(SeverityLevel.BLOCKER)
    public void searchWishlist(){
        step("Проверяем наличие избранного", () -> {
            $(".HeaderMenu__buttons_wishlist").shouldBe(visible);
            $(".HeaderMenu__buttons_wishlist").click();
        });
        step("Нет избранного, так как пользователь не залогинен", () -> {
            $("h2").shouldHave(text("Избранное"));
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
    @DisplayName("Проверка наличия корзины")
    @Severity(SeverityLevel.BLOCKER)
    public void searchBasket(){
        step("Проверяем наличие корзины", () -> {
            $(".HeaderMenu__buttons_basket").shouldBe(visible);
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
    @DisplayName("Проверка наличия каталога товаров")
    @Severity(SeverityLevel.BLOCKER)
    public void catalogIsVisible(){
        step("Проверяем наличие каталога товаров", () -> {
            $("[data-label=\"Каталог товаров\"]").shouldBe(visible);
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
    @DisplayName("Проверка загрузки каталога товаров")
    @Severity(SeverityLevel.BLOCKER)
    public void catalogLoading(){
        step("Проверяем загрузку каталога товаров", () -> {
            $("[data-label=\"Каталог товаров\"]").click();
            $(".CatalogMenu__category").shouldBe(visible);
        });
    }
}
