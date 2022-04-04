<h1>Проект по тестированию главной страницы интернет-магазина "Ситилинк"</h1>

<a target="_blank" href="https://www.citilink.ru/">Ссылка на сайт магазина</a>

<h2>:bookmark_tabs: Содержание</h2>

:eight_spoked_asterisk:	 Стек технологий

:eight_spoked_asterisk:	 Запуск тестов в Jenkins

:eight_spoked_asterisk:	 Отчет о результатах прохождения тестов в Allure TestOps

:eight_spoked_asterisk:	 Уведомления в Telegram с использованием бота

:eight_spoked_asterisk:	 Пример запуска теста в Selenoid


<h2>:books:	 Стек технологий</h2>


<p>
<img title="Allure TestOps" src="images/logo/Allure_TestOps.png" height="48" width="48"> 
<img title="GitHub" src="images/logo/GitHub.svg" height="48" width="48">
<img title="Gradle" src="images/logo/Gradle.svg" height="48" width="48">
<img title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg" height="48" width="48">
<img title="JUnit5" src="images/logo/JUnit5.svg" height="48" width="48">
<img title="Selenide" src="images/logo/Selenide.svg" height="48" width="48">
<img title="Selenoid" src="images/logo/Selenoid.svg" height="48" width="48">
<img title="Telegram" src="images/logo/Telegram.svg" height="48" width="48">
<img title="Java" src="images/logo/Java.svg" height="48" width="48">
<img title="Jenkins" src="images/logo/Jenkins.svg" height="48" width="48"> 
</p>


<h2>:arrow_forward:	 Запуск тестов в Jenkins</h2>
<p>Для запуска тестов используется инструмент CI/CD под названием <b>Jenkins</b></p>

```
clean
test
-Dbrowser=${BROWSER}
-Dversion=${VERSION}
-DremoteUrl=${REMOTEURL}
-Dlogin=${LOGIN}
-Dpassword=${PASSWORD}
```
<p><code>BROWSER</code> – браузер, в котором будут выполняться тесты.</p>
<p><code>VERSION</code> – версия браузера, в которой будут выполняться тесты.</p>
<p><code>REMOTE_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.</p>
<p><code>LOGIN</code> - логин для авторизации на удалённом сервере.</p>
<p><code>PASSWORD</code> - пароль для авторизации на удалённом сервере.</p>

<h3>:large_blue_diamond:	 Процесс запуска происходит следующим образом:</h3>

<p><i>На странице сборки выбираем <b>"Собрать с параметрами"</b>: </i>
</br>
</br>
<img title="Jenkins" src="images/screenshots/jenkins_1.png">
</p>

<p><i>Выбираем необходимые параметры запуска и нажимаем <b>"Собрать"</b>: </i>
</br>
</br>
<img title="Jenkins" src="images/screenshots/jenkins_2.png">
</p>

<h2>:bar_chart:	 Отчет о результатах прохождения тестов в Allure TestOps</h2>

<h3>:large_orange_diamond:	 Страница с обобщёнными данными по отчёту:</h3>

<p align="center">
<img title="Allure Overview" src="images/screenshots/overview.png">
</p>

<h3>:large_orange_diamond:	 Страница с графической информацией:</h3>

<p align="center">
<img title="Allure Graphs" src="images/screenshots/graphs.png">
</p>

<h3>:large_orange_diamond:	 Страница с описанием шагов теста:</h3>

<p align="center">
<img title="Allure Behaviors" src="images/screenshots/behaviors.png">
</p>


<h2>:mailbox_with_mail:	 Уведомления в Telegram с использованием бота</h2>
<p><i>После окончания сборки в Телеграм отправляется уведомление со ссылкой на отчёт. </i>
</br>
</br>
<img title="Telegram notification" src="images/screenshots/telegram_message.png">
</p>


<h2>:cinema:	 Пример запуска теста в Selenoid</h2>
<p><i>К каждому тесту в отчете прилагается видео: </i>
</br>
</br>
<img title="Selenoid" src="images/screenshots/selenoid.gif">
</p>


<img src="https://readme-jokes.vercel.app/api" alt="Jokes Card" />
