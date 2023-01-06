package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageAboutRent {
    // url страницы заказа Для кого самокат
    //private final String urlOrderPage = "https://qa-scooter.praktikum-services.ru/order";

    //поле Когда привезти самокат
    private final By dateField = By.xpath(".//input[contains(@placeholder, 'Когда привезти самокат')]");
    //выбор даты когда привезти самокат из календаря
    private final By choosingDate = By.xpath(".//div[contains(@class, 'react-datepicker__day--selected')]");
    //поле с выпадающим списком со скроком аренды самоката
    private final By rentField = By.xpath(".//div[@class='Dropdown-placeholder']");
    //выбор периода аренды из списка
    private final By choosingRentalPeriod = By.xpath(".//div[text()='сутки']");
    //выбор цвета самоката
    private final By colorOfScooter = By.id("black"); //выбор черного цвета
    //поле с комментарием
    private final By commentField = By.xpath(".//input[contains(@placeholder, 'Комментарий для курьера')]");
    //финальная кнопка заказать
    private final By finalOrderButton = By.xpath(".//div[3]/button[text()='Заказать']");
    //Всплывающее окно хотите оформить заказ? Кнопка Да
    private final By yesOrderButton = By.xpath(".//button[text()='Да']");
    //сообщение об успешном оформлении заказа
    private final By notificationOfSuccessfulOrder = By.xpath(".//div[contains(text(), 'Заказ оформлен')]");

    private WebDriver driver;

    public OrderPageAboutRent(WebDriver driver) {
        this.driver = driver;
    }
    //выбор даты
    public void chooseDate(String dayWhatIWant) {
        driver.findElement(dateField).sendKeys(dayWhatIWant);
        driver.findElement(choosingDate).click();
    }
    //выбор срока аренды
    public void chooseRentalPeriod() {
        driver.findElement(rentField).click();
        driver.findElement(choosingRentalPeriod).click();

    }
    //выбор чек-бокса с цветом самоката
    public void chooseColor() {
        driver.findElement(colorOfScooter).click();
    }
    //при желании можно оставить комментарий
    public void writeComment(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }
    //нажать на финальную кнопку Заказать
    public void clickFinalOrderButton() {
        driver.findElement(finalOrderButton).click();
    }
    //подтвердить намерение заказать
    public void confirmOrder() {
        driver.findElement(yesOrderButton).click();
    }
    //сообщение об успешном заказе
    public void checkOrderComplete() {
        driver.findElement(notificationOfSuccessfulOrder).isDisplayed();
    }

}
