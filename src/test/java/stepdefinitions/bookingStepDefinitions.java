package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BookingPage;
import utils.BrowserDriver;

public class bookingStepDefinitions {
    Actions actions=new Actions(BrowserDriver.getBrowserDriver());
    BookingPage bookingPage=new BookingPage();
    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        BrowserDriver.getBrowserDriver().get(url);
    }
    @Given("Cookies i kabul eder")
    public void cookies_i_kabul_eder() throws InterruptedException {
        bookingPage.cookie.click();
    }
    @Given("sag ust uc cizgi menuye tiklar")
    public void sag_ust_uc_cizgi_menuye_tiklar() throws InterruptedException {
        Thread.sleep(1000);
        bookingPage.menuButton.click();
    }
    @Given("para birimi bolumunde degisiklik yaparak euro secer")
    public void para_birimi_bolumunde_degisiklik_yaparak_euro_secer() throws InterruptedException {
        bookingPage.currencyButton.click();
        Thread.sleep(600);
        bookingPage.euro.click();
    }
    @Given("dil i turkce olarak degistirir")
    public void dil_i_turkce_olarak_degistirir() throws InterruptedException {
        bookingPage.languageMenu.click();
        actions.moveToElement(bookingPage.turkce).perform();
        Thread.sleep(500);
        bookingPage.turkce.click();
    }
    @Given("arama bolume {string} yazilir ve arama yapilir")
    public void arama_bolume_antalya_yazilir_ve_arama_yapilir(String sehir) throws InterruptedException {
        Thread.sleep(1500);
        bookingPage.searchBox.sendKeys(sehir);
        Thread.sleep(1500);
        actions.sendKeys(Keys.ENTER).perform();


    }
    @Given("gelen otel puanin {double} den yuksek oldugu dogrulanir")
    public void gelen_otel_puanin_den_yuksek_oldugu_dogrulanir(Double expectedRate) {
        String rateResult= bookingPage.firstRate.getText(); //8,6
        rateResult=rateResult.replaceAll(",","."); // 8.6

        Assert.assertTrue(Double.parseDouble(rateResult)>expectedRate);

    }
    @Given("uygulama kapatilir")
    public void uygulama_kapatilir() {
        BrowserDriver.quitAppiumDriver();
    }

}