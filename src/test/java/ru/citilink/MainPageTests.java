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
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

@DisplayName("Тесты для проверки содержимого главной страницы citilink.ru")
public class MainPageTests extends TestBase{

    @Test
    @Owner("igor.glazov")
    @Feature("Главная страница Citilink")
    @DisplayName("Проверка загрузки header и его содержимого")
    @Severity(SeverityLevel.BLOCKER)
    public void headerLoading() {
        step("Проверяем загрузку header", () -> {
            $(".Container").shouldBe(visible);
            $(".Container .MainHeader__logo").shouldBe(visible);
            $(".MainHeader__city").shouldBe(visible).shouldHave(text("Санкт-Петербург"));
            $(".MainHeader__phone").shouldBe(visible).shouldHave(text("332-84-84"));
            $(".MainMenu__link a").shouldBe(visible).shouldHave(text("Журнал"));
            $(".MainMenu__link a").sibling(0).shouldBe(visible).shouldHave(text("Акции"));
            $(".MainMenu__link a").sibling(1).shouldBe(visible).shouldHave(text("Ситилинк.Бизнес"));
            $(".MainMenu__link a").sibling(2).shouldBe(visible).shouldHave(text("Доставка"));
            $(".MainMenu__link a").sibling(3).shouldBe(visible).shouldHave(text("Магазины"));
            $(".MainMenu__link a").sibling(4).shouldBe(visible).shouldHave(text("Обратная связь"));
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Главная страница Citilink")
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
    @Feature("Главная страница Citilink")
    @DisplayName("Проверка наличия корзины")
    @Severity(SeverityLevel.BLOCKER)
    public void searchBasket(){
        step("Проверяем наличие корзины", () -> {
            $(".HeaderMenu__buttons_basket").shouldBe(visible);
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Главная страница Citilink")
    @DisplayName("Проверка наличия каталога товаров")
    @Severity(SeverityLevel.BLOCKER)
    public void catalogIsVisible(){
        step("Проверяем наличие каталога товаров", () -> {
            $("[data-label=\"Каталог товаров\"]").shouldBe(visible);
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Главная страница Citilink")
    @DisplayName("Проверка загрузки каталога товаров")
    @Severity(SeverityLevel.BLOCKER)
    public void catalogLoading(){
        step("Проверяем загрузку каталога товаров", () -> {
            $("[data-label=\"Каталог товаров\"]").click();
            $(".CatalogMenu__category").shouldBe(visible);
        });
    }
}
