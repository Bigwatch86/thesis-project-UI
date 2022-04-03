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
    @DisplayName("Проверка загрузки нижнего колонтитула")
    @Severity(SeverityLevel.BLOCKER)
    public void footerLoading() {
        step("Проверяем загрузку нижнего колонтитула", () -> {
            $(".js--Footer").shouldBe(visible);
            step("Подписка по почте", () -> {
                $(".Subscribe__title_email").shouldBe(visible).shouldHave(text("Хочу быть в курсе акций и новинок"));
                $(".Subscribe__email").$(".Subscribe__input").shouldBe(visible);
                $(".Subscribe__email").$(".Subscribe__button").shouldBe(visible).shouldHave(text("Подписаться"));
            });
            step("Уведомления в браузере", () -> {
                $(".Subscribe__title_push").shouldBe(visible).shouldHave(text("Включить уведомления в браузере"));
                $(".Subscribe__push").$(".Subscribe__input-block").shouldBe(visible).shouldHave(text("Новости, " +
                        "акции и все самые важные события для вас!"));
                $(".Subscribe__push").$(".Subscribe__button-push").shouldBe(visible).shouldHave(text("Включить"));
            });
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Главная страница Citilink")
    @DisplayName("Проверка загрузки тела нижнего колонтитула")
    @Severity(SeverityLevel.BLOCKER)
    public void footerBodyLoading(){
        step("Проверяем загрузку тела нижнего колонтитула", () -> {
            $(".Footer__body").shouldBe(visible);
            step("Контакты", () -> {
                $(".Footer__contact").$(".Heading").shouldBe(visible).shouldHave(text("Контакты"));
                $(".Footer__contact").$(".Footer__contact-address").shouldBe(visible).shouldHave(text("Адреса магазинов"));
                $(".Footer__contact").$(".Footer__contact-button").shouldBe(visible).shouldHave(text("Задать вопрос"));
            });
            step("Меню нижнего колонтитула", () -> {
                $(".FooterMenu__menu").shouldBe(visible).shouldBe(text("Журнал"), text("Акции"), text("Сервисные центры"),
                        text("Услуги"), text("Корпоративным клиентам"), text("Обзоры"), text("Барахолка"), text("Форум"), text("Конфигуратор"),
                        text("Подброр расходных материалов"), text("Ситилинк"), text("Новости"), text("Клуб Ситилинк"), text("Вакансии"));
            });
        });
    }


//    @Disabled
//    @Test
//    @Owner("igor.glazov")
//    @Feature("Главная страница Citilink")
//    @DisplayName("Проверка наличия каталога товаров")
//    @Severity(SeverityLevel.BLOCKER)
//    public void catalogIsVisible(){
//        step("Проверяем наличие каталога товаров", () -> {
//            $("[data-label=\"Каталог товаров\"]").shouldBe(visible);
//        });
//    }
//    @Disabled
//    @Test
//    @Owner("igor.glazov")
//    @Feature("Главная страница Citilink")
//    @DisplayName("Проверка загрузки каталога товаров")
//    @Severity(SeverityLevel.BLOCKER)
//    public void catalogLoading(){
//        step("Проверяем загрузку каталога товаров", () -> {
//            $("[data-label=\"Каталог товаров\"]").click();
//            $(".CatalogMenu__category").shouldBe(visible);
//        });
//    }
}
