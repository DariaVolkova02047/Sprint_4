package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    // url главной страницы
    private final String urlManePage = "https://qa-scooter.praktikum-services.ru/";
    //кнопка Заказать наверху
    public static By orderButtonTop = By.xpath(".//button[@class='Button_Button__ra12g']");
    //кнопка Заказать перед вопросами
    public static By orderButtonMiddle = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM')]");
    //Заголовок вопросы о важном
    private final By importantQuestions = By.xpath(".//div[text()='Вопросы о важном']");
    //кнопка с куками
    private final By cookieButton = By.id("rcc-confirm-button");

    //------------Вопросы-----------------------------------------------------------
    //вопрос №1
    public static By questionOne = By.id("accordion__heading-0");
    //вопрос №2
    public static By questionTwo = By.id("accordion__heading-1");
    //вопрос №3
    public static By questionThree = By.id("accordion__heading-2");
    //вопрос №4
    public static By questionFour = By.id("accordion__heading-3");
    //вопрос №5
    public static By questionFive = By.id("accordion__heading-4");
    //вопрос №6
    public static By questionSix = By.id("accordion__heading-5");
    //вопрос №7
    public static By questionSeven = By.id("accordion__heading-6");
    //вопрос №8
    public static By questionEight = By.id("accordion__heading-7");

    //------------Ответы--------------------------------------------------------------
    //Ответ №1
    public static By answerOne = By.id("accordion__panel-0");
    //Ответ №2
    public static By answerTwo = By.id("accordion__panel-1");
    //Ответ №3
    public static By answerThree = By.id("accordion__panel-2");
    //Ответ №4
    public static By answerFour = By.id("accordion__panel-3");
    //Ответ №5
    public static By answerFive = By.id("accordion__panel-4");
    //Ответ №6
    public static By answerSix = By.id("accordion__panel-5");
    //Ответ №7
    public static By answerSeven = By.id("accordion__panel-6");
    //Ответ №8
    public static By answerEight = By.id("accordion__panel-7");

    //-----------Текст ответов на вопросы----------------------------------------------
    //Текст ответана вопрос №1
    public static  String answerOneText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    //Текст ответана вопрос №2
    public static  String answerTwoText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    //Текст ответана вопрос №3
    public static  String answerThreeText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    //Текст ответана вопрос №4
    public static  String answerFourText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    //Текст ответана вопрос №5
    public static String answerFiveText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    //Текст ответана вопрос №6
    public static String answerSixText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    //Текст ответана вопрос №7
    public static  String answerSevenText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    //Текст ответана вопрос №8
    public static  String answerEightText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //метод открыть страницу
    public void openMainPage() {
        driver.get(urlManePage);
    }
    //проскролить до элемента с видимыми вопросами
    public void scrollToElement() {
        WebElement element = driver.findElement(importantQuestions );//текст вопросы о важном
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    //кликнуть на принятие куки
    public void clickCookie() {
        driver.findElement(cookieButton).click();
    }

    //нажать на вопрос
    public void clickQuestion(By question) {
        driver.findElement(question).click();
    }

    //получить текст ответа на вопрос
    public String getAnswerText(By answer){
        return driver.findElement(answer).getText();
    }

    //нажать на кнопу Заказать
    public void clickOrderButton(By orderButton) {
        driver.findElement(orderButton).click();
    }

}
