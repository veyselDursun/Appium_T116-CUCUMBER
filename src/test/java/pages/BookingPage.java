package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserDriver;

public class BookingPage {

    public BookingPage(){
        PageFactory.initElements((WebDriver) BrowserDriver.getBrowserDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Decline']")
    public WebElement cookie;

    @FindBy(xpath = "//button[@aria-label='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//*[@data-testid='header-mobile-menu-currency-picker-menu-item']")
    public WebElement currencyButton;

    @FindBy(xpath = "//*[text()='Euro']")
    public WebElement euro;

    @FindBy(xpath = "//*[@data-testid='header-mobile-menu-language-picker-menu-item']")
    public WebElement languageMenu;

    @FindBy(xpath = "//*[text()='Türkçe']")
    public WebElement turkce;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='abf093bdfe d86cee9b25'])[1]")
    public WebElement firstRate;

}