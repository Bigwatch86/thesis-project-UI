package ru.citilink;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@DisplayName("Тесты для проверки содержимого главной страницы citilink.ru")
public class MainPageTests extends TestBase{
    @Disabled
    @Test
    @Owner("igor.glazov")
    @Feature("Главная страница Citilink")
    @DisplayName("Проверка загрузки верхней части заголовка и её содержимого")
    @Severity(SeverityLevel.BLOCKER)
    public void headerTopLoading() {
        step("Проверяем загрузку верхней части заголовка и её содержимого", () -> {
            $(".MainHeader__inner_top").shouldBe(visible);
            step("Лого", () -> {
                $(".MainHeader__logo").shouldBe(visible);
                    });
            $(".MainHeader__info-block").shouldBe(visible);
            step("Город", () -> {
                $(".MainHeader__city").shouldBe(visible);
                    });
            step("Телефон", () -> {
                $(".MainHeader__phone").shouldBe(visible);
                    });
            step("Журнал", () -> {
                $(".MainMenu__link a").shouldBe(visible).shouldHave(text("Журнал"));
                    });
            step("Акции", () -> {
                $(".MainMenu__link a").sibling(0).shouldBe(visible).shouldHave(text("Акции"));
                    });
            step("Ситилинк.Бизнес", () -> {
                $(".MainMenu__link a").sibling(1).shouldBe(visible).shouldHave(text("Ситилинк.Бизнес"));
                    });
            step("Конфигуратор", () -> {
                $(".MainMenu__link a").sibling(2).shouldBe(visible).shouldHave(text("Конфигуратор"));
                    });
            step("Доставка", () -> {
                $(".MainMenu__link a").sibling(3).shouldBe(visible).shouldHave(text("Доставка"));
                    });
            step("Магазины", () -> {
                $(".MainMenu__link a").sibling(4).shouldBe(visible).shouldHave(text("Магазины"));
                    });
            step("Обратная связь", () -> {
                $(".MainMenu__link a").sibling(5).shouldBe(visible).shouldHave(text("Обратная связь"));
                    });
        });
    }
    @Disabled
    @Test
    @Owner("igor.glazov")
    @Feature("Главная страница Citilink")
    @DisplayName("Проверка загрузки нижней части заголовка и её содержимого")
    @Severity(SeverityLevel.BLOCKER)
    public void headerBottomLoading() {
        step("Проверяем загрузку нижней части заголовка и её содержимого", () -> {
            $(".MainHeader__inner_bottom").shouldBe(visible);
            step("Каталог", () -> {
                $(".MainHeader__catalog").shouldBe(visible);
            });
            $(".MainHeader__actions-block").shouldBe(visible);
            step("Поле поиска", () -> {
                $(".MainHeader__search").shouldBe(visible);
            });
            $(".HeaderMenu").shouldBe(visible);
            step("Войти", () -> {
                $(".AuthPopup ").shouldBe(visible);
            });
            step("Избранное", () -> {
                $("[data-name=\"wishlist\"]").shouldBe(visible);
            });
            step("Сравнение", () -> {
                $("[data-name=\"compare\"]").shouldBe(visible);
            });
            step("Корзина", () -> {
                $("[data-name=\"basket\"]").shouldBe(visible);
                    });
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Главная страница Citilink")
    @DisplayName("Проверка загрузки популярных категорий")
    @Severity(SeverityLevel.BLOCKER)
    public void searchBasket(){
        step("Проверяем загрузку популярных категорий", () -> {
            $(".PopularCategoriesBox__header").shouldBe(visible);
            step("Ноутбуки", () -> {
                $(".PopularCategoriesBox__content div").shouldBe(visible).shouldHave(text("Ноутбуки"));
            });
            step("Смартфоны", () -> {
                $(".PopularCategoriesBox__content div").sibling(0).shouldBe(visible).shouldHave(text("Смартфоны"));
            });
            step("Телевизоры", () -> {
                $(".PopularCategoriesBox__content div").sibling(1).shouldBe(visible).shouldHave(text("Телевизоры"));
            });
            step("Мониторы", () -> {
                $(".PopularCategoriesBox__content div").sibling(2).shouldBe(visible).shouldHave(text("Мониторы"));
            });
            step("Процессоры", () -> {
                $(".PopularCategoriesBox__content div").sibling(3).shouldBe(visible).shouldHave(text("Процессоры"));
            });
            step("Садовая техника", () -> {
                $(".PopularCategoriesBox__content div").sibling(4).shouldBe(visible).shouldHave(text("Садовая техника"));
            });
            step("Стиральные машины", () -> {
                $(".PopularCategoriesBox__content div").sibling(5).shouldBe(visible).shouldHave(text("Стиральные машины"));
            });
            step("Климатическая техника", () -> {
                $(".PopularCategoriesBox__content div").sibling(6).shouldBe(visible).shouldHave(text("Климатическая техника"));
            });
            step("Холодильники", () -> {
                $(".PopularCategoriesBox__content div").sibling(7).shouldBe(visible).shouldHave(text("Холодильники"));
            });
            step("Компьютеры", () -> {
                $(".PopularCategoriesBox__content div").sibling(8).shouldBe(visible).shouldHave(text("Компьютеры"));
            });
        });
    }

    @Disabled
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
    @Disabled
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
