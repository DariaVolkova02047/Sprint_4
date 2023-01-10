package questions;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobject.MainPage;

import java.time.Duration;

import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class CheckTextOfQuestions {

    private WebDriver driver;
    private static By question;
    private static By answer;
    private static String answerText;

    //конструктор класса
    public CheckTextOfQuestions(By question, By answer, String answerText) {
        this.question = question;
        this.answer = answer;
        this.answerText = answerText;
    }

    //параметризация
    @Parameterized.Parameters
    public static Object[][] getCredentials(){
        return new Object[][] {
                {MainPage.questionOne, MainPage.answerOne, MainPage.answerOneText},
                {MainPage.questionTwo, MainPage.answerTwo, MainPage.answerTwoText},
                {MainPage.questionThree, MainPage.answerThree, MainPage.answerThreeText},
                {MainPage.questionFour, MainPage.answerFour, MainPage.answerFourText},
                {MainPage.questionFive, MainPage.answerFive, MainPage.answerFiveText},
                {MainPage.questionSix, MainPage.answerSix, MainPage.answerSixText},
                {MainPage.questionSeven, MainPage.answerSeven, MainPage.answerSevenText},
                {MainPage.questionEight, MainPage.answerEight, MainPage.answerEightText}
        };

    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.scrollToElement();
        mainPage.clickCookie();
    }

    @Test
    public void shownTextOfQuestionByClick() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickQuestion(question);
        mainPage.getAnswerText(answer);
        MatcherAssert.assertThat(mainPage.getAnswerText(answer), is(answerText));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
