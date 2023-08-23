package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class apkStepDefinitions {
    AndroidDriver<AndroidElement>driver;

    @Given("Kullanici yukleme yapmak istedigi apk dosyasini belirleyerek yukleme yapar")
    public void kullanici_yukleme_yapmak_istedigi_apk_dosyasini_belirleyerek_yukleme_yapar() throws MalformedURLException {

        final String cihazIsmi="Pixel 2";
        final String platformVersion="10.0";


        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,cihazIsmi);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\ahmet\\IdeaProjects\\APPIUM_T-116\\Apps\\all-currency-converter-3-9-0 (1).apk");

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("Kullanici yukleme yapmak istedigi {string} {string} {string} {string} {string} apk dosyasini belirleyerek yukleme yapar")
    public void kullanici_yukleme_yapmak_istedigi_apk_dosyasini_belirleyerek_yukleme_yapar(String cihazIsmi, String platformVersion, String platformName, String automationName, String apk) throws MalformedURLException {



        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,cihazIsmi);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,platformName);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,automationName);

        capabilities.setCapability(MobileCapabilityType.APP,apk);

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}