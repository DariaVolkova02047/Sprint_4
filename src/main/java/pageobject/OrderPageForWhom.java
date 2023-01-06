package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageForWhom {
    // url страницы заказа Для кого самокат
    // private final String urlOrderPage = "https://qa-scooter.praktikum-services.ru/order";

    //поле Имя
    private final By nameField = By.xpath(".//input[contains(@placeholder, 'Имя')]");
    //поле Фамилия
    private final By surnameField = By.xpath(".//input[contains(@placeholder, 'Фамилия')]");
    //поле с адресом заказа
    private final By addressField = By.xpath(".//input[contains(@placeholder, 'куда привезти заказ')]");
    //поле с выбором станции метро
    private final By metroField = By.xpath(".//input[@class='select-search__input']");
    //Выбор станции метро(2) из списка
    private final By metroStation = By.xpath(".//div[@class='select-search__select']/ul/li/button/div[2]");
    //поля ввода номера телефона
    private final By telephoneField = By.xpath(".//div[5]/input[contains(@class, 'Input_Input__1iN_Z')]");
    //кнопка Далее
    private final By nextButton = By.xpath(".//button[text()='Далее']");

    private WebDriver driver;

    public OrderPageForWhom(WebDriver driver) {
        this.driver = driver;
    }

    //ввести имя
    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }
    //ввести фамилию
    public void enterSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }
    //ввести адрес
    public void enterAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }
    //выбрать станцию метро
    public void clickMetroStation() {
        driver.findElement(metroField ).click();
        driver.findElement(metroStation).click();
    }
    //ввести номер телефона
    public void enterPhoneNumber(String number) {
        driver.findElement(telephoneField).sendKeys(number);
    }
    //нажать на кнопку далее
    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

}
